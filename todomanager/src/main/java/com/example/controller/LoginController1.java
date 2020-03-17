package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class LoginController1 {

@RequestMapping("/login1")
//@ResponseBody
/*public String login1()
{
	return "Rajan Chaubey";
}*/

public String login1()
{
	return "login1";
}

}
