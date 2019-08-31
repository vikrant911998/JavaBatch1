package javamorning4;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of the array");
		
		for(int i=0;i<5;i++) {
			a[i] = sc.nextInt();
		}
		
		int j=a.length-1;
		
		for(int i=0;i<a.length/2;i++) {
			int temp  = a[i];
			a[i] = a[j];
			a[j] = temp;
			
			j--;
		}
		
		for(int i:a) {
			System.out.println(i);
		}

	}

}
