import java.util.*;
public class Longest_Palin {
    public static int palin(String s)
    {
        int ans[][]= new int[s.length()][s.length()];
        int l=0;
        for(int i=0;i<s.length();i++)
        {
            if(i<2)
            {
                l=1;
            }  
            else
            {
                l=2;
            } 
            
            for(int j=0;j<s.length();j++)
            {
                if(i==0)
                {
                   // System.out.print("here");
                    ans[j][j]=1;
                }
                else
                {
                    
                    if(j+i>=s.length())
                    {
                        break;
                    }
                   
                     else if(s.charAt(j)==s.charAt(j+i) )
                    {
                        ans[j][j+i]=ans[j-1][j+i-1]+l;

                    }
                    else if(s.charAt(j)!=s.charAt(j+i))
                    {
                        ans[j][j+i]=Math.max(ans[j][j+i-1],ans[j+1][j+i]);

                    }

                }

            }
        }
      /*  for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<s.length();j++)
            {
                System.out.print(ans[i][j]+"  ");
            }
            System.out.println();
        }*/





        return ans[0][s.length()-1];

    }





    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        System.out.println(palin(x));

    }
    
}