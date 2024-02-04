package tester;

import java.util.Comparator;
import java.util.TreeSet;

import com.core.Employee;

import custom_sorting.TestTresSetEmp;

public class TestTreeSetEmp1 {

	public static void main(String[] args) {
            
		Employee employee1 = new Employee("abc-123", "arpit", 2000.4); 
		Employee employee2 = new Employee("pqr-125", "Arpit", 2000.4);
		Employee employee3 = new Employee("Xyz-126", "Black", 2000.4);
		Employee employee4 = new Employee("abc-123", "kalu", 2000.4);
		Employee employee5 = new Employee("pqr-125", "pqrs", 2000.4);
		Employee employee6 = new Employee("Arpit", "Aniket", 2000.4);

		
		Comparator<Employee>comparator =new TestTresSetEmp(); // sorting is done on the basis of the custom sorting
		
		TreeSet<Employee> h = new TreeSet<Employee>(comparator);
		
		h.add(employee1);    
		h.add(employee2);
		h.add(employee3);
		h.add(employee4); // its empId is same and still it can be added in the set 
		                  // even if we only override the equal method the dupicates are allowed  so solution is that also overide hashcode() in Employee Class . 
		h.add(employee5);
		h.add(employee6);
		
		for(Employee e: h) {
			System.out.println(e);
		}
	}
}


