package com.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		System.out.println("Set example....");
		Set<String> myset = new HashSet<>();
		myset.add("sakshi");
		myset.add("aaruhi");
		myset.add("shweta");
		myset.add("Manasvi");
		myset.add("trisha");
		myset.add("mahi");
		myset.add(null);

		if (myset.contains("sakshi")) {
			System.out.println("\n element found....");
		} else {
			System.out.println("element not found....");
		}
		System.out.println(myset.hashCode());
		System.out.println("My Set elements are.." + myset);
		// System.out.println("My Set elements are.." + myset.stream().count());
		// System.out.println("My Set elements are.." + myset.toArray());
		Object[] arrayset = myset.toArray();
		System.out.println("array set is...." + Arrays.toString(arrayset));
		System.out.println("\n Set Element after traversing...");
		for (String set : myset) {
			System.out.print(set + "  ");
		}

	}
}
