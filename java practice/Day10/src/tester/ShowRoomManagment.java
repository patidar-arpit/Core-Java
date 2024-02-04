package tester;
import com.app.core.*;

import custom_sorting.ComparatorPrice;
import utils.VehicleValidation;

import java.util.*;


public class ShowRoomManagment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  try(Scanner scanner =new Scanner(System.in)){
		 List<Vehicle> vehList = new ArrayList<Vehicle>();
		 
		 while(true) {
			 System.out.println("1 . Add a vehicle 2.Display All \n" + "3. Get Specific Vehicle details \n"
						+ "4. Apply discount \n"+"8.Sort the vehicle acc to chasisnNo.\n"+"9.Sort the vehicle acc to price.(custom Sorting)\n"+"0.Exit");
			 
			 System.out.println("Choose an option");
			 
			 System.out.println("Enter a choice");
			 try {
				 switch(scanner.nextInt()) {
			
				     case 1:
			    	      
				    	      System.out.println("Enter the Car details:(chasisNo,Color,basePrice,manufactureDate,Company");
				    	      Vehicle vehicle =VehicleValidation.validateAllInput(scanner.next(),scanner.next(),scanner.nextDouble(),scanner.next(),scanner.next(),vehList); 
				    	      vehList.add(vehicle);
				    	      
				    	      break;
				     case 2:
				    	    for(Vehicle v :vehList) {
				    	        System.out.println(v.toString());
				    	    }
				    	    
				    	    break;
				    	    
				     case 3:
				    	 
				     
				    	   break;
				     case 5:
				    	  
				    	 vehList = getSampleData();
				    	  
				    	  break;
				     case 8:
				    	   //first we have to create the obj of our class;
				    	   
				    	   
				    	   Collections.sort(vehList); // if we apply directly it will say not applicable we have to overide
				    	                              // toCompare() method in the Vehicle class and implements the comparable interface
				    	                              // this method will internally calls the toCompare() method 
				    	                               // this is natural sorting based on chasisNo (PK)
				    	   break;
				    	   
				     case 9:
				    	 
				    	  Comparator<Vehicle> cpComparator  = new ComparatorPrice();
				    	  
				    	  Collections.sort(vehList,cpComparator);  // Now if i want to change the key on which sorting is done
				    	                              //Basically i want to do the custom soritng based on price so 
				    	                             // we have to create the new class and this class should be implement Comparator i/f 
				    	                             //and that class should also override the compare( , ) method
				    	                             //sort method will internally call above method
				    	  
				    	  break;
				    	  
				     case 0:
				    	 
				    	   System.exit(0);
				    	   
				  }
			}
			 catch (Exception e) {
					// TODO: handle exception
				   System.out.println(e.getMessage());
				}
		}
			 
	  }
	 catch (Exception e) {
		// TODO: handle exception
		  System.out.println(e);
			System.out.println("Pls retry....");
		  
	}
	  
     
  }
}
