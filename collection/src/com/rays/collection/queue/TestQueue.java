package com.rays.collection.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestQueue {
	public static void main(String[] args) {
		Queue q = new ArrayDeque();

		q.offer("ram");
		q.offer(44);
		q.offer('c');
		q.offer("shyam");
		q.offer(80.78);

		System.out.println("queue : " + q);
		System.out.println("peek : " + q.peek());
		System.out.println("queue : " + q);
		System.out.println("poll : " + q.poll());
		System.out.println("queue : " + q);
		q.poll();
		System.out.println("queue : " + q);

	}
}
