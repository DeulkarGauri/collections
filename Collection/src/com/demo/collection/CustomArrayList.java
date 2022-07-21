package com.demo.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class CustomArrayList<E> extends ArrayList<E> { // extends original ArrayList

	public boolean allowDuplicate; // creating an field

	public CustomArrayList(boolean allowDuplicate) { // create a constructor
		this.allowDuplicate = allowDuplicate;
	}

	HashSet<E> mySet = new HashSet<>(); // creating a hashset

	public boolean add(E e) {
		if (this.allowDuplicate == false && mySet.add(e) == false) {
			throw new IllegalArgumentException("Duplicates are not allowed ");

		} else if (this.allowDuplicate == true && mySet.add(e) == true) {
			super.add(e);
		}
		return allowDuplicate;
	}
}
