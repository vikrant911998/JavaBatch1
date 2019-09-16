package javamorning14;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
	private int roll_no;
	private String name;
	
	public void input() {
		System.out.println("Enter the rollno and name of the student");
		Scanner sc = new Scanner(System.in);
		this.roll_no = sc.nextInt();
		sc.nextLine();
		this.name = sc.nextLine();
	}
	
	public void display() {
		System.out.println("RollNo : "+this.roll_no);
		System.out.println("Name : "+this.name);
	}
	
}

public class Demo1 {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		Student s1 = new Student();
		s1.input();
		list.add(s1);
		
		Student s2 = new Student();
		s2.input();
		list.add(s2);
		
		Student s3 = new Student();
		s3.input();
		list.add(s3);
		
		//For-each loop or Enhanced for-loop
		for(Student s:list) {
			s.display();
			System.out.println();
		}
		
		

	}

}
