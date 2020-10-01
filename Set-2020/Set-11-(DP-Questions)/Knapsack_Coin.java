import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Knapsack_Coin {

    // Complete the unboundedKnapsack function below.
    static int unboundedKnapsack (int x,int coins[],int y)
    {
        System.out.println(y);
        int check[][]=new int[x][y+1];
       Arrays.sort(coins);
        int flag=0;
        int end=0;
        for(int i=0;i<x;i++)
        {
            int coin=coins[i];
            end=i;
            if(coin>y)
            {
                end=i;

                break;
            }

            
            
            for(int j=0;j<y+1;j++)
            {
                if(j==0)
                {
                    check[i][j]=0;

                }
                else
                {
                    if(i==0)
                    {   // System.out.println(i+" "+j);
                        if(coin<j)
                        {
                            if(check[i][j-coin]!=0)
                            {
                                 check[i][j]=check[i][j-coin]+1;
                            }
                            else
                            {
                                check[i][j]=0;

                            }
                             //note -coin
                            //System.out.println(check[i][j] +"First enter in coin>j");
                        }
                        else 
                        {
                            if (coin==j) 
                            {
                                check[i][j]=1;
                               // System.out.println("set"+i+" "+j);
    
                            }
                            else
                            {


                            check[i][j]=0;
                            }   
                    }
                }
                    else
                    {
                        if(j<coin)
                        {
                            check[i][j]=check[i-1][j];

                        }
                        else if(coin==j)
                        {
                            check[i][j]=1;
                        }
                        else
                        {
                            if(((check[i-1][j]) !=0) && ((check[i][j-coin]+1)!=0))
                            {
                                check[i][j]= Math.min(check[i-1][j],(check[i][j-coin]+1));

                            }
                            else if(((check[i-1][j]) ==0) && ((check[i][j-coin])==0))
                            {
                             check[i][j]=0; 
                            }
                            else
                            {
                                 check[i][j]=Math.max(check[i-1][j],(check[i][j-coin]+1));

                            }
                            
                            if(j==y)
                            {
                                if(check[i][y] !=0)
                                {
                                    flag=1;
                                    break;
                                }
                            }
                        }

                    }

                }
                
            }
            if(flag==1)
            {
                break;
            }
            
            
        }
                for(int i=0;i<x;i++)
        {
            int coin=coins[i];
            System.out.print(coin+" ");
            for(int j=0;j<y+1;j++)
            {
                System.out.print(check[i][j]+" ");
            }
            System.out.println(" ");
        }
        if(flag==1)
        {
            System.out.println(y+" Ans");
        }

        else
        {
            for(int i=y;i>-1;i--)
            {
                if(check[end][i]!=0)
                {
                    System.out.println(" Ans"+ i);
                    break;
                }
            }
        }

        return 0;

    


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)  {

        int t = scanner.nextInt();
       
       

       
        for(int i=0;i<t;i++)
        {  
           
             
            int n =  scanner.nextInt();

        int k =  scanner.nextInt();

        int[] arr = new int[n];

        

        for (int i1= 0; i1 < n; i1++) {
            int arrItem = scanner.nextInt();
            arr[i1] = arrItem;
        }

        
        unboundedKnapsack(n, arr,k);
       /* int result = 
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();*/


        }

        

        scanner.close();
    }
}
