import java.util.Scanner;

public class OnlyDigitsCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        if (containsOnlyDigits(str)) {
            System.out.println("The string contains only digits.");
        } else {
            System.out.println("The string does NOT contain only digits.");
        }
    }

    static boolean containsOnlyDigits(String str) {
        if (str.length() == 0) return false;

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
