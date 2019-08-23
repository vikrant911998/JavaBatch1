package javamorning;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		double per=0;
		
		System.out.println("Enter the percent");
		Scanner sc = new Scanner(System.in);
		
		per = sc.nextDouble();
		
		if(per>=90)
			System.out.println("A grade");
		else if(per <=89 && per >=70)
			System.out.println("B grade");
		else if(per <=69 && per >=50)
			System.out.println("C grade");
		else
			System.out.println("D grade");

	}

}
