import java.util.Scanner;
public class FirstDigitOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        sc.close();
        double power = Math.log10(num);
        int p = (int)power;
        int r = (int)Math.pow(10,p);
        int result = num/r;
        System.out.println("First Digit of the Number is : "+result);
    }
}
