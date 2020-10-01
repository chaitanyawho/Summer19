import java.util.*;
public class Ques1
{
    public static int kmp(String lookup,String word)
    
  { int sum=0;
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
              //System.out.println(i1-n);
              j1=pre[j1-1];
              sum++;
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
    return sum;

  }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int w=sc.nextInt();
        char arr[]=new char[n];
        char look1[]=new char[w];
        char look2[]=new char[w];
        char look3[]=new char[w];
        String word;
        for(int i=0;i<n;i++)
        {
            char x=sc.next().charAt(0);
            arr[i]=x;
           

        }
       
        for(int i=0;i<w;i++)
        {  
            
            char x=sc.next().charAt(0);
            look1[i]=x;
            x++;
            look2[i]=x;
            x--;
            x--;
            look3[i]=x;  

        }
        word=new String(arr);
        String a=new String(look1);
        String b=new String(look2);
        String c=new String(look3);
        int sum=0;
        System.out.println(a+"   "+b+"   "+c);
        sum+=kmp(a, word);
        sum+=kmp(b, word);
        sum+=kmp(c, word);
        System.out.println(sum);



        
    }

}