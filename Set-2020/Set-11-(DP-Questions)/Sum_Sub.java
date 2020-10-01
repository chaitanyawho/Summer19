import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
// example for 1654 = 1*1*(1111)+6*2*(111)+5*3*(11)+4*4*(1)
public class Sum_Sub {

    // Complete the substrings function below.
    static long substrings(String s) 
    {
        int mod =1000000007;
        long sum=0;
        long s1=0;
        long [] temp=new long[200008];
        int l=s.length();
        long x=s.charAt(0)-'0';
        temp[0]=x;
        sum+=x;
        for(int i=1;i<l;i++)
        {
            //s1=(l-i)*(s.charAt(l-i)-'0');
            temp[i]=((i+1)*(s.charAt(i)-'0')+10*temp[i-1] )%mod;
         sum+=(temp[i])%mod;
         if(sum<0)
            sum=(sum+mod)%mod;
        }
       
  return sum%mod;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String n = scanner.nextLine();

        long result = substrings(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
