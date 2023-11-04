package calci;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        if (start < 2 || start > end) {
            System.out.println("Invalid input. Please ensure that the starting number is greater than or equal to 2 and less than or equal to the ending number.");
        } else {
            System.out.println("Prime numbers within the range are:");
            for (int i = start; i <= end; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
