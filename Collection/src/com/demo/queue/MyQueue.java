package com.demo.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class MyQueue {

	public static void main(String[] args) {
		System.out.println("Queue example....");

		Queue<Integer> myque = new PriorityQueue<Integer>();

		myque.add(100);
		myque.add(200);
		myque.add(3400);
		myque.add(140);
		System.out.println("Queue elements are...." + myque);

		System.out.println("it return first element of queue:----" + myque.peek());

		System.out
				.println("it retrive element from head of the queue \n but it does not remove:----" + myque.element());
		System.out.println(
				"it retrive element from head of the queue. \n and also remove from the queue:----" + myque.poll());
		System.out.println("after poll method queue is:-----" + myque);
		System.out.println();
	}
}
