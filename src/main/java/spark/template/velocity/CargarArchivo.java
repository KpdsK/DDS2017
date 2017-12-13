package spark.template.velocity;

import spark.*;

import javax.activation.DataSource;
import javax.servlet.*;
import javax.servlet.http.*;

import ar.edu.utn.frba.dds.dondeinvierto.jpa.Cuenta;
import ar.edu.utn.frba.dds.dondeinvierto.jpa.ManejadorPersistencia;

import java.io.*;
import java.nio.file.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static spark.Spark.*;
import static spark.debug.DebugScreen.*;

public class CargarArchivo {

    public static void main(String[] args) {
        enableDebugScreen();

        File uploadDir = new File("upload");
        uploadDir.mkdir(); // create the upload directory if it doesn't exist

        staticFiles.externalLocation("upload");//archivos subidos temporales

        get("/guardar-cuenta", (req, res) ->
                  "Seleccionar archivo de cuentas.csv: <form method='post' enctype='multipart/form-data'>" // note the enctype
                + "    <input type='file' name='uploaded_file' accept='.csv'>" // make sure to call getPart using the same "name" in the post
                + "    <button>Subir archivo</button>"
                + "</form>"
        );

        post("/guardar-cuenta", (req, res) -> {

            Path tempFile = Files.createTempFile(uploadDir.toPath(), "", "");

            req.attribute("org.eclipse.jetty.multipartConfig", new MultipartConfigElement("/temp"));

            try (InputStream input = req.raw().getPart("uploaded_file").getInputStream()) { // getPart needs to use same "name" as input field in form
                Files.copy(input, tempFile, StandardCopyOption.REPLACE_EXISTING);
            }

            logInfo(req, tempFile);

			String mostrar = "vacio";
            File file = new File(tempFile.getFileName().toString());
            try {
    			Scanner inputStream = new Scanner(file);

				String linea1 = inputStream.next();//ignora la primer linea del archivo que tiene los titulos
    			while (inputStream.hasNext()){
    				String linea = inputStream.next();
    				String[] datos = linea.split(",");
    				
    			    Map<String, Object> model = new HashMap<>();
    			    model.put("guardadoExitoso", crearCuenta(datos[0],datos[1],datos[2],datos[3]));
    			    return new ModelAndView(model, "publico/pages/cargar-cuentas.vm");

    			}
    			inputStream.close();
    		} catch (FileNotFoundException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}

		return "<h1>Archivo cargado<h1>"+ mostrar;
            

        });

    }

    // methods used for logging
    private static void logInfo(Request req, Path tempFile) throws IOException, ServletException {
        System.out.println("Uploaded file '" + getFileName(req.raw().getPart("uploaded_file")) + "' saved as '" + tempFile.toAbsolutePath() + "'");
    }

    private static String getFileName(Part part) {
        for (String cd : part.getHeader("content-disposition").split(";")) {
            if (cd.trim().startsWith("filename")) {
                return cd.substring(cd.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return null;
    }
    
    private static boolean crearCuenta(String empresa, String cuenta, String valor, String periodo) {
		Map<String, Object> map= new HashMap<>();
		try {
			ManejadorPersistencia.persistir(new Cuenta().setEmpresa(empresa).setNombre(cuenta).setValor(valor).setPeriodo(periodo));
		} catch (Exception e) {
			return false;
		}
		return true;
	}
    
    
}