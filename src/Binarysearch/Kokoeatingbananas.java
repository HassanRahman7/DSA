package Binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class Kokoeatingbananas 
{
    public static boolean possibleans(int pil[],int h,int mid) 
    {
        int i,hours=0;
        for(i=0;i<pil.length;i++)
        {
            if(pil[i]<mid)
            hours++;
            else
            {
                if(pil[i]%mid==0)
                hours=hours+pil[i]/mid;
                else
                hours=hours+pil[i]/mid+1;
            }
        }
        if(hours<=h)
        return true;
        else 
        return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int lo=1,hi,mid=0,h,i,n,ans=0;
        System.out.println("Enter the number of piles:");
        n=sc.nextInt();
        int pil[]=new int[n];
        System.out.println("Enter the number of bananas in ith pile:");
        for(i=0;i<n;i++)
        pil[i]=sc.nextInt();
        System.out.println("Enter the number of hours:");
        h=sc.nextInt();
        Arrays.sort(pil);
        hi=pil[n-1];
        while(lo<=hi)
        {
            mid=lo+(hi-lo)/2;
            if(possibleans(pil,h,mid)==true)
            {
                ans=mid;
                hi=mid-1;
            }
            else
            lo=mid+1;
        }
        System.out.println(ans);
         
        
    }
}

