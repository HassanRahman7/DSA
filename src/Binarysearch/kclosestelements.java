package Binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class kclosestelements 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n,i,x,k,j;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter the value of x:");
        x=sc.nextInt();
        System.out.println("Enter the value of k:");
        k=sc.nextInt();
        List<Integer> ans=new ArrayList<>();
        if(x<arr[0])
        {
            for(i=0;i<k;i++)
            ans.add(arr[i]);
        }
        else if(x>arr[n-1])
        {
            for(i=n-1;i>=n-k;i--)
            ans.add(arr[i]);
            Collections.sort(ans);
        }
        else
        {
            int lb=n,hi,lo,mid=0;
            lo=0;
            hi=n-1;
            while(lo<=hi)
            {
                mid=lo+(hi-lo)/2;
                if(arr[mid]<x)
                lo=mid+1;
                else if(arr[mid]>=x)
                {
                    hi=mid-1;
                    lb=Math.min(lb,mid);
                }
            }
            i=lb-1;
            j=lb;
            while(k>0&&i>=0&&j<n)
            {
                int di,dj;
                di=(int)Math.abs((double)x-(double)arr[i]);
                dj=(int)Math.abs((double)x-(double)arr[j]);
                if(di<=dj)
                {
                    ans.add(arr[i]);
                    i--;
                }
                else
                {
                    ans.add(arr[j]);
                    j++;
                }
                k--;
            }
            while(i<0&&k>0)
            {
                int dj=Math.abs(x-arr[j]);
                ans.add(arr[j]);
                j++;
                k--;
            }
            while(j==n&&k>0)
            {
                int di=Math.abs(x-arr[i]);
                ans.add(arr[i]);
                i--;
                k--;
            }
            Collections.sort(ans);
            System.out.println(ans);

        }
        

    }
    
}
