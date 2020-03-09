package com.cts.priceapp.service;

import org.springframework.stereotype.Service;

import com.cts.priceapp.model.Product;
@Service
public class DiscountServiceImpl implements DiscountService {

	@Override
	public double calculateDiscount(Product product) {
		int discount=0;
		switch (product.getProductType()) {
		case "Electronic":
			discount=25;
			break;
		case "Apparels":
			discount=10;
			break;
		case "Toys":
			discount=50;
			break;
			
		}
		double discountedPrice=product.getProductPrice()-(product.getProductPrice()*discount/100);
				
		return discountedPrice;
	}

}
