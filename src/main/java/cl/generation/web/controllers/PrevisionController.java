package cl.generation.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/prevision")
public class PrevisionController {

	@RequestMapping("/") // 
	public String getPrevision() {
		System.out.println("Obtener prevision");
		return "index.jsp";

	}
}