package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis 
{
    public static boolean isValid(String s) 
    {
        if(s.length()%2!=0)
        return false;
        else
        {
            char ch;
            int i=0;
            Stack<Character> st=new Stack<>();
            while(i!=s.length())
            {
                ch=s.charAt(i);
                if(ch=='('||ch=='{'||ch=='[')
                {
                    st.push(ch);
                    i++;
                }
                else
                {
                    if(st.size()==0)
                    return false;
                    else if(st.peek()=='('&&ch==')')
                    {
                        st.pop();
                        i++;
                    }
                    else if(st.peek()=='{'&&ch=='}')
                    {
                        st.pop();
                        i++;
                    }
                    else if(st.peek()=='['&&ch==']')
                    {
                        st.pop();
                        i++;
                    }
                    else
                    return false;
                }
            }
            if(st.size()==0)
            return true;
            else
            return false;
        }
    }
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a string:");
            String str=sc.next();
            System.out.println("ISVAlid="+isValid(str));
        }
    }
    

