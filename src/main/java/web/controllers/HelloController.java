package web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("PP_2_3_1. Spring MVC Hibernate CRUD. Version V");
		messages.add("Malchihin Serg. August 2023 ");
		model.addAttribute("messages", messages);
		return "pages/hello";
	}
	
}