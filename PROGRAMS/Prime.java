import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int flag = 1;
        sc.close();
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                System.out.println("Given number is not a Prime Number");
                flag=flag+1;
                return;
            }
        }
        if(flag==1){
            System.out.println("Given number is Prime Number");
        }
    }    
}
