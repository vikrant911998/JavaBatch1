package javamorning6;

class A{
	//instance variable
	int a;
	
	
	//member functions
	void display() {
		System.out.println("The value of a is "+a);
	}
	
}



public class Demo1 {
	
		public static void main(String[] args) {
			
			A obj = new A();
			System.out.println("The obj a is "+obj.a);
			obj.display();
		}
	

}
