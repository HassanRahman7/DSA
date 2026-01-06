package Binarytree;

import java.util.LinkedList;
import java.util.Queue;


class Pair
{
    Node node;
    int level;
    Pair(Node node,int level)
    {
        this.node=node;
        this.level=level;
    }
}
public class leetcode102 
{
    public static int level(Node root)
    {
        if(root==null)
        return 0;
        return 1+Math.max(level(root.left), level(root.right));
    }
    public static void levelOrder(Node root)
    {
        Queue<Pair> q=new LinkedList<>();
        int previouslevel=0;
        if(root!=null)
        q.add(new Pair(root, 0));
        while(q.isEmpty()==false)
        {
            Pair p=q.poll();
            if(p.level!=previouslevel)
            {
                System.out.println();
                previouslevel++;
            }
            System.out.print(p.node.val+" ");
            if(p.node.left!=null)
            q.add(new Pair(p.node.left, p.level+1));
            if(p.node.right!=null)
            q.add(new Pair(p.node.right, p.level+1));
        }
    }
    public static void main(String[] args) 
    {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
        c.right=g;
        levelOrder(a);
        
    }
    
}
