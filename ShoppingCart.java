package Catalogue;

import java.util.*;

/*Project : Project 1
 * Class: ShoppingCart.java
 * Author: Amritpal Singh
 * Date: March 2nd, 2021
 * Stores information about the overall order
 */

public class ShoppingCart {

	private double priceMultiplierAfterDiscount;
	ArrayList<ItemOrder> cart = new ArrayList<ItemOrder>();
	
	
	// ---------------------------------------------------------------
	// This method serves as a constructor that creates an empty list of item orders
	public ShoppingCart() {
		this.cart = cart;
	   }
	
	
	// ---------------------------------------------------------------
	// This method adds an item order to the list, replacing any previous order for this item with the new order
	public void add(ItemOrder itemOrder) {
		
			cart.add(itemOrder);
		
	for(int i =0; i < cart.size()-1; i++) { //increments through the arraylist, until before the new itemOrder was added at the end. If it has, then the original order is removed
		if (itemOrder.getItem()==(cart.get(i).getItem())) {
			cart.remove(i);
		}
	}
	}
	
	
	// ---------------------------------------------------------------
	// This method sets whether or not this order gets a discount 
	public void setDiscount(boolean value) {
		if (value == true) {
			priceMultiplierAfterDiscount = .9;//multiplier set to .9, to represent the 10% applied discount
		}
		if (value == false) {
			priceMultiplierAfterDiscount = 1.0;
		}
	}
	
	
	// ---------------------------------------------------------------
	// This method returns the total cost of the shopping cart
	public double getTotal() {
		double total = 0;
		for(int i =0; i<cart.size(); i++) {//increments through the entire shopping cart to add the prices of all of the orders
			total += cart.get(i).getPrice();
		}
		return priceMultiplierAfterDiscount * total; //error in shoppingframe? initially doesnt display total until you press discount at least once
	}
	
}


