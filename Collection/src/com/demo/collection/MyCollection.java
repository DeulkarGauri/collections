package com.demo.collection;

import java.util.HashMap;

//MAP EXAMPLE...
class Students {
	int id;
	String name;

	public Students(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return id + ", name=" + name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class MyCollection {

	public static void main(String[] args) {
		System.out.println("main method starts here ....");
		Students s1 = new Students(10, "ABC");
		Students s2 = new Students(10, "ABC");

		HashMap<Students, String> Map = new HashMap<>();
		Map.put(s1, "Gauri");
		Map.put(s2, "Shweta");
		System.out.println("Is S1 and S2 are equal ? " + s1.equals(s2));
		System.out.println("my map is ................> " + Map);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
