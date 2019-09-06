package javamorning10;


class Rectangle{
		
	private int length,breadth;
	
	public Rectangle(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	public int returnArea() {
		return (this.length*this.breadth);
	}
	
	
}

public class Demo4 {

	public static void main(String[] args) {
		
		Rectangle obj = new Rectangle(20,10);
		System.out.println(obj.returnArea());

	}

}
