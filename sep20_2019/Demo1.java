package sep20_2019;

//upcasting and downcasting

class A{
	void play() {
		System.out.println("Play of Class A");
	}
}

class B extends A{
	void play1() {
		System.out.println("Play1 of Class B");
	}
}



public class Demo1 {

	public static void main(String[] args) {
		 A obj = new B(); //upcasting
		 obj.play();
		 
		 B obj1;
		 obj1 = (B)obj; //downcasting
		 obj1.play();
		 obj1.play1();	
	}

}
