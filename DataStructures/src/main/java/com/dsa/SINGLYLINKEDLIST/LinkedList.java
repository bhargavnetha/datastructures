package com.dsa.SINGLYLINKEDLIST;

public class LinkedList {

	Node head;

	public void insert(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
		} else {
			Node currentNode = head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
		}
	}

	public void show() {
		Node current = head;
		while (current.next != null) {
			System.out.println(current.data);
			current = current.next;
		}
		System.out.println(current.data);
	}
}
