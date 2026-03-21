import java.util.*;

class FirstNonRepeating {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        str = str.toLowerCase();

        int[] freq = new int[256]; // ASCII frequency array

        // Count frequency
        for(int i = 0; i < str.length(); i++){
            freq[str.charAt(i)]++;
        }

        // Find first non-repeating character
        boolean found = false;

        for(int i = 0; i < str.length(); i++){
            if(freq[str.charAt(i)] == 1){
                System.out.println("First non-repeating character: " + str.charAt(i));
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("No unique character");
        }
    }
}
