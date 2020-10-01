import java.util.*;

public class DreaMoon_Wifi {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int sum2=0;
        String s1=sc.next();
        sc.nextLine();
        String s2=sc.next();
        int q=0;
        for(int i=0;i<s1.length();i++)
        {
            if(s2.charAt(i)=='+')
            {
                sum2++;
            }
            else if(s2.charAt(i)=='-')
            {
                sum2--;

            }
            else
            {
                q++;

            }
            if(s1.charAt(i)=='+')
            {
                sum++;
            }
            else
            {
                sum--;

            }
        }

        System.out.println(sum+"   "+sum2+"   "+q);
         sum=Math.abs(sum-sum2);
         double denominator=Math.pow(q, 2);
        if((sum%2 != q%2) || (q<=sum))
        {
            System.out.println("No answer");
        }
       
        else
        { //qcsum2, 
            //3int ans= 


        }




    }
    
}