package com.set;

import java.util.LinkedHashSet;
import java.util.Set;

//As we insert element this print as it is ..
public class LinkedHashSetEx {

	public static void main(String[] args) {
		System.out.println("Linked HashSet example....");
		Set<String> myset = new LinkedHashSet<>();
		myset.add("sakshi");
		myset.add("aaruhi");
		myset.add("shweta");
		myset.add("Manasvi");
		myset.add("trisha");
		myset.add("mahi");
		myset.add(null);

		System.out.println("My Set elements are.." + myset);
		System.out.println(myset.hashCode());
	}
}
