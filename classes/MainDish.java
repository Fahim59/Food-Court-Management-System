package classes;
import java.lang.*;
import interfaces.*;

public class MainDish extends FoodItem{
	
	private String category;
	
	public void setCategory(String category){
		this.category = category;
	}
	
	public String getCategry(){
		return this.category;
	}
	
	public void showInfo(){
		System.out.println("Food Type: Main Dish");
		System.out.println("Food ID: "+fid);
		System.out.println("Food Name: "+name);
		System.out.println("Category: "+category);
		System.out.println("Available Quantity: "+availableQuantity);
		System.out.println("Price: "+price);
	}
}