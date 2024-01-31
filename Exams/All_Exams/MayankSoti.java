public class MayankSoti {
    public static void main(String args[]) {
        int[] input2 = { 1, 2, 3 };
        int k = 2;
        rotate(input2, k);
        int[] ans = new int[input2.length];
        for (int i = 0; i < input2.length; i++) {
            //System.out.println(input2[i]);
            ans[i] = input2[i];
        }
        int counter = MinimumSwap(ans, input2);
        System.out.println(counter);

    }

    static void rotate(int[] input2, int k) {
        for (int i = 0; i < k; i++) {
            int j, last;
            // Stores the last element of array
            last = input2[input2.length - 1];

            for (j = input2.length - 1; j > 0; j--) {
                // Shift element of array by one
                input2[j] = input2[j - 1];
            }
            // Last element of array will be added to the start of array.
            input2[0] = last;
        }
    }


    static int MinimumSwap(int[] ans, int[] input2) {
        int swapCount = 0;
        // array size should be same to make them identical
        if (ans.length != input2.length) {
            // throw new Exception("Array size are different.");
        }

        // keeping first array as it is,
        // move the items in second array to match first array
        for (int i = 0; i < ans.length; i++) {
            // if the index value is not same in both the arrays
            if (ans[i] != input2[i]) {
                int j = i;

                // look for the same value in second array as
                // on i index of first array
                while (input2[j] != ans[i]) {
                    j++;
                    // if j is going out of range and item is not found.
                    if (j >= input2.length) {
                        // throw new Exception("Array elements are different.");
                    }
                }

                // swap the items on index i and j in second array
                // to match the i index with first array.
                Swap(input2, i, j);
                // increase the swap count.
                swapCount++;
            }
        }

        return swapCount;
    }

    /// <summary>
    /// Method to swap the index values of i and j in given array
    /// </summary>
    /// <param name="arr">integer array</param>
    /// <param name="i">index i</param>
    /// <param name="j">index j</param>
    static void Swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
