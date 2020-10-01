import java.util.*;
 public class Ques8
 {
     public static void main( String args[])
     {
        
         Scanner sc = new Scanner(System.in);
         int n =sc.nextInt();
         List<Integer> pos = new ArrayList<>();
         List<Integer> neg = new ArrayList<>();
         List<Integer> zer = new ArrayList<>();
         for(int i=0;i<n;i++)
         {
             int x = sc.nextInt();
             if(x>0)
             {
                 pos.add(x);
             }
             else if(x==0)
             {
                 zer.add(x);
             }
             else
             {
                 neg.add(x);
             }
         } 

             if((neg.size()%2)==0)
             { 
                 int x1 =neg.get(0);
                 neg.remove(0);
                 zer.add(x1); 
             }
             if(pos.size()<1)
             {
                 int x2=neg.get(0);
                 int x3=neg.get(1);
                 neg.remove(0);
                 neg.remove(1);
                 pos.add(x2);
                 pos.add(x3);

             }

        
        System.out.println(pos+"-----"+zer+"-----"+neg);

        sc.close();
     }
}

 