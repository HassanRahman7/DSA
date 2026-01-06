package TwoDarrayassignment;


public class store10 
{
    public static void main(String[] args) 
    {
        int i,j;
        int arr[][]=new int[5][5];
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                arr[i][j]=10;
            }
        }
        System.out.println("Printing the array:");
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }

    
}
