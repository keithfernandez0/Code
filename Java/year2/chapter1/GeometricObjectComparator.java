// ====================================================================================
// Keith Michelangelo Fernandez
// ID: 1209266
// Email: fernkayl@kean.edu
//
// ASSIGNMENT: UNIT 3, BASIC DATA STRUCTURES
// FA23 CPS 2232-02
// 10/1/2023
// ====================================================================================


package Java.year2.chapter1;
import java.util.Comparator;

class GeometricObjectComparator
    implements Comparator<GeometricObject>, java.io.Serializable 
{
    public int compare(GeometricObject o1, GeometricObject o2) 
    {
        double perimeter1 = o1.getPerimeter();
        double perimeter2 = o2.getPerimeter();

        return perimeter1 > perimeter2 ? 1 : perimeter1 == perimeter2 ? 0 : -1;
    }
}
