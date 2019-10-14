//https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps/0
import java.util.*;
class minjump
{
    public static void  main (String args [])
    {
        Scanner sc =new Scanner (System.in);
        int t, iter, i, j, n, currmin;
        t = sc.nextInt();
        for (iter = 0; iter < t; iter++)
        {
            n = sc.nextInt();
            sc.nextLine();
            String items [] = sc.nextLine().split(" ");
            int a [] = new int [n];
            for (i=0; i<n; i++)
                a[i] = Integer.parseInt(items[i]);
            int m [] = new int [n];
            for (i=1; i<n; i++)
            {
                currmin=10000001;
                for (j=0; j<i; j++)
                    if ((i-j)<=a[j] && a[j]!=0)
                        if (m[j]<currmin)
                        {
                            currmin = m[j];
                            m[i]=m[j]+1;
                        }
            }
            System.out.println (m[n-1]==0?-1:m[n-1]);

        }    
    }
}