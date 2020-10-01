import java.util.*;
 public class Ques9
 {
     public static void main( String args[])
     {
         HashMap<Integer,Integer> ans= new HashMap<Integer,Integer>();
         Scanner sc = new Scanner(System.in);
         int n =sc.nextInt();
         for(int i=0;i<n;i++)
         {
             int x = sc.nextInt();
             if(ans.containsKey(x) || (x==0))
            {
                continue;
            }
            else
            {
                ans.put(x, 0);
            }

        }
System.out.println(ans.size());
sc.close();
     }

 }