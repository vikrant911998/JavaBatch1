package javamorning15;

class A{
	
	//Function Overloading
	public void print(int i,char c) {
		System.out.println("Integer : "+i+"  and Char : "+c);
	}
	
	public void print(char c,int i) {
		System.out.println("Char : "+c+"  and Integer : "+i);
	}
}


public class Demo8 {

	public static void main(String[] args) {
		A obj  = new A();
		obj.print('F', 23);
		obj.print(23,'F');

	}

}
