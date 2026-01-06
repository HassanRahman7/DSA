package Stacks;

import java.util.Stack;

public class prefixtoinfix 
{
    public static void main(String[] args) 
    {
        String str="-9/*+5346";
        Stack <String> val=new Stack<>();
        int i=str.length()-1;
        String v2,v1;
        char ch;
        while(i!=-1)
        {
            ch=str.charAt(i--);
            if((int)ch>=48&&(int)ch<=57)
                val.push(""+ch);
            else
            {
                v2=val.pop();
                v1=val.pop();
                val.push("("+v2+ch+v1+")");
            }
        }
        System.out.println(val.peek());
    }
    
}
