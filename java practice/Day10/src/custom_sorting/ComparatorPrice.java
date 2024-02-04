package custom_sorting;

import java.util.Comparator;

import com.app.core.Vehicle;

public class ComparatorPrice implements Comparator<Vehicle> {
  
	
	
	@Override 
	public int compare(Vehicle v1 , Vehicle v2 ) { // Signature inside Comparator
		                                          //public int compare(T o1,T o2)
		
		if(v1.getVehColor().getAdditionalCost() < v2.getVehColor().getAdditionalCost())
			return 0;
		if(v1.getVehColor().getAdditionalCost() > v2.getVehColor().getAdditionalCost())
			return 1;
		else
			return 0;
		
	}
}
