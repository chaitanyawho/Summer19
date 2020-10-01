import java.util.*;
public class Knuth_prefix
{   public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String lookup =sc.next();
        //String  word =sc.next();
        //int m=word.length();
        int i=1,j=0;
        char pref[]=new char[lookup.length()];
        int n = lookup.length();
        pref=lookup.toCharArray();
        
        int pre[]=new int [n];
        pre[0]=0;
        while(i<n)
        {
          if(pref[i]==pref[j])
           {
              pre[i]=pre[j]+1; 
               i++;
              j++;

            }
         else 
           {
             if(j!=0)
               {
                 j=pre[j-1]; //keep reaching to index of j-1 and set as j
               }
            
               else
               {
                 pre[i]=0; //if j is 0 set i also to 0 and icrement i 
                 i++;
               }
            }

            
        }
        for(int q=0;q<n;q++)
        System.out.print(pre[q]);

      




    
        sc.close();

    }

}