public class StringProgram3 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        System.out.println("Comparing s1 and s2");
        if(s1==s2)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        } // Return True
        System.out.println("Comparing s1 and s3");
        if(s1==s3)
        {
            System.out.println("True");
        }
        else

        {
            System.out.println("False");
        } // Return False
    }
}