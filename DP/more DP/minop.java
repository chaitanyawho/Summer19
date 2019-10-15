import java.util.Scanner;
class minop
{
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        int t, n, iter, i;
        t = sc.nextInt ();
        int m []=new int [10001];
        m[1]=1;
        for (i=2; i<10000; i+=2)
        {
            //even
            m[i] = Math.min (m[i-1], m[i/2])+1;
            //odd 
            m[i+1] = m[i]+1;
        }
        m[10000] = Math.min (m[999], m[500])+1;
        for (iter = 0; iter < t; iter++)
        {
            n = sc.nextInt ();
            System.out.println (m[n]);
        }
    }
}