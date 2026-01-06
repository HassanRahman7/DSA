package arrays;
import java.util.ArrayList;
public class basicsofArrayList 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> arr  =new ArrayList<>(6);
        arr.add(0,10);
        arr.add(1,20);  //Initialize
        arr.add(2,30);  //Isme line wise he initialize karna chahiye.
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
        System.out.println(arr);
        int i;
        for(i=0;i<arr.size();i++)
        System.out.print(arr.get(i)+" ");
        System.out.println();
        arr.set(2,300); //modify
        arr.add(90);
        System.out.println(arr);
        System.out.println("The size of array is :"+arr.size());
        // arr.add(0,30) used to initialize a value
        // arr.set(0,50) used to update/modify 
        //arr.add(90) used to push a value at the end of the list
        //arr.get(3) used to print a value
        ArrayList<Integer> list =new ArrayList<>();
        System.out.println(list+" "+list.size());
        list.add(60);
        System.out.println(list+" "+list.size());
        list.add(20);
        System.out.println(list+" "+list.size());
        list.add(204);
        System.out.println(list+" "+list.size());
        list.add(-45);
        System.out.println(list+" "+list.size());
        list.remove(1);
        System.out.println(list+" "+list.size());
    }
}
