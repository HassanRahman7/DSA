package stringsassignment;

import java.util.Scanner;



public class secondlargestdigit 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter a string:");
        s=sc.next();
        String c[]=new String[s.length()];
        int arr[]=new int[c.length];
        int i;
        for(i=0;i<s.length();i++)
        {
            c[i]=s.substring(i, i+1);
            arr[i]=Integer.parseInt(c[i]);
        }
        int a,b,temp;
        a=arr[0];
        b=arr[0];
        for(i=1;i<arr.length;i++)
        {
            if(arr[i]>b&&arr[i]<a)
            b=arr[i];
            if(arr[i]>b&&arr[i]>a)
            {
                temp=a;
                a=b;
                b=temp;
                a=arr[i];
            }
        }
        System.out.println(b);

        
    }
    
}
