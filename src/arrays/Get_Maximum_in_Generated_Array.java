package arrays;

public class Get_Maximum_in_Generated_Array
{
    public static int getMaximumGenerated(int n)
    {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 1;
        int arr[]=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        int i=1;
        int max=Integer.MIN_VALUE;
        while(2*i<=n && 2*i+1<=n)
        {
            arr[2*i]=arr[i];
            arr[2*i+1]=arr[i]+arr[i+1];
            max=(int)Math.max(max,Math.max(arr[2*i],arr[2*i+1]));
            i++;
        }
        return max;
    }

    public static void main(String[] args)
    {
        int n=3;
        System.out.println(getMaximumGenerated(n));

    }
}
