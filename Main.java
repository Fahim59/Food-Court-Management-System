import java.lang.*;
import java.util.*;
import java.io.*;
import classes.*;
import interfaces.*;
import fileio.*;

public class Main{
	public static void main(String args[]){
		try{
		
		    Scanner sc = new Scanner(System.in);
		    FoodCourt f = new FoodCourt();
		    QuantityDetails qd = new QuantityDetails();
		
		    int option,input1,input2,input3,input4;
		
		do{
			System.out.println("-----------------------------------------");
		    System.out.println("               Welcome                   ");
			System.out.println("                  To                     ");
			System.out.println("       Food Court Management System      ");
		    System.out.println("-----------------------------------------");
			System.out.println();
		    System.out.println("1. Employee Management");
		    System.out.println("2. Restaurant Management");
		    System.out.println("3. Restaurant FoodItem Management");
		    System.out.println("4. FoodItem Quantity Add-Sell");
	        System.out.println("5. Exit");
			
			System.out.print("\nEnter any choice To Start: ");
			
			option= sc.nextInt();
			
			switch(option){
				case 1: 
				
				System.out.println("\n\t*****Employee Management*****");
				System.out.println("\t-----------------------------");
				System.out.println("1. Insert New Employee");
		        System.out.println("2. Remove Existing Employee");
		        System.out.println("3. Show All Employees");
				System.out.println("4. Search An Employee");
		        System.out.println("5. Go Back");
				
				do{
			        System.out.print("\nEnter any choice: ");
					
					input1 = sc.nextInt();
					
					switch(input1){
						case 1:
						System.out.println("\t***Insert New Employee***");
						
						System.out.print("How many Employees you want to insert? " );
						int n = sc.nextInt();
						
						for(int i=0;i<n;i++){
						
						System.out.println("\n----Employee no."+(i+1)+"----");
						System.out.print("Enter Employee Name: ");
						String n1 = sc.next();
						
						System.out.print("Enter Employee ID: ");
						String id1 = sc.next();
						
						System.out.print("Enter Employee Salary: ");
						double s1 = sc.nextDouble();
						
						Employee e1 = new Employee();
						e1.setEmpId(id1);
						e1.setName(n1);
						e1.setSalary(s1);
						
						f.insertEmployee(e1);
						}
						break;
						
						case 2:
						System.out.println("\t***Remove Existing Employee***");
						
						if(f.totalEmployee==0){
			                System.out.println("There are no Employees in the System...\n");
			                break;
		                }
						
						System.out.print("Enter Employee ID: ");
						String id2 = sc.next();
						
						Employee e2 = f.getEmployee(id2);
						f.removeEmployee(e2);
						
						break;
						
						case 3:
						System.out.println("\t***Displaying Employees***");
						
						if(f.totalEmployee==0){
			                System.out.println("There are no Employees in the System...\n");
			                break;
		                }
						
						f.showAllEmployees();
						
						break;
						
						case 4:
						System.out.println("\t***Search An Employee***");
						
						if(f.totalEmployee==0){
			                System.out.println("There are no Employees in the System...\n");
			                break;
		                }
						
						System.out.print("Enter Employee ID: ");
							String id3 = sc.next();
							
							Employee e3 = f.getEmployee(id3);
							
						if(e3 != null){
							
							System.out.println("\nEmployee ID: "+e3.getEmpId());
							System.out.println("Employee Name: "+e3.getName());
							System.out.println("Employee Salary: "+e3.getSalary());
						}
						else{
							System.out.println("Employee Does Not Exist...");
						}
						break;
						
						case 5:
						System.out.println("\t***Going Back***");
						break;
						
						default :
						System.out.println("Invalid Option!! Enter Again...");
						break;
					}
				}
				while(input1!= 5);
				break;
				
				case 2: 
				
				System.out.println("\t*****Restaurant Management*****");
				System.out.println("\t-------------------------------");
				System.out.println("1. Insert New Restaurant");
		        System.out.println("2. Remove Existing Restaurant");
		        System.out.println("3. Show All Restaurants");
				System.out.println("4. Search A Restaurant");
		        System.out.println("5. Go Back");
				
				do{
			        System.out.print("\nEnter any choice: ");
					
					input2 = sc.nextInt();
					
					switch(input2){
						case 1:
						System.out.println("\t***Insert New Restaurant***");
					
					    System.out.print("How many Restaurants you want to insert? " );
					    int n = sc.nextInt();
					
					    for(int i=0;i<n;i++){
						
					    System.out.println("\n----Restaurant no."+(i+1)+"----");
					
					    System.out.print("Enter Restaurant Name: ");
					    String n1 = sc.next();
					
					    System.out.print("Enter Restaurant ID: ");
					    String id1 = sc.next();
					
					    Restaurant r1 = new Restaurant();
					    r1.setName(n1);
					    r1.setRid(id1);
					
					    f.insertRestaurant(r1);
					    }
						break;
						
						case 2:
						System.out.println("\t***Remove Existing Restaurant***");
					
					    if(f.totalRestaurant==0){
			                System.out.println("There are no Restaurant in the System...\n");
			                break;
		                }
						
					    System.out.print("Enter Restaurant ID: ");
					    String id2 = sc.next();
						
					    Restaurant r2 = f.getRestaurant(id2);
						
						f.removeRestaurant(r2);
						
						break;
						
						case 3:
						System.out.println("\t***Displaying Restaurants***");
						
						if(f.totalRestaurant==0){
			                System.out.println("There are no Restraunts in the System...\n");
			                break;
		                }
						
					    f.showAllRestaurants();
						break;
						
						case 4:
						System.out.println("\t***Search A Restaurant***");
						
						if(f.totalRestaurant==0){
			                System.out.println("There are no Restraunts in the System...\n");
			                break;
		                }
						
					    System.out.print("Enter Restaurant ID: ");
					    String id3 = sc.next();
					
					    Restaurant r3 = f.getRestaurant(id3);
					
					    if(r3 != null){
					
					        System.out.println("\nRestaurant ID: "+r3.getRid());
					        System.out.println("Restaurant Name: "+r3.getName());
						    r3.showAllFoodItems();
					    }
					    else{
					        System.out.println("Restaurant Does Not Exist...");
					    }
						break;
						
						case 5:
					    System.out.println("\t***Going Back***");
					    break;
						
						default :
						System.out.println("Invalid Option!! Enter Again...");
						break;
					}
				}
				while(input2!= 5);
				break;
				
				case 3: 
				
				System.out.println("\t*****Restaurant FoodItem Management*****");
				System.out.println("\t----------------------------------------");
				System.out.println("1. Insert New FoodItem");
		        System.out.println("2. Remove Existing FoodItem");
				System.out.println("3. Show All FoodItems");
				System.out.println("4. Search A FoodItem");
				System.out.println("5. Go Back");
				
				do{
			        System.out.print("\nEnter any choice: ");
					
					input3 = sc.nextInt();
					
					switch(input3){
						case 1:
						System.out.println("\t***Insert New FoodItem***");
						
						if(f.totalRestaurant==0){
			                System.out.println("There are no Restaurant in the System, Add a Restaurant First...\n");
			                break;
		                }
						
					    System.out.print("How many FoodItems you want to insert? " );
					    int n = sc.nextInt();
						
					    for(int i=0;i<n;i++){
						
					    System.out.println("\n----FoodItem no."+(i+1)+"----");
						
						System.out.println("Which Type of FoodItem Do you Want to Add?");
						System.out.println("1. Main Dish");
						System.out.println("2. Appitizers");
						System.out.println("3. Go Back");
						
						System.out.print("Your Type: ");
						int type = sc.nextInt();
						
						FoodItem fi1 = null;
						
						if(type == 1){
							
							System.out.print("Enter FoodItem Name: ");
					        String n1 = sc.next();
							
					        System.out.print("Enter FoodItem ID: ");
					        String id1 = sc.next();
							
							System.out.print("Enter Category: ");
					        String c1 = sc.next();
						
						    System.out.print("Enter Available Quantity: ");
					        int q = sc.nextInt();
						
						    System.out.print("Enter FoodItem Price: ");
					        double p = sc.nextDouble();
							
							MainDish md = new MainDish();
					
					        md.setName(n1);
					        md.setFid(id1);
							md.setCategory(c1);
						    md.setAvailableQuantity(q);
						    md.setPrice(p);
							
							fi1 = md;
						}
						else if(type == 2){
							System.out.print("Enter FoodItem Name: ");
					        String n1 = sc.next();
					
					        System.out.print("Enter FoodItem ID: ");
					        String id1 = sc.next();
							
							System.out.print("Enter Size: ");
					        String s1 = sc.next();
						
						    System.out.print("Enter Available Quantity: ");
					        int q = sc.nextInt();
						
						    System.out.print("Enter FoodItem Price: ");
					        double p = sc.nextDouble();
							
							Appitizers ap = new Appitizers();
					
					        ap.setName(n1);
					        ap.setFid(id1);
							ap.setSize(s1);
						    ap.setAvailableQuantity(q);
						    ap.setPrice(p);
							
							fi1 = ap;
						}
						else if(type == 3){
							System.out.println("Going Back...");
						}
						else{
							System.out.println("Invalid Type...");
						}
						
						if(fi1 != null){
							System.out.print("Enter Restaurant ID: ");
							String r1 = sc.next();
							
							f.getRestaurant(r1).insertFoodItem(fi1);
						}
					}
						break;
						
						case 2:
						System.out.println("\t***Remove Existing FoodItem***");
						
						if(f.totalRestaurant==0){
			                System.out.println("There are no FoodItems in the System...\n");
			                break;
						}
						
						System.out.print("Enter Restaurant ID: ");
						String r2 = sc.next();
						
					    System.out.print("Enter FoodItem ID: ");
					    String id2 = sc.next();
						
						f.getRestaurant(r2).removeFoodItem(f.getRestaurant(r2).getFoodItem(id2));
						
						break;
						
						case 3:
						System.out.println("\t-----Displaying FoodItems-----");
						
						if(f.totalRestaurant==0){
			                System.out.println("There are no FoodItems in the System...\n");
			                break;
						}
						
						System.out.print("Enter Restaurant ID: ");
						String r3 = sc.next();
						
						f.getRestaurant(r3).showAllFoodItems();
						
						break;
						
						case 4:
						System.out.println("\t***Search A FoodItem***");
						
						if(f.totalRestaurant==0){
			                System.out.println("There are no FoodItems in the System...\n");
			                break;
						}
						
						System.out.print("Enter Restaurant ID: ");
						String r4 = sc.next();
						System.out.print("Enter FoodItem ID: ");
						String id3 = sc.next();
						
						FoodItem fi = f.getRestaurant(r4).getFoodItem(id3);
						
						if(fi != null){
							fi.showInfo();
						}
						break;
						
						case 5:
						
						System.out.println("\t***Going Back***");
						break;
						
						default :
						System.out.println("Invalid Option!! Enter Again...");
						break;
					}
				}
				while(input3!= 5);
				break;
				
				case 4:
				
				System.out.println("\t*****FoodItem Quantity Add-Sell*****");
				System.out.println("\t------------------------------------");
				System.out.println("1. Add FoodItem");
		        System.out.println("2. Sell FoodItem");
				System.out.println("3. Show Add-Sell History");
				System.out.println("4. Go Back");
				
				do{
			        System.out.print("\nEnter any choice: ");
					
					input4 = sc.nextInt();
					
					switch(input4){
						case 1:
						System.out.println("\tAdd FoodItem");
						
						System.out.print("Enter Restaurant ID: ");
						String rid1 = sc.next();
						
						System.out.print("Enter FoodItem ID: ");
						String fid1 = sc.next();
						
						System.out.print("Enter Quantity For Adding: ");
						int q1 = sc.nextInt();
						
						if(q1>0){
							
							qd.writeInFile(+q1+" item has been Added in Food Item ID "+ fid1);
							f.getRestaurant(rid1).getFoodItem(fid1).addQuantity(q1);
						}
						break;
						
						case 2:
						System.out.println("\tSell Quantity");
						
						System.out.print("Enter Restaurant ID: ");
						String rid2 = sc.next();
						
						System.out.print("Enter FoodItem ID: ");
						String fid2 = sc.next();
						
						System.out.print("Enter Quantity For Selling: ");
						int q2 = sc.nextInt();
						
						if(q2>0 && q2<= f.getRestaurant(rid2).getFoodItem(fid2).getPrice()){
							
							qd.writeInFile(+q2+" item has been Sold from Food Item ID "+ fid2);
							f.getRestaurant(rid2).getFoodItem(fid2).sellQuantity(q2);
						}
						break;
						
						case 3:
						System.out.println("\t***Showing Add-Sell History***");
						qd.readFromFile();
						
						break;
						
						case 4:
						System.out.println("\t***Going Back***");
						break;
						
						default :
						System.out.println("Invalid Option!! Enter Again...");
						break;
					}
				}
				while(input4!= 4);
				break;
				
				case 5:
				System.out.println("\t***System Closing...***");
				System.exit(0);
				break;
				
				default :
				System.out.println("Invalid Option!! Enter Again...");
				break;
			}
		}
		while(option!= 5);
		}
		catch(InputMismatchException a){
				System.out.println("------------------------------------------------");
				System.out.println("Oops !!! You have entered wrong input...");
				System.out.println("Exception Occured!!! InputMismatchException...");
				System.out.println("------------------------------------------------");
		}
	}
}