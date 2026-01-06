package Stacks;

import java.util.Stack;
public class reversestack 
{
    public static Stack<Integer> rev(Stack <Integer> st) 
    {
        Stack <Integer> b=new Stack<>();
        while(st.size()!=0)
            b.push(st.pop());
        Stack <Integer> se=new Stack<>();
        while(b.size()!=0)
            se.push(b.pop());
        return se;
    }
    public static void PushatBottom(Stack<Integer> st,int val) 
    {
        if(st.size()==0)
            st.push(val);
        else
        {    
            int top=st.pop();
            PushatBottom(st,val);
            st.push(top);
        }
    }
    public static void revrec(Stack<Integer> st) 
    {
        if(st.size()==0)
        return;
        int top=st.pop();
        revrec(st);
        PushatBottom(st,top);        
    }
    public static void main(String[] args) 
    {
        Stack<Integer> st=new Stack<>();
        st.push(32);
        st.push(2);
        st.push(23);
        Stack<Integer> ans=new Stack<>();
        ans=rev(st);
        /*while(ans.size()!=0)
        System.out.print(ans.pop()+" ");*/
        revrec(ans);
        while(ans.size()!=0)
        System.out.print(ans.pop()+" ");
    }
}
