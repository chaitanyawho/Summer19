import java.util.*;

public class Ques5 {
    public static int cal(int index,int end,int m)
    {
        
        if(index==1)
        {
          if(end!=m)
            {
              return m-end+1;

            }
            else
            {
              return 0;
            }
           
        }
        else if(end==m)
        {
          if(index==1)
          {
            return 0;

          }
          else
          {
            return index-1;

          }

        }
          else
          {
            

            int x=((index-1)*(m-end+1));
            return x;
          }

       




    }
    public static void main(String args[])
    {

    
    Scanner sc=new Scanner(System.in);
    String lookup ="bear";
    String  word =sc.next();
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
   int sum=0;
   while(i1<m)
   {
       if(word.charAt(i1)==lookup.charAt(j1) )
       {  
          i1++; 
         j1++;
       }
           if(j1==n)
           {
             // System.out.println(i1-n);
              sum+=cal(i1-n+1, i1+1,m+1);
             // System.out.println((i1-n+1)+" "+ (i1));
              //System.out.println(m);

              
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
   System.out.println(sum);
    sc.close();

}

}