import java.lang.*;
import java.util.Scanner;

class SelectionSort {
	void sort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			// Swap the found minimum element with the first
			// element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

	// Prints the array
	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver code to test above
	public static void main(String args[]) {
		if (Integer.parseInt(args[0]) < 10) {
			System.out.println("Minimum Array length required is 10");
		} else {
			SelectionSort ob = new SelectionSort();
			int size = Integer.parseInt(args[0]);
			int[] arr = new int[size];

			for (int i = 0; i < size; i++) {
				arr[i] = Integer.parseInt(args[i + 1]);
			}

			System.out.println("Entered Array: ");
			ob.printArray(arr);
			ob.sort(arr);
			System.out.println("Sorted array");
			ob.printArray(arr);
		}
	}
}