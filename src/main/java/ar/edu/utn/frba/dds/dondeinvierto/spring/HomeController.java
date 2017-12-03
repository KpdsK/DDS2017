package ar.edu.utn.frba.dds.dondeinvierto.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;
 
@Controller
public class HomeController {
	String message = "Welcome to Spring MVC!";
 
	//@RequestMapping("/home")
//	public ModelAndView showMessage(
//			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
//		System.out.println("in controller");
// 
//		ModelAndView mv = new ModelAndView("home");
//		mv.addObject("message", message);
//		mv.addObject("name", name);
//		return mv;
//	}
	
	@GetMapping("/home")
	public String home(Model model){
		
		model.addAttribute("msj","Hola");
		
		return "Bienvenido";
	}
}