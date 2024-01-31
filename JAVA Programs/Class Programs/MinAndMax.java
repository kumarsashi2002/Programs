import java.util.Scanner;

class Pair {
	public int max, min;

	public Pair(int max, int min) {
		this.max = max;
		this.min = min;
	}
}

class MinAndMax {
	public static void findMinAndMax(int[] A, int left, int right, Pair p) {
		// if the array contains only one element

		if (left == right) // common comparison
		{
			if (p.max < A[left]) { // comparison 1
				p.max = A[left];
			}

			if (p.min > A[right]) { // comparison 2
				p.min = A[right];
			}

			return;
		}

		// if the array contains only two elements

		if (right - left == 1) // common comparison
		{
			if (A[left] < A[right]) // comparison 1
			{
				if (p.min > A[left]) { // comparison 2
					p.min = A[left];
				}

				if (p.max < A[right]) { // comparison 3
					p.max = A[right];
				}
			} else {
				if (p.min > A[right]) { // comparison 2
					p.min = A[right];
				}

				if (p.max < A[left]) { // comparison 3
					p.max = A[left];
				}
			}

			return;
		}

		// find the middle element
		int mid = (left + right) / 2;

		// recur for the left subarray
		findMinAndMax(A, left, mid, p);

		// recur for the right subarray
		findMinAndMax(A, mid + 1, right, p);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size = scan.nextInt();
		int[] A = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the element " + (i + 1) + ":");
			A[i] = scan.nextInt();
		}

		Pair p = new Pair(Integer.MIN_VALUE, Integer.MAX_VALUE);
		findMinAndMax(A, 0, A.length - 1, p);

		System.out.println("The minimum array element is " + p.min);
		System.out.println("The maximum array element is " + p.max);
	}
}