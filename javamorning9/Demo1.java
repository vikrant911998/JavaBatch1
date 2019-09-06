package javamorning9;

import java.util.ArrayList;
import java.util.Scanner;

class Employee{
	private int empid;
	private String name;
	private double salary;
	
	
	Scanner sc = new Scanner(System.in);
	
	//Default Constructor
	public Employee() {
		this.empid = 0;
		this.salary = 0;
	}
	
	public void input() {
		System.out.println("Enter the employee id ");
		this.empid = sc.nextInt();
		
		sc.nextLine();
		 
		System.out.println("Enter the employee name ");
		this.name = sc.nextLine();
		
		System.out.println("Enter the employee salary ");
		this.salary = sc.nextDouble();
		
	}
	
	
	public void display(Employee object) {
		System.out.println("Employee ID : "+object.empid);
		System.out.println("Employee Name : "+object.name);
		System.out.println("Employee Salary : "+object.salary);
	}
	
	
	
}



public class Demo1 {

	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		Employee obj1 = new Employee();
		Employee obj2 = new Employee();
		Employee obj3 = new Employee();
		
		obj1.input();
		list.add(obj1);
		
		obj2.input();
		list.add(obj2);
		
		obj3.input();
		list.add(obj3);
		
		for(Employee e:list) {
			
			e.display(e);
			System.out.println("--------------");
			System.out.println();
		}
		
	}

}










