package Binarysearch;

import java.util.Arrays;
import java.util.Scanner;
//Amazon and Roblox (leetcod 1552)
public class Magneticforcesbetween2ball 
{
    public static boolean isAllocationPossible(int mind,int pos[],int m) 
    {
        int i,bp=1,lp=pos[0];
        for(i=1;i<pos.length;i++)
        {
            if(pos[i]-lp>=mind)
            {
                bp++;
                lp=pos[i];
            }
        }
        if(bp>=m)
        return true;
        else 
        return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int lo=1,ans=0,hi,i,m,n,mid=0;
        System.out.println("Enter the number of balls:");
        m=sc.nextInt();
        System.out.println("Enter the size of position array: ");
        n=sc.nextInt();
        System.out.println("Enter the position array:");
        int pos[]=new int[n];
        for(i=0;i<n;i++)
        pos[i]=sc.nextInt();
        if(m>pos.length)
        {
            System.out.println(-1);
            System.exit(0);
        }
        Arrays.sort(pos);
        hi=pos[n-1]-pos[0];
        while(lo<=hi)
        {
            mid=lo+(hi-lo)/2;
            if(isAllocationPossible(mid,pos,m)==true)
            {
                ans=mid;
                lo=mid+1;
            }
            else
            hi=mid-1;

        }
        System.out.println(ans);
    }
    
}
