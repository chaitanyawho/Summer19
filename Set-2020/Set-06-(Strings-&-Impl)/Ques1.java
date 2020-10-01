import java.util.*;

public class Ques1
{


    public static void main(String args[])
{

    Scanner sc=new Scanner(System.in);
    int a,b;
    a=sc.nextInt();
    b=sc.nextInt();
    
    int a1[]=new int[a];
    int b1[]=new int[b];
    for(int i=0;i<a;i++)
    {
        a1[i]=sc.nextInt();
    }
    for(int i=0;i<a;i++)
    {
        b1[i]=sc.nextInt();
    }
    for(int i=0;i<a;i++)
    {
       System.out.println(a1[i]+b1[i]);
    }
    sc.close();

}

}