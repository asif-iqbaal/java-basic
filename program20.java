public class program20 {
    public static void main(String[] args) {
        // Example sorted arrays
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        // Merging the arrays
        int[] mergedArray = mergeArrays(arr1, arr2);

        // Printing the merged sorted array
        System.out.print("Merged Sorted Array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    // Method to merge two sorted arrays
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] mergedArray = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Traverse both arrays and merge them
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        // Store remaining elements of arr1
        while (i < n1) {
            mergedArray[k++] = arr1[i++];
        }

        // Store remaining elements of arr2
        while (j < n2) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }
}
