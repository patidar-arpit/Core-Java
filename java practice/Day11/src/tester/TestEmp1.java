package tester;

import java.util.HashSet;
import java.util.TreeSet;

import com.core.Employee;

public class TestEmp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee1 = new Employee("abc-123", "Arpit", 2000.4); 
		Employee employee2 = new Employee("pqr-125", "Bittu", 2000.4);
		Employee employee3 = new Employee("xyz-126", "kalu", 2000.4);
		Employee employee4 = new Employee("abc-123", "kalu", 2000.4);
		Employee employee5 = new Employee("pqr-125", "pqrs", 2000.4);
		Employee employee6 = new Employee("arpit", "pqrs", 2000.4);

		
		HashSet<Employee> h =new HashSet<Employee>();
		
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
		
		//internally wwhen we add element in hashset it generate the hashcode and then add that element in the linked list present 
		//at that node and after that if we add another element it go on the hashcode geenerated by that element and then check the list 
		//by calling equals methdo if it is already present than it will not add  

	}

}
