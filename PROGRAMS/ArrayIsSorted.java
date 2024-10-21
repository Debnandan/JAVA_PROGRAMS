import java.util.Scanner;
public class ArrayIsSorted {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total elements to be stored in an Array : ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter numbers ---");
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        boolean ans = IsSorted(arr);
        if(ans==true)
        {
            System.out.println("Given Array is Sorted");
        }
        else
        {
            System.out.println("Given Array is not sorted");
        }
    }
    public static boolean IsSorted(int[] a) {
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<a[i-1])
            {
                return false;
            }
        }
        return true;
    }
}