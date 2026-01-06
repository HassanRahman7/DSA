package Stacks;

import java.util.Stack;

public class prefixtopostfix 
{
    public static void main(String[] args) 
    {
        String str="-9/*+5346";
        Stack<String> val=new Stack<>();
        int i=str.length()-1;
        char ch;
        String v2,v1;
        while(i!=-1)
        {
            ch=str.charAt(i--);
            if((int)ch>=48&&(int)ch<=57)
            {
                val.push(""+((int)ch-48));
            }
            else
            {
                v1=val.pop();
                v2=val.pop();
                val.push(v1+v2+ch);
            }
        }
        System.out.println(val.peek());

        
    }
    
}
