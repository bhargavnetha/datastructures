package com.dsa.LRUCache;

public class Runner {

	public static void main(String[] args) {
		LRUCache cache = new LRUCache(3);

		cache.put(1, 10);
		cache.put(2, 20);
		cache.put(3, 30);
		cache.printCache(); // Output: (3,30) (2,20) (1,10)

		cache.get(1);
		cache.printCache(); // Output: (1,10) (3,30) (2,20)

		cache.put(4, 40); // Evicts key 2
		cache.printCache(); // Output: (4,40) (1,10) (3,30)

		System.out.println(cache.get(2)); // Output: -1 (not found)
	}
}
