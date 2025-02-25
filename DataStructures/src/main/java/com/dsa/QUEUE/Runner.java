package com.dsa.QUEUE;

public class Runner {

	public static void main(String[] args) {
		Queue nums = new Queue();

		nums.enQueue(5);
		nums.enQueue(7);
		nums.enQueue(3);
		

		nums.deQueue();

		nums.show();

	}
}
