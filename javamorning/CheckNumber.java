package javamorning;

import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		int a = 0;
		
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		
		if(a > 0) {
			System.out.println("A is positive");
		}
		else if(a < 0) {
			System.out.println("A is negative");
		}
		else {
			System.out.println("A is Zero");
		}
	}

}
