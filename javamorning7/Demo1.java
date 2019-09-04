package javamorning7;

import java.util.Scanner;

public class Demo1 {

	
	
	static int area(int l,int b) {
		return(l*b);
	}
	
	public static void main(String[] args) {
		
		int l=0, b=0;
		
	
		System.out.println("Enter the length and breadth");
		Scanner sc = new Scanner(System.in);
		l = sc.nextInt();
		b= sc.nextInt();
		
		int a = area(l,b);
		System.out.println("The area is "+a);
	}

}
