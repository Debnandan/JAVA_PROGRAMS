import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter your name :- ");
        String s = br.readLine();
        System.out.println("your name is "+ s);

    }
}
