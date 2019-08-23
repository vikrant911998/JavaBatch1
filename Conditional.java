package javamorning;

import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
		
		int a =0;
		String b="";
		
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		a =sc.nextInt();
		
		b = a%2==0 ? "Even" : "Odd";
		
//		if(a%2 == 0)
//			b ="Even";
//		else
//			b="Odd";
		
		System.out.println(b);

	}

}
