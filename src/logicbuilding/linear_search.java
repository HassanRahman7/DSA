package logicbuilding;
import java.util.Scanner;
public class linear_search 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int key,i;
        System.out.println("Enter the elements into the array.");
        for(i=0;i<5;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter the element to be searched:");
        key=sc.nextInt();
        // The main algo starts:
        boolean flag=false; 
        for(i=0;i<5;i++)
        {
            if(arr[i]==key)
            {
                System.out.println("Element is present.");
                flag=true;
                break;
            }
        }
        if(flag==false)
        System.out.println("Element is not present.");
    }
}
