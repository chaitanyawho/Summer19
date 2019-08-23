import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class PointsOnARectangle {

    // Complete the solve function below.
    static String solve(int[][] coordinates) {
        Set<Integer> x = new HashSet<>();
        Set<Integer> y = new HashSet<>();
        for(int[] c : coordinates){
            x.add(c[0]);
            y.add(c[1]);
        }
        if(x.size()<=2&&y.size()<=2)
            return "YES";
        return "NO";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[][] coordinates = new int[n][2];

            for (int i = 0; i < n; i++) {
                String[] coordinatesRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < 2; j++) {
                    int coordinatesItem = Integer.parseInt(coordinatesRowItems[j]);
                    coordinates[i][j] = coordinatesItem;
                }
            }

            String result = solve(coordinates);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
