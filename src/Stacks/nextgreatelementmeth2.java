package Stacks;

import java.util.Stack;

public class nextgreatelementmeth2 
{
    public static void main(String[] args) 
    {
        int arr[]={1,5,3,2,1,6,3,4};
        int res[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        res[arr.length-1]=-1;
        st.push(arr[arr.length-1]);
        int i=arr.length-2;
        while(i>=0)
        {
            if(st.peek()>arr[i])
            {
                res[i]=st.peek();
                st.push(arr[i--]);
            }
            if(i<0)
            break;
            while(st.size()!=0&&i>=0&&st.peek()<arr[i])
                st.pop();
            if(st.size()==0)
                res[i]=-1;
            else
                res[i]=st.peek();
            st.push(arr[i--]);
        }
        for(i=0;i<res.length;i++)
        System.out.print(res[i]+" ");

        
    }
    
}
