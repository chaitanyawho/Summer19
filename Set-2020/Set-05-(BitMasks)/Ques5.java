import java.util.*;
public class Ques5 {
    static long sumXor(long n)
     {
        long c=0;
        while(n>0)
        {
          if(n%2==0)
          c++;
           n/=2; 
        }
        return c;
     
     }  
    
public static void main(String args[])
{Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(n);
    sc.close();

}

}