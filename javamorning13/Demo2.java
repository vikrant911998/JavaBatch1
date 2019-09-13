package javamorning13;

public class Demo2 {

	public static void main(String[] args) {
		
		String a = "hello";//String pool ->"hello"(3400) ->a= 3400
		String b = "hello";//String pool ->"hello"(3400) ->b = a
//		if(a == b) {
//			System.out.println("Same");
//		}
		
		String obj = new String("Hi");//new ->1100 ->obj =1100
		String obj1 = new String("Hi");//new ->1200 -> obj1 = 1200
		
		if(obj == obj1) {
			System.out.println("Again Same");
		}
		else {
			System.out.println("Not same");
		}
	}

}
