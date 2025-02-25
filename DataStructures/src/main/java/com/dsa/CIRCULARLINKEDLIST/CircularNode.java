package com.dsa.CIRCULARLINKEDLIST;

public class CircularNode {

	int data;
	CircularNode prev;
	CircularNode next;

	CircularNode(int data) {
		this.data = data;
		this.prev = null;
		this.next = null;
	}
}
