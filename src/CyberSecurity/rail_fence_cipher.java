package CyberSecurity;

import java.util.Scanner;

public class rail_fence_cipher 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the plain text:");
        String str=sc.nextLine();
        int depth;
        System.out.println("Enter the depth:");
        depth=sc.nextInt();
        char mat[][]=new char[depth][(int)Math.ceil(str.length()/2.0)];
        int i=0,j=0,c=0;
        while(i!=depth && j!=(int)Math.ceil(str.length()/2.0))
        {
            if(c!=str.length())
                mat[i][j]=str.charAt(c++);
            else 
                mat[i][j]='x';
            i++;
            if(i==depth)
            {
                i=0;
                j++;
            }
            if(j==(int)Math.ceil(str.length()/2.0))
                break;
        }
        i=0;
        j=0;
        String ans="";
        while(i!=depth)
        {
            j=0;
            while(j!=(int)Math.ceil(str.length()/2.0))
            {
                ans=ans+mat[i][j++];
            }
            i++;
            // System.out.println();
        }
        System.out.println("Encrypted text:"+ans);
        String a=ans.substring(0,ans.length()/2);
        System.out.println(a);
        String b=ans.substring(ans.length()/2);
        System.out.println(b);
        String decrypt="";
        i=0;
        j=0;
        while(i!=a.length() && j!=b.length())
            decrypt=decrypt+a.charAt(i++)+b.charAt(j++);
        System.out.println("Decrypted String="+decrypt.substring(0,str.length()));
    }
}
