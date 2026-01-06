package inheritance_question_solving;

public class InheritanceDemo 
{
    public static void main(String[] args) {
        // Creating an object of base class
        Num num = new Num(100);
        num.showNum();  // Outputs decimal

        // Creating an object of derived class
        OctNum octNum = new OctNum(100);
        octNum.showNum();  // Outputs octal
    }
}
