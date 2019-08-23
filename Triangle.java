package javamorning;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		//local variables
		int a=0,b=0,c=0;
		
		System.out.println("Enter the sides of the Triangle");
		Scanner sc  = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a == b && b == c) {
			System.out.println("Equilateral Triangle");
		}
		else if (a == b || b == c || c == a) {
			System.out.println("Isoceles Triangle");
		}
		else {
			System.out.println("Scalene Triangle");
		}
		
		
		sc.close();
	}

}
