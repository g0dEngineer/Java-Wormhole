import java.util.ArrayList;

public class Zoo
{
    //features
    private ArrayList <Dog> dogs = new ArrayList <Dog> ( );
    
    //constructor
    public Zoo ( ArrayList <Dog> externalDogs )
    {
        this.dogs = externalDogs;
    }
    
    
    public ArrayList <Dog> getDogs ( )
    {
        return dogs;
    }
}
