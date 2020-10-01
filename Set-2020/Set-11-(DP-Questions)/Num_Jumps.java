import java.util.*;



public class Num_Jumps {

public static int jump(int arr[],int n)
{
    int jumps[]=new int[n];
    jumps[0]=0;

    for(int i=1;i<n;i++)
    {
        for(int j=0;j<i;j++)
        {
            if(arr[j]<(i-j) && j!=(i-1))
            {

            }
            else if(j==(i-1))
            {
                jumps[i]=jumps[j]+1;

            }
            else if(arr[j]==(i-j)) //jumpps in j is enough to reach i then just take max of the two;
            {
                jumps[i]=Math.min(jumps[j]+1,jumps[i-1]+1);
                break;
            }






        }
    }
   /* for(int i=0;i<n;i++)
    {
        System.out.print(jumps[i]+" ");
    }*/




  //System.out.

    return jumps[n-1];
}

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x;
        x=sc.nextInt();

        int arr[]=new int[x];
        for(int i=0;i<x;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println(jump(arr,x));



    }
    
}