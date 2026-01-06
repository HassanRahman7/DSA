package Binarysearch;

import java.util.Scanner;

//leetcode 5219.
public class maxcandyallottokchild 
{//failed to solve.
    public static boolean posans(int mid,int k,int candy[]) 
    {
        if(mid==0)
        return true;
        int i,sp=0;
        for(i=0;i<candy.length;i++)
            sp=sp+candy[i]/mid;
        if(sp>=k)
            return true;
        else
            return false;        
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int ans=0,lo=1,hi,mx=Integer.MIN_VALUE,k,s=0,i,n,mid=0;
        System.out.println("Enter the size of candy array:");
        n=sc.nextInt();
        int candy[]=new int[n];
        System.out.println("Enter the number of candies in ith pile:");
        for(i=0;i<n;i++)
        candy[i]=sc.nextInt();
        System.out.println("Enter the number of children:");
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(candy[i]>mx)
            mx=candy[i];
        }
        hi=mx;
        while(lo<hi)
        {
            mid=lo+(hi-lo)/2;
            if(posans(mid,k,candy)==true)
                lo=mid+1;
            else
                hi=mid;
        }
        if(posans(mid, k, candy)==true)
        System.out.println(lo);
        else
        System.out.println(lo-1);
    
    }

    
}
