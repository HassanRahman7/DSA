package arrays;
import java.util.Scanner;
public class marks 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        System.out.println("Enter the number of students:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the marks of the students:");
        for(i=0;i<n;i++)
           arr[i]=sc.nextInt();
        System.out.println("The Roll number of students who have their marks less than 35 are:");
        for(i=0;i<n;i++)
        {
            if(arr[i]<35)
            System.out.println(i);
            
        }   
    }

    
}
