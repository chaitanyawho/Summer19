import java.util.*;
import java.lang.*; 
import java.io.*; 
  
public  class Kruskals {


    int v1;
    int v2;
    int weight;
    Kruskals()
   {
  
    } 
   Kruskals(int a,int b,int c)
   {
       v1=a;
       v2=b;
       weight=c;
   }





static class sort implements Comparator<Kruskals> 
{ 
    // Used for sorting in ascending order of 
    // roll number 
    public int compare(Kruskals a, Kruskals b) 
    { 
        return a.weight - b.weight; 
    } 
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
        ArrayList<Kruskals>g=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int ver=sc.nextInt();
        int n= sc.nextInt();
       
        for(int i=0;i<n;i++)
        {
            int a,b,c;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            g.add(new Kruskals(a,b,c));

        }
      
            Collections.sort(g, new sort());
            Kruskals set=new Kruskals();
            ArrayList<Kruskals>ans=new ArrayList<>();
            for(int i=0;i<ver;i++)
            {
                set.makeSet(i);//initailize
                
                
            }
        
            int check=0;
            for(int j=0;j<g.size();j++)
            {
                
                int a=g.get(j).v1;
                int b=g.get(j).v2;
                if(set.findSet(a)==set.findSet(b))
                {
        
        
                }
                else
                {
                    set.union(a,b);
                    check++;
                    ans.add(g.get(j));
                    if(check==(ver-1))
                    {
                        break;
        
                    }
        
                }
            }
        
            for(int j=0;j<ans.size();j++)
            {
                System.out.println(ans.get(j).v1 +"   "+ans.get(j).v2+"  "+ans.get(j).weight);
            }
            /*4
1 2 3
1 4 10
1 6 90
1 5 7*/
      

       


      sc.close();
    }

}