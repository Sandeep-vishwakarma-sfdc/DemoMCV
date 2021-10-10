package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.User;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String login(Model m) {
		m.addAttribute("title", "Login Page");
		return "login";
	}
	
	@RequestMapping(path = "/processlogin",method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model) {
		return "success";
	}
}
