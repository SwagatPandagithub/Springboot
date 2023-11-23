package in.ineuron.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ViewController {
	
	
	@GetMapping("/welcome")
	public String getMessage(Model model) {
		model.addAttribute("get", "Welcome to Capgemini");
		return "index";
	}

}
