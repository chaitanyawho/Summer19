import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
// 7 8 9 10
public class Ques1 {
 
    // Complete the lonelyinteger function below.
 static int lonelyinteger(int[] a) 
 {
      int exor;
      int sum=0;
      int flag=0;
      Arrays.sort(a);
      int ele=0;
      int i;
      for( i=0;i<a.length;i++)
    {   ele=a[i];
    
        for(int j=0;j<a.length;j++)
      {
          if((ele^a[j])==0 && j!=i)
          { 
              System.out.println(ele+ "   "+a[j]);
              flag=0;
              break;
              
          }

          
      }
      if(flag==0)
      {
           System.out.println(ele+ "   ");
        flag=1;  
      }
      else
      {
          break;
      }

    }
    return ele;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = lonelyinteger(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}


