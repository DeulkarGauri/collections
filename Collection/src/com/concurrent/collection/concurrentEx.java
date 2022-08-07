package com.concurrent.collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class concurrentEx extends Thread {
	// static ArrayList l = new ArrayList<>();
	static CopyOnWriteArrayList<String> l = new CopyOnWriteArrayList<String>();

	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("child thread " + " goiting to add element ");
		}

		// Child thread trying to add new
		// element in the Collection object
		l.add("D");
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("************** concurrent modification exception solution **************");

		System.out.println(
				" ************** By using copyOnWriteArrayList class of cocurrent collection \n  we solve that exception ************** ");
		l.add("A");
		l.add("B");
		l.add("C");

		concurrentEx c1 = new concurrentEx();
		c1.start();

		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			// int s = (int) itr.next();
			System.out.println(s);
			Thread.sleep(6000);
		}
		System.out.println(l);

	}
}
