package TWODARRAY;

import java.util.Scanner;

public class spiral 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int c=1,i,j,m,n,minr=0,maxr,minc=0,maxc;
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
        maxr=m-1;
        maxc=n-1;
        while(c<=m*n)
        {
            for(j=minr;j<=maxc;j++)
            {
                System.out.print(arr[minr][j]+" ");
                c++;
            }
            if(c>=m*n)
                break;
            minr++;
            for(i=minr;i<=maxr;i++)
            {
                System.out.print(arr[i][maxc]+" ");
                c++;
            }
            if(c>=m*n)
                break;
            maxc--;
            for(i=maxc;i>=minc;i--)
            {
                System.out.print(arr[maxr][i]+" ");
                c++;
            }
            if(c>=m*n)
                break;
            maxr--;
            for(i=maxr;i>=minr;i--)
            {
                System.out.print(arr[i][minc]+" ");
                c++;
            }
            minc++;
        }
    }
}