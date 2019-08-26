package javamorning1;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		int base,power,i=1,result=1;
		
		System.out.println("Enter base and it's power");
		Scanner sc = new Scanner(System.in);
		base = sc.nextInt();
		power = sc.nextInt();
//		2,3
//		a= 2*1
//		a = 2*2
//		a = 2*3
		while(i<=power)
		{
			result = result *base;
			i++;
		}
		
		System.out.println("The result is "+result);

	}

}
