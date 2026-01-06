package Binarysearch;

import java.util.Scanner;

public class kthmissingpositivenumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n,k,i,c=1,ans=0,p=0;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter the value of k:");
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            while(arr[i]!=c)
            {
                ans=c;
                p++;
                c++;
                if(p==k)
                break;
            }
            if(p==k)
            break;
            c++;
        }
        if(ans==0)
            System.out.println(arr[n-1]+k);
        if(p!=k)
        {
            while(p!=k)
            {
                ans=c;
                p++;
                c++;
                if(p==k)
                break;
            }
        }
        System.out.println(ans);
    }
}
