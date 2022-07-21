package com.demo.collection;

// example of linkedlist ... 
/*
 * in linkedlist insertion order is preserved 
 * null is possible
 * duplicate are allowed
 * it is best for insertion or deletion in middle  
 * and worst for searching an element..
 */
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String[] args) {
		System.out.println("*****main method starts*****");
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(arr));
		LinkedList<Integer> mylist = new LinkedList<>();
		mylist.add(20);
		mylist.add(10);
		mylist.add(10);
		mylist.add(10);
		System.out.println("my linkedlist will be " + mylist);
		mylist.addLast(30);
		System.out.println("my linkedlist will be " + mylist);
		boolean b1 = mylist.contains(10);
		System.out.println("contains true or false........ " + b1);
		boolean b2 = mylist.contains(100);
		System.out.println("contains true or false........ " + b2);

		Object[] a = mylist.toArray();
		System.out.println("array....." + Arrays.toString(a));
		int poll = mylist.pollFirst();// it gives an element which present at first index
		System.out.println("poll first " + poll);
		boolean offerfirst = mylist.offerFirst(40);// add an element at first positioned and boolean return type ... and
													// always return true
		System.out.println("offer first........" + offerfirst);
		System.out.println(mylist);

		boolean offer = mylist.offer(50);
		System.out.println("offer ........." + offer);
		System.out.println(mylist);

		int pop = mylist.pop(); // it returns an first elemnt of the list and remove it from thhe list..
		System.out.println("pop ..." + pop);
		System.out.println(mylist);

		mylist.push(40);// push an element to the list at first positioned
		System.out.println(mylist);

		int peek = mylist.peek();// it give an elemnt which resent at first index on list but does not remove it
		System.out.println("peek ......." + peek);

		System.out.println("after peek method linkedlist will be" + mylist);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * arr[i];

		}
		System.out.println("new array ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	@Override
	public String toString() {
		return "LinkedListEx [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
