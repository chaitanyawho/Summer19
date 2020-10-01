import java.io.*;

import java.util.*;
;
//According to the definition of Greatest Common Divisior, 
//if m is any integer, then gcd(a + m * b, b) = gcd(a, b).
public class Ques10 {
    static long hcf(long n1, long n2) {
    if (n2 != 0)
        return hcf(n2, n1 % n2);
    else
        return n1;
}

    // Complete the solve function below.
    static String solve(long a, long b, long x, long y) {
      long n1=hcf(a,b);
      long n2=hcf(x,y);
      if(n1==n2)
      return "YES";
      else
      return "NO";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] abxy = scanner.nextLine().split(" ");

            long a = Long.parseLong(abxy[0]);

            long b = Long.parseLong(abxy[1]);

            long x = Long.parseLong(abxy[2]);

            long y = Long.parseLong(abxy[3]);

            String result = solve(a, b, x, y);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
