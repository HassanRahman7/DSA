package Stacks;

import java.util.Stack;

public class underflow 
{
    public static void main(String[] args) 
    {
        Stack<Integer> st=new Stack<>();
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        //st.pop();//underflow error
        
    }
    
}
