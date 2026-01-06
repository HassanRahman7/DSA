package inheritance_question_solving;

import java.util.Scanner;

public class buildingdemo 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int rooms,bedrooms,bathrooms,footage,floors;
        System.out.println("Enter the number of rooms:");
        rooms=sc.nextInt();
        System.out.println("Enter the number of berooms:");
        bedrooms=sc.nextInt();
        System.out.println("Enter the number of bathrooms:");
        bathrooms=sc.nextInt();
        System.out.println("Enter the number of footage:");
        footage=sc.nextInt();
        System.out.println("Enter the number of floors:");
        floors=sc.nextInt();
        Building ob=new House(floors, footage, rooms, bedrooms, bathrooms);
        ob.displayInfo();
    }

    
}
