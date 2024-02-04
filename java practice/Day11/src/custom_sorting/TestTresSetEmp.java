package custom_sorting;

import java.util.Comparator;

import com.core.Employee;

public class TestTresSetEmp implements Comparator<Employee>{
	
	@Override
	public int compare(Employee e1,Employee e2) {
		
		return e1.getName().compareTo(e2.getName());
	}
	
}
