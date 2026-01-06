package Cyclic_Sort;

import java.util.ArrayList;
import java.util.List;


public class leetcode443 
{
    public static void swap(int arr[],int i,int j) 
    {
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public List<Integer> findDisappearedNumbers(int[] arr) 
    {
        int i=0;
        while(i!=arr.length)
        {
            if(arr[i]==arr[arr[i]-1])
            i++;
            else if(arr[i]==i+1)
                i++;
            else
            {
                swap(arr,i,arr[i]-1); 
            }
        }
        i=0;
        List<Integer> l=new ArrayList<>();
        while(i!=arr.length)
        {
            if(arr[i]==i+1)
            i++;
            else
            {
                l.add(i+1);
                i++;
            }
        }
        return l;        
    }
}
