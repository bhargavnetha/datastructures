package com.dsa.SORTING;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
		int start = 0;
		int end = arr.length - 1;
		quickSort(arr, start, end);
		
		System.out.println("\nSorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
	}

	private static void quickSort(int[] arr, int start, int end) {
		if (start < end) {
			int loc = partition(arr, start, end);
			quickSort(arr, start, loc - 1); // sort left part
			quickSort(arr, loc + 1, end); // Sort the right part
		}

	}

	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[start];

		while (start < end) {
			while (arr[start] <= pivot) {
				start++;
			}
			while (arr[end] > pivot) {
				end--;
			}
			if (start < end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
			}
		}
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;

		return end;

	}

}
