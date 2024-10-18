import java.util.Scanner;

public class PrimeOptimised {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        // Checking prime conditions
        if (num == 1) {
            System.out.println("Given number is not a prime number");
            return;
        }
        if (num == 2 || num == 3) {
            System.out.println("Given number is a prime number");
            return;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            System.out.println("Given number is not a prime number");
            return;
        }

        // Optimized checking
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                System.out.println("Given number is not a prime number");
                return;
            }
        }

        System.out.println("Given number is a prime number");
    }
}
