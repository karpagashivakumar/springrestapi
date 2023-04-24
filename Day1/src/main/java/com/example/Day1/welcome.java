package com.example.Day1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class welcome {
	@RequestMapping("/hello")
	@ResponseBody
	public String Welcome()
	{
		return "Welcome to SKCT";
	}
}
