package com.dsa.CIRCULARLINKEDLIST;

public class CircularLinkedList {

	CircularNode head;

	public void insert(int data) {
		CircularNode newNode = new CircularNode(data);
		if (head == null) {
			head = newNode;
			newNode.next = head;
		} else {
			CircularNode current = head;
			while (current.next != head) {
				current = current.next;
			}
			current.next = newNode;
			newNode.next = head;
		}
	}

	public void display() {
		if (head == null) {
			return;
		}
		CircularNode current = head;
		do {
			System.out.print(current.data + " -> ");
			current = current.next;
		} while (current != head);
		System.out.println("(back to head)");
	}
}
