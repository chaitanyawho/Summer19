/*For the zero digits of n you can either add a 1 or 0 without getting a carry which implies xor = + 
whereas if a digit in n is 1 then the matching digit in x is forced to be 0 on order to avoid carry. 
For each 0 in n in the matching digit in x can either being a 1 or 0 with a total combination count of 2^(num of zero).
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Ques3 {

    // Complete the sumXor function below.
    static long sumXor(long n) {
        long c=0;
        while(n>0){
     if(n%2==0)
     c++;
     n/=2; 
}
c=(long)Math.pow(2,c);
return c;


    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = sumXor(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
