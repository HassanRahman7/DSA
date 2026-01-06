package Binarysearch;

import java.util.Scanner;

public class minspeedtoariveontime 
{
    public static boolean answer(int dist[],int mid,double h) 
    {
        double c=0.0;
        int i;
        for(i=0;i<dist.length;i++)
        {
            if(i!=dist.length-1)
            {
                if(dist[i]%mid!=0)
                    c=c+dist[i]/mid+1;
                else
                    c=c+dist[i]/mid;
            }
            else
                c=c+(double)dist[i]/(double)mid;
        }
        if(c<=h)
            return true;
        else 
            return false;

        
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        double h;
        int i,n,lo=1,hi,mid=0,ans=-1;
        System.out.println("Enter the number of trains:");
        n=sc.nextInt();
        int dist[]=new int[n];
        System.out.println("Enter the distance travelled att ith train:");
        for(i=0;i<n;i++)
            dist[i]=sc.nextInt();
        System.out.println("Enter the total time:");
        h=sc.nextDouble();
       // h=2.7;
        //System.out.println((double)2/(double)5);
        hi=10000000+5;
        while(lo<hi)
        {
            mid=lo+(hi-lo)/2;
            if(answer(dist,mid,h)==true)
            {
                ans=mid;
                hi=mid;
            }
            else
            lo=mid+1;
        }
        if(ans>10000000)
        System.out.println(-1);
        else
        System.out.println(ans);
    }
}    

