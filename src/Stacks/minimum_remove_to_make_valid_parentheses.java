package Stacks;
import java.util.*;
public class minimum_remove_to_make_valid_parentheses
{
    public static class pair
    {
        char ch;
        int idx;
        pair(char ch,int idx)
        {
            this.ch=ch;
            this.idx=idx;
        }
    }
    public static String minRemoveToMakeValid(String s)
    {
        Stack<pair> st=new Stack<>();
        String ans="";
        int i=0;
        while(i!=s.length())
        {
            char ch=s.charAt(i);
            if(ch=='(' || ch==')')
            {
                if(ch==')')
                {
                    if(st.isEmpty()==false && st.peek().ch=='(')
                        st.pop();
                    else
                        st.push(new pair(ch,i));
                }
                else
                    st.push(new pair(ch,i));
            }
            i++;
        }
        // List<Integer> arr=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        while(st.isEmpty()==false)
        {
            pair p=st.pop();
            set.add(p.idx);
        }
        // Collections.sort(arr);
        i=0;
        while(i!=s.length())
        {
            if(set.contains(i)==true)
            {
                i++;
                continue;
            }
            else
                ans=ans+s.charAt(i++);
        }
        return ans;
    }
    public static void main(String[] args)
    {
        System.out.println(minRemoveToMakeValid("))(("));
    }
}
