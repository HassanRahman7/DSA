package Binarysearch;

import java.util.Arrays;



public class containsduplicate 
{
    public static void main(String[] args) 
    {
        int arr[]={1,1,1,3,3,4,3,2,4,2};
        int i,n;
        Arrays.sort(arr);
        n=arr.length;
        boolean flag=false;
        for(i=0;i<n-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                flag=true;
                break;
            }
            
        
        }
        System.out.println(flag);
    
    }
}
