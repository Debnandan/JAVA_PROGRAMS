import java.util.Scanner;

public class DivisorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        sc.close();
        int i;
        
        // Loop to find divisors up to the square root of the number
        for (i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        
        // Loop to find the remaining divisors
        for (i = i - 1; i >= 1; i--) {
            if (num % i == 0 && i != num / i) { // Avoid printing the square root twice
                System.out.print((num / i) + " ");
            }
        }   
    }
}
