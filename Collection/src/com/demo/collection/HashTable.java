package com.demo.collection;

import java.util.Hashtable;

//MAP EXAMPLE...
public class HashTable {
	public static void main(String[] args) {
		System.out.println("main method .........");
		// null are not allowed as key and values also
		Hashtable<Integer, Integer> h1 = new Hashtable<>();
		h1.put(10, 100);
		h1.put(20, 200);
		h1.put(30, 400);

		System.out.println(h1);

		// clone of h1....
		Hashtable h2 = new Hashtable<>();
		h2 = (Hashtable) h1.clone();
		System.out.println("h1:---------------> " + h1);
		System.out.println("h2:---------------> " + h2);
		h2.clear();
		System.out.println("***************************");
		System.out.println("h1:---------------> " + h1);
		System.out.println("h2:---------------> " + h2);

		// contains
		System.out.println("******************************");
		if (h1.contains(100))
			System.out.println("values is found ......");

	}
}
