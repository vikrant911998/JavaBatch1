package javamorning4;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list  = new ArrayList<>();
		
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		num = sc.nextInt();
		
		while(num != 0) {
			int temp = num%10;
			list.add(temp);
			num = num/10;
		}
		
		for(int i:list) {
			System.out.println(i);
		}

	}

}
