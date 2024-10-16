import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int ans_1=Math.max(a,b);
        int ans=Math.max(ans_1,c);
        System.out.print("Largest number : "+ans);
        sc.close();
    }
}
