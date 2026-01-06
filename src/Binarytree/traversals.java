package Binarytree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class traversals 
{
    public static void preorder(Node root)// root left right
    {
        if(root==null)
        return;
        System.out.print(root.val+" ");
        preorder(root.left);// This function will pass the left sub tree of the tree
        preorder(root.right);//This function will pass the right sub tree of the tree.
    }
    public static void nthlevel(Node root,int Level,int reqlevel)
    {
        if(root==null)
        return;
        if(Level==reqlevel)
        System.out.print(root.val+" ");
        nthlevel(root.left,Level+1,reqlevel);//left subtree
        nthlevel(root.right,Level+1,reqlevel);//right subtree
    }
    public static int level(Node root)
    {
        if(root==null)
        return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }
    public static void Inorder(Node root)
    {
        if(root==null)
        return;
        Inorder(root.left);//left subtree
        System.out.print(root.val+" ");
        Inorder(root.right);//right subtree
    }
    public static void postorder(Node root)
    {
        if(root==null)
        return;
        postorder(root.left);//left subtree
        postorder(root.right);//right subtree
        System.out.print(root.val+" ");
    }
    public static void levelOrder(Node root) 
    {
        Queue <Node> q=new LinkedList<>();
        if(root!=null)
        q.add(root);
        while (q.isEmpty()==false) 
        {
            Node node=q.remove();
            System.out.print(node.val+" ");
            if(node.left!=null)
            q.add(node.left);
            if(node.right!=null)
            q.add(node.right);
        }
    }
    public static void RtoLlevelOrder(Node root) 
    {
        Queue <Node> q=new LinkedList<>();
        if(root!=null)
        q.add(root);
        while (q.isEmpty()==false) 
        {
            Node node=q.remove();
            System.out.print(node.val+" ");
            if(node.right!=null)
            q.add(node.right);
            if(node.left!=null)
            q.add(node.left);
        }
    }
    public static void LOLwithoutqueue(Node root) 
    {
        int noflevel=level(root),i;
        for(i=0;i<noflevel;i++)
        nthlevel(root, 0, i);
    }
    public static void preorderwithoutrec(Node root) 
    {
        Stack<Node> st=new Stack<>();
        if(root!=null)
        st.push(root);
        while(st.isEmpty()==false)
        {
            Node node=st.pop();
            System.out.print(node.val+" ");
            if(node.right!=null)
            st.push(node.right);
            if(node.left!=null)
            st.push(node.left);
        }
    }
    public static void MorrisTraversal(Node root)
    {
        List<Integer> ans=new ArrayList<>();
        Node curr=root;
        while(curr!=null)
        {
            if(curr.left!=null)
            {
                Node pred=curr.left;
                while(pred.right!=null&&pred.right!=curr)
                pred=pred.right;
                if(pred.right==null)
                {// Linking
                    pred.right=curr;
                    curr=curr.left;
                }
                else if(pred.right==curr)
                {// Unlinking.
                    ans.add(curr.val);
                    pred.right=null;
                    curr=curr.right;
                }
            }
            else
            {
                ans.add(curr.val);
                curr=curr.right;
            }
        }
        int i=0;
        while(i!=ans.size())
            System.out.print(ans.get(i++)+" ");
        
    }
    public static void postorderwithoutrec(Node root) 
    {
        Stack<Node> st=new Stack<>();
        if(root!=null)
        st.push(root);
        List<Integer> ans=new ArrayList<>();
        while(st.isEmpty()==false)
        {
            Node node=st.pop();
            ans.add(node.val);
            if(node.left!=null)
            st.push(node.left);
            if(node.right!=null)
            st.push(node.right);
        }
        Collections.reverse(ans);
        System.out.println(ans);

        
    }
    public static void Inorderwithoutrec(Node root) 
    {
        Stack<Node> st=new Stack<>();
        Node temp=root;
        while(true)
        {
            if(temp!=null)
            {
                st.push(temp);
                temp=temp.left;
            }
            else
            {
                if(st.isEmpty()==true)
                break;
                Node node=st.pop();
                System.out.print(node.val+" ");
                temp=node.right;
            }   
        }
    }
    public static boolean isVAlidBST(Node root)
    {
        Node curr=root;
        int i=0;
        // List<Integer> ans=new ArrayList<>();
        Node prev=null;
        while(curr!=null)
        {
            if(curr.left!=null)
            {
                Node pred=curr.left;
                while(pred.right!=null&&pred.right==curr)
                pred=pred.right;
                if(pred.right==null)
                {// linking
                    pred.right=curr;
                    curr=curr.left;
                }
                else if(pred.right==curr)
                {//Unlinking
                    if(prev!=null&&prev.val>=curr.val)
                    return false;
                    prev=curr;
                    curr=curr.right;
                }
            }
            else
            {
                if(prev!=null&&prev.val>=curr.val)
                return false;
                prev=curr;
                curr=curr.right;
            }
        }
        return true;
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
        preorder(a);
        System.out.println();
        Inorder(a);
        System.out.println();
        postorder(a);
        System.out.println();
        System.out.println("Level Order:");
        levelOrder(a);
        System.out.println();
        RtoLlevelOrder(a);
        System.out.println();
        nthlevel(a, 0, 2);
        System.out.println();
        LOLwithoutqueue(a);
        System.out.println();
        preorderwithoutrec(a);
        System.out.println();
        postorderwithoutrec(a);
        Inorderwithoutrec(a);
        System.out.println();
        MorrisTraversal(a);
        System.out.println();
        System.out.println(isVAlidBST(a));
    }    
}
