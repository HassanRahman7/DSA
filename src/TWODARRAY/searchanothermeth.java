package TWODARRAY;

import java.util.Scanner;

public class searchanothermeth 
{
    //leetcode 240
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t,m,n,i,j,k=0;
        System.out.println("Enter the number of rows:");
        m=sc.nextInt();
        System.out.println("Enter the number of columns:");
        n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        i=m-1;
        j=0;
        System.out.println("Enter the number you want to search:");
        t=sc.nextInt();
        while(i>=0&&j<n)
        {
            if(arr[i][j]>t)
            i--;
            else if(arr[i][j]<t)
            j++;
            else
            {
                System.out.println("Search successful.");
                k++;
                break;
            }
        }
        if(k==0)
        System.out.println("Search unsuccessful.");
        
    }

    
}
