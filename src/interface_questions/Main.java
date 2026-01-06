package interface_questions;

public class Main 
{
    public static void main(String[] args) 
    {
        Mango m1=new Winter();
        Mango m2=new Summer();
        System.out.println("Summer Season");
        m2.availability();
        System.out.println("Winter Season");
        m1.availability();
    }
}
