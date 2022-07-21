package com.demo.collection;

import java.util.ArrayList;

class Employee {

	int id;
	String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	void Display() {
		System.out.println("my id = " + id + " my name is : " + name);
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome  to main method......");

		Employee t1 = new Employee(101, "ABC");
		Employee t2 = new Employee(101, "PQR");
		Employee t3 = new Employee(101, "STU");
		Employee t4 = new Employee(101, "XYZ");

		ArrayList<Employee> myList = new ArrayList<Employee>();
		myList.add(t1);
		myList.add(t2);
		myList.add(t3);
		myList.add(t4);
		t1.Display();
		t2.Display();
		t3.Display();
		t4.Display();
		System.err.println(myList.equals(t1));
		System.err.println(myList.equals(t2));
		System.err.println(myList.equals(t3));
		System.err.println(myList.equals(t4));
	}

}
