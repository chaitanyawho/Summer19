import java.util.*;
class SubsetSum{
    public static int subset(int x,int coins[],int y)
    {
        boolean check[][]=new boolean[x][y+1];
        for(int i=0;i<x;i++)
        {
            int coin=coins[i];
            for(int j=0;j<y+1;j++)
            {
                if(j==0)
                {
                    check[i][j]=true;

                }
                else
                {
                    if(i==0)
                    {
                        if(coin==j)
                        {
                            check[i][j]=true;
                        }
                        else{
                            check[i][j]=false;
                        }
                        
                    }
                    else
                    {
                        if(j<coin)
                        {
                            check[i][j]=check[i-1][j];

                        }
                        else
                        {
                            check[i][j]= (check[i-1][j] || check[i-1][j-coin]);
                        }

                    }

                }
                
            }
            if(check[i][y]==true)
            return coin;
        }






        return -1; 
    }










    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int x,y;
        x=s.nextInt();
        int coins[]=new int[x];
        for(int i=0;i<x;i++)
        {
            coins[i]=s.nextInt();

        }
        System.out.println("Enter sum to be chexked?");
        y=s.nextInt();
        int check=subset(x,coins,y);
        System.out.println(check);

    }
    
}