package javamorning12;

import java.util.Scanner;

class Car{
	protected int speed;
	protected String name;
	
	public void display() {
		System.out.println("Name : "+this.name);
		System.out.println("Speed : "+this.speed);
	}
	
}



class SportCar extends Car{
	private String tyre;
	
	SportCar(String name,int speed){
		this.name = name;
		this.speed = speed;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void getTyre() {
		System.out.println("Enter the name of tyre");
		tyre = sc.next();
	}
}




class LuxuryCar extends Car{
	private String interior;
	
	Scanner sc = new Scanner(System.in);
	
	
	LuxuryCar(String name,int speed){
		this.name = name;
		this.speed = speed;
	}
	
	public void getInterior() {
		System.out.println("Enter the name of Interior");
		interior = sc.next();
	}
}




public class Demo1 {

	public static void main(String[] args) {
		
		SportCar obj1 = new SportCar("Aston Martin",350);
		LuxuryCar obj2 = new LuxuryCar("RollsRoyce",300);
		obj1.getTyre();
		obj2.getInterior();
		obj1.display();
		obj2.display();
	}

}
