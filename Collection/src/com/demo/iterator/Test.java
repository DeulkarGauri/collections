package com.demo.iterator;
// example for iterator
import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Welcome to Main Method.......");
    
    ArrayList<Integer> mylist = new ArrayList<>();
    
    mylist.add(10);
    mylist.add(10);
    mylist.add(23);
    mylist.add(10);
System.out.println("my list element are...."+ mylist);

System.out.println("my list size is ...."+ mylist.size());
Iterator<Integer> itr = mylist.iterator();
 while(itr.hasNext()) {
	 int i = itr.next();
	  System.out.print(i + " ");
	   
	  if(i%2!=0) 
		 itr.remove();
	  
 }
System.out.println();

System.out.println("my new element are "+ mylist);
    
	}

}
