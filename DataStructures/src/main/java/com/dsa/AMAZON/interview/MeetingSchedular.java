package com.dsa.AMAZON.interview;

import java.util.Arrays;

public class MeetingSchedular {

	public static void main(String[] args) {
		//int[][] intervals1 = { { 0, 30 }, { 5, 10 }, { 15, 20 } };
		int[][] intervals2 = { { 7, 10 }, { 2, 4 } };
		
		canAttendMeetings(intervals2);
	}

	private static boolean canAttendMeetings(int[][] intervals) {
		
		if(intervals.length==0 || intervals.length==0) {
			return true;
		}
		
		Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
		
		for(int i =1; i<intervals.length; i++) {
		
			System.out.println(intervals[i-1][1]+"---------"+intervals[i][0]);
			if(intervals[i-1][1]> intervals[i][0]) {
				return false;
			}
			
//			for(int  ar: intervals[i]) {
//				System.out.println(ar);
//			}
			
			
		}
		
		return true;
		
		
	}
}
