package inheritance_question_solving;

public class Cube extends ThreeDobjects
{
    double side;
    Cube(double side)
    {
        this.side=side;
    }
    @Override
    double wholeSurfaceArea()
    {
        return 6*side*side;
    }
    @Override
    double volume()
    {
        return side*side*side;
    }
}
