// ====================================================================================
// Keith Michelangelo Fernandez
// ID: 1209266
// Email: fernkayl@kean.edu
//
// ASSIGNMENT: UNIT 3, BASIC DATA STRUCTURES
// FA23 CPS 2232-02
// 10/1/2023
// Iterable.java
// ====================================================================================


package Java.year2.semester1.generics;
import java.util.*;

public class Iterable
{
    public static void main(String[] args) 
    {   
        // CHANGED TO LINKEDLIST
        Collection<String> collection = new LinkedList<>();

        collection.add("New York"); 
        collection.add("Atlanta"); 
        collection.add("Dallas"); 
        collection.add("Madison"); 

        // USING THE FOR-EACH LOOP
        for (String city : collection) 
        {
            System.out.print(city.substring(0, 1).toUpperCase() + " ");
        }
        System.out.println();

        // USING THE ITERATOR
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) 
        {
            String city = iterator.next();
            System.out.print(city.substring(0, 1).toUpperCase() + " ");
        }
        System.out.println();
    }
}


