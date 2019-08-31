package javamorning3;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
//		int a[]= {1,2,3,5};
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of the array");
		
		for(int i=0;i<5;i++) {
			a[i] = sc.nextInt();
		}
		
//		for(int i=0;i<5;i++) {
//			System.out.println(a[i]);
//		}
		
		
		//For-Each Loop
		for(int l:a) {
				System.out.println(l);
			
		}
		
		
		

	}

}
