// ====================================================================================
// Keith Michelangelo Fernandez
// ID: 1209266
// Email: fernkayl@kean.edu
//
// ASSIGNMENT: UNIT 3, BASIC DATA STRUCTURES
// FA23 CPS 2232-02
// 10/1/2023
// TestForEach.java
// ====================================================================================

package Java.year2.semester1.generics;
import java.util.*;

public class TestForEach 
{
    public static void main(String[] args) 
    {
        Collection<String> collection = new ArrayList<>();
        collection.add("New York"); 
        collection.add("Atlanta"); 
        collection.add("Dallas"); 
        collection.add("Madison"); 

        collection.forEach(e -> System.out.print(e.toUpperCase() + " "));

        ArrayList<Integer> collection2 = new ArrayList<>();
        String keanID = "1209266";
        for (char digit : keanID.toCharArray()) {
            collection2.add(Character.getNumericValue(digit));
        }

        // LOG 10 FOR KEAN ID
        collection2.forEach(e -> System.out.print(Math.log10(e) + " "));
    }
}





