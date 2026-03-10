import java.util.*;

class ConcatenationArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        int[] ans = new int[2*n];

        for(int i=0;i<n;i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }

        System.out.println("Concatenated array:");

        for(int i=0;i<2*n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
