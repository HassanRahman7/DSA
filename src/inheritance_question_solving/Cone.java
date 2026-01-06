package inheritance_question_solving;

public class Cone extends ThreeDobjects
{
    double radius;
    double height;
    Cone(double radius,double height)
    {
        this.radius=radius;
        this.height=height;
    }
    @Override
    double wholeSurfaceArea()
    {
        return 3.14*radius*(radius+height);
    }
    @Override
    double volume()
    {
        return 0.33*3.14*radius*radius*height;
    }
}
