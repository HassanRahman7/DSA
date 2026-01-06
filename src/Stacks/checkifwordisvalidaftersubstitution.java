package Stacks;

import java.util.Stack;

public class checkifwordisvalidaftersubstitution 
{
    public static boolean isValid(String s)
    {
        if(s.charAt(0)=='c'||s.charAt(1)=='c')
        return false;
        else
        {
            Stack<Character> st=new Stack<>();
            int l=s.length(),i=0;   
            while(i!=l)
            {
                if(s.charAt(i)=='c')
                {
                    if(st.size()!=0)
                    {
                        if(st.peek()=='b')
                        {
                            st.pop();
                            if(st.size()!=0)
                            {
                                if(st.peek()=='a')
                                    st.pop();
                                else
                                    return false;
                            }
                            else
                                return false;
                        }
                        else
                        return false;
                    }
                    else
                    return false;
                }
                else
                    st.push(s.charAt(i));
                i++;
            }
            if(st.size()==0)
            return true;
            else
            return false;
        }
    }
    public static void main(String[] args) 
    {
        System.out.println(isValid("aaabc"));
    }
}
