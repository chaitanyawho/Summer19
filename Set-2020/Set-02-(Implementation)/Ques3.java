import java.util.*;
class Ques3{
    public static void main(String args[])
     {
         HashMap<String,Integer> Ques= new HashMap<String,Integer>();
         Scanner sc =new Scanner(System.in);
         int x=sc.nextInt();
         for(int i=0;i<x;i++)
         { 
            String y=sc.next();
        
            if(Ques.containsKey(y))
            {
                System.out.println(y+Ques.get(y));
                Ques.put(y,Ques.get(y)+1);

            }
            else
            {
                Ques.put(y, 1);
                System.out.println(y);
            }

             
         }
         sc.close();


        
    }
}