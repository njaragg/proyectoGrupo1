package cl.generation.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class ConocenosController {
				
	
	@GetMapping("/conocenos")
	public String conocenos( ) {
		return "Equipo.jsp";
	}
	
	
	
}
