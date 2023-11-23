package in.ineuron.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class controller {
	
	
	@GetMapping("/course")
	public String getView(Model model) {
		model.addAttribute("cid", "A-JAVA109");
		model.addAttribute("cName", "Java FullStack Development");
		model.addAttribute("cost", "12000");
		
		return "course";
	}

}
