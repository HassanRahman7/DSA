package arrays;

public class minimum_number_of_operations_to_make_all_array_elements_equal_to_1
{
    public static int GCD(int num1,int num2)
    {
        if(num1==num2)
            return num1;
        else if(num1>num2)
            return GCD(num1-num2,num2);
        else
            return GCD(num1,num2-num1);
    }
    public static int minOperations(int[] arr)
    {
        int i=0,count1s=0;
        while(i!=arr.length)
        {
            if(arr[i++]==1)
                count1s++;
        }
        if(count1s!=0)
            return arr.length-count1s;
        else
        {
            int gcd;
            i=0;
            int j;
            int minLength=Integer.MAX_VALUE;
            for(i=0;i<arr.length;i++)
            {
                // int minLength=Integer.MAX_VALUE;
                gcd=arr[i];
                for(j=i+1;j<arr.length;j++)
                {
                    gcd=GCD(gcd,arr[j]);
                    if(gcd==1)
                    {
                        minLength=(int)Math.min(minLength,j-i+1);
                        break;
                    }
                    else
                        continue;
                }
            }
            if(minLength==Integer.MAX_VALUE)
                return -1;
            else
                return minLength-1+arr.length-1;
        }
    }
    public static void main(String[] args)
    {
        int arr[]={2,6,3,4};
        System.out.println(minOperations(arr));
    }
}
