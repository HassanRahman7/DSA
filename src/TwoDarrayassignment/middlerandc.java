package TwoDarrayassignment;

import java.util.Scanner;
//only possible with arrays of odd number of rows and columns like 3*3 AND 5*5. ALSO THE MATRIX MUST BE SQUARE MATRIX.
public class middlerandc 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,j,m,n;
        System.out.println("Enter the number of rows:");
        m=sc.nextInt();
        System.out.println("Enter the number of columns:");
        n=sc.nextInt();
        if(m==n&&m%2!=0&&n%2!=0)
        {
            int arr[][]=new int[m][n];
            System.out.println("Enter the elements in the array:");
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    if(i==m/2)
                    System.out.print(arr[i][j]);
                    else if(j==n/2)
                    System.out.print(arr[i][j]+" ");
                    else
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
        else
        System.out.println("Not possible.");

        
    }
    
}
