package semester2;

public class Test {

    public static void main(String[] args) {

        Circle c2 = new Circle(1);
        Circle c3 = new Circle(2, "Green", true);

        Rectangle r2 = new Rectangle(2, 4);
        Rectangle r3 = new Rectangle(2, 4, "Blue", true);
        
        System.out.println("Radius is: " + c2.getRadius());
        System.out.println("The area is " + c2.getArea());
        System.out.println("The diameter is " + c2.getDiameter());

    }
    
}
