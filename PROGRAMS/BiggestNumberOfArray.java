import java.util.Scanner;
public class BiggestNumberOfArray {
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
        System.out.println("Biggest Number stored in Array is "+Check(a));
        sc.close();
    }
    public static int Check(int[] arr) {
        int n = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(n<arr[i])
            {
                n=arr[i];
            }
        }
        return n;
    }
}
