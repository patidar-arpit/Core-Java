package tester;

import java.util.*;

public class TestlinkedSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> h1 = new LinkedHashSet<Integer>();  //   maintain the insertion  order
		System.out.println(h1.add(10));
		System.out.println(h1.add(20));
		h1.add(30);
		h1.add(40);
		h1.add(50);
		System.out.println(h1.add(10));
		h1.add(20);
		for(int i :h1) {
			System.out.print(i+" ");
		}

	}

}
