package Stacks;

import java.util.Stack;

public class basicsofstacks 
{
    public static void main(String[] args) 
    {
        Stack<Integer> st=new Stack<>();
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5);
        st.push(34);
        //peek
        System.out.println(st.peek());
        System.err.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println("size is:"+st.size());
        while(st.size()>2)
        st.pop();
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.isEmpty());

        
    }
    
}
