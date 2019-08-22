package javamorning;

import java.util.Scanner;

//Conditionals Statement--> IF else, Switch Case

//Tokens
		//comments
		//whitespaces
		//datatypes
		//operators -->=-> assignment operator,== ->equality operator
		//identifiers
		//()->parentheses
		//{} -> curly braces,[]->square bracket
	//Condition -if else ,loops --> true, false
public class IfElseDemo {

	public static void main(String[] args) {
		//Declaration Statement
		
//		int a = 5;
//		boolean b = false;
		
		System.out.println("Enter a number");
		Scanner sc  = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a == 1) {
			System.out.println("A is equal to one");
		}
		System.out.println();
		
		if(a==5) {
			System.out.println("A is equal to five");
		}
		
		
		
		
		
		if(a == 1) {
			System.out.println("Equal Found");
		}
//		System.out.println();
		else if(a==2) {
			System.out.println("A is equal to 2");
		}
		else if(a==3) {
			System.out.println("A is equal to 3");
		}
		else {
			System.out.println("Not Equal Found");
		}

	}

}
