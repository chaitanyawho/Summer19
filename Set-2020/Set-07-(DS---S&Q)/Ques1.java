import  java.util.*;
import javafx.util.Pair;
import java.util.Queue;

public class Ques1 {


 public static void getpow(Queue<Integer>q,HashMap <Integer, Integer> ans,int x)
  {
     int n=q.size();
     int loop=n-x+1;
     int arr[]=new int[x];
     int extra=x-loop;
     
     while(x>0)
       {     
            if(x<=n)
           {
               int max=-1000;
                for (int i=0;i<x;i++)
                   {    arr[i]=q.peek();
                      int j=q.peek();
                      // System.out.print(j+" ");
                      q.remove();
                      if(max<ans.get(j))
                      {
                          max=j;

                      }
                   }
                System.out.println("MAX   "+max);
                 System.out.println("Whats going back in array");
         
                for(int i1=0;i1<x;i1++)
               {
                   if(arr[i1]!=max)
                   {   
                        //System.out.print( arr[i1]+ ":"+ ans.get(arr[i1])+"     ");
                      if(ans.get(arr[i1])>0)
                      {
                          ans.put(arr[i1], ans.get(arr[i1])-1);
                      }
                        q.add(arr[i1]);
                   }
               }
              n--;
            
            
            }
                 else
               {
                  x=q.size();
               }
        }
    }


  
    public static void main(String args[])
    { Scanner s=new Scanner(System.in);
       int n= s.nextInt();
       Queue<Integer> q=new LinkedList<Integer>();
       HashMap <Integer, Integer> ans  =  new HashMap <Integer, Integer> ();;
       for(int i=0;i<n;i++)
       {
         ans.put(i, s.nextInt());
         q.add(i);
       }
       int x=s.nextInt();
       getpow(q, ans, x);
      


    }

}