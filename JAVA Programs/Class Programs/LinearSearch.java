import java.util.Scanner;
class LinearSearch {
	public static int search(int arr[], int x) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] == x)
				return i;
		}
		return -1;
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the element " + (i + 1));
			arr[i] = scan.nextInt();
		}

		System.out.println("Enter the element to search: ");
		int x = scan.nextInt();
		int result = search(arr, x);
		if (result == -1)
			System.out.print(x + " is not present in array");
		else
			System.out.print(x + " is present at index " + result);
	}
}
