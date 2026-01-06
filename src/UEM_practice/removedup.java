package UEM_practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class removedup 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 9 elements:");
        int i=1;
        List<Integer> arr=new ArrayList<>();
        while(i!=9)
        {
            arr.add(sc.nextInt());
            i++;
        }
        HashSet <Integer> set=new HashSet<>();
        i=0;
        while(i!=8)
            set.add(arr.get(i++));
        System.out.println(set);
    }
    
}
