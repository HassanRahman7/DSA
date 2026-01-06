package Stacks;
import java.util.Stack;


public class Stockspanprob 
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
        System.out.println();
        int ch=0,c=1,j=1;
        i=0;
        int brr[]=new int[ans.length];
        brr[0]=1;
        while(j!=brr.length)
        {
            if(ch==0)
            i=j-1;
            if(arr[i]==ans[j])
            {
                brr[c++]=j-i;
                j++;
                ch=0;
            }
            else
            {
                i--;
                ch++;
            }
        }      
        for(i=0;i<brr.length;i++)
        System.out.print(brr[i]+" ");
    }
}

    

