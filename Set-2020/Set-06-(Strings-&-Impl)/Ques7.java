
import java.util.*;
public class Ques7 {
   
  
        static int isp(int n)
        {
            if(n==1)
             return 0;
           for(int i=2;i<n/2;i++)
           {
               if(n%i==0)
               {
                   return 0;
               }
           }
    
    
            return 1;
        }
    
        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            for(int j=0;j<n;j++)
            {
             int a=sc.nextInt();
             int lim=(int)Math.sqrt(((a-3)/2));
    
             int i=0;
             int save=0;
                
             for( i=1;i<=lim;i++)
    
             {
                 int sub =(2*i*i);
                 if(sub>=a)
                 break;
                 else
                 {
                    int check=a- (2*i*i);
                 int flag=isp(check);
                 if(flag==1)
                 {
                    save++;
                 }
                 }
             }
             System.out.println(save);
            }
        }
    }
    
    