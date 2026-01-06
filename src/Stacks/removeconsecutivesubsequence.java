package Stacks;
import java.util.Stack;
public class removeconsecutivesubsequence 
{
    public static int[] remove(int arr[]) 
    {
        Stack<Integer> st=new Stack<>();
        int i=0;
        for(i=0;i<arr.length;i++)
        {
            if(st.size()==0||st.peek()!=arr[i])
            st.push(arr[i]);
            else if(arr[i]==st.peek())
            {
                if(i==arr.length-1||arr[i]!=arr[i+1])
                    st.pop();
                
            }
        }
        System.out.println(st);
        int brr[]=new int[st.size()];
        for(i=st.size()-1;i>=0;i--)
        brr[i]=st.pop();
        return brr;
    }
    public static void main(String[] args) 
    {
        int arr[]={1,2,2,3,10,10,10,4,4,5,7,7,2};
        int res[]=remove(arr);
        int i;
        for(i=0;i<res.length;i++)
        System.out.print(res[i]+" ");
    }
}
