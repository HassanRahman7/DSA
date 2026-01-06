package Stacks;

import java.util.Stack;


public class Insertion 
{
    public static void main(String[] args) 
    {
        Stack<Integer> st=new Stack<>();
        st.push(23);
        st.push(3);
        st.push(32);
        st.push(23);
        st.push(23);
        System.out.println(st);
        int idx=0;
        int x=3;
        Stack<Integer> st2=new Stack<>();
        while(st.size()>idx)
            st2.push(st.pop());
        st.push(x);
        while(st2.size()>0)
            st.push(st2.pop());
        System.out.println(st);


        
    }
    
}
