import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    
    static long[] solve(int n) {
      
        long arr[][]=new long[n+1][n+1];  
   long ans []=new long[n+1];
    // Iterate through every line and  
    // print integer(s) in it 
    for (int line = 0; line <=n; line++) 
    { 
        // Every line has number of integers  
        // equal to line number 
        for (int i = 0; i <= line; i++) 
        { 
        // First and last values in every row are 1 
        if (line == i || i == 0) 
            arr[line][i] = 1; 
        // Other values are sum of values just  
        // above and left of above 
        else
            arr[line][i] = (arr[line - 1][i - 1] +  arr[line - 1][i]) % 1000000000; 
      
        } 
    }
        
    for(int i=0;i<=n;i++)

    {
        ans[i]=arr[n][i];

    }
    return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

          long [] result = solve(n);

            for (int resultItr = 0; resultItr < result.length; resultItr++) {
                bufferedWriter.write(String.valueOf(result[resultItr]));

                if (resultItr != result.length - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
