package com.demo.collection;

import java.util.ArrayList;
import java.util.Arrays;

//converting an array to list
public class ArraytoList {

	public static void main(String[] args) {
		System.out.println("Converting an array to list");

		String[] array = { "GAURI", "SALONI", "SHWETA", "SAKSHI" };

		System.out.println("array will be:-----");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
		list.add("mahi");
		list.add("tanu");
		list.add("sana");
		System.out.println("after converting array to list");
		for (String s : list) {
			System.out.print(s + "  ");
		}
		System.out.println("\n length of ARRAYLIST IS :----" + list.size());
	}
}
