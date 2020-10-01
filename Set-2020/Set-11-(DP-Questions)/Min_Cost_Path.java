import java.util.*;
public class Min_Cost_Path {

public static int cost(int arr[][],int x,int y)
{
    for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
              
              if(i==0 && j==0)
              {

              }
              else
              {
                if(i==0)
                {
                    arr[i][j]+=arr[i][j-1];

                }
                else if(j==0)
                { 
                    arr[i][j]+=arr[i-1][j];

                }
                else
                {
                    arr[i][j]+=Math.min(arr[i-1][j-1],Math.min(arr[i][j-1], arr[i-1][j]));

                }

              } 
            }
        }



    return arr[x-1][y-1];
}
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        int arr[][]=new int[x][y];
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                arr[i][j]=sc.nextInt();

            }
        }

        System.out.println(cost(arr,x,y));


    }
    
}