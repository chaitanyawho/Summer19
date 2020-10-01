
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static long  solve(long[] a) {
           Map<Long, Long> m = new HashMap<Long, Long>();
        int n = a.length;
      
        for (int i = 0; i < n; i++) {
            if (!m.containsKey(a[i])) {
                m.put(a[i], 0L); //0L is 0 in long
            }
            m.put(a[i], m.get(a[i]) + 1);
        }
        long ans = 0;
        for (Long an : m.keySet()) {
            ans += m.get(an) * (m.get(an) - 1);
        }
       return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int aCount = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            long[] a = new long[aCount];

            String[] aItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int aItr = 0; aItr < aCount; aItr++) {
                int aItem = Integer.parseInt(aItems[aItr]);
                a[aItr] = aItem;
            }

            long  result = solve(a);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
