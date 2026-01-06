package UEM_practice;

public class Rectangle extends Graphic2D
{
    Rectangle(double a,double b)
    {
        super(a,b);
    }
    @Override
    double area()
    {
        return dim1*dim2;
    }
}
