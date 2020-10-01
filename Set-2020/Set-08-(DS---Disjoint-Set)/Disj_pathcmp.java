import java.util.*;

/*using tree that has data,parent and an approximate rank,it will have three functions one to perform 
union,other to show elements in a union and makeset ,it will also do a path compression in a recursive 
manner rank is zero at frist and increases by one on becoming a parent, if same rank then choose one and 
increse rank by one of the chosen one and decrease rank of the other one by one, but if one has higher rank any way
no need to alter the rank*/
public class Disj_pathcmp
 {
    Map<Long,Node>map=new HashMap<>(); //this hashmap has a node and it's respective data for a faster access

   class Node
  {
    long data;
    Node parent;
    int rank;

  }


  public void makeSet(long data) //creates a node pointing to itself with rank 0
  {
      Node n=new Node();
      n.data=data;
      n.parent=n;
      n.rank=0;
      map.put(data,n);
  }
  public long findSet(long data)
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
 public boolean union(long d1,long d2)
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
        Disj_pathcmp ds = new Disj_pathcmp();
        ds.makeSet(1);
        ds.makeSet(2);
        ds.makeSet(3);
        ds.makeSet(4);
        ds.makeSet(5);
        ds.makeSet(6);
        
        ds.makeSet(7);
         String s="j";

        ds.union(1, 2);
        ds.union(2, 3);
        ds.union(4, 5);
        ds.union(6, 7);
        ds.union(5, 6);
        ds.union(3, 7);

        System.out.println(ds.findSet(1));
        System.out.println(ds.findSet(2));
        System.out.println(ds.findSet(3));
        System.out.println(ds.findSet(4));
        System.out.println(ds.findSet(5));
        System.out.println(ds.findSet(6));
        System.out.println(ds.findSet(7));




    }


}