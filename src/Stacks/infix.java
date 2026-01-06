package Stacks;

import java.util.Stack;

public class infix 
{
    public static void main(String[] args) 
    {
        String str="(9-5+3*4/6)";
        Stack<Integer> val=new Stack<>();
        Stack<Character> op=new Stack<>();
        char ch;
        int i=0;
        int v2,v1;
        while(i!=str.length())
        {
            ch=str.charAt(i++);
            if((int)ch>=48&&(int)ch<=57)
                val.push((int)ch-48);
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
                            if(op.peek()=='+')
                            val.push(v1+v2);
                            else if(op.peek()=='-')
                            val.push(v1-v2);
                            else if(op.peek()=='*')
                            val.push(v1*v2);
                            else
                            val.push(v1/v2);
                            op.pop();
                        }
                        op.pop();
                    }
                    else if(ch=='+'||ch=='-')
                    {
                        v2=val.pop();
                        v1=val.pop();
                        if(op.peek()=='+')
                        val.push(v1+v2);
                        else if(op.peek()=='-')
                        val.push(v1-v2);
                        else if(op.peek()=='*')
                        val.push(v1*v2);
                        else
                        val.push(v1/v2);
                        op.pop();
                        op.push(ch);
                    }
                    else
                    {
                        if(op.peek()=='*'||op.peek()=='/')
                        {
                            v2=val.pop();
                            v1=val.pop();
                            if(op.peek()=='*')
                            val.push(v1*v2);
                            if(op.peek()=='/')
                            val.push(v1/v2);
                            op.pop();
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
            if(op.peek()=='+')
            val.push(v1+v2);
            else if(op.peek()=='-')
            val.push(v1-v2);
            else if(op.peek()=='*')
            val.push(v1*v2);
            else
            val.push(v1/v2);
            op.pop();
        }
        System.out.println(val.peek());
    }
    

  }
 