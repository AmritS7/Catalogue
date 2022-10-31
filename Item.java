package Catalogue;

import java.text.*;

/*Project : Project 1
 * Class: Item.java
 * Author: Amritpal Singh
 * Date: March 2nd, 2021
 * Stores information about individual items 
 */

public class Item {

	private String name;
	private double price;
	private int bQuantity;
	private double bPrice;
	
	NumberFormat nf = NumberFormat.getCurrencyInstance();
	
	
	// ---------------------------------------------------------------
	// This method serves as a constructor that takes a name and a price as arguments
	// It also throws a exception if the price is negative
	public Item (String name, double price){
		this.name = name;
		this.price = price;
		
		if (this.price < 0) {
			throw new IllegalArgumentException("Can not have a negative price!");
		}
	}
	
	
	// ---------------------------------------------------------------
	// This method serves as a constructor that takes a name, a single-item price, a bulk quantity and a bulk price as arguments
	// It also throws an exception if any of the numbers is negative
	public Item(String name, double price, int bulkQuantity, double bulkPrice) {
		this.name = name;
		this.price = price;
		this.bQuantity = bulkQuantity;
		this.bPrice = bulkPrice;
		
		if (this.price < 0 || this.bQuantity < 0 || this.bPrice < 0) {
			throw new IllegalArgumentException("Can not have a negative price, bulk quantity or bulk price!");
		}
	}
	
	
	// ---------------------------------------------------------------
	// This method returns the price for a given quantity of the item (taking into account bulk price, if applicable)
	// It also throws an exception if quantity is negative
	public double priceFor(int quantity) {
		
		double total;
		
		if (this.bPrice != 0 && this.bQuantity != 0) { //if the bulk quantity and bulk price are entered using the second constructor the following code will execute
		int numBulk = quantity / this.bQuantity; //returns how many times the bulkprice can be used
		int numLeftOver = quantity %  this.bQuantity; //returns the extra amount of times the individual price will have to be used
		total = ((numBulk * this.bPrice) + (numLeftOver * price));
		}
		else {
			total = this.price * quantity;
		}
		
		if (quantity < 0) {
			throw new IllegalArgumentException("Can not have a negative quantity!");
			}
		
		return total;
	}
	
	
	// ---------------------------------------------------------------
	// This method returns a String representation of this item
	// If there is a bulk price or quantity, then those are stated in parentheses
	public String toString() {
		String returnString;
			if (this.bPrice != 0 && this.bQuantity != 0) {
				
					returnString = (this.name + ", " + nf.format(this.price) + " (" + bQuantity + " for " + nf.format(this.bPrice) + ")");
			}
			else { 
				returnString = (this.name + ", " + nf.format(this.price));
			}
			return returnString;
		}
	
	
}
