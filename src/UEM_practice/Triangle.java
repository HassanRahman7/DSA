package UEM_practice;

public class Triangle extends Graphic2D
{
    Triangle(double a,double b)
    {
        super(a,b);
    }
    @Override 
    double area()
    {
        return 0.5*dim1*dim2;
    }
}
