package tester;

import java.util.HashSet;

import com.core.Employee;

public class TestEmp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee("BBBB", "Arpit", 2000.4); 
		Employee employee2 = new Employee("AaBB", "Bittu", 2000.4);
		Employee employee3 = new Employee("AaAa", "kalu", 2000.4);
		Employee employee4 = new Employee("BBAa", "kalu", 2000.4);
		Employee employee5 = new Employee("AaAa", "pqrs", 2000.4);

		
		HashSet<Employee> h =new HashSet<Employee>();
		
		h.add(employee1);    
		h.add(employee2);
		h.add(employee3);   
		h.add(employee4); // its empId is same and still it can be added in the set 
		                  // even if we only override the equal method the dupicates are allowed  so solution is that also overide hashcode() in Employee Class.
		                 // beacuse hasset is based on hashing which uses the concept of hashcode generator.
		h.add(employee5);
		
		for(Employee e: h) {
			System.out.println(e);
		}
		
		// in this above case the content are differnt still it will goes inside equal to because the string of empId have same hashcode and thie
		// are many links get added on the single bucket of the hashtable and the node of LL get increses so if new element come on the same 
		// bucket or same hashcode it will have to checked with the elements present on that bin LL one by one.
	}

}
