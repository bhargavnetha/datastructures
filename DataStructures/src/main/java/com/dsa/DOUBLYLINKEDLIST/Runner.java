package com.dsa.DOUBLYLINKEDLIST;

public class Runner {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.insert(5);
		list.insert(11);
		list.insert(21);
		list.displayForward(); // Output: 1 -> 2 -> 3 -> null
        list.displayBackward(); // Output: 3 -> 2 -> 1 -> null
	}
	
}
