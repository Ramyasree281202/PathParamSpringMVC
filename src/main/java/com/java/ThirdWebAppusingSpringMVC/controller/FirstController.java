package com.java.ThirdWebAppusingSpringMVC.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class FirstController {
	//localhost:8080/res/Ramya
	@GetMapping("/res/{name}")
	public String showResponse(@PathVariable("name")String name,Map<String,Object> map) {
		String msg = "Hello "+name;
		map.put("msg", msg);
		return "response";
		
	}
}
