import java.io.*;

class QuickSort {

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static int partition(int[] arr, int low, int high) {

		// pivot
		int pivot = arr[high];
		int i = (low - 1);
		for (int j = low; j <= high - 1; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return (i + 1);
	}

	static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}

	// Function to print an array
	static void printArray(int[] arr, int size) {
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	// Driver Code
	public static void main(String[] args) {
		if (Integer.parseInt(args[0]) < 10) {
			System.out.println("Minimum Array size required is 10");
		} else {
			int size = Integer.parseInt(args[0]);
			int[] arr = new int[size];

			for (int i = 0; i < size; i++) {
				arr[i] = Integer.parseInt(args[i + 1]);
			}

			int n = arr.length;
			System.out.println("Given Array");
			printArray(arr, n);

			quickSort(arr, 0, n - 1);
			System.out.println("Sorted array: ");
			printArray(arr, n);
		}
	}
}