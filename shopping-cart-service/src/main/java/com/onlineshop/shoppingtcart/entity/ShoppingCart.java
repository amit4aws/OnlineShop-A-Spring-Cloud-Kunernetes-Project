package com.onlineshop.shoppingtcart.entity;

import java.util.List;

public class ShoppingCart {
	
	   
     private List<Item> itemlist;
	 private long itemcount;
	 private double cartamount;

	 
	public List<Item> getItemlist() {
		return itemlist;
	}
	public void setItemlist(List<Item> itemlist) {
		this.itemlist = itemlist;
	}
	public long getItemcount() {
		return itemcount;
	}
	public void setItemcount(long itemcount) {
		this.itemcount = itemcount;
	}
	public double getCartamount() {
		return cartamount;
	}
	public void setCartamount(double cartamount) {
		this.cartamount = cartamount;
	}
	public ShoppingCart(List<Item> itemlist, long itemcount, double cartamount) {
		this.itemlist = itemlist;
		this.itemcount = itemcount;
		this.cartamount = cartamount;
	}

	public ShoppingCart(){

		
	}
	@Override
	public String toString() {
		return "ShoppingCart [cartamount=" + cartamount + ", itemcount=" + itemcount + ", itemlist=" + itemlist + "]";
	}


    


	
    
}
