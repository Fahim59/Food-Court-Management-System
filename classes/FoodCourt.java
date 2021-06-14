package classes;
import java.lang.*;
import interfaces.*;

public class FoodCourt implements RestaurantOperations, EmployeeOperations{
	
	public int totalEmployee=0;
	public int totalRestaurant=0;
	
	private Restaurant restaurants[] = new Restaurant[100];
	private Employee employees[] = new Employee[50];
	
	//These are from RestaurantOperations
	
	public void insertRestaurant(Restaurant r){
		
		if(totalRestaurant<restaurants.length){
			
			restaurants[totalRestaurant++]=r;
			System.out.println("\nRestaurant Inserted Successfully...");
		}
		else{
			System.out.println("\nSomething Wrong, Restaurant Cannot be Inserted...");
		}
	}
	
	public void removeRestaurant(Restaurant r){
		int index=0;
		boolean found=false;
		
		for(int i=0;i<totalRestaurant;i++){
			
			if(restaurants[i]==r){
				
				index=i;
				found=true;
				break;
			}
		}
		if(found){
			
			for(int i=index;i<totalRestaurant-1;i++)
			
			restaurants[i]=restaurants[i+1];
			totalRestaurant--;
			
			System.out.println("\nRestaurant Removed Successfully...");
		}
		else{
			System.out.println("\nInvalid ID, Restraunt doesn't exist...");
		}
	}
	
	public Restaurant getRestaurant(String rid){
	    int i;
		Restaurant r = null;
		
		for(i=0;i<totalRestaurant;i++){
			
			if(restaurants[i] != null){
				
			    if(restaurants[i].getRid().equals(rid)){
					
					r = restaurants[i];
			        break;
				}
			}
		}
		return r;
	}
	
	public void showAllRestaurants(){
		
		for(int i=0;i<totalRestaurant;i++){
			
			if(restaurants[i] != null){
				
				System.out.println("Restaurant Name: "+ restaurants[i].getName());
				System.out.println("Restaurant Id: "+ restaurants[i].getRid());
				System.out.println("\n---Food Menu---");
				restaurants[i].showAllFoodItems();
				System.out.println();
			}
		}
	}
	
	// These are from EmployeeOperations
	
	public void insertEmployee(Employee e){
		
		if(totalEmployee<employees.length){
			
			employees[totalEmployee++]=e;
			System.out.println("\nEmployee Inserted Successfully...");
		}
		else{
			System.out.println("\nSomething Wrong, Employee Cannot be Inserted...");
		}
	}
	
	public void removeEmployee(Employee e){
		int index=0;
		boolean found=false;
		
		for(int i=0;i<totalEmployee;i++){
			
			if(employees[i]==e){
				
				index=i;
				found=true;
				break;
			}
		}
		if(found){
			
			for(int i=index;i<totalEmployee-1;i++)
				
			employees[i]=employees[i+1];
			totalEmployee--;
			
			System.out.println("\nEmployee Removed Successfully...");
		}
		else{
			System.out.println("\nInvalid ID, Employee doesn't exist...");
		}
	}
	
	public Employee getEmployee(String empId){
		int i;
		Employee e = null;
		
		for(i=0;i<totalEmployee;i++){
			
			if(employees[i] != null){
			
			    if(employees[i].getEmpId().equals(empId)){
				
			    e = employees[i];
			    break;
			    }
		    }
		}
		return e;
	}
	
	public void showAllEmployees(){
		
		for(int i=0;i<totalEmployee;i++){
			
			if(employees[i] != null){
				
				System.out.println("Employee Name: "+ employees[i].getName());
				System.out.println("Employee Id: "+ employees[i].getEmpId());
				System.out.println("Salary: "+ employees[i].getSalary());
				System.out.println();
			}
			else{
				System.out.println("\nThere are no Employees in the System...");
			}
		}
	}
}