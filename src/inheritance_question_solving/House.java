package inheritance_question_solving;

public class House extends Building
{
    int bedrooms,bathrooms;
    House(int floors,int footage,int rooms,int bedrooms,int bathrooms)
    {
        super(floors, rooms, footage);
        this.bathrooms=bathrooms;
        this.bedrooms=bedrooms;
    }
    @Override
    void displayInfo()
    {
        super.displayInfo();
        System.out.println("Bedrooms:"+bedrooms+"Bathrooms:"+bathrooms);
    }
}
