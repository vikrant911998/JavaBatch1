package javamorning15;

class PrintNumber{
	
	public void printn(int a){
		System.out.println("Integer type "+a);
	}
	
	public void printn(double d) {
		System.out.println("Double Type "+d);
	}
	
	public void printn(byte b) {
		System.out.println("Byte type "+b);
	}
	
}



public class Demo7 {

	public static void main(String[] args) {
		PrintNumber pn = new PrintNumber();
		pn.printn(5);
		
		pn.printn(46783);
		
		pn.printn(2345677.8765432);
		
	}

}
