package Arraysassignement;

import java.util.Scanner;

public class uniquelement 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,n,j,c=0;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                    break;
                }
            }
            if(c==0)
            {
                System.out.println("The unique element is "+arr[i]);
                break;
            }
        }
    }
}
        

        
    
    

