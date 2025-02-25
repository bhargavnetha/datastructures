package com.dsa.DOUBLYLINKEDLIST;

public class DoublyLinkedList {

	DoublyNode head;

	public void insert(int data) {
		DoublyNode newNode = new DoublyNode(data);

		if (head == null) {
			head = newNode;
		} else {
			DoublyNode currentNode = head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
			newNode.prev=currentNode;
		}
	}

	
	public void displayForward() {
		DoublyNode current = head;
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println();
	}

	
	public void displayBackward() {
        DoublyNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.prev;
        }
        System.out.println();
    }
}
