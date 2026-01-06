package TwoDarrayassignment;

import java.util.Scanner;

public class diagonal 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,j,m;
        System.out.println("Enter the number of rows in the square matrix :");
        m=sc.nextInt();
        int arr[][]=new int[m][m];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                if(i==j||i+j==m-1)
                    System.out.print(arr[i][j]);
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
    
}
