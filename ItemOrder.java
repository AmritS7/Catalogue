package Catalogue;

/*Project : Project 1
 * Class: ItemOrder.java
 * Author: Amritpal Singh
 * Date: March 2nd, 2021
 * Stores information about a particular item and the quantity ordered for that item
 */

public class ItemOrder {

	private Item item;
	private int quantity;
	
	
	// ---------------------------------------------------------------
	// This method serves as a constructor that creates an item order for the given item and given quantity
	public ItemOrder(Item item, int quantity){
		this.item = item;
		this.quantity = quantity;
	}
	
	
	// ---------------------------------------------------------------
	// This method returns the cost for this item order
	public double getPrice() {
		return this.item.priceFor(this.quantity);
	}
	
	
	// ---------------------------------------------------------------
	// This method returns a reference to the item in this order
	public Item getItem() {
		return this.item;
	}
}
