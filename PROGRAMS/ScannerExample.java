import java.util.*;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name : "); // note: enter on same line
        String name = sc.nextLine();
        System.out.print("enter your age : ");
        int age = sc.nextInt();
        System.out.print("enter your weight : ");
        float weight = sc.nextFloat();
        System.out.println("name : " + name); // note: print on another line
        System.out.println("age : " + age);
        System.out.println("weight : " + weight);
        sc.close();
    }
}
