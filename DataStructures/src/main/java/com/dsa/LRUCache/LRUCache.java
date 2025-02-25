package com.dsa.LRUCache;

import java.util.HashMap;

public class LRUCache {

	int capacity;
	HashMap<Integer, Node> map;
	Node head, tail;
	
	public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        
        // Initialize dummy head and tail nodes
        this.head = new Node(0, 0);
        this.tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }
	
	 public int get(int key) {
	        if (!map.containsKey(key)) {
	            return -1; // Key not found
	        }
	        
	        Node node = map.get(key);
	        moveToHead(node); // Move the accessed node to the head (most recently used)
	        return node.value;
	    }
	 
	// Helper: Move a node to the head of the doubly linked list
	    private void moveToHead(Node node) {
	        removeNode(node);
	        addToHead(node);
	    }
	    
	    
	 // Helper: Remove a node from the doubly linked list
	    private void removeNode(Node node) {
	        node.prev.next = node.next;
	        node.next.prev = node.prev;
	    }
	    
	 // Helper: Add a node to the head of the doubly linked list
	    private void addToHead(Node node) {
	        node.next = head.next;
	        node.prev = head;
	        head.next.prev = node;
	        head.next = node;
	    }
	    
	    // Put a value in the cache
	    public void put(int key, int value) {
	        if (map.containsKey(key)) {
	            // Update the value of an existing key
	            Node node = map.get(key);
	            node.value = value;
	            moveToHead(node);
	        } else {
	            if (map.size() == capacity) {
	                // Evict the least recently used node
	                Node lru = tail.prev;
	                removeNode(lru);
	                map.remove(lru.key);
	            }
	            
	            // Add the new node
	            Node newNode = new Node(key, value);
	            map.put(key, newNode);
	            addToHead(newNode);
	        }
	    }
	    
	    // Debug: Print the cache contents (for testing purposes)
	    public void printCache() {
	        Node current = head.next;
	        while (current != tail) {
	            System.out.print("(" + current.key + "," + current.value + ") ");
	            current = current.next;
	        }
	        System.out.println();
	    }
}
