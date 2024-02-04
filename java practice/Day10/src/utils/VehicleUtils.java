package utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.app.core.Color;
import com.app.core.Vehicle;

public class VehicleUtils {

	
	
	public static List<Vehicle> getSampleData(){
		
	 List<Vehicle> v = new ArrayList<Vehicle>();
//chasisNo,Color,basePrice,manufactureDate,Company
	 v.add(new Vehicle("abc-123",Color.valueOf("BLACK"),20000,LocalDate.parse("2023-10-10"),"HONDA"));
	 v.add(new Vehicle("abc-123",Color.valueOf("WHITE"),10000,LocalDate.parse("2023-10-10"),"HONDA"));
	 v.add(new Vehicle("abc-123",Color.valueOf("GREY"),30000,LocalDate.parse("2023-10-10"),"HONDA"));
	 v.add(new Vehicle("abc-123",Color.valueOf("BLACK"),50000,LocalDate.parse("2023-10-10"),"HONDA"));
	 v.add(new Vehicle("abc-123",Color.valueOf("BLACK"),60000,LocalDate.parse("2023-10-10"),"HONDA"));
	 
		
	}
}
