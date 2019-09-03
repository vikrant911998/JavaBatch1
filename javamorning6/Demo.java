package javamorning6;

public class Demo {
	

	static void checkTriangle(int a,int b,int c) {
			if(a==b && b==c) {
				System.out.println("Equilateral Triangle");
			}
			else if(a == b || b == c || c == a) {
				System.out.println("Isoceles Triangle");
			}
			else {
				System.out.println("Scalene Triangle");
			}
	}
		
	public static void main(String[] args) {
		
		
		checkTriangle(3,5,4);

	}

}
