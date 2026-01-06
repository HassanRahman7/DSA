package leetcode;
//https://leetcode.com/problems/special-array-i/description/?envType=daily-question&envId=2025-02-01
// Leetcode 3151
public class specialarrayI 
{
    public static boolean isEven(int n)
    {
        if(n%2==0)
        return true;
        else
        return false;
    }
    public static boolean isArraySpecial(int[] arr) 
    {
        if(arr.length==1)
        return true;
        int i=0;
        while(i!=arr.length-1)
        {
            if((isEven(arr[i])==true&&isEven(arr[i+1])==true)||(isEven(arr[i])==false&&isEven(arr[i+1])==false))
                return false;
            i++;
        }
        return true;
        
    }
    public static void main(String[] args) 
    {
        int arr[]={4,3,1,6};
        System.out.println(isArraySpecial(arr));

        
    }
    
}
