package CyberSecurity;
import java.util.HashMap;
import java.util.*;
class caeser_cipher
{
    public static String encrypt(String pt,int key,HashMap<Character,Integer> map,HashMap<Integer,Character> map3) 
    {
        String ans="";
        int i=0;
        while(i!=pt.length())
        {
            char ch=pt.charAt(i++);
            int val=(map.get(ch)+key)%26;
            // System.out.println(val);
            ans=ans+map3.get(val);
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Integer,Character> map3=new HashMap<>();
        int i=97;
        while(i!=123)
        {
            map.put((char)i,i-97);
            map3.put(i-97,(char)i);
            i++;
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the plain text please:");
        String pt=sc.nextLine();
        int key;
        System.out.println("Enter a key:");
        key=sc.nextInt();
        System.out.println("Encrypted text="+encrypt(pt, key,map,map3));
        HashMap<String,String> map2=new HashMap<>();
        map2.put(encrypt(pt,key,map,map3),pt);
        System.out.println("Decrypted text="+map2.get(encrypt(pt,key,map,map3)));
    }
}