import java.util.*;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("area of rectangle");
        System.out.println("enter length and bredth");
        int lengthOfRectangle = sc.nextInt();
        int bredthOfRectangle = sc.nextInt();
        int area = lengthOfRectangle * bredthOfRectangle;
        System.out.println("area of rectangele = "+ area);
        sc.close();
    }
    
}
