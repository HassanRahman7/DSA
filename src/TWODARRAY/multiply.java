package TWODARRAY;

import java.util.Scanner;

public class multiply 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,j,m1,n1,m2,n2,k;
        System.out.println("Enter the number of rows of first matrix:");
        m1=sc.nextInt();
        System.out.println("Enter the number of columns of first matrix:");
        n1=sc.nextInt();
        System.out.println("Enter the number of rows of second matrix:");
        m2=sc.nextInt();
        System.out.println("Enter the number of columns of second matrix:");
        n2=sc.nextInt();
        int arr[][]=new int[m1][n1];
        int brr[][]=new int[m2][n2];
        System.out.println("Enter the elements in the first matrix:");
        for(i=0;i<m1;i++)
        {
            for(j=0;j<n1;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements in the second matrix:");
        for(i=0;i<m2;i++)
        {
            for(j=0;j<n2;j++)
            {
                brr[i][j]=sc.nextInt();
            }
        }
        if(n1==m2)
        {//Multiplication is possible.
            int crr[][]=new int[m1][n2];
            for(i=0;i<m1;i++)
            {
                for(j=0;j<n2;j++)
                {
                    for(k=0;k<n1;k++)
                    {
                        crr[i][j]=crr[i][j]+arr[i][k]*brr[k][j];
                    }
                }
            }
            System.out.println("Printing the resultant matrix:");
            for(i=0;i<m1;i++)
            {
                for(j=0;j<n2;j++)
                {
                    System.out.print(crr[i][j]+" ");
                }
                System.out.println();
            }
        }
        else
        System.out.println("Matrix multiplication is not possible.");

        }
        
    }
    

