package Slidingwindowalgoritm;

import java.util.Scanner;

public class CountOccurencesofAnagrams 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String txt,pat;
        int arr[]=new int[26];
        System.out.println("Enter txt:");
        txt=sc.nextLine();
        txt=txt+" ";
        System.out.println("Enter a pattern:");
        pat=sc.nextLine();
        int i,j,k,r=0;
        char ch;
        for(i=0;i<pat.length();i++)
        {
            ch=pat.charAt(i);
            arr[(int)ch-97]++;
        }
        j=pat.length();
        i=0;
        //System.out.println(txt.substring(i,j));
        while(i<txt.length()&&j<txt.length())
        {
            String str=txt.substring(i, j);
            int brr[]=new int[26];
            //System.out.println(str);
            for(k=0;k<str.length();k++)
            {
                ch=str.charAt(k);
                brr[(int)ch-97]++;
            }
            for(k=0;k<26;k++)
            {
                if(arr[k]==brr[k])
                continue;
                else
                break;
            }
            if(k==26)
            r++;
            i++;
            j++;
        }
        System.out.println(r);
        
    }
    
}
