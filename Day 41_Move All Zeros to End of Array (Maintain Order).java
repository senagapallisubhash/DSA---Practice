import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        moveZeros(arr);

        System.out.println("After moving zeros: " + Arrays.toString(arr));
    }

    static void moveZeros(int[] arr) {
        int index = 0;

        // Move non-zero elements forward
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        // Fill remaining positions with 0
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }
}
