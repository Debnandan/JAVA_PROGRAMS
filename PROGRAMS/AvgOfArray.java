import java.util.Scanner;
public class AvgOfArray {
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
        sc.close();
        System.out.println("Avg of the Given Array : "+Avg(a));
    }
    public static int Avg(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        return sum/arr.length;
    }
}