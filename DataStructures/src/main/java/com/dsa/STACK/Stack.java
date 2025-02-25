package com.dsa.STACK;

public class Stack {

	int stack[] = new int[5];
	int top = 0;

	//push the element into stack
	public void push(int data) {
		stack[top] = data;
		top++;
	}

	//removes the topmost element
	public int pop() {
		int data;
		top--;
		data = stack[top];
		stack[top] = 0;
		return data;
	}

	//retrives the top element
	public int peek() {
		int data;
		data = stack[top];
		return data;
	}

	//prints all the elements
	public void show() {
		for (int n : stack) {
			System.out.println(n + " ");
		}
	}
}
