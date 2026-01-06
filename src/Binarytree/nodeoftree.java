package Binarytree;
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
public class nodeoftree 
{
    public static void display(Node root)
    {
        if(root==null)
        return;
        System.out.print(root.val+" ");
        display(root.left);//left subtree
        display(root.right);//right subtree
    }
    public static int sum(Node root)
    {
        if(root==null)
        return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    public static int prod(Node root)
    {
        if(root==null)
        return 1;
        return root.val*prod(root.left)*prod(root.right);
    }
    public static int prodnonzero(Node root)
    {
        if(root==null)
        return 1;
        if(root.val==0)
            return prodnonzero(root.left)*prodnonzero(root.right);
        else
            return root.val*prodnonzero(root.left)*prodnonzero(root.right);
    }
    public static int max(Node root)
    {
        if(root==null)
        return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }
    public static int min(Node root)
    {
        if(root==null)
        return Integer.MAX_VALUE;
        return Math.min(root.val,Math.min(min(root.left),min(root.right)));
    }
    public static int size(Node root)
    {
        if(root==null)
        return 0;
        return 1+size(root.left)+size(root.right);
    }
    public static int level(Node root)
    {
        if(root==null)
        return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }
    public static void main(String[] args) 
    {
        Node a=new Node(1);//a is the root
        Node b=new Node(4);
        Node c=new Node(43);
        Node d=new Node(2);
        Node e=new Node(6);
        Node f=new Node(3);
        //Node g=new Node(10);
        //Node h=new Node(20);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.right=f;
        //c.left=g;
        //e.right=h;
        display(a);
        System.out.println();
        System.out.println("Sum of Nodes:"+sum(a));
        System.out.println("product of nodes:"+prod(a));
        System.out.println("prodct of non zero elements:"+prodnonzero(a));
        System.out.println("max element:"+max(a));
        System.out.println("Min element:"+min(a));
        System.out.println("Size of tree:"+size(a));
        System.out.println("Level of tree:"+level(a));
    }
}
