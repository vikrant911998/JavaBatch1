package javamorning9;



public class Triangle {
	
	private int a,b,c;
	
	public Triangle(int a,int b,int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void perimeter() {
		System.out.println("Perimeter : "+(this.a+this.b+this.c));
	}
	
	
	
	
	public static void main(String[] args) {
		Triangle triangle = new Triangle(3,4,5);
		triangle.perimeter();
	}

}


//public class Triangle {
//	
//	private int a,b,c;
//	
//	public Triangle(){
//		this.a = 3;
//		this.b = 4;
//		this.c = 5;
//	}
//	
//	public void perimeter() {
//		System.out.println("Perimeter : "+(this.a+this.b+this.c));
//	}
//	
//	
//	
//	
//	public static void main(String[] args) {
//		Triangle triangle = new Triangle();
//		triangle.perimeter();
// 	}
//
//}
