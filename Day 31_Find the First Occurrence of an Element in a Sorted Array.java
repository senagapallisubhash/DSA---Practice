public class FirstOccurrenceBinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 10, 15};
        int target = 4;

        int result = firstOccurrence(arr, target);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("First Occurrence at index: " + result);
        }
    }

    static int firstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;         // store index
                right = mid - 1;      // move left to find earlier occurrence
            } else if (arr[mid] < target) {
                left = mid + 1;       // search right
            } else {
                right = mid - 1;      // search left
            }
        }
        return result;
    }
}
