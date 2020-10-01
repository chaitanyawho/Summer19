import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class sol {

    // Complete the substrings function below.
    static long substrings(String s) 
    {
         int mod =1000000007;
        long sum=0;
        long s1=0;
       
       int l=s.length();
       int x=1;
        
        for(int i=0;i<l;i++)
        {
            s1+=(l-i)*(s.charAt(l-i-1)-'0')*x;
            x=10*x+1;
            System.out.println(x +"  "+s.charAt(l-i-1));
           
      
        if(s1<0)
            s1=(s1+mod)%mod;
        }
       
  return s1%mod;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();

        long result = substrings(n);

        System.out.println(result);

        scanner.close();
    }
}
