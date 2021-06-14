package classes;
import java.lang.*;
import interfaces.*;

public class Appitizers extends FoodItem{
	
	private String size;
	
	public void setSize(String size){
		this.size = size+"'";
	}
	
	public String getSize(){
		return this.size;
	}
	
	public void showInfo(){
		System.out.println("Food Type: Appitizers");
		System.out.println("Food ID: "+fid);
		System.out.println("Food Name: "+name);
		System.out.println("Size: "+size);
		System.out.println("Available Quantity: "+availableQuantity);
		System.out.println("Price: "+price);
	}
}