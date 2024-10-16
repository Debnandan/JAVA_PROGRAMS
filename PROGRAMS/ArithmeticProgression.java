import java.util.*;
public class ArithmeticProgression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first term, common ratio, and the term number::-");
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        int nth_term = a + (n-1)*d;
        System.out.println("printing the Nth term = "+ nth_term);
        sc.close();
    }
}