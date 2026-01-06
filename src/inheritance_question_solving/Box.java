package inheritance_question_solving;

public class Box extends ThreeDobjects
{
    double length,breadth,height;
    Box(double length,double breadth,double height)
    {
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }
    @Override
    // @Override
    double wholeSurfaceArea() 
    {
        return (2*(length*breadth+breadth*height+height*length));
    }
    @Override
    double volume()
    {
        return length*breadth*height;
    }
}
