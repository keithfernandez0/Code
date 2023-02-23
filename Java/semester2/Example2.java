package semester2;
import java.awt.Color;

public class Example2 {

	public static void main(String[] args) {
		//Objects
		Circle c1 = new Circle(); //c1 - default contructor
		System.out.println("Radius of c1 "+c1.getRadius());
		Circle c2 = new Circle(); //c2 - default constructor
		System.out.println("Radius of c2 "+c2.getRadius());
		
		//Create obj c3 using overloaded construtor
		Circle c3 = new Circle(4, Color.CYAN);
		Circle c4 = new Circle(15, Color.GRAY);
		
		//Change the radius of c1 as 10
		c1.setRadius(10);
		
		//changing the color of C2 to green
		c2.setColorOfCircle(Color.GREEN);
		System.out.println("Color of c2 "+c2.getColorOfCircle());

		System.out.println("Number of objects in Circle class: " );

		Circle[] objArray = new Circle[3]; // array of circle object

		for (int i = 0; i < objArray.length; i++) 
		{
			objArray[i] = new Circle();
		}
		
	}

}

class Circle
{
	//Data Fields - Attributes
	double radius;
	Color colorOfCircle;

	
	//Constructors
	//Default Constructor
	public Circle()
	{
		radius = 2;
		colorOfCircle = Color.BLUE;
	}
	//Overloaded Contructor
	public Circle(double radius_input,Color color_input)
	{
		radius = radius_input;
		colorOfCircle = color_input;
	}
	//Methods - Functions
	//Setter Method - for radius
	public void setRadius(double radius_input)
	{
		radius = radius_input;
	}
	//Getter Method - for radius
	public double getRadius()
	{
		return radius;
	}
	
	//Setter and getter method for colorOfCircle
	public void setColorOfCircle(Color color_input)
	{
		colorOfCircle = color_input;
	}
	public Color getColorOfCircle()
	{
		return colorOfCircle;
	}
	
	//Additional methods - Area of Circle
	public double getArea()
	{
		return 3.14 *radius*radius;
	}
	
	
}
