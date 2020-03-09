package com.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class momcontroller {
	//@ResponseBody
	@RequestMapping("/sugar")
	public String givesugar(Model modal)
	{
		//return "/WEB-INF/view/sugar.jsp";
		String s="pallavi";
		modal.addAttribute("a",s);
		return "sugar";
	}
	@RequestMapping("/show")
public String showname(HttpServletRequest request,Model m)
{
	String s=request.getParameter("name");
	m.addAttribute("a",s);
	//System.out.println(s);
	return "sugar";
}
	
}
