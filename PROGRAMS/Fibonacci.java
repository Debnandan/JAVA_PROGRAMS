import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit : ");
        int num = sc.nextInt();
        sc.close();
        int num1=0;
        int num2=1;
        System.out.println(num1);
        System.out.println(num2);
        for(int i=0;i<num-2;i++)
        {
            int num3=num1+num2;
            System.out.println(num3);
            num1=num2;
            num2=num3;
            
        }
    }
}
