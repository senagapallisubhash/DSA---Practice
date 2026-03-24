import java.util.*;

class FindDuplicate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] freq = new int[100001]; // assuming values <= 100000

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            if(freq[arr[i]] == 1){
                System.out.println("Duplicate element: " + arr[i]);
                return;
            }
            freq[arr[i]]++;
        }

        System.out.println("No duplicate found");
    }
}
