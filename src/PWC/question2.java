// package PWC;
package PWC;
public class question2 
{
    public static int array_sum(int arr[])
    {
        int i=0,sum=0;
        while(i!=arr.length)
            sum=sum+arr[i++];
        return sum;
    }
    public static int getMaxToys(int arr[],int k) 
    {
        if(array_sum(arr)==k)
            return arr.length;
        int i=0,j=0,sum=arr[i],ans=Integer.MIN_VALUE;
        while(i!=arr.length && j!=arr.length)
        {
            // sum=sum+arr[j];
            if(sum<=k)
            {
                ans=(int)Math.max(ans,j-i+1);
                // System.out.println(ans);
                if(j<arr.length-1)
                    sum=sum+arr[++j];
                else if(j==arr.length-1)
                    break;
            }
            else
            {
                sum=sum-arr[i++];
                if(sum==0)
                {
                    j++;
                    if(i==arr.length)
                        break;
                    sum=arr[i];
                    continue;
                }
                ans=(int)Math.max(ans,j-i+1);
            }
        }
        if(ans==Integer.MIN_VALUE)
            return 0;
        else
            return ans;
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,1,0,1,1,0};
        int k=4;
        System.out.println(getMaxToys(arr, k));   
    }   
    
}
