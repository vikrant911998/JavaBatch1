package javamorning;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		int a =0,b=0,c=0;
//		int k=0;
//		k=2;
		System.out.println("Enter two character");
		Scanner sc = new Scanner(System.in);
		
		a =sc.nextInt();//->2
		b=sc.nextInt();//->3
		
		c = a;//c= 2
		a = b;//a= 3
		b = c;//b= 2
		System.out.println("A is "+a);
		System.out.println("B is "+b);
		
	}

}
