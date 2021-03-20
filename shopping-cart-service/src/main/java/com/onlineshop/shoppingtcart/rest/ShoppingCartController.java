package com.onlineshop.shoppingtcart.rest;
import java.util.ArrayList;
import java.util.List;

import com.onlineshop.shoppingtcart.entity.ShoppingCart;
import com.onlineshop.shoppingtcart.service.ShoppingCartItemService;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingCartController {

	private org.slf4j.Logger logger=LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ShoppingCartItemService shoppingcartitemservice;
	
	ShoppingCart  cart = null;
	
	@GetMapping("/mycart/getcartItems")
	public ShoppingCart getCartItems() {
		
		logger.info("ShoppingCart :: getCartItems ");
		
	    try{

			cart = shoppingcartitemservice.getShoppingCartState();
			logger.debug("ShoppingCart :: getCartItems"+cart.toString());

		}catch(Exception excep){

			logger.debug("ShoppingCart :: getCartItems::Exception Occured "+excep.getMessage());

		}

		return  cart;
	}

}
