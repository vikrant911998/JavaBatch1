package javamorning2;

import java.util.Scanner;

public class Ques24 {
	
	public static void main(String[] args) {
		int i=1,n,sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		n = sc.nextInt();
		
		while(i<=n) {
			sum = sum+(i*i);
			i++;
		}
		System.out.println("The sum of first "+n+" number is "+sum);
		
	}
}
