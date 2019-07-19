package com.tyagi.spring.mvc1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//create controller class
@Controller
public class HomeController {
	
	// Create controller method
	// Do the request mapping to the method so it handles all the request
	@RequestMapping(value="/")
	public String showTheView() {
		
		return "mainview";
		
	}

}
