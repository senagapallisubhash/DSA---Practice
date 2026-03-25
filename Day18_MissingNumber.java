import java.util.*;

class MissingNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements (n): ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        // Missing number should be from 1 to n+1
        int expected = (n + 1) * (n + 2) / 2;

        int missing = expected - sum;

        System.out.println("Missing number: " + missing);
    }
}
