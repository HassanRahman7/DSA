package Stacks;
import java.util.Scanner;
import java.util.Stack;
public class balancedbracket 
{
    public static boolean isBalanced(String str) 
    {
        Stack<Character> st=new Stack<>();
        int i=0;
        while(i!=str.length())
        {
            if(str.charAt(i)=='(')
            {
                st.push('(');
                i++;
            }
            else
            {
                if(st.size()==0)
                {
                    System.out.println("1");
                    return false;
                }
                else if(st.peek()=='(')
                {
                    st.pop();
                    i++;
                }
            }
        }
        //System.out.println(st);
        if(st.size()==0)
            return true;
        else
        {
            System.out.println(st.size());
            return false;
        }    
    }
    public static boolean isValid(String s) 
    {//leetcode 20 
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
    public static int min(String str) 
    {
        if(isBalanced(str)==true)
        return 0;
        else
        {
            int i=0,o=0,c=0;
            while(i!=str.length())
            {
                if(str.charAt(i++)=='(')
                o++;
                else
                c++;
            }
            if(o>c)
            return o-c;
            else
            return c-o;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter a string:");
        str=sc.next();
        System.out.println(isBalanced(str));
        //System.out.println("Min number of brackets:"+min(str));
    }    
}