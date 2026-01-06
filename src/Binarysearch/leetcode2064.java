package Binarysearch;

import java.util.Scanner;

public class leetcode2064 
{
    public static boolean Correct(int arr[],int n,int p) 
    {
        int stores=0;
        int i;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]%p==0)
            stores=stores+arr[i]/p;
            else
            stores=stores+arr[i]/p+1;            
        }
        if(stores>n)
        return false;
        else 
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int maxans=0,m,mx,i,n,lo=1,hi,mid=0;
        System.out.println("Enter the size of array:");
        m=sc.nextInt();
        int arr[]=new int[m];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<m;i++)
        arr[i]=sc.nextInt();
        mx=Integer.MIN_VALUE;
        System.out.println("Enter the number of stores:");
        n=sc.nextInt();
        for(i=0;i<m;i++)
        {
            if(arr[i]>mx)
            mx=arr[i];
        }
        hi=mx;
        while(lo<=hi)
        {
            mid=lo+(hi-lo)/2;
            if(Correct(arr, n, mid)==true)
            {
                maxans=mid;
                hi=mid-1;
            }
            else
            lo=mid+1;
        }
        System.out.println(maxans);
    }
    
}
