public class Rectangle extends GeometricObject {

    private double width;
    private double height;

    public Rectangle() {
        super();
        width = 1;
        height = 1;
    }
    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        setColor(color);
        setFilled(filled);
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height) {}

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public void printRectangle() {
        System.out.println("The rectangle was created on " + super.getDateCreated() + " and the width is " + width + " and the height is " + height);
    }
}
