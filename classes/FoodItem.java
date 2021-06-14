package classes;
import java.lang.*;
import interfaces.*;
import fileio.*;

public abstract class FoodItem implements IQuantity{
	
	protected String fid;
	protected String name;
	protected int availableQuantity;
	protected double price;
	int totalFoodItem = 0;
	
	QuantityDetails qd = new QuantityDetails();
	
	public void setFid(String fid){
		this.fid = fid;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAvailableQuantity(int availableQuantity){
		this.availableQuantity = availableQuantity;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public String getFid(){
		return this.fid;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getAvailableQuantity(){
		return this.availableQuantity;
	}
	
	public double getPrice(){
		return this.price;
	}
	
	public abstract void showInfo();
	
	// These are from IQuantity
	
	public void addQuantity(int amount){
		
		if(amount>0){
		
		System.out.println("\nPrevious Item Quantity was: "+availableQuantity);
		System.out.println(+amount+ " Items Added...");
		
		availableQuantity = availableQuantity + amount;
		
		System.out.println("Current Item Quantity is: "+availableQuantity);
		}
		else{
			System.out.println("Invalid Amount...");
		}
	}
	
	public void sellQuantity(int amount){
		
		if(amount>0 && availableQuantity>=amount){
		
		System.out.println("\nPrevious Item Quantity was: "+availableQuantity);
		System.out.println(+amount + " Items Sold...");
		
		availableQuantity = availableQuantity - amount;
		
		System.out.println("Current Item Quantity is: "+availableQuantity);
		}
		else{
			System.out.println("Invalid Or Insufficient Amount...");
		}
	}
}