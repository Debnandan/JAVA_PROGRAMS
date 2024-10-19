import java.util.Scanner;

public class CountDistinctElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total Numbers to be stored in Array: ");
        int num = sc.nextInt();
        int a[] = new int[num];
        System.out.println("Enter numbers -");
        for (int i = 0; i < num; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Count: " + Count(a));
    }

    public static int Count(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean IsDistinct = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    IsDistinct = false;
                    break;
                }
            }
            if (IsDistinct) {
                count++;
            }
        }
        return count;
    }
}
