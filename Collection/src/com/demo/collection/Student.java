package com.demo.collection;

// Custom array list example // t uses coustome array list which we create s
import java.util.ArrayList;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method starts ......");

		CustomArrayList<String> MyList = new CustomArrayList<>(true);
		ArrayList<Integer> myNum = new ArrayList<>();
		MyList.add("sakshi");
		MyList.add("sashi");
		MyList.add("kshi");
		MyList.add("skshi");
		System.out.println(MyList);
	}

}
