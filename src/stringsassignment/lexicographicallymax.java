package stringsassignment;

import java.util.Arrays;
import java.util.Scanner;
//Q10. Given a sentence ‘str’, return the word that is lexicographically maximum.
public class lexicographicallymax 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter a sentence.");
        str=sc.nextLine();
        str=str+" ";
        int i,sp=0,p1=0,j=0;
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            sp++;
        }
        String words[]=new String[sp];
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                words[j++]=str.substring(p1,i);
                p1=i+1;
            }
        } 
        Arrays.sort(words);
        System.out.println(words[words.length-1]);
    }
    
}
