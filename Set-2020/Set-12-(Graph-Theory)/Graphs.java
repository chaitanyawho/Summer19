import java.util.*;
// set1 12 14
public class Graphs {
    static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
    {
        //for directed
        adj.get(u).add(v);
      //adj.get(v).add(u);

    }
    static void printGraph(ArrayList<ArrayList<Integer> > adj) 
    { 
        for (int i = 0; i < adj.size(); i++) { 
            System.out.println("\nAdjacency list of vertex" + i); 
            for (int j = 0; j < adj.get(i).size(); j++) { 
                System.out.print(" -> "+adj.get(i).get(j)); 
            } 
            System.out.println(); 
        } 
    } 
    static void bfs(ArrayList<ArrayList<Integer>>adj,int v,int n)

    {
        boolean visited[] = new boolean[n]; //false by default
        visited[v]=true;
        Queue <Integer> q =  new LinkedList<Integer>();
        q.add(v);
        while(!q.isEmpty())
        {
            v=q.peek();
            q.remove();
            System.out.print(v +" ");

        
        for( int i=0;i<adj.get(v).size();i++)
        {
            int x=adj.get(v).get(i);
            if(!visited[x])
            {

            
            visited[x]=true;
            q.add(x);
           
            }
        }
    }

  
    }
    static void dfs(ArrayList<ArrayList<Integer>>adj,int v,boolean visited[])

    {
       
        visited[v]=true;
        System.out.println(v);

        for(int i=0;i<adj.get(v).size();i++)
        {
            if(!visited[adj.get(v).get(i)])
            {
                dfs(adj,adj.get(v).get(i),visited);
            }
        }
  
    }

    static void dfs_stack(ArrayList<ArrayList<Integer>>adj,int v,int u)

    {
        boolean visited[]=new boolean[adj.size()];
        for(int j=0;j<adj.size();j++)
        {
            visited[j]=false;

        }   
         Stack<Integer> s= new Stack<Integer>();
        s.push(v);
       
        visited[v]=true;
       
        System.out.println(v);
   while(!s.isEmpty())
   {

    v=s.peek();
    s.pop();
   
    if(!visited[v])
    {
        visited[v]=true;
        System.out.println("THIS IS STACK");
        System.out.print(v+ " ");
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
}




    public static void main(String args[])
    { Scanner s= new Scanner(System.in);
        int V = s.nextInt(); 
        ArrayList<ArrayList<Integer> > adj  
                    = new ArrayList<ArrayList<Integer> >(V);  
            //each ele of array list has an array lst oof int type
          
        for (int i = 0; i < V; i++) 
            adj.add(new ArrayList<Integer>()); 
  
        // Adding edges one by one 
        addEdge(adj, 0, 1); 
        addEdge(adj, 0, 4); 
        addEdge(adj, 1, 2); 
        addEdge(adj, 1, 3); 
        addEdge(adj, 1, 4); 
        addEdge(adj, 2, 3); 
        addEdge(adj, 3, 4);
        addEdge(adj, 2, 0); 
        //printGraph(adj);
       bfs(adj, 1,V);
       boolean visited[]=new boolean[V];
       dfs_stack(adj, 1,2);
       dfs(adj, 1, visited);


        s.close();
    }


}