package Stacks;
import java.util.Stack;
public class display 
{
    public static void displayrecreverse(Stack<Integer> st)
    {
        if(st.size()==0)
        return;
        int top=st.pop();
        System.out.print(top+" ");
        displayrecreverse(st);
        st.push(top);
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
    public static Stack<Integer> removefromidx(Stack <Integer> st,int idx)     
    {
        Stack <Integer> ans=new Stack<>();
        while(st.size()!=0)
        {
            if(st.size()==idx)
                st.pop();
            else
                ans.push(st.pop());
        }
        Stack<Integer> ans2=new Stack<>();
        while(ans.size()!=0)
            ans2.push(ans.pop());
        return ans2;

    }
    public static void main(String[] args)
    {
        Stack<Integer> st=new Stack<>();
        st.push(21);
        st.push(432);
        st.push(23);
        st.push(2);
        st.push(3);
        Stack<Integer> st2=new Stack<>();
        while(st.size()>0)
            st2.push(st.pop());
        while(st2.size()>0)
        {
            System.out.println(st2.peek());
            st.push(st2.pop());
        }
        displayrecreverse(st);
        System.out.println();
        PushatBottom(st,32);
        displayrecreverse(st);
        System.out.println();
        Stack <Integer> ans=new Stack<>();
        ans=removefromidx(st, 1);
        displayrecreverse(ans);
    }   
    }
    
