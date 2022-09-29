package com.HashmapExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Student {

	String Name;
	int age;

	public Student(String string, int age) {
		super();
		Name = string;
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + age;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (age != other.age)
			return false;
		return true;
	}

}

public class HashmapExample {

	public static void main(String[] args) {
		System.out.println("hashmap example.......");
		Student s1 = new Student("Sakshi", 21);
		Student s2 = new Student("shweta", 26);
		Student s3 = new Student("mahi", 31);
		Student s4 = new Student("trisha", 23);

		Map<String, Student> mymap = new HashMap<String, Student>();

		mymap.put("10", s1);
		mymap.put("20", s2);
		mymap.put("40", s3);
		mymap.put("30", s4);
		// System.out.println(mymap.put("50", "Gauri")); // it will return null
		System.out.println("size of map is :-  " + mymap.size());
		System.out.println("It will give key value pair:- " + mymap);
		System.out.println("key set:-------- " + mymap.keySet());
		System.out.println("Value set :----- " + mymap.values());

		/** using set and entryset **/
		Set<Entry<String, Student>> myEntrySet = mymap.entrySet();

		Iterator<Entry<String, Student>> itr = myEntrySet.iterator();
		System.out.println("\n ***** Using While Loop *****");
		while (itr.hasNext()) {
			System.out.println(itr.next().getValue().Name + " , " + itr.next().getValue().age);

		}
		System.out.println("\n ***** Using forEach loop *****");
		for (Entry<String, Student> oneEntry : myEntrySet) {
			String s_temp1 = oneEntry.getKey();
			Student MyValue = oneEntry.getValue();
			System.out
					.println("Key :- " + oneEntry.getKey() + "   Name :- " + MyValue.Name + "   Age is " + MyValue.age);

		}

		/*** using iterable ***/
		Iterable<Entry<String, Student>> keyset = mymap.entrySet();
		System.out.println("\n ***** Using Iterable *****");
		for (Entry<String, Student> s_temp : keyset) {

			// System.out.println(s_temp.getKey());
			// System.out.println(s_temp.getClass());
			// System.out.print(s_temp.getValue().Name + " \n");
			System.out.println();
			System.out.print(" My key :- " + s_temp.getKey() + " " + " , My Name :- " + s_temp.getValue().Name + " "
					+ ", Age:- " + s_temp.getValue().age + "\n ");

		}

	}
}
