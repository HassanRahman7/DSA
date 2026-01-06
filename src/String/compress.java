package String;

import java.util.Scanner;

public class compress 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s,s2="";
        System.out.println("Enter a string:");
        s=sc.next();
        s=s+" ";
        char ch;
        int i=0,j=1,c=1;
        while(i<s.length()&&j<s.length())
        {
            ch=s.charAt(i);
            if(ch==s.charAt(j))
            {
                c++;
                j++;
            }
            else
            {
                if(c==1)
                s2=s2+ch;
                else
                s2=s2+ch+c;
                c=1;
                i=j;
                j++;
            }
        }
        char arr[]=s2.toCharArray();
        for(i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");


        }

        
    }
    
