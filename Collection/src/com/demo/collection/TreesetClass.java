package com.demo.collection;

import java.util.Set;
import java.util.TreeSet;

//  foodbyid class will used in it.......
public class TreesetClass {

	public static void main(String[] args) {
		System.out.println(" main method starts ");

		Set<FoodById> treeset = new TreeSet<>();

		FoodById f1 = new FoodById(10, "ABkC ");
		FoodById f2 = new FoodById(50, "ABmC");
		FoodById f3 = new FoodById(40, null);
		treeset.add(f1);
		treeset.add(f2);
		treeset.add(f3);
		System.out.println("my treeset size will be...> " + treeset.size());
		System.out.println(" My TreeSet is ..........>" + treeset);
	}
}
