import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 9};

        int n = arr1.length;
        int m = arr2.length;
        int[] result = new int[n + m];

        int i = 0, j = 0, k = 0;

        // merge both arrays
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        // remaining elements of arr1
        while (i < n) {
            result[k++] = arr1[i++];
        }

        // remaining elements of arr2
        while (j < m) {
            result[k++] = arr2[j++];
        }

        System.out.println("Merged Sorted Array: " + Arrays.toString(result));
    }
}
