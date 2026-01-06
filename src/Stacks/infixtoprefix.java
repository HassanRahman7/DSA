package Stacks;

import java.util.Stack;

public class infixtoprefix 
{
    public static void main(String[] args) 
    {
        String str="9-(5+3)*4/6";
        Stack<String> val=new Stack<>();
        Stack<Character> op=new Stack<>();
        int i=0;
        char ch,o;
        String v2,v1,s;
        while(i!=str.length())
        {
            ch=str.charAt(i++);
            if((int)ch>=48&&(int)ch<=57)
                val.push(""+ch);
            else
            {
                if(op.size()==0||ch=='('||op.peek()=='(')
                    op.push(ch);
                else
                {
                    if(ch==')')
                    {
                        while(op.peek()!='(')
                        {
                            v2=val.pop();
                            v1=val.pop();
                            o=op.pop();
                            s=o+v1+v2;
                            val.push(s);
                        }
                        op.pop();
                    }
                    else if(ch=='+'||ch=='-')
                    {
                        v2=val.pop();
                        v1=val.pop();
                        o=op.pop();
                        s=o+v1+v2;
                        val.push(s);
                        op.push(ch);
                    }
                    else
                    {
                        if(op.peek()=='*'||op.peek()=='/')
                        {
                            v2=val.pop();
                            v1=val.pop();
                            o=op.pop();
                            s=o+v1+v2;
                            val.push(s);
                            op.push(ch);
                        }
                        else
                            op.push(ch);
                    }
                }
            }
        }
        while(val.size()>1)
        {
            v2=val.pop();
            v1=val.pop();
            o=op.pop();
            s=o+v1+v2;
            val.push(s);
        }
        System.out.println(val.peek());
    }
}