package javamorning;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Fahernit {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#.###");
		double f = 0, c=0;
		char c1;
		System.out.println("Enter the value of temperature in fahernit");
		Scanner sc = new Scanner(System.in);
		
		f = sc.nextDouble();
		
		c = ( (f-32) *5)/9;
		
		System.out.println("The temperature in Celsius is "+df.format(c));
		
		sc.close();
	}

}
