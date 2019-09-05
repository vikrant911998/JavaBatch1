package javamorning8;

public class Demo1 {
		private int a,  b;
		
		Demo1(int a, int b){
			this.a = a;
			this.b = b;
		}
		
		void sum() {
			System.out.println("A is "+this.a);
			System.out.println("B is "+this.b);
			System.out.println("sum is "+(this.a +this.b));
		}
		
		Demo1(){
			
		}
	
	public static void main(String[] args) {
			
		Demo1 obj = new Demo1(3,4);
		obj.sum();

	}

}
