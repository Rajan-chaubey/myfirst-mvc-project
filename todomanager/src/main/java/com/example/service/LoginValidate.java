package com.example.service;

import org.springframework.stereotype.Component;

//it is Spring  bean 
@Component
public class LoginValidate {
	//uid-Rajan pass-chaubey
	
	public boolean validateUser(String user,String password)
	{
		return user.equalsIgnoreCase("Rajan") &&  password.equalsIgnoreCase("chaubey");
	}
	

}
