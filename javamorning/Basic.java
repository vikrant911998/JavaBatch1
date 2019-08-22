package javamorning;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		int a=0,b =0;
		
		System.out.println("Enter two numbers");
		Scanner sc= new Scanner(System.in);
		a =sc.nextInt();
		b= sc.nextInt();
		
		int c =a+b;
		System.out.println("Sum is "+c);
//		System.out.println("Sum is "+(a+b));
	}

}
