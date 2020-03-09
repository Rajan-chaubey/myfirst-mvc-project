package com.cts.priceapp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.cts.priceapp.model.Product;
import com.cts.priceapp.service.DiscountService;

@Controller
public class DiscountController {
	@Autowired
	DiscountService discountService;
	
	@GetMapping("/getDiscountedPrice")
	public String discountPage(@ModelAttribute Product product){
		return "calculatediscount";
	}
	@ModelAttribute("productTypeList")
	public List<String> populateProductType()	{
		List<String> list=new ArrayList<>();
		list.add("Electronic");
		list.add("Apparels");
		list.add("Toys");
		return list;
		
	}
	@GetMapping("/calculateDiscountedPrice")
	public String calculateDiscount(@Valid @ModelAttribute Product product,
			BindingResult result,ModelMap map){
		
		if(result.hasErrors()){
			return "calculatediscount";
		}
		double discountPrice=discountService.calculateDiscount(product);
		map.addAttribute("finalPrice", discountPrice);
		
		return "finalprice";
		
	}

}
