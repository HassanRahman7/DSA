package interface_questions;

import java.util.Scanner;

public class Hostel
{
    String hostelName,hostelLocation;
    int numberofRooms;
    void getHosteldata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your hostel name:");
        hostelName=sc.nextLine();
        System.out.println("Enter Hostel Location:");
        hostelLocation=sc.nextLine();
        System.out.println("Enter the number of rooms:");
        numberofRooms=sc.nextInt();
    }
    void printHosteldata()
    {
        System.out.println("Hostel Name:"+hostelName);
        System.out.println("Hostel Location:"+hostelLocation);
        System.out.println("Number of Rooms:"+numberofRooms);
    }
}
