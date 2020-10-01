
import java.util.*;

public class k_Core {
    static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
    {
        //for undirected
        adj.get(u).add(v);
        adj.get(v).add(u);

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
 
   






    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
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
      
    }
}