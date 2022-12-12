package Java;
import java.util.Scanner;

public class Test { 
    public static void main(String[] args) { 

        double x, y, z;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        x = input.nextDouble();

        System.out.println("Enter second number: ");
        y = input.nextDouble();

        System.out.println("Enter third number: ");
        z = input.nextDouble();

        System.out.println("The average is: " + ThreeAve(x, y, z));

    }
     public static double ThreeAve(double x, double y, double z) {
        return (x+y+z) / 3.0;
     }
}