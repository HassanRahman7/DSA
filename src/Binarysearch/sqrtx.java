package Binarysearch;

public class sqrtx 
{
    public static void main(String[] args) 
    {
        boolean flag=false;
        int x=16;
        int lo=0,hi=x,mid=0;
        while(lo<=hi)
        {
            mid=(lo+hi)/2;
            if(mid*mid<x)
            lo=mid+1;
            else if(mid*mid>x)
            hi=mid-1;
            else if(mid*mid==x)
            {
                flag=true;
                break;
            }
            

        }
        if(flag==true)
        System.out.println(mid);
        else
        System.out.println(hi);
        
    }


    
}
