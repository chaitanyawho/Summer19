import java.util.*;
class Prefix {
    public class Trie{
        Trie child;
        char data;
        int freq=0;
        int index=0;
        boolean eow=false;
        Trie()
        {
            freq=0;
            boolean eow=false;    
        }
        Trie(char data)
        {
            this.data=data;
            freq=1;    
        }
        
        
        public Trie insert(Trie head, String s1)
        { Trie temp=new Trie();
         temp=head;
            
            if(head.freq==0)
            {
                if(s1.length()>0)
                {
                    char enter=s1.charAt(0);
                    head=new Trie(data); //add a new char to head and index it as 0
                    head.index=0;
                    temp=head; // temp == head
                    
                    
                }
                for(int i=1;i<s1.length();i++)
                {
                    Trie add=new Trie(s1.charAt(i)); // new node
                    add.index=i; // add index value
                    temp.child=add; //temps child
                    temp=temp.child; // new temp is the child
                    
                }
                
            }
         else{
             for(int i=0;i<s1.length();i++)  // for  strings tha are not the first
             {
                 if(temp.data==s1.charAt(i))
                 {
                     temp.freq+=1; // add frequency
                     temp=temp.child;
                 }
                 else
                 {
                     temp.eow=true;
                     break; // otherwise break
                 }
             }
         }
         return head;
            
        }
        
        
    }
    public String longestCommonPrefix(String[] strs) {
        Trie t= new Trie();
        for (int i =0;i<strs.length;i++)
        {
            t=t.insert(t,strs[i]);
            System.out.println(t.data+ " "+t.child.data);
        }
        while(t!=null || t.child!=null)
        {
            if(t.child.freq<strs.length && t.freq==strs.length)
            {
                return  strs[0].substring(0, t.index+1);
                
            }
            else{
                t=t.child;
            }
        }
        
        return "";
    }
        
        
        public static void main(String args[])
        {
            Prefix s=new Prefix();
            
            
           // String strs[] ={"flow","flew"};
           // s.longestCommonPrefix(strs);

          
           
           
    
    
        }
        
        
    }
