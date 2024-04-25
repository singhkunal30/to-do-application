package com.spring.todoapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	//using JSP
	
	@RequestMapping("say-hello-jsp")
	public String sayHello() {
		return "sayHello";
	}

}
