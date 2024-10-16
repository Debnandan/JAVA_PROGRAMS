/*
 * * * *
 * * *
 * * 
 * 
 */
import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit : ");
        int lim = sc.nextInt();
        sc.close();
        for(int i=0;i<lim;i++)
        {
            for(int j=lim;j>i;j--)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
