package javamorning15;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		
//		String s = "";
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a message");
//		s = sc.nextLine();
//		
//		System.out.println(s);
		
		String r = "refrigerator";
		
		System.out.println("Length : "+r.length());
		
		char s[] = r.toCharArray();
		
		int count=0;
		for(int i=0;i<s.length;i++) {
			count++;
		}
		System.out.println("Length : "+count);
	}

}
