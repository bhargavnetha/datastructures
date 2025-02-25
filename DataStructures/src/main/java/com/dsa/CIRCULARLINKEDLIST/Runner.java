package com.dsa.CIRCULARLINKEDLIST;

public class Runner {

	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();
		list.insert(5);
		list.insert(11);
		list.insert(21);
		list.display(); // Output: 1 -> 2 -> 3 -> (back to head)
        
		
	}
	
}
