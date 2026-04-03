public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99, 99, 23};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second Largest Number: " + secondLargest);
        }
    }
}
