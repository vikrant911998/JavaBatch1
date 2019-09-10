package javamorning11;

import java.util.Scanner;

public class Employee {
	private int year,salary;
	private String name,address;
	Scanner sc= new Scanner(System.in);
	
	public void input() {
		System.out.println("Enter the name");
		this.name = sc.nextLine();
		System.out.println("Enter the Address");
		this.address = sc.nextLine();
		System.out.println("Enter the year and salary");
		this.year = sc.nextInt();
		this.salary =  sc.nextInt();
	}
	
	public void display() {
		System.out.println(this.name+"        "+this.year+"         "+this.address);
		
	}
	
	
	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.input();
		System.out.println("Name           Year          Address");
		obj.display();
	}

}
