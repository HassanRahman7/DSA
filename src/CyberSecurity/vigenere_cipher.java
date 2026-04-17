package CyberSecurity;
import java.util.HashMap;
import java.util.Scanner;
public class vigenere_cipher 
{
    public static String updateString(String str) 
    {
        return str.substring(1)+str.charAt(0);
    }
    public static void main(String[] args) 
    {
        char mat[][]=new char[26][26];
        String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // String str2=str.substring(1)+str.charAt(0);
        // System.out.println(str2);
        int i=0,j=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(i!=str.length())
        {
            map.put(str.charAt(i),i);
            i++;
        }
        i=0;
        while(i!=26)
        {
            j=0;
            while(j!=26)
                mat[i][j]=str.charAt(j++);
            str=updateString(str);
            i++;
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the plain text:");
        String pt=sc.nextLine();
        System.out.println("Enter the key:");
        String key=sc.nextLine();
        i=0;
        // while(key.length()!=pt.length())
        if(pt.length()>key.length())
        {
            while(pt.length()!=key.length())
                key=key+key.charAt(i++);
        }
        i=0;
        String ans="";
        while(i!=pt.length())
            ans=ans+mat[map.get(pt.charAt(i))][map.get(key.charAt(i++))];
        System.out.println("The Encrypted text="+ans);
        HashMap<String,String> map2=new HashMap<>();
        map2.put(ans,pt);
        System.out.println("The decrypted text="+map2.get(ans));
    }
    
}
