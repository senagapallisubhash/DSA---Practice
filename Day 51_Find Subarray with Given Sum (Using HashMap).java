import java.util.HashMap;

public class SubarraySum {
    public static void main(String[] args) {
        int[] arr = {10, 2, -2, -20, 10};
        int target = -10;

        findSubarray(arr, target);
    }

    static void findSubarray(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum == target) {
                System.out.println("Subarray found from index 0 to " + i);
                return;
            }

            if (map.containsKey(currentSum - target)) {
                int start = map.get(currentSum - target) + 1;
                System.out.println("Subarray found from index " + start + " to " + i);
                return;
            }

            map.put(currentSum, i);
        }

        System.out.println("No subarray found.");
    }
}
