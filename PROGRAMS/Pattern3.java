
/*    
      *
    * * *
  * * * * * 
* * * * * * *
 */
import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int lim = sc.nextInt();
        sc.close();
        
        for (int i = 1; i <= lim; i++) {
            //note: Print leading spaces
            for (int j = lim - i; j > 0; j--) {
                System.out.print("  ");
            }
            //note: Print stars for the left half
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            //note: Print stars for the right half
            for (int l = 1; l <= i - 1; l++) {
                System.out.print("* ");
            }
            //note: Move to the next line
            System.out.println("");
        }
    }
}
