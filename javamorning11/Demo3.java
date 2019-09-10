package javamorning11;

class A{
	A(){
		System.out.println("a constructor");
	}
}


class B extends A{
	B(){
		System.out.println("B constructor");
	}
}


class C extends A{
	C(){
		System.out.println("C constructor");
	}
}


public class Demo3 {

	public static void main(String[] args) {
		B obj1 = new B();
		C obj2 = new C();
	}

}
