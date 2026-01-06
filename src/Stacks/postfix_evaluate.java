package Stacks;

import java.util.Stack;

public class postfix_evaluate 
{
    public static void main(String[] args) 
    {
        String str="953+4*6/-";
        Stack <Integer> val=new Stack<>();
        int i=0,v1,v2;
        char ch;
        while(i!=str.length())
        {
            ch=str.charAt(i++);
            if((int)ch>=48&&(int)ch<=57)
            {
                val.push((int)ch-48);
            }
            else
            {
                v2=val.pop();
                v1=val.pop();
                if(ch=='+')
                val.push(v1+v2);
                else if(ch=='-')
                val.push(v1-v2);
                else if(ch=='*')
                val.push(v1*v2);
                else
                val.push(v1/v2);
            }
        }
        System.out.println(val.peek());
        
    }
    
}
