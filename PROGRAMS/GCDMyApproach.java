import java.util.Scanner;
public class GCDMyApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int num2 = sc.nextInt();
        int num = Math.min(num1, num2);
        int ans=0;
        for(int i=1;i<=num;i++)
        {
            if(num1%i==0&&num2%i==0)
            {
                ans=i;
            }
        }
        System.out.println("GCD of given two Numbers is : "+ans);
        sc.close();
    }
}
