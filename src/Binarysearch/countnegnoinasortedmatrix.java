package Binarysearch;


import java.util.Scanner;

public class countnegnoinasortedmatrix 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int m,n,i,j,ne=0;
        System.out.println("Enter the number of rows:");
        m=sc.nextInt();
        System.out.println("Enter the number of columns:");
        n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("Enter elements in the array:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt(); 
                if(arr[i][j]<0)
                ne++;
            }
        }
        System.out.println(ne);
        /*int brr[]=new int[m*n];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                brr[c++]=arr[i][j];
            }
        }
        Arrays.sort(brr);
        hi=brr.length-1;
        while(lo<=hi)
        {
            mid=(lo+hi)/2;
            if(brr[mid]<0)
            lo=mid+1;
            else if(brr[mid]>0)
            hi=mid-1;
            else if(brr[mid]==0)
            break;
        }
        System.out.println(mid+1);
        */
    }
    
}
