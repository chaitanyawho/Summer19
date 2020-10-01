// https://www.hackerearth.com/practice/notes/disjoint-set-union-union-find/

//After performing required Union(A, B) operations, we can easily perform the Find(A, B) 
//operation to check whether A and B are connected or not. It can be checked by calculating roots of 
//both A and B. If roots of A and B are same, that means both A and B are in same subset and are connected.

//As we know that Arr[ i ] is the parent of i (where i is the element of set),
//then the root of i is Arr[ Arr[ Arr[ …...Arr[ i ]...... ] ] ] until Arr[ i ] is not equal to i. 
//Simply we can run a loop until we get a element which is a parent of itself.
//Note: 
//This can be only done when there is no cycle in the elements of subset,otherwise loop will run infinitely.
import java.util.*;
public class Disjoint
{ 
    public static void main(String args[])
     {  Scanner sc=new Scanner(System.in);
        int a=5/2;
        String tan="Tanussh learns to code";
        Double x=(Double)(5*0.5);
        Boolean x1=true;
        x1=false;
        
       
        System.out.println(x+"  "+a );
   
     }


}