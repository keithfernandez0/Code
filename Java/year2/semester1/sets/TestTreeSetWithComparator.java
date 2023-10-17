package Java.year2.semester1.sets;
import java.util.*;
import Java.year2.semester1.generics.Circle;
import Java.year2.semester1.generics.GeometricObject;
import Java.year2.semester1.generics.Rectangle;

public class TestTreeSetWithComparator 
{
    public static void main(String[] args) 
    {
        // CREATE A TREE SET FOR GEOMETRIC OBJECTS USING A COMPARATOR
        Set<GeometricObject> set = new TreeSet<>(new GeometricObjectComparator());
        set.add(new Rectangle(4, 5));
        set.add(new Circle(40));
        set.add(new Circle(40));
        set.add(new Rectangle(4, 1));

        // DISPLAY GEOMETRIC OBJECTS IN THE TREE SET
        System.out.println("A sorted set of geometric objects");
        for (GeometricObject element : set)
            System.out.println("area = " + element.getArea());

        // CREATE AND INSERT 4 BERRIES INTO A HASHSET
        Set<Berry> berryHashSet1 = new HashSet<>();
        berryHashSet1.add(new Berry(2.5, "2023-12-31"));
        berryHashSet1.add(new Berry(1.8, "2023-11-15"));
        berryHashSet1.add(new Berry(3.2, "2023-10-20"));
        berryHashSet1.add(new Berry(2.0, "2023-09-05"));

        // CREATE AND INSERT 5 BERRIES INTO ANOTHER HASHSET
        Set<Berry> berryHashSet2 = new HashSet<>();
        berryHashSet2.add(new Berry(1.5, "2023-11-30"));
        berryHashSet2.add(new Berry(2.8, "2023-10-15"));
        berryHashSet2.add(new Berry(3.5, "2023-12-05"));
        berryHashSet2.add(new Berry(1.2, "2023-09-15"));
        berryHashSet2.add(new Berry(2.3, "2023-08-25"));

        // CREATE A BERRYCOMPARATOR AND INSERT 4 BERRIES INTO A TREESET
        Set<Berry> berryTreeSet = new TreeSet<>(new BerryComparator());
        berryTreeSet.add(new Berry(2.5, "2023-12-31"));
        berryTreeSet.add(new Berry(1.8, "2023-11-15"));
        berryTreeSet.add(new Berry(3.2, "2023-10-20"));
        berryTreeSet.add(new Berry(2.0, "2023-09-05"));

        // DISPLAY BERRIES IN THE TREE SET
        System.out.println("\nA sorted set of berries using BerryComparator");
        for (Berry berry : berryTreeSet)
            System.out.println("price = " + berry.getPrice() + ", expiration date = " + berry.getExpirationDate());
    }
}

class Berry 
{
    private double price;
    private String expirationDate;

    public Berry(double price, String expirationDate) 
    {
        this.price = price;
        this.expirationDate = expirationDate;
    }

    public double getPrice() 
    {
        return price;
    }

    public String getExpirationDate() 
    {
        return expirationDate;
    }
}

class BerryComparator implements Comparator<Berry> 
{
    @Override
    public int compare(Berry berry1, Berry berry2) 
    {
        // COMPARE BERRIES BASED ON PRICE
        return Double.compare(berry1.getPrice(), berry2.getPrice());
    }
}

class GeometricObjectComparator implements Comparator<GeometricObject> 
{
    @Override
    public int compare(GeometricObject o1, GeometricObject o2) 
    {
        // IMPLEMENT YOUR COMPARISON LOGIC FOR GEOMETRIC OBJECTS HERE
        return Double.compare(o1.getArea(), o2.getArea());
    }
}
