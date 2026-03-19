import java.util.*;

class CountWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int count = 0;

        // Trim to remove leading and trailing spaces
        str = str.trim();

        if(str.length() == 0){
            System.out.println("Number of words: 0");
            return;
        }

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }

        // words = spaces + 1
        System.out.println("Number of words: " + (count + 1));
    }
}
