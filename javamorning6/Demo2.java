package javamorning6;

import java.util.Scanner;

public class Demo2 {
	
	static void checkGrade(int percent) {
		
		if(percent >= 90 && percent <= 100) {
			System.out.println("Grade A");
		}
	}
	public static void main(String[] args) {
		int percent=0;
			
		System.out.println("Enter the percent");
		Scanner sc = new Scanner(System.in);
		
		percent = sc.nextInt();
		
		checkGrade(percent);

	}

}
