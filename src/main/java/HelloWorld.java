import static spark.Spark.*;

public class HelloWorld {
	public static void main(String[] args) {
		get("/hola", (req, res) -> "Que onda viejaaaa");

		// Manejo de errores de pagina. Using string/html
		notFound("<html><body><h1>Error 404 no existe la pagina</h1></body></html>");

		// el valor :name lo usa como variable para mostrar en la pagina
		get("/hola/:name", (request, response) -> {
			return "Hola: " + request.params(":name");
		});

		// matches "GET /say/hello/to/world"
		// request.splat()[0] is 'hello' and request.splat()[1] 'world'
		// numero de asteriscos??
		get("/say/*/to/*/*", (request, response) -> {
			return "Number of splat parameters: " + request.splat().length;
		});
		
		// directorio donde se encuantran los recursos que usa la webApp (ej.: html, img, css, bootstrap, templates, etc.)
		staticFiles.location("/publico"); // Static files

	}
}