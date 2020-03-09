package home.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sis")
public class SisterController {

	@RequestMapping("/makeup")
	@ResponseBody
	public String giveMakeUp() {
		return "give makeup";
	}
	
	@RequestMapping("/book")
	@ResponseBody
	public String giveBook() {
		return "Math Book";
	}
}
