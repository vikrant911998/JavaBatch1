package javamorning2;

import java.util.Scanner;

public class Ques11 {

	public static void main(String[] args) {
		String name,gender,city;
		int age ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		name = sc.nextLine();
		
		System.out.println("Enter your gender");
		gender = sc.next();
		
		System.out.println("Enter your age");
		age = sc.nextInt();
		
		System.out.println("Enter your city");
		city = sc.next();
		
		if(age>25 && age<35 && gender.equalsIgnoreCase("male") && city.equalsIgnoreCase("metro")) {
			System.out.println("Premium is 6%");
		}
		

	}

}
