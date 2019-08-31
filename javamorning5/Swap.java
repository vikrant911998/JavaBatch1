package javamorning5;

public class Swap {

	
	
	
	public static void main(String[] args) {
		int a=9,b=5;
		//calling function
		swap(a,b);

	}
	
	
	//function definition
	static void swap(int a, int b) {
		int temp = a;
		a=b;
		b=temp;
		System.out.println("The value of a is "+a+" and b is "+b);
	}
	

}
