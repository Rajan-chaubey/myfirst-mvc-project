package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.service.LoginValidate;

@Controller
@SessionAttributes("name")
public class LoginController {

	@Autowired
	LoginValidate service;
	
	//dependency 
	//LoginValidate service=new LoginValidate();

	
	
	//@ResponseBody
	 /*public String login()
	{
		return "Hello World";
	}
    */	
	/*public String login()
	{
		return "WEB-INF/jsp/login.jsp";
	}*/
/*	public String login()
	{ 
		return "login";
	}*/
	/*public String login(@RequestParam String name ,ModelMap model)
	{
		model.put("name", name);
		System.out.println("name is :");
		return "login";
	}*/
	@RequestMapping(value = "/login",method=RequestMethod.GET)
	public String showloginPage(ModelMap model)
	{
		return "login";
	}
	@RequestMapping(value = "/login",method=RequestMethod.POST)
	public String login(ModelMap model,@RequestParam String name,@RequestParam String password)
	{
		boolean isValid=service.validateUser(name, password);
		if(!isValid)
		{
			model.put("errorMessage", "invalid Credential");
			return "login";
		}
		
		model.put("name", name);
		model.put("password", password);
		return "welcome";
	}
}
