package com.baxter.training02;

class MergeSort {

	// Merge two subarrays L and M into arr
	void merge(int arr[], int low, int mid, int high) {

		// Create L ← A[low..mid] and M ← A[mid+1..high]
		int n1 = mid - low + 1;
		int n2 = high - mid;

		int L[] = new int[n1];
		int M[] = new int[n2];

		for (int i = 0; i < n1; i++)
			L[i] = arr[low + i];
		
		
		
		for (int j = 0; j < n2; j++)
			M[j] = arr[mid + 1 + j];

		// Maintain current index of sub-arrays and main array
		int i, j, k;
		i = 0;
		j = 0;
		k = low;

		// Until we reach either end of either Low or Mid, pick larger among
		// elements L and M and place them in the correct position at A[p..r]
		while (i < n1 && j < n2) {
			if (L[i] <= M[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = M[j];
				j++;
			}
			k++;
		}

		// When we run out of elements in either L or M,
		// pick up the remaining elements and put in A[p..r]
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = M[j];
			j++;
			k++;
		}
	}

	// Divide the array into two subarrays, sort them and merge them
	void mergeSort(int arr[], int low, int high) {
		if (low < high) {

			// m is the point where the array is divided into two subarrays
			int mid = (low + high) / 2;

			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);

			// Merge the sorted subarrays
			merge(arr, low, mid, high);
		}
	}

	// Print the array
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver program
	public static void main(String args[]) {
		int arr[] = { 6, 5, 12, 10, 9, 1 };

		MergeSort ob = new MergeSort();
		ob.mergeSort(arr, 0, arr.length - 1);

		System.out.println("Sorted array:");
		printArray(arr);
	}
}