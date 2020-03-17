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
import com.example.service.TodoService;

@Controller
@SessionAttributes("name")
public class TodoController {

	@Autowired
	TodoService service;
	
	
	@RequestMapping(value = "/list-todos",method=RequestMethod.GET)
	public String showTodos(ModelMap model)
	{
		//model.put("todo",service.retrieveTodos("Rajan") );
		//by using name instead of Rajan is due to @SessionAttribute("name")
		String name1=(String)model.get("name");
		model.put("todo",service.retrieveTodos(name1));
		
		return "list-todos";
	}
	
}
