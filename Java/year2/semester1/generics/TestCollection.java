// ====================================================================================
// Keith Michelangelo Fernandez
// ID: 1209266
// Email: fernkayl@kean.edu
//
// ASSIGNMENT: UNIT 3, BASIC DATA STRUCTURES
// FA23 CPS 2232-02
// 10/1/2023
// TestCollection.java
// ====================================================================================

package Java.year2.chapter1;
import java.util.*;

public class TestCollection 
{
    public static void main(String[] args) 
    {
        // USING TREESET
        TreeSet<String> collection1 = new TreeSet<>();
        collection1.add("New York"); 
        collection1.add("Atlanta"); 
        collection1.add("Dallas"); 
        collection1.add("Phoenix"); // ADDED NEW CITY

        System.out.println("A set of cities in collection1:");
        System.out.println(collection1);

        System.out.println("\nIs Dallas in collection1? "
        + collection1.contains("Dallas"));

        collection1.remove("Dallas");
        System.out.println("\n" + collection1.size() + 
        " cities are in collection1 now");

        // USING TREESET
        TreeSet<String> collection2 = new TreeSet<>();
        collection2.add("Seattle"); 
        collection2.add("Portland"); 
        collection2.add("Los Angeles");
        collection2.add("Atlanta"); 

        System.out.println("\nA set of cities in collection2:");
        System.out.println(collection2);

        // USING TREESET
        TreeSet<String> c1 = new TreeSet<>(collection1);
        c1.addAll(collection2);
        System.out.println("\nCities in collection1 or collection2: ");
        System.out.println(c1);

        c1 = new TreeSet<>(collection1);
        c1.retainAll(collection2);
        System.out.print("\nCities in collection1 and collection2: ");
        System.out.println(c1);

        c1 = new TreeSet<>(collection1);
        c1.removeAll(collection2);
        System.out.print("\nCities in collection1, but not in 2: ");
        System.out.println(c1);
    }
}
