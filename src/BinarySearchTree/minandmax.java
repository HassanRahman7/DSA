package BinarySearchTree;



class Node
{
    int val;
    Node left;
    Node right;
    Node(int val)
    {
        this.val=val;
    }
}
public class minandmax 
{
    public static int max(Node root)
    {
        int max=root.val;
        if(root.right!=null)
        max=max(root.right);
        return max;
    }
    public static int min(Node root)
    {
        int min=root.val;
        if(root.left!=null)
        min=min(root.left);
        return min;
    }
    public static Node searchBST(Node root, int val) 
    {
        if(root==null)
        return null;
        if(root.val==val)
        return root;
        else if(val>root.val)
        {
            return searchBST(root.right,val);
        }
        else
        return searchBST(root.left,val);
        
    }
    public static void main(String[] args)
    {
        Node a=new Node(10);
        Node b=new Node(5);
        Node c=new Node(15);
        Node d=new Node(2);
        Node e=new Node(8);
        Node f=new Node(12);
        Node g=new Node(19);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
        c.right=g;
        System.out.println(max(a));
        System.out.println(min(a));
    }
    
}
