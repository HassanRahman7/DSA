package UEM_practice;

import java.util.LinkedList;

public class polymorphisDemo 
{
    public static void main(String[] args) 
    {
        LinkedList<Graphic2D> shapes=new LinkedList<>();
        shapes.add(new Rectangle(234,45));
        shapes.add(new Triangle(43,56));
        for(Graphic2D shape:shapes)
        System.out.println("Area:"+shape.area());   
    }
}
