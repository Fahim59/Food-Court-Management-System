package classes;
import java.io.*;
import java.lang.*;
import interfaces.*;

public class Restaurant implements FoodItemOperations{
	
	public int totalFoodItem=0;
	
	private String rid;
	private String name;
	private FoodItem fooditems[] = new FoodItem[100];
	
	public void setRid(String rid){
		this.rid = rid;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getRid(){
		return this.rid;
	}
	
	public String getName(){
		return this.name;
	}
	
	// These are from FoodItemOperations
	
	public void insertFoodItem(FoodItem fi){
		
		if(totalFoodItem<fooditems.length){
			
			fooditems[totalFoodItem++]=fi;
			System.out.println("\nFoodItem Inserted Successfully...");
		}
		else{
			System.out.println("\nSomething Wrong, FoodItem Cannot be Inserted...");
		}
	}
	
	public void removeFoodItem(FoodItem f){
		int index=0;
		boolean found=false;
		
		for(int i=0;i<totalFoodItem;i++){
			
			if(fooditems[i]==f){
				
				index=i;
				found=true;
				break;
			}
		}
		if(found){
			
			for(int i=index;i<totalFoodItem-1;i++)
				
			fooditems[i]=fooditems[i+1];
			totalFoodItem--;
			
			System.out.println("\nFoodItem Removed Successfully...");
		}
		else{
			System.out.println("\nInvalid ID, FoodItem doesn't exist...");
		}
	}
	
	public FoodItem getFoodItem(String fid){
		int i;
		FoodItem f = null;
		
		for(i=0;i<totalFoodItem;i++){
			
			if(fooditems[i] != null){
			
			    if(fooditems[i].getFid().equals(fid)){
					
					f = fooditems[i];
			        break;
				}
			}
		}
		return f;
	}
	
	public void showAllFoodItems(){
		
		for(int i=0;i<totalFoodItem;i++){
			
			if(fooditems[i] != null){
				
				fooditems[i].showInfo();
				System.out.println();
			}
		}
	}
}