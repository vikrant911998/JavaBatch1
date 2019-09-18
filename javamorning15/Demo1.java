package javamorning15;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
//		Demo1 obj  =new Demo1();
		
		int number=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		try {
			number = sc.nextInt();
		}
		catch(Exception e) {
			System.out.println("Something has gone wrong....");
		}
		finally {
			System.out.println("Final run");
		}
		
		
		System.out.println("Number : "+number);

	}

}
