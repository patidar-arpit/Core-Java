package utils;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

import com.app.core.Color;
import com.app.core.Vehicle;

import custom_exception.VehicleHandlingException;

public class VehicleValidation {
	
	
	
	public static void checkDuplicate(String chNo,List<Vehicle> vehicles)throws VehicleHandlingException {
         
	    Vehicle v = new Vehicle(chNo);
		if(vehicles.contains(v))
			 throw new VehicleHandlingException("Duplicate Chasis No of Vehicle");
		
		System.out.println("Not Duplicated Vehicle");
		
			
   }
	
	public static LocalDate manDateValidation(String str)throws DateTimeParseException,VehicleHandlingException {
		LocalDate manfDate = LocalDate.parse(str);
		LocalDate fixedDate = LocalDate.of(2020, 1, 1);
		
		
		if(manfDate.isBefore(fixedDate))
			 throw new VehicleHandlingException("OLd Model of Vehicle.!");
		
		System.out.println("New Model");
		
		return manfDate;
		
	}
	
	public static Color colorValidation(String str) throws IllegalArgumentException{
		Color userColor = Color.valueOf(str.toUpperCase());
		System.out.println("Color is fine");
		return userColor;
	}

	public static Vehicle validateAllInput(String chasisNo, String color, double baseprice, String date, String company,List<Vehicle> list) throws VehicleHandlingException{
		// TODO Auto-generated method stub
		
		
		
		checkDuplicate(chasisNo, list);
		Color c = colorValidation(color);
		LocalDate d1 = manDateValidation(date);
		
		return  new Vehicle(chasisNo,c,baseprice,d1,company);
		
	}

}
