package com.okayjava.html.cotroller;

import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.okayjava.html.model.User;
			

@Controller
public class IndexCotroller {
	
	@GetMapping("/")
	public String index() {
		
		return "index";
	}
	
	
	@PostMapping("/register")
	public String userResistration(@ModelAttribute User user, Model model) {
		System.out.println(user.toString());
		//validate
		System.out.println(user.getFname());
		System.out.println(user.getLname());
		System.out.println(user.getEmail());

		return "welcome";
	}

}
