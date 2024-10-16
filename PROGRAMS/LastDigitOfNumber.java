import java.util.*;
public class LastDigitOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = sc.nextInt();
        num = Math.abs(num); // note: if given number is -ve modulus convert it.
        int LastDigit = num % 10;
        System.out.println("Last digit = "+ LastDigit);
        sc.close();
    }
}
