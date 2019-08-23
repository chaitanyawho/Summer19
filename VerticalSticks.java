import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class VerticalSticks {

        static ArrayList<Integer> scores;
        //Prints the array into scores
        static void printArr(int a[], int n)
        {
            int avg = 0;

            scores.add(getScore(a));
        }

        //Generating permutation using Heap Algorithm
        static void heapPermutation(int a[], int size, int n)
        {
            // if size becomes 1 then prints the obtained
            // permutation
            if (size == 1)
                printArr(a,n);

            for (int i=0; i<size; i++)
            {
                heapPermutation(a, size-1, n);

                // if size is odd, swap first and last
                // element
                if (size % 2 == 1)
                {
                    int temp = a[0];
                    a[0] = a[size-1];
                    a[size-1] = temp;
                }

                // If size is even, swap ith and last
                // element
                else
                {
                    int temp = a[i];
                    a[i] = a[size-1];
                    a[size-1] = temp;
                }
            }
        }

    // Complete the solve function below.
    static double[] solve(int[] y) {
        //get perm, store in perm
        //input perm in getScore to get score of current perm
        scores = new ArrayList<>();
        heapPermutation(y, y.length, y.length);
        double avg = 0.0;
        for(Integer i : scores)
            avg = avg+i;
        avg = avg/scores.size();


        double[] res = {((avg))};
        return res;



    }
    static int getScore(int[] y){
        int[] v = new int[y.length];
        v[0] = 1;
        for(int i = 1; i<y.length;i++){
            v[i] = Math.min(i+1, getI(y, y[i], i));
        }
        int sum = 0;
        for(int i : v) {
            sum += i;
        }
        return sum;

    }

    static int getI(int[] y ,int p, int i){
        int x = -1;
        for(int j = 0; j<i;j++){
            if(y[j]>=p)
                x = j;
        }
        return i-x;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int yCount = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] y = new int[yCount];

            String[] yItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < yCount; i++) {
                int yItem = Integer.parseInt(yItems[i]);
                y[i] = yItem;
            }
            double[] result = solve(y);
            for (int i = 0; i < result.length; i++) {
                NumberFormat nf = new DecimalFormat("#0.00");
                bufferedWriter.write(nf.format(result[i]));
                if (i != result.length - 1) {
                    bufferedWriter.write("\n");
                }
            }
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        scanner.close();
    }
}
