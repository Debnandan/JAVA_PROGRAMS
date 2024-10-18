/*
* * * *
*     *
*     *
* * * *
 */
import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit : ");
        int s= sc.nextInt();
        sc.close();
        for(int i=0;i<s;i++)
        {
            if(i==0||i==s-1)
            {
                for(int j=0;j<s;j++)
                {
                    System.out.print("* ");
                }
            }
            else
            {
                System.out.print("* ");
                for(int k=0;k<s-2;k++)
                {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
