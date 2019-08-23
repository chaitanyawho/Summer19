import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class NumberGroups {

    // Complete the sumOfGroup function below.
    static long sumOfGroup(int k) {
        // Return the sum of the elements of the k'th group.
        //we initially retrieve n for 2n+1 formula starting w 0
        int a = 1;
        int sum = 0;
        for(int i =1;i<=k; i++) {
            for (int j = 1; j <= i; j++) {
                if(i==k)
                    sum+=a;
                a += 2;

            }
        }
        return sum;
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        long answer = sumOfGroup(k);
        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }
}
