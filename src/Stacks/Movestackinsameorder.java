package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Movestackinsameorder 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        int n,i;
        System.out.println("Enter the size of stack:");
        n=sc.nextInt();
        System.out.println("Enter the elements:");
        for(i=1;i<=n;i++)
        st.push(sc.nextInt());
        System.out.println(st);
        //reverseb order
        Stack<Integer> st2=new Stack<>();
        while(st.size()>0)
        st2.push(st.pop());
        System.out.println(st2);
        Stack<Integer> st3=new Stack<>();
        while(st2.size()>0)
        st3.push(st2.pop());
        System.out.println(st3);

        
    }
    
}
