import java.lang.*;
import java.util.Scanner;

class BubbleSort {
	void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver method to test above
	public static void main(String args[]) {
		if (Integer.parseInt(args[0]) < 10) {
			System.out.println("Minimum Array Size Required is 10");
		} else {
			int size = Integer.parseInt(args[0]);
			int[] arr = new int[size];
			BubbleSort ob = new BubbleSort();

			for (int i = 0; i < size; i++) {
				arr[i] = Integer.parseInt(args[i + 1]);
			}

			System.out.println("Entered Array: ");
			ob.printArray(arr);
			ob.bubbleSort(arr);
			System.out.println("Sorted array");
			ob.printArray(arr);
		}
	}
}
