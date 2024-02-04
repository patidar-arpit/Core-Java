package local;

import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int [] arr=new int[sc.nextInt()];
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
