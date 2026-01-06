package inheritance_question_solving;

public class Building 
{
    int floors;
    int rooms;
    int footage;
    Building(int floors,int rooms,int footage)
    {
        this.floors=floors;
        this.rooms=rooms;
        this.footage=footage;
    }
    void displayInfo()
    {
        System.out.println("Floors:"+floors+"Rooms:"+rooms+"footage:"+footage);
    }
}
