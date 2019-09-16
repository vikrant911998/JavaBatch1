package javamorning14;

import java.util.InputMismatchException;
import java.util.Scanner;

class A{
	int a;
	
}

public class Demo2 {

	public static void main(String[] args) throws InputMismatchException {
		A obj = new A();
		
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		
		//try {
			
			obj.a = sc.nextInt();
			
			System.out.println("A's value : "+obj.a);
//		}
//		catch(InputMismatchException e) {
//			System.out.println("Input mismatch");
//		}
//		catch(Exception e){
//			
//			System.out.println("Invalid input");
//		}
//		finally {
//			System.out.println("Final Run");
//		}
		
		
		

	}

}
