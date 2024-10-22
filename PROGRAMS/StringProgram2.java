public class StringProgram2 {
    public static void main(String[] args) {
        String s1 = "Debnandan Bera";
        String s2 = "Debnandan Bera";
        String s3 = "Debnandan";
        String s4 = "Bera";
        String s5 = "Hello";
        System.out.println(s1.equals(s2)); //True
        System.out.println(s1.contains(s3)); //True
        System.out.println(s1.indexOf(s4)); 
        //Returns the first occurrence of s4 in s1 
        System.out.println(s1.equals(s5)); // False
        System.out.println(s1.contains(s5)); // False
        String s6 = s3 + "Bera";
        System.out.println(s3.concat(s4)+" "+s6);
    }
}
