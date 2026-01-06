package TWODARRAY;

import java.util.Scanner;

public class transpose2 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int m,i,j,temp,c=0;
        System.out.println("Enter the number of rows or columns of the square matrix:");
        m=sc.nextInt();
        int arr[][]=new int[m][m];
        System.out.println("Enter the elements in the 2d array:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<m;i++)
        {
            for(j=c;j<m;j++)
            {
                if(i==j)
                    continue;
                else
                {
                    temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
            if(j==m)
            c++;
        }
        System.out.println("Printing the modified array:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
