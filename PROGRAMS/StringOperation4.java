public class StringOperation4 {
    public static void main(String[] args) {
        String s1 = "DEBNANDAN";
        String s2 = "debnandan";
        System.out.println(s1.equalsIgnoreCase(s2)); //true
        System.out.println(s2.toUpperCase());
        System.out.println(s1.substring(0, 3));
    }
}
