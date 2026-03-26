import java.util.*;

class SecondLargest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // If array contains fewer than 2 elements
        if(n < 2){
            System.out.println("Second largest does not exist.");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            }
            else if(num > secondLargest && num < largest){
                secondLargest = num;
            }
        }

        if(secondLargest == Integer.MIN_VALUE){
            System.out.println("No second largest number (all elements equal)");
        } else {
            System.out.println("Second largest: " + secondLargest);
        }
    }
}
