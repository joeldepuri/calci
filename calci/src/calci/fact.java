package calci;

import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        if (start < 0 || end < 0 || start > end) {
            System.out.println("Invalid input. Please ensure that the starting number is non-negative and less than or equal to the ending number.");
        } else {
            System.out.println("Factorials within the range are:");
            for (int i = start; i <= end; i++) {
                long factorial = calculateFactorial(i);
                System.out.println("Factorial of " + i + " is " + factorial);
            }
        }
    }

    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}
