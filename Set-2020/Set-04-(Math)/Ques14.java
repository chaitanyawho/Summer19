import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
/*5^13 //Starting Problem
5^ 1 1 0 1 //Convert "13" to binary.
5^2^2^2 * 5^2^2 * 5 */

public class Ques14{

    // Complete the solve function below.
    static long solve(int a1, int b1, long t) {
        long a =(long)(Math.ceil(0.5*(a1+b1)));
       // System.out.println(x);
       long b=t;
        long mod=1000000007;
 long ans=1;
        while(b>0)
    {//a = a+b/2  b is the power;
    System.out.println(b);
        if((b&1)==1) //if b is even;
        {
            ans=(ans*a)%mod; //get b in binary form 
            //and when in binary it is 1 multiply with answer
            //else just keep incresing a's power to keep up with b=b/2
        }


            a=(a*a)%mod;
            
            b=b>>1;
    }
    return ans;

       


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] abt = scanner.nextLine().split(" ");

        int a = Integer.parseInt(abt[0]);

        int b = Integer.parseInt(abt[1]);

        long t = Long.parseLong(abt[2]);

        long result = solve(a, b, t);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
