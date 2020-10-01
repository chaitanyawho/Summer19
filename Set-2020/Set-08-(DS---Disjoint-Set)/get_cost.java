import java.io.*;
import java.util.*;
import java.lang.*;


public class get_cost {
  
  Map<Integer,Node>map=new HashMap<>(); //this hashmap has a node and it's respective data for a faster access

   class Node
  {
    int data;
    Node parent;
    int rank;
    int size;

  }


  public void makeSet(int data) //creates a node pointing to itself with rank 0
  {
      Node n=new Node();
      n.data=data;
      n.parent=n;
      n.rank=0;
      n.size=1;
      map.put(data,n);
  }
  public int findSet(int data)
  {
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
        p1.size+=p2.size;
    }
    else
    {
        p1.parent=p2;
        p2.size+=p1.size;
    }
    return true;

 }
 public static void main(String args[])
    {
        get_cost ds = new get_cost();
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int queries=sc.nextInt();
        int lib=sc.nextInt();
        int road=sc.nextInt();
        
     
        for(int i=1;i<=no;i++)
        {
           ds.makeSet(i);
        }
       // System.out.println(queries);
        for(int i=0;i<queries;i++)
        {
           
            
            int x=sc.nextInt();
            int y= sc.nextInt();
        
                //System.out.println("here");
                ds.union(x,y); 
           
        }
        int set=0;
        int sum=0;
        boolean vis[]=new boolean[no+1];
        if(road>lib)
        {
            System.out.println(lib*no);
        }
        else{

        

        for(int i=1;i<=no;i++)
        {

            int size=0;
           if(vis[ds.findSet(i)]==true)
           {

           }
           else
           {
            vis[ds.findSet(i)]=true;
           // System.out.println(ds.findSet(i));

            set++;
            size=ds.map.get(i).size;
           // System.out.println(size);
            sum+=(size-1)*road;



           }
        }
        System.out.println(sum+(lib*set));
    }






    }


}

    
