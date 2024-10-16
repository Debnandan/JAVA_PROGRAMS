import java.util.*;
import java.io.*;
public class LogicalOperators { //info: && , ! , ||
    // idea: short circuiting  
    // note: in && ig first variable is false then return false. same for ||
    public static void main(String[] args) throws IOException
    { 
        String user = "geek" , pwd = "GEEK";
      
        Scanner sc = new Scanner(System.in);
      
        String iu = sc.next();
      
        String ip = sc.next();
      
        if(user.equals(iu) && pwd.equals(ip))
        {
            System.out.println("Welcome");
        }
        else
        {
            System.out.println("Try Again");
        }
        sc.close();
    } 
}

