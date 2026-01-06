package TWODARRAY;

import java.util.Scanner;

public class rollnumber 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[4][2];
        int i,j;
        System.out.println("Enter your roll number and then followed by your marks and continue that pattern:");
        for(i=0;i<4;i++)
        {
            for(j=0;j<2;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Printing the data:");
        for(i=0;i<4;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
