package inheritance_question_solving;

public class Cylinder extends ThreeDobjects 
{
    double radius,height;
    Cylinder(double radius,double height)
    {
        this.radius=radius;
        this.height=height;
    }
    @Override
    double wholeSurfaceArea()
    {
        return 2*3.14*radius*(radius+height);
    }
    @Override
    double volume()
    {
        return 3.14*radius*radius*height;
    }
}
