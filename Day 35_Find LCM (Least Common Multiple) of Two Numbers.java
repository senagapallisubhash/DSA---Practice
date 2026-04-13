import java.util.Scanner;

public class LCMExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        sc.close();

        int gcd = findGCD(a, b);
        int lcm = (a * b) / gcd;

        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }

    static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
