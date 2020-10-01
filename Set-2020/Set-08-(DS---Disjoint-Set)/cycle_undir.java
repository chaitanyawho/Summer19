import java.util.*;
/* Three wasy to detect a cycle is usig dfs,disjoint sets
*/
public class cycle_undir {
    int v1;
    int v2;
    int weight;
    cycle_undir()
   {
  
    } 
  cycle_undir(int a,int b,int c)
   {
       v1=a;
       v2=b;
       
   }
   Map<Integer,Node>map=new HashMap<>(); //this hashmap has a node and it's respective data for a faster access

   class Node
  {
    int data;
    Node parent;
    int rank;

  }


  public void makeSet(int data) //creates a node pointing to itself with rank 0
  {
      Node n=new Node();
      n.data=data;
      n.parent=n;
      n.rank=0;
      map.put(data,n);
  }
  public long findSet(int data)
  {
      //System.out.println(map.get(data));
      return findSet(map.get(data)).data;

  }
  public Node findSet(Node node)
 {
   
 Node parent=node.parent;

 if(parent==node)
 {
     return parent;
 }
 node.parent=findSet(node.parent);
 return node.parent;


 } 
 public boolean union(int d1,int d2)
 {
    Node n1 = map.get(d1);
    Node n2 = map.get(d2);

    Node p1 = findSet(n1);
    Node p2 = findSet(n2);
    if(p1.data==p2.data)
    {
        return false;
    }
    if(p1.rank>=p2.rank)
    {
        p1.rank=(p1.rank==p2.rank)?p1.rank+1:p1.rank;
        p2.parent=p1;
    }
    else
    {
        p1.parent=p2;
    }
    return true;

 }


   public static void main(String args[])
   {
       System.out.println("Enter number of vertices,follwed by number of edges, followed by the each edge and it's weight");
       ArrayList<cycle_undir>g=new ArrayList<>();
       Scanner sc=new Scanner(System.in);
       int ver=sc.nextInt();
       int n= sc.nextInt();
      
       for(int i=0;i<n;i++)
       {
           int a,b,c;
           a=sc.nextInt();
           b=sc.nextInt();
           c=sc.nextInt();
           g.add(new cycle_undir(a,b,c));

       }
       cycle_undir set =new cycle_undir();
       for(int i=0;i<ver;i++)
            {
                set.makeSet(i);//initailize  
                
            }
            for(int j=0;j<g.size();j++)
            {
                
                int a=g.get(j).v1;
                int b=g.get(j).v2;
                if(set.findSet(a)==set.findSet(b))
                {
                    System.out.println("Graph has a cycle");
                    break;
        
        
                }
                else
                {
                    set.union(a,b);
                    
                   
                   
        
                }
    }
}
}       //

