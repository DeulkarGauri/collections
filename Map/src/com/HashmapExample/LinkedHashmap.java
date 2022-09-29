package com.HashmapExample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashmap {

	public static void main(String[] args) {
		System.out.println("*** Linked Hashmap ***");
		System.out.println("*****************************************************");
		LinkedHashMap<Integer, String> MyMap = new LinkedHashMap<>();
		System.out.println(MyMap.put(null, "ABCD"));
		// System.out.println(MyMap.put(20, "PQRS"));
		MyMap.put(20, null);
		MyMap.put(30, null);
		MyMap.put(40, "JKLM");
		MyMap.put(50, "STUV");
		System.out.println("linked hashmap");
		System.out.println("map element :- " + MyMap);
		System.out.println("map size :- " + MyMap.size());

		TreeMap<Integer, Integer> tmp = new TreeMap<>();
		tmp.put(12, 20);
		tmp.put(12, 56);
		tmp.put(11, 98);
		tmp.put(22, null);
		System.out.println("\n ***Treemap element****");

		System.out.println("Treemap element :- " + tmp);
		HashMap<Integer, Integer> mp = new HashMap<>();
		mp.put(12, 20);
		mp.put(59, 56);
		mp.put(34, 98);
		mp.put(34, null);
		System.out.println("\n hashmap element ");
		System.out.println(mp);

	}
}
