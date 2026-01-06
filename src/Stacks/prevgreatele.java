package Stacks;

import java.util.Stack;

public class prevgreatele 
{
    public static void main(String[] args) 
    {
        int arr[]={100,80,60,70,60,75,85};
        int ans[]=new int[arr.length];
        ans[0]=-1;
        Stack<Integer> st=new Stack<>();
        st.push(arr[0]);
        int i=1;
        while(i!=arr.length)
        {
            if(arr[i]<st.peek())
            {
                ans[i]=st.peek();
                st.push(arr[i]);
                i++;
            }
            if(arr[i]>st.peek())
            {
                while(arr[i]>st.peek())
                    st.pop();
                ans[i]=st.peek();
                st.push(arr[i]);
                i++;
            }
        }
        
        for(i=0;i<ans.length;i++)
        System.out.print(ans[i]+" ");
    }
    
}
