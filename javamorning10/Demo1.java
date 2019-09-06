package javamorning10;


class A{
	
	A(){
		System.out.println("Default Constructor of class A");
	}
	
	A(int a){
		System.out.println("Value of a is "+a);
	}
	
	public void play() {
		System.out.println("The play of class A");
	}
}

class B extends A {
	
	
	B(){
		super(6);
//		super(); ->ERROR
		System.out.println("Default Constructor of Class B");
	}
	
//	public void use() {
//		A obj = new A();
//		obj.play();
//	}
	
	
}



public class Demo1 {

	public static void main(String[] args) {
		
		
		B obj = new B();
//		obj.play();
		
		
	}

}
