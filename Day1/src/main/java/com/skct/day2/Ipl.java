package com.skct.day2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ipl {
	@Value("RCB")
	private String teamName;
	@Value("1")
	private int tablePosition;
	@Value("Eesala cup namade")
	private String Quote;
	@RequestMapping("/ji")
	@ResponseBody
	public String Data() {
		return "Team Name : " +teamName+ " Position : " +tablePosition+ " Quote : "+Quote ;
	}
	
}