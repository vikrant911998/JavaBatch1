package javamorning7;

class SimpleInterest{
	//instance variable
	private double principal,rate,time;
	
	
	//Constructor
	//Default Constructor
	public SimpleInterest() {
		System.out.println("Constructor Called");
	}
	
	//Parameterised Constructor
	public SimpleInterest(int a) {
		principal = a;
	}
	
	
	public SimpleInterest(int principal, int rate) {
		this.principal = principal;
		this.rate = rate;
	}

	//member functions
	public void setData(double p,double r, double t) {
		principal = p;
		rate = r;
		time = t;
	}
	
	void display() {
		System.out.println("The principal amount is "+principal);
		System.out.println("The rate is "+rate);
		System.out.println("The Time is "+time);
	}
	
}



public class Demo2 {

	public static void main(String[] args) {
		SimpleInterest obj = new SimpleInterest();
		SimpleInterest obj1 = new SimpleInterest(8);
		SimpleInterest obj2 = new SimpleInterest(4,5);
//		obj.setData(4000, 2, 3);
		obj2.display();
	}

}
