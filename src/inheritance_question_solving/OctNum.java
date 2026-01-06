package inheritance_question_solving;

public class OctNum extends Num
{
    OctNum(int number)
    {
        super(number);
    }
    @Override
    void showNum()
    {
        System.out.print(Integer.toOctalString(number));
    }
}
