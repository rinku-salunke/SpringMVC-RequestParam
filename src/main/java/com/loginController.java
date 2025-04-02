package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {


@RequestMapping("/login/{u}/{password}")
public String getLoginData(@PathVariable("u")String username, @PathVariable("password")String password) {	

	System.out.println(username);
	System.out.println(password);
	
	return "welcome";
}
}
