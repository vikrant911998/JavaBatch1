package javamorning4;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of the array");
		
		for(int i=0;i<5;i++) {
			a[i] = sc.nextInt();
		}
		
		
		for(int i:a) {
			if(i%5 ==0) {
				System.out.println(i+"  Divided by 5");
			}
			else {
				System.out.println(i+"  Not Divided by 5");
			}
		}
	}

}
