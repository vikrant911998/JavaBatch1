package javamorning3;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of the array");
		
		for(int i=0;i<5;i++) {
			a[i] = sc.nextInt();
		}
		
		for(int l:a) {
			
			if(l%2 ==0)
				System.out.println(l+" Even");
			else
				System.out.println(l+" Odd");
					
		}
		
		
		

	}

}
