package com.way;

import java.util.ArrayList;

public class ShoppingCart {

	public ArrayList<Item> items;
	public int capacity;
	public double total;
	
	public ShoppingCart() {
		items = new ArrayList<Item>();
		capacity = 5;
		total = 0.0;
	}
	
	
	public void addItem(Item item) {
		
		if(items.size() < capacity) {
			items.add(item);
			total += item.price;
		}else {
			System.out.println("Item canot be added. Capacity reached");
		}
	}
	
	public void removeItem(Item item) {
	
		if(items.indexOf(item) != -1) {
			items.remove(items.indexOf(item));
			total -= item.price;
		}else {
			System.out.println("Item not found!!");
		}
		
	}
	
	public void print() {
		for(Item i:items)
			System.out.println(i.toString());
	}
	
	
	public int getCount() {
		return items.size();
	}
	
	public boolean exists(Item i) {
		return items.indexOf(i) > -1;
	}
	
	
	private class Item{
		public int itemId;
		public String itemDesc;
		public double price;
		
		
		public Item(int i, String d, double p) {
			itemId = i;
			itemDesc = d;
			price = p;
		}
		
		@Override
		public boolean equals(Object o) {
			
			if(o==null) return false;
			
			if(o==this) return true;
			
			Item i = (Item) o;
			
			if(i.itemId != this.itemId) return false;	
			
			return true;
		}
		
		
		@Override
		public int hashCode() {
			
			int prime = 31;
			int result = 1;
			
		return prime * result + this.itemId; 
			
		}
		
		@Override
		public String toString() {
			return this.itemId + " " + this.itemDesc + " " + this.price;
		}
		
	}
	
	
	public static void main(String args[]) {
		
		ShoppingCart cart = new ShoppingCart();
		
		ShoppingCart.Item i1 = cart.new Item(1, "A", 20.00);
		ShoppingCart.Item i2 = cart.new Item(2, "b", 30.00);
		ShoppingCart.Item i3 = cart.new Item(3, "c", 40.00);
		
		ShoppingCart.Item i4 = cart.new Item(4, "d", 50.00);
		ShoppingCart.Item i5 = cart.new Item(5, "e", 60.00);
		ShoppingCart.Item i6 = cart.new Item(6, "f", 70.00);
		
		cart.addItem(i1);
		cart.addItem(i2);
		cart.addItem(i3);
		cart.addItem(i4);
		cart.addItem(i5);
		cart.addItem(i6);
		
		cart.print();
		System.out.println(cart.getCount());
		
		System.out.println(" ->> "+ cart.total);
		
		cart.removeItem(i4);
		
		System.out.println(cart.getCount());
		cart.print();
		System.out.println(" ->> "+ cart.total);
		
		System.out.println(" " + cart.exists(i5));
		System.out.println(" " + cart.exists(i6));
	}
	
	
}
