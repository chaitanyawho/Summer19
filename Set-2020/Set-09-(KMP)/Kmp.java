import java.util.*;
public class Kmp
{  public static void kmp(String lookup,String word)
  {
    int m=word.length();
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
   // for(int q=0;q<n;q++)
   // System.out.print(pre[q]);
   int j1=0;
   int i1=0;
   while(i1<m)
   {
       if(word.charAt(i1)==lookup.charAt(j1) )
       {  
          i1++; 
         j1++;
       }
           if(j1==n)
           {
              System.out.println(i1-n);
              j1=pre[j1-1];
           }

       
       else if(i1<m && word.charAt(i1)!=lookup.charAt(j1))
       {
          
           if(j1!=0)
           {
           j1=pre[j1-1];
           }
           else
           {
            i1++;
           }

       }
    

   }

  }
   public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String lookup =sc.next();
        String  word =sc.next();
        kmp(lookup,word);
       
        sc.close();

    }

}