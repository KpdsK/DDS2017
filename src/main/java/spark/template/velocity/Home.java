package spark.template.velocity;

import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.get;
import static spark.Spark.notFound;
import static spark.Spark.staticFiles;

/**
 * VelocityTemplateRoute example.
 */
public final class Home {

	public static void main(String[] args) {
//		get("/hola", (req, res) -> "Donde invierto?");

		// Manejo de errores de pagina. Using string/html
		notFound("<html><body><h1>Error 404 no existe la pagina</h1></body></html>");

		// directorio donde se encuantran los recursos que usa la webApp (ej.:
		// html, img, css, bootstrap, templates, etc.)
		staticFiles.location("/publico"); // Static files
        
        get("/login", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("message", "Hello Velocity - Donde Invierto?");
            return new ModelAndView(model, "publico/pages/login.html"); // located in the resources directory
        }, new VelocityTemplateEngine());
        
        get("/index", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("message", "Hello Velocity - Donde Invierto?");
            return new ModelAndView(model, "index.html"); // located in the resources directory
        }, new VelocityTemplateEngine());

	}

}