package semester2;
import java.lang.Math;

public class Circle extends GeometricObject {
    
    private double radius;

    public Circle() {
        super(); // invokes deafault constructor
        radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled); // invokes overloaded constuctor
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * (Math.pow(radius, 2));
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public void printCircle() {
        System.out.println("The circle is created on " + super.getDateCreated() + " and the radius is " + radius + ". " + Output());
    }

    public String Output() {
        return "The output is printed from Circle class.";
    }

    @Override
    public String toString() {
        return "Circle[getRadius()="+getRadius()+", getArea()="+getArea()+", getDiameter()="+
    }

}
