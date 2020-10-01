import java.util.*;
public class cal {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of activities");
        int nu=sc.nextInt();
        for(int i=0;i<nu;i++)
        {
           int x,y,z;
           System.out.println("Enter O(i,j),M(i,j),P(i,j)");
           x=sc.nextInt();
           y=sc.nextInt();
           z=sc.nextInt();
           long sum= x+(4*y)+z;
           long var= (z-x)*(z-x);
           System.out.println(sum+" /6 and variance is"+var+"/36");

        }

    }
 


}