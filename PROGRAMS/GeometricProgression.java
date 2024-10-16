import java.util.*;
public class GeometricProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first term, common ratio, and the term number:");
        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        
        int Nth_term = a * (int)(Math.pow(r, n - 1));
        System.out.println("Nth term = " + Nth_term);
        
        sc.close();
    }
}
