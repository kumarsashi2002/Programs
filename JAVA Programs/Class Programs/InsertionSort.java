class InsertionSort {
	void sort(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	/* A utility function to print array of size n */
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	// Driver method
	public static void main(String args[]) {
		if (Integer.parseInt(args[0]) < 10) {
			System.out.println("Minimum array Size required is 10");
		} else {
			int size = Integer.parseInt(args[0]);
			int[] arr = new int[size];

			for (int i = 0; i < size; i++) {
				arr[i] = Integer.parseInt(args[i + 1]);
			}

			System.out.println("Entered Array: ");
			printArray(arr);

			InsertionSort ob = new InsertionSort();
			ob.sort(arr);
			System.out.println("Sorted Array: ");
			printArray(arr);
		}
	}
}
