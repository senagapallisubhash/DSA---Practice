import java.util.*;

public class MoveZerosToEnd {
    public static void moveZeros(int[] nums) {
        int j = 0; // pointer for next non-zero position

        // Move all non-zero elements to front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        // Fill rest with zeros
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        moveZeros(nums);

        // print output
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
