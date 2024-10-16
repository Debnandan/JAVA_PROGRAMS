import java.io.*;
public class BufferedReaderExample2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter any number :- ");
        int num = Integer.parseInt(br.readLine());
        System.out.println("your entered number : "+ num);
    }
}
