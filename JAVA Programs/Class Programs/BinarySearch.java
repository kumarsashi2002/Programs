import java.util.Scanner;

class BinarySearch {
	int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == x)
				return mid;

			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);

			return binarySearch(arr, mid + 1, r, x);
		}

		return -1;
	}

	// Driver method to test above
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the element " + (i + 1));
			arr[i] = scan.nextInt();
		}

		System.out.println("Enter the element to search: ");
		int x = scan.nextInt();
		BinarySearch ob = new BinarySearch();
		int result = ob.binarySearch(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println(x + " is not present");
		else
			System.out.println(x + " found at index " + result);
	}
}