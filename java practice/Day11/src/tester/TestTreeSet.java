package tester;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> h1 = new TreeSet<Integer>(); //   order in sorting 
		System.out.println(h1.add(100));
		System.out.println(h1.add(20));
		h1.add(30);
		h1.add(400);
		h1.add(50);
		System.out.println(h1.add(100));
		h1.add(20);
		for(int i :h1) {
			System.out.print(i+" ");
		}

	}

	}

