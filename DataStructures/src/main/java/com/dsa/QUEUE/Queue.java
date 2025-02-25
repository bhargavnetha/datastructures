package com.dsa.QUEUE;

public class Queue {

	int queue[] = new int[5];
	int size;
	int front;
	int rear;

	public void enQueue(int data) {
		queue[rear] = data;
		size++;
		rear++;
	}

	public int deQueue() {
		int data = queue[front];
		front++;
		size--;
		return data;
	}
	
	public void show() {
		System.out.println("Elements ");
		for (int i = 0; i < size; i++) {
			System.out.println(queue[front + i] + " ");
		}
	}

	
}
