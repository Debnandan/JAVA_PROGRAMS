import java.util.Scanner;
public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total Numbers to be stored in Array : ");
        int num = sc.nextInt();
        int a[]=new int[num];
        System.out.println("Enter numbers -");
        for(int i=0;i<num;i++)
        {
            a[i]=sc.nextInt();
        }
        Sum(a);
        sc.close();
    }
    public static void Sum(int[] a) {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("Sum of Array : "+sum);
    }
}
