package com.dsa.SORTING;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
		int left = 0;
		int right = arr.length - 1;
		mergeSort(arr, left, right);
		
		System.out.println("After sorting");
		for(int n : arr) {
			System.out.println(n);
		}
	}

	private static void mergeSort(int[] arr, int left, int right) {
		if (left < right) {
			int mid = left + (right - left) / 2;

			mergeSort(arr, left, mid); // Recursively sort left half
			mergeSort(arr, mid + 1, right); // Recursively sort right half
			merge(arr, left, mid, right); // Merge 2 halfs
		}
	}

	private static void merge(int[] arr, int left, int mid, int right) {
		
		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		int leftArr[] = new int[n1];
		int rightArr[] = new int[n2];
		
		for(int x=0; x<n1; x++) {
			leftArr[x]= arr[left+x];
		}
		for(int x=0; x<n2; x++) {
			rightArr[x]= arr[mid+1+x];
		}
		
		int i=0;
		int j=0;
		int k=left;
		
		while(i<n1 && j<n2) {
			if(leftArr[i]<=rightArr[j]) {
				arr[k]=leftArr[i];
				i++;
			}else {
				arr[k]=rightArr[i];
				j++;
			}
			k++;
		}
		while(i<n1) {
			arr[k]=leftArr[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=rightArr[j];
			j++;
			k++;
		}

	}
}
