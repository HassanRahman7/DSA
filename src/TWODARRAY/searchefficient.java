package TWODARRAY;

import java.util.Scanner;

public class searchefficient 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t,m,n,i,j,k=0;
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
            }
        }
        System.out.println("Enter the element to be searched:");
        t=sc.nextInt();
        i=0;
        j=n-1;
        while(i<m&&j>=0)
        {
            if(arr[i][j]>t)
            j--;
            else if(arr[i][j]<t)
            i++;
            else
            {
                System.out.println("Search successful.");
                k++;
                break;
            }
        }
        if(k==0)
        System.out.println("Search Unsuccessful.");

        
    }
    
}
