package javamorning10;

//Multilevel  Inheritance
class First{
	
	public void show1() {
		System.out.println("SHow of First");
	}
	
	First(){
		System.out.println("First Constructor Called...");
	}
}

class Second extends First{
	
	public void show2() {
		System.out.println("SHow of Second");
	}
	Second(){
		super();
		System.out.println("Second Constructor Called...");
	}
	
}

class Third extends Second{
	Third(){
		super();
		System.out.println("Third Constructor Called...");
	}
	
	public void show3() {
		System.out.println("SHow of Three");
	}
	
}


public class Demo2 {

	public static void main(String[] args) {
//		Third obj = new Third();
//		obj.show3();
		
//		Second obj = new Second();
//		obj.show2();
		First obj = new First();
		obj.show1();
		

	}

}
