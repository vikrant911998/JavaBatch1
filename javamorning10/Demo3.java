package javamorning10;

class Area{
	
	private int length,breadth;
	
	public void setDim(int length,int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public int getArea() {
			return(this.length*this.breadth);
	}
}

public class Demo3 {

	public static void main(String[] args) {
		Area obj = new Area();
		obj.setDim(10, 20);
		System.out.println( obj.getArea() );

	}

}
