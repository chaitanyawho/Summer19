import java.util.*;
public class Transitive_Closure {

    static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
    {
        //for directed
        adj.get(u).add(v);
      //adj.get(v).add(u);

    }
    static int dfs(ArrayList<ArrayList<Integer>>adj,int v,Boolean visited[],int u)

    {     System.out.println(u+ " " +v);
        Stack<Integer> s= new Stack<Integer>();
        s.push(v);
        int flag=0;
        visited[v]=true;
        System.out.println(v);
   while(!s.isEmpty())
   {

    v=s.peek();
    s.pop();
    if(v==u)
    {
      flag=1;
      break;
    }
    if(!visited[v])
    {
        visited[v]=true;
        

    }
        for(int i=0;i<adj.get(v).size();i++)
        {
            int x=adj.get(v).get(i);
            if(!visited[x])
            {
                s.push(x);

            }
        }


  
    }
    return flag;
  
    }

    static int[][] t_closure (ArrayList<ArrayList<Integer>> adj,int v)
    {
        int transitive[][]=new int[v][v];
         for(int i=0;i<v;i++)
         {
             for (int j=0;j<v;j++)
             {
                 if(i==j)
                 {
                 transitive[i][j]=  1;

                 }
                 else
                 {
                    Boolean visited[]=new Boolean[adj.size()];
                    for(int k=0;k<adj.size();k++)
                    {
                        visited[k]=false;
            
                    }  
                    transitive[i][j]=  dfs(adj, i, visited, j);
                    System.out.println(transitive[i][j]);
                    


                 }

              

             }
         }
         return transitive;
    }






    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int V = s.nextInt(); 
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(V);
       
        
            //each ele of array list has an array lst of int type
          
        for (int i = 0; i < V; i++) 
            adj.add(new ArrayList<Integer>()); 

            Boolean visited []= new Boolean[V];
  
        // Adding edges one by one 
        addEdge(adj, 0, 1); 
        addEdge(adj, 0, 4); 
        addEdge(adj, 1, 2); 
        addEdge(adj, 1, 3); 
        addEdge(adj, 1, 4); 
        addEdge(adj, 2, 3); 
        addEdge(adj, 3, 4);
        addEdge(adj, 2, 0); 
      int arr[][]=new int [V][V];
      arr=t_closure(adj, V);
      for(int a=0;a<V;a++)
      {
          for(int k=0;k<V;k++)
          {
              System.out.print(arr[a][k]+" ");
          }
          System.out.println(" ");
      }




        s.close();
    }

}