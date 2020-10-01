import java.util.*;

public class Knapsack_dp {

    public static int Knap(int weight[], Map<Integer,Integer>w,int cap)
    { int W=weight.length +1;
        int C=cap+1;
        int check[][]=new int [W][C];

        for(int i=0;i<W;i++)
        {
            int weigh;
            if(i>0)
            {
                weigh=weight[i-1];

            }
            else
            {
                weigh=weight[0];

            }
            int cost=w.get(weigh);
            for(int j=0;j<C;j++)
            {

                if(i==0)
                {
                    check[i][j]=0;


                }
                else if(j==0)
                {
                    check[i][j]=0;

                }
                else 
                {
                    if(weigh>j)
                    {
                        check[i][j]=check[i-1][j];
                    }
                    else if(weigh<=j)
                    {
                        check[i][j]= Math.max(check[i-1][j],cost+check[i-1][j-weigh]);

                    }


                }

            }

        }




        return check[W-1][C-1];
    }


    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ener number of weights");
        int n=sc.nextInt();
        Map<Integer,Integer>weights=new HashMap<>();
        int weight[]=new int[n];
        System.out.println("Enter weights with their profit");
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            int y= sc.nextInt();
            weights.put(x,y);
            weight[i]=x;
        }
        System.out.println("Enter capacity");
        int cap=sc.nextInt();
        System.out.println(Knap(weight, weights, cap));


    }
    
    
}