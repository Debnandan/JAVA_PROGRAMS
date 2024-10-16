import java.util.*;
public class EvenOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("given number is even ");
        }
        else{
            System.out.println("given number is odd");
        }
        sc.close();
    }
}