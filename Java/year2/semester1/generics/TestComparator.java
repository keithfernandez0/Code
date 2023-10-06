// ====================================================================================
// Keith Michelangelo Fernandez
// ID: 1209266
// Email: fernkayl@kean.edu
//
// ASSIGNMENT: UNIT 3, BASIC DATA STRUCTURES
// FA23 CPS 2232-02
// 10/1/2023
// ====================================================================================


package Java.year2.semester1.generics;
import java.util.Comparator;

public class TestComparator {
  public static void main(String[] args) {
      GeometricObject g1 = new Rectangle(5, 5);
      GeometricObject g2 = new Circle(5);

      GeometricObject g = max(g1, g2, new GeometricObjectComparator());

      System.out.println("The perimeter of the larger object is " + g.getPerimeter());
  }

  public static GeometricObject max(GeometricObject g1, GeometricObject g2, Comparator<GeometricObject> c) 
  {
    return c.compare(g1, g2) > 0 ? g1 : g2;
  }
}