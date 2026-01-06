package Stacks;

import java.util.Stack;

public class postfixtoprefix 
{
    public static void main(String[] args) 
    {
        String str="953+4*6/-";
        Stack <String> val=new Stack<>();
        int i=0;
        String v2,v1;
        char ch;
        while(i!=str.length())
        {
            ch=str.charAt(i++);
            if((int)ch>=48&&(int)ch<=57)
                val.push(""+ch);
            else
            {
                v2=val.pop();
                v1=val.pop();
                val.push(ch+v1+v2);
            }
        } 
        System.out.println(val.peek());
    }
    
}
