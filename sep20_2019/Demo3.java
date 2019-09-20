package sep20_2019;

import java.util.Scanner;

class Member{
	String name;
	int age;
	long phone;
	String address;
	double salary;
	Scanner sc = new Scanner(System.in);
	
	
	void input() {
		System.out.println("Enter your name");
		this.name = sc.nextLine();
		
		System.out.println("Enter your age");
		this.age = sc.nextInt();
		
		System.out.println("Enter your phone number");
		this.phone = sc.nextLong();
		
		sc.nextLine();
		
		System.out.println("Enter your address");
		this.address = sc.nextLine();
		
		System.out.println("Enter your salary");
		this.salary = sc.nextDouble();
	}
	
	
	void printSalary() {
		System.out.println("Salary : "+this.salary);
	}
	
}


class Employee extends Member{
	String specialization;
	String department;
	
	Employee(){
		this.specialization = "Employee";
		this.department = "IT";
	}
	
	void display() {
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
		System.out.println("Phone : "+this.phone);
		System.out.println("Address : "+this.address);
		System.out.println("Specialization : "+this.specialization);
		System.out.println("Department : "+this.department);
	}
	
	
}

class Manager extends Member{
	String specialization;
	String department;
	
	Manager(){
		this.specialization = "Manager";
		this.department = "Forensics";
	}
	
	void display() {
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
		System.out.println("Phone : "+this.phone);
		System.out.println("Address : "+this.address);
		System.out.println("Specialization : "+this.specialization);
		System.out.println("Department : "+this.department);
	}
}



public class Demo3 {

	public static void main(String[] args) {
		
//		Employee obj = new Employee();
//		obj.input();
//		obj.display();
//		obj.printSalary();
		
		
		Manager obj = new Manager();
		obj.input();
		obj.display();
		obj.printSalary();
		
	}

}
