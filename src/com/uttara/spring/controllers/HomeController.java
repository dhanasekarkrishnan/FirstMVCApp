package com.uttara.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
	
	public HomeController() {
		super();
		System.out.println("in HC no_arg const");

	}
@RequestMapping("/")
	public String showHome()
	{
		System.out.println("in HC showHome");

		return "Home";
	}
@RequestMapping("/register")
	public String register(Model m)
    {
	RegBean bean = new RegBean();
	m.addAttribute("reg", bean);
	return "Register";
	}
	


}
