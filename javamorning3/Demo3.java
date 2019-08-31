package javamorning3;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		
		int sum =0;
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of the array");
		
		for(int i=0;i<5;i++) {
			a[i] = sc.nextInt();
		}
		
		for(int l:a) {
			sum =sum + l;
		}
		System.out.println("The sum of all elements of the array is "+sum);

	}

}
