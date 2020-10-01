import java.util.*;
class Node 
{ 
	int key; 
	Node left, right; 
    public Node(){};
	public Node(int item) 
	{ 
		key = item; 
		left = right = null; 
    } 
    static void preorder(Node temp) 
    { 
        if (temp == null) 
            return; 
       
        preorder(temp.left); 
        preorder(temp.right); 
        System.out.print(temp.key+" "); 
    
       
    } 
    static void postorder(Node temp) 
    { 
        if (temp == null) 
            return; 
        
        System.out.print(temp.key+" "); 
        postorder(temp.left); 
        postorder(temp.right); 
    } 
    static void inorder(Node temp) 
    { 
        if (temp == null) 
            return; 
       
        inorder(temp.left); 
        System.out.print(temp.key+" "); 
        inorder(temp.right); 
    } 
    static BinaryTree insert(BinaryTree t, int key) //Node.insert in order AKA wherever empty in that level
    {
        Queue<Node> q = new LinkedList<Node>(); 
        Node temp=new Node();
        temp=t.root;
        if(temp==null)
        {
            Node nRoot=new Node(key);
            t.root=nRoot;
            return t;
        }
        q.add(temp); 
       
        // Do level order traversal until we find 
        // an empty place.  
        while (!q.isEmpty()) { 
            temp = q.peek(); 
            q.remove(); 
       
            if (temp.left == null) { 
                temp.left = new Node(key); 
                break; 
            } else
                q.add(temp.left); 
       
            if (temp.right == null) { 
                temp.right = new Node(key); 
                break; 
            } else
                q.add(temp.right); 
        } 


        return t;
    }
    
} 
class BinaryTree 
{ 
	Node root; 
	BinaryTree(int key) 
	{ 
		root = new Node(key); 
	} 

	BinaryTree() 
	{ 
		root = null; 
	} 

	public static void main(String[] args) 
	{ 
        BinaryTree t = new BinaryTree(); 
        

        t=Node.insert(t, 10); 
        Node.insert(t, 11); 
        Node.insert(t, 12); 
        Node.insert(t, 14); 
        Node.insert(t, 66); 
        Node.insert(t, 100); 
        Node.inorder(t.root);
        System.out.println(" ");
        Node.preorder(t.root);
        System.out.println(" ");
        Node.postorder(t.root);


		
	} 
} 
