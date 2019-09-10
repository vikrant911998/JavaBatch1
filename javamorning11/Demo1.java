package javamorning11;

class A1{
	A1(){
		System.out.println("A1 constructor");
	}
	
	void play() {
		System.out.println("A1's play");
	}
}



class B1 extends A1{
	B1(){
		System.out.println("B1 constructor");
	}
}


public class Demo1 {

	public static void main(String[] args) {
		
		B1 obj = new B1();
		obj.play();
	}

}
