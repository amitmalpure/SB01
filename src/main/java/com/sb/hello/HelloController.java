package com.sb.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{
	@RequestMapping("/hello")
	public String sayHi()
	{
		return "Hiii!";
	}
}
