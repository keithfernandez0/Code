/* Keith Michelangelo Fernandez
 * Kean University CPS 1231-01
 * Due: 10/22/22 @ 11:55pm EST
 * Program 2
 * Calculate the area and the perimeter
 * of a circle via user input and arithmetic
 * operations in Java.
 */

package semester1;
import java.util.Scanner;
import java.lang.Math;

public class fernkayl_Prog2 {
    public static void main(String[] args) {

        double perimeter, area, radius;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your desired circle radius: \n");
        radius = input.nextDouble();

        perimeter = 2 * radius * Math.PI;
        area = (radius*radius) * Math.PI;

        System.out.println("\nThe area of a circle with radius " + radius + " is " + area);
        System.out.println("The perimeter of a circle with radius " + radius + " is " + perimeter);

        input.close();
    }
}
