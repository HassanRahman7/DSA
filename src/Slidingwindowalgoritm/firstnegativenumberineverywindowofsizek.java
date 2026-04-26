package Slidingwindowalgoritm;

import java.util.Scanner;

public class firstnegativenumberineverywindowofsizek 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of an array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        int d,c=0,k,i,j,r=0;
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter the value of K:");
        k=sc.nextInt();
        int brr[]=new int [n+1];
        i=0;
        j=k-1;
        while(i<n&&j<n)
        {
            d=i;
            while(d<=j)
            {
                if(arr[d]<0)
                {
                    brr[c++]=arr[d++];
                    r++;
                    break;
                }
                d++;
            }
            if(r==0)
                brr[c++]=0;
            i++;
            j++;
            r=0;
        }
        int crr[]=new int[c];
        for(i=0;i<c;i++)
            crr[i]=brr[i];
        for(i=0;i<c;i++)
            System.out.println(crr[i]);
    }
}
