package javamorning11;


class A2{
	A2(){
		System.out.println("A2 constructor");
	}
	
	void play() {
		System.out.println("A2 play");
	}
}



class B2 extends A2{
	B2(){
		System.out.println("B2 constructor");
	}
	
	void play1() {
		System.out.println("B2 play");
	}
}



class C2 extends B2{
	C2(){
		super();
		System.out.println("C2 constructor");
	}
	
	
}

public class Demo2 {

	public static void main(String[] args) {
		C2 obj = new C2();

	}

}
