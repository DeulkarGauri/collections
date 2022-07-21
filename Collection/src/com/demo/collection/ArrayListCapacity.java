package com.demo.collection;

import java.lang.reflect.Field;
import java.util.ArrayList;
//import java.util.LinkedList.Node;

public class ArrayListCapacity {

	public static void main(String[] args) throws Exception {
		System.out.println(" main method starts  here: ");

		ArrayList<Integer> MyList = new ArrayList<>();

		System.out.println("size of my list........> " + MyList.size());
		System.out.println("Capacity  of my list........> " + getCapacity(MyList));
		MyList.add(10);
		MyList.add(20);
		MyList.add(30);
		MyList.add(40);
		MyList.add(50);
		MyList.add(60);
		MyList.add(70);
		MyList.add(80);
		MyList.add(90);
		MyList.add(100);
		System.out.println("size of my list........> " + MyList.size());
		System.out.println("Capacity  of my list........> " + getCapacity(MyList));
		MyList.add(101);
		System.out.println("size of my list........> " + MyList.size());
		System.out.println("Capacity  of my list........> " + getCapacity(MyList));
	}

	// static int getCapacity(ArrayList<Integer> myList)
	// throws NoSuchFieldException, SecurityException, IllegalArgumentException,
	// IllegalAccessException {
	// Field field = ArrayList.class.getDeclaredField("elementData");
	// field.setAccessible(true);
	// int Capacity = ((Object[]) field.get(myList)).length;
	// return Capacity;
	//
	// }
	static int getCapacity(ArrayList<Integer> myList)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Field field = ArrayList.class.getDeclaredField("elementData");
		field.setAccessible(true);
		int Capacity = ((Object[]) field.get(myList)).length;
		return Capacity;

	}

	// java.util.List<Integer > myList = new ArrayList<>();
	// myList.add(100);
	// myList.add(20);
	// myList.add(450);
	// myList.add(12);
	// myList.add(24);
	// myList.add(30);
	// myList.add(40);
	// myList.add(50);
	//
	//
	// System.out.println(" My List Is = "+myList);
	// System.out.println(myList);

}
