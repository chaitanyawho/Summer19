import java.io.*;
import java.util.*;
import java.lang.*;


public class Solution {
  
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
        Solution ds = new Solution();
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        
        sc.nextLine();
        for(int i=1;i<=no;i++)
        {
           ds.makeSet(i);
        }
       // System.out.println(queries);
        for(int i=0;i<no;i++)
        {
            String s=sc.nextLine();
            
            String arr[]=s.split(" ");
           // System.out.println(arr[0]);
           // System.out.println(i);
            
            //System.out.println("here");
                ds.union((int)Integer.valueOf(arr[0]),Integer.valueOf(arr[1]));

                      

            
        }
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<no;i++)
        {
            Node n = ds.map.get(i);
           
            if(n.size>max)
            {
                max=n.size;
            }
            if(n.size<min)
            {
                min=n.size;
            }
           

        }
        System.out.println(min+" "+max);




    }


}

    
