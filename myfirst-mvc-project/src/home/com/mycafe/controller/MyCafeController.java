package home.com.mycafe.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeController {
	@RequestMapping("/cafe")
	public String showWelcomePage(Model model){
		
		return "welcome-page";
	}
	
	@RequestMapping("/processorder")
	public String processOrder(HttpServletRequest request,Model model){
		String food=request.getParameter("foodtype");
		model.addAttribute("food", food);
		//model.addAttribute("name", "Puneet");
		return "process-order";
	}
}
