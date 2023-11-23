package in.ineuron.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class FirstMVCapp {	
	
	
	@RequestMapping("/welcome")
	public ModelAndView displayMsg() {		
		ModelAndView mv= new ModelAndView();
		mv.addObject("message","First Application of Spring Boot MVC project...");
		mv.setViewName("index");
		return mv;
	}

}
