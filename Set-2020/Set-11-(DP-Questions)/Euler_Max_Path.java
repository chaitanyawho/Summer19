//https://www.hackerrank.com/contests/projecteuler/challenges/euler067/problem 
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Euler_Max_Path {
    public static long  Min_Path(int arr[][],int dim)
    {
        for( int i=0;i<dim-1;i++)
        {
            for(int j=0;j<=i;j++)
            {

                if(i==0)
                {
                    arr[i+1][j]+=arr[0][0];
                    arr[i+1][j+1]+=arr[0][0];
                }
                else
                {
                   if(j==0)
                   {
                    arr[i+1][j]+=arr[i][j];
                    arr[i+1][j+1]+=Math.max(arr[i][j], arr[i][j+1]);

                   }
                   else
                   {
                   
                    arr[i+1][j+1]+=Math.max(arr[i][j], arr[i][j+1]);
                   }
                   
                   
                }
            }
        }

       /* for( int i=0;i<dim;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/
        long max=0;
        for(int i=0;i<dim;i++)
        {
            max=Math.max(max, arr[dim-1][i]);

        }






        return max;
    }

    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=0;i<x;i++)
        {
            int dim=sc.nextInt();
            int arr[][]=new int[dim][dim];
            for(int j=0;j<dim;j++)
            {
                for(int k=0;k<=j;k++)
                {
                 arr[j][k]=sc.nextInt();

                }
            }
            System.out.println(Min_Path(arr,dim));


        }


    }
}