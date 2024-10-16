public class ArithmeticOperators {
    public static void main(String[] args) {
        int x = 3, y = 5;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(y / x);
        System.out.println(x * y);
        System.out.println(y % x);
        
        // info: postfix -> x++
        // note: z = x & x = x + 1

        int z = x++;
        System.out.println("x = "+x);
        System.out.println("z = "+z);
        // info: prefix -> ++x
        // note: x = x + 1 , z = x
        
        z = ++x;
        System.out.println("x = "+x);
        System.out.println("z = "+z);
        
    }
}
