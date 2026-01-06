package Stacks;
public class arrayimplementation 
{
    public static class Stack
    {
        private int arr[]=new int[5];
        private int idx=0;
        void push(int val)
        {
            if(idx==arr.length)
            {
                System.out.println("Stack is full.");
                return;
            }
            arr[idx++]=val;
        }
        int peek()
        {
            if(idx==0)
            {
                System.out.println("Stack is empty.");
                return -1;
            }
            return arr[idx-1];
        }
        int pop()
        {
            if(idx==0)
            {
                System.out.println("Stack is empty.");
                return -1;
            }
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        void display()
        {
            int i;
            for(i=0;i<=idx-1;i++)
            System.out.print(arr[i]+" ");
            System.out.println();
        }
        int size()
        {
            return idx;
        }
        boolean isEmpty()
        {
            if(idx==0)
            return true;
            else
            return false;

        }
        boolean isFull()
        {
            if(idx==arr.length)
            return true;
            else
            return false;
        }
        int capacity()
        {
            return arr.length;
        }

    }
    //Asked in interviews
    public static void main(String[] args) 
    {
        Stack st=new Stack();
        st.push(3);
        st.display();
        st.push(231);
        st.display();
        st.push(332);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.size());
        st.push(12);
        st.push(3);
        st.push(21);
        System.out.println(st.isFull());   
    }
}
