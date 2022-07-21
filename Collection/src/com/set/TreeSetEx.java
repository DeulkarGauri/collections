package com.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		System.out.println("treeset example...");

		Set<Integer> myset = new TreeSet<>();
		// myset.add("sakshi");
		// myset.add("aaruhi");
		// myset.add("shweta");
		// myset.add("Manasvi");
		// myset.add("trisha");
		// myset.add("mahi");
		// myset.add(null);
		myset.add(10);
		myset.add(180);
		myset.add(210);
		myset.add(100);
		myset.add(78);
		myset.add(10);
		System.out.println("My Set elements are.." + myset);
		System.out.println(myset.hashCode());

		Iterator<Integer> it = myset.iterator();
		System.out.println("my treeset is :----");
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			System.out.print(integer + "   ");

		}
	}
}
