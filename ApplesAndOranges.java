import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class ApplesAndOranges {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        ArrayList<Integer> app = new ArrayList<>();
        ArrayList<Integer> ora = new ArrayList<>();
        for(int i : apples){
            app.add(i);
        }
        for(int i : ora){
            ora.add(i);
        }
        ArrayList<Integer> da = new ArrayList<>();
        ArrayList<Integer> dor = new ArrayList<>();

        for(Integer i : app){
            da.add(a+i);
        }
        for(Integer i : ora){
            dor.add(b+i);
        }
        int a1 = 0, b1 = 0;
        for(Integer i : dor){
            if(i>=s && i<=t)
                a1++;

        }

        for(Integer i : da){
            if(i>=s && i<=t)
                b1++;
        }
        System.out.println(a1);
        System.out.println(b1);





    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);

        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);

        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        int[] apples = new int[m];

        String[] applesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }

        int[] oranges = new int[n];

        String[] orangesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        scanner.close();
    }
}
