package web.controller;

import jdk.jfr.Registered;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class CarController {

//	@Autowired   Инъекция в поле не рекомендуется
	private final CarService carService;

	public CarController(CarService carService) {
		this.carService = carService;
	}


	@GetMapping(value = "/cars")
//	@RequestParam(value = "count", defaultValue = "5")
	public String listCars(@RequestParam("count")int count, Model model) {
//		https://sysout.ru/vvedenie-v-thymeleaf/
		model.addAttribute("cars", carService.getCars(count));

		return "cars";
	}
}