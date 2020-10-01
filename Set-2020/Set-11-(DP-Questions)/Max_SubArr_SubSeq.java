import java.util.*;

public class Max_SubArr_SubSeq {

    // Complete the maxSubarray function below.
    static int[] maxSubarray(int[] arr) {
        int n=arr.length;
        int t[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            t[i]=arr[i];
            if(i==0)
            {

            }
            else
            {
                if(arr[i-1]<0)
                {

                }
                else
                {
                    arr[i]+=arr[i-1];
                }

            }
        }
        Arrays.sort(arr);
        int res[]=new int[2];
        res[0]=arr[n-1];
        res[1]=0;
        Arrays.sort(t);
        int sum=0;
        for(int i=(n-1);i>-1;i--)
        {
            if( t[i]<0)
            {
             
             if(i==(n-1))
             {
                  res[1]=t[n-1];
                  break;

             }
            
            }
            else
            {
                if(t[i]>0)
                {
                    res[1]+=t[i];
                    //System.out.println(t[i]);


                }
                else
                {
                    break;
                }
            }
        }
        System.out.println("Sub array sum is: "+res[0]+"\n"+"Subsequence of array: "+res[1]);
        //res[1]=-112;
  return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        int t = scanner.nextInt();
      

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
          

            int[] arr = new int[n];

         
          

            for (int i = 0; i < n; i++) {
                int arrItem = scanner.nextInt();
                arr[i] = arrItem;
            }

           maxSubarray(arr);

           

        scanner.close();
    }
}
}
