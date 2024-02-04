package tester;

import java.util.TreeSet;

import custom_sorting.TestTreeSetDesc;

public class TestSetTreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> t1 = new TreeSet<Integer>(new TestTreeSetDesc());
		t1.add(20);
		t1.add(4);
		t1.add(90);
		t1.add(10);
		t1.add(10);
		
		System.out.println(t1);
 
	}

}
