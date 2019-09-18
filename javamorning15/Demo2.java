package javamorning15;

public class Demo2 {

	public static void main(String[] args) {
		int a=34,b=0;
		
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e){
			System.out.println("Cannot divide by zero");
//			e.printStackTrace();
			
		}

	}

}
