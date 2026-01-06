package Slidingwindowalgoritm;

import java.util.Scanner;
//find the maximum sum of all subarrays of size K:

public class maxsumofsubarrayofsizek 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int j,i,n,k,maxsum=0,sum=0;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        System.out.println("Enter the elements in the array:");
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter the size of k:");
        k=sc.nextInt();
        for(i=0;i<k;i++)
            sum=sum+arr[i];
        maxsum=0;
        j=k-1;
        i=0;
        //isDistinct(arr, 3, 5);
        while(i<arr.length&&j<arr.length)
        {
            j++;
            if(j>=arr.length)
                break;
            sum=sum+arr[j]-arr[i++];
            if(maxsum<sum)
                maxsum=sum;
        }
        System.out.println("Answer="+maxsum);
    }
}
