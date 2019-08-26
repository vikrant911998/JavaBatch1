package javamorning1;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		
		String day;
//		System.out.println("The day is "+day);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any day from the week");
		day  = sc.next();
		
		switch(day) {
			case "Monday":System.out.println("The day is Monday");
				break;
			case "Tuesday":System.out.println("The day is Tuesday");
				break;
			case "Wednesday":System.out.println("The day is Wednesday");
				break;
			case "Thursday":System.out.println("The day is Thursday");
				break;
			case "Friday":System.out.println("The day is Friday");
				break;
			case "Saturday":System.out.println("The day is Saturday");
				break;
			case "Sunday":System.out.println("The day is Sunday");
				break;
			
			default:System.out.println("Invalid Input");
				break;
			
		}

	}

}
