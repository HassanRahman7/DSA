package arrays;
import java.util.Arrays;
public class leetcode2148 
{
    public static int countElements(int[] arr) 
    {
        if(arr.length==1)
        return 0;
        Arrays.sort(arr);
        int i=1,c=0;
        while(i!=arr.length-1)
        {
            if(arr[i]>arr[0]&&arr[i]<arr[arr.length-1])
            c++;
            i++;
        }
        return c;
    }
    public static void main(String[] args) 
    {
        int arr[]={11,7,2,15};
        System.out.println(countElements(arr));
    }
}
