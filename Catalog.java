package Catalogue;

import java.util.*;

/*Project : Project 1
 * Class: Catalog.java
 * Author: Amritpal Singh
 * Date: March 2nd, 2021
 * Stores information about a Catalog of these items
 */

public class Catalog {

	private String catName;
	private int index;
	ArrayList <Item> catList = new ArrayList<Item>(); 
	
	
	// ---------------------------------------------------------------
	// This method serves as a constructor that takes the name of this catalog as a parameter
	public Catalog(String name) {
		this.catName = name;
	}
	
	
	// ---------------------------------------------------------------
	// This method adds an Item at the end of this list
	public void add(Item item) {
		catList.add(item);
	}
	
	
	// ---------------------------------------------------------------
	// This method returns the number of items in this list
	public int size() {
		int numItems = catList.size();
		return numItems;
	}
	
	
	// ---------------------------------------------------------------
	// This method returns the Item with the given index
	public Item get(int index) {
		return catList.get(index);
	}
	
	
	// ---------------------------------------------------------------
	// This method returns the name of this catalog
	public String getName() {
		return this.catName;
	}
}
