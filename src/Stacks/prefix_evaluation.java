package Stacks;
import java.util.Stack;
public class prefix_evaluation 
{
    public static void main(String[] args) 
    {
        String str="-9/*+5346";
        Stack <Integer> val=new Stack<>();
        int i=str.length()-1,v2,v1;
        char ch;
        while(i!=-1)
        {
            ch=str.charAt(i--);
            if((int)ch>=48&&(int)ch<=57)
                val.push((int)ch-48);
            else
            {
                v1=val.pop();
                v2=val.pop();
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