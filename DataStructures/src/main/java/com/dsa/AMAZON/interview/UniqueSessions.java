package com.dsa.AMAZON.interview;

import java.util.HashSet;
import java.util.Set;

// Time Complexity: O(r×c), 
// Space Complexity: O(max(r,c))
public class UniqueSessions {

	public static void main(String[] args) {
		int[][] sessions = { { 5, 2, 1 }, { 2, 3, 2 }, { 5, 2, -1 } };
		findUniqueSessions(sessions);
	}

	private static void findUniqueSessions(int[][] sessions) {
		int[] uniqueSessionsCount = new int[sessions.length];
		for (int i = 0; i < sessions.length; i++) {
			Set<Integer> uniqueSessions = new HashSet<Integer>();
			for (int session : sessions[i]) {
				if (session != -1) {
					uniqueSessions.add(session);
				}
				//System.out.println(uniqueSessions);
			}
			uniqueSessionsCount[i] = uniqueSessions.size();
		}
		for(int num :uniqueSessionsCount) {
			System.out.println(num+" ");
		}
	}
}
