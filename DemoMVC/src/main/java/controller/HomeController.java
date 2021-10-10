package controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(Model model) {
		List<String> friends = new ArrayList<String>();
		friends.add("Suresh");
		friends.add("Rohit");
		friends.add("Mahipal");
		model.addAttribute("name", "Sandeep Vishwakarma");
		model.addAttribute("friends",friends);
		return "home";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		List<String> technologies = new ArrayList<String>();
		technologies.add("Java");
		technologies.add("JavaScript");
		technologies.add("Python");
		ModelAndView modelview = new ModelAndView();
		modelview.setViewName("help");
		modelview.addObject("technologies", technologies);
		return modelview;
	}
}
	
