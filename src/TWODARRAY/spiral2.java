package TWODARRAY;

import java.util.Scanner;

//leetcode 59

public class spiral2 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,j,minr=0,minc=0,maxr,maxc,c=0,n;
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
        maxr=maxc=n-1;
        int arr[][]=new int [n][n];
        while(c<n*n)
        {
            for(j=minc;j<=maxc;j++)
            {
                arr[minr][j]=c+1;
                c++;
            }
            if(c>=n*n)
            break;
            minr++;
            for(i=minr;i<=maxr;i++)
            {
                arr[i][maxc]=c+1;
                c++;
            }
            if(c>=n*n)
            break;
            maxc--;
            for(j=maxc;j>=minc;j--)
            {
                arr[maxr][j]=c+1;
                c++;
            }
            if(c>=n*n)
            break;
            maxr--;
            for(i=maxr;i>=minr;i--)
            {
                arr[i][minc]=c+1;
                c++;
            }
            minc++;
        }
        System.out.println("Printing the modified array:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        
    }
    
}
