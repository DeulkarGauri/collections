package com.demo.collection;

import java.util.ArrayList;

// an array in this program we  perform many operations
public class JoyTest {

	public static void main(String[] args) {
		System.out.println("main method starts here : ");
		// ArrayList a1 = new ArrayList<>();

		// System.out.println(a1);
		// LinkedList<String> list2 = new LinkedList<>(a1);
		ArrayList<Integer> list3 = new ArrayList();
		// System.out.println("capacity of vector before adding an element =
		// "+list3.capacity());
		// System.out.println("size of vector before ="+list3.size());

		list3.add(10);
		list3.add(20);
		list3.add(30);
		list3.add(40);
		list3.add(50);
		System.out.println("my list elements are " + list3);
		// list3.add(34);
		// System.out.println("my new list elements are "+ list3);
		list3.add(3, 34);
		System.out.println("my list elements are " + list3.get(2));
		System.out.println("my list elements are " + list3.remove(1));
		System.out.println("my list elements are " + list3);

		// list3.add(60);
		// list3.add(70);
		// list3.add(80);
		// list3.add(90);
		// list3.add(100);
		// list3.add(501);

		// System.out.println("capacity of vector after adding an element =
		// "+list3.capacity());
		// System.out.println("size of vector before = "+list3.size());
		// System.out.println("iterator of vector before = "+list3.iterator());

	}
}
