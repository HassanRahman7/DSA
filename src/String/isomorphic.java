package String;

import java.util.Scanner;

public class isomorphic 
{ 
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s,t;
        System.out.println("Enter 2 strings:");
        s=sc.next();
        t=sc.next();
        if(s.length()!=t.length())
        System.out.println("Not isomorphic.");
        else
        {
            int arr[]=new int[128];
            int arr2[]=new int[128];
            int dcs=0,dct=0,i;
            for(i=0;i<s.length();i++)
                arr[(int)s.charAt(i)]++;
            for(i=0;i<t.length();i++)
                arr2[(int)t.charAt(i)]++;
            for(i=0;i<128;i++)
            {
                if(arr[i]!=0)
                dcs++;
                if(arr2[i]!=0)
                dct++;
            }
            if(dcs!=dct)
            System.out.println("Not isomorphic.");
            else
            {
                int k=0;
                char arrs[]=new char[128];
                for(i=0;i<s.length();i++)
                {
                    if(arrs[(int)s.charAt(i)]=='\u0000'||arrs[(int)s.charAt(i)]==t.charAt(i))
                    arrs[(int)s.charAt(i)]=t.charAt(i);
                    else
                    {
                        System.out.println("Not isomorphic");
                        k++;
                    }
                }
                if(k==0)
                System.out.println("Isomorphic.");
                

                
            }

        }
    }
    
}
