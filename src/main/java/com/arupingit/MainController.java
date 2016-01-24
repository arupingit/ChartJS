package com.arupingit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String greentings(){
		return "greetings";
	}
	
	@RequestMapping("/index")
	public String getIndex(){
		return "index";
	}
}
