package Heaps;

import java.util.LinkedList;
import java.util.Queue;

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
public class isBTaMaxHeap
{
    public static int size(Node root)
    {
        if(root==null)
            return 0;
        return 1+size(root.left)+size(root.right);
    }
    public static boolean isCBT(Node root)
    {
        if(root==null)
            return true;
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        boolean nullseen=false;
        while(queue.isEmpty()!=true)
        {
            Node q=queue.poll();
            if(q==null)
                nullseen=true;
            else
            {
                if(nullseen==true)
                    return false;
                queue.add(q.left);
                queue.add(q.right);
            }
        }
        return true;
    }
    public static boolean isheap(Node root)
    {
        if(root==null)
            return true;
        else if(root.left!=null && root.left.val>root.val)
            return false;
        else if(root.right!=null && root.right.val>root.val)
            return false;
        else if(isheap(root.left)==true && isheap(root.right)==true)
            return true;
        else
            return false;
    }
    public static boolean isMaxHeap(Node root)
    {
        if(isheap(root)==true && isCBT(root)==true)
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        Node a=new Node(10);
        Node b=new Node(8);
        Node c=new Node(7);
        Node d=new Node (6);
        Node e=new Node(4);
//        Node f=new Node(23);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        System.out.println(isMaxHeap(a));

    }
}
