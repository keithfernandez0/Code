/**************************************************************
 * Kean University
 * Spring 2023
 * Course: CPS*2231 - Computer Programming in Java
 * Author: Keith Michelangelo Fernandez, CPS*2231
 * 
 * HW Assignment 5
 **************************************************************
 */

enum Color {
    YELLOW,
    ORANGE,
    RED,
    PURPLE
}

public class Fruit {

    public static void main(String[] args) {
        // Create new Fruit objects
        Fruit apple = new Fruit(Color.RED, 95, 2.99);
        Fruit orange = new Fruit(Color.ORANGE, 80, 1.99);
    
        // Print the attributes of the Fruit objects
        System.out.println(apple.toString());
        System.out.println(" ");
        System.out.println(orange.toString());
    }

    // Data fields
    private Color color;
    private int calories;
    private double pricerPerPound;
    protected static int numberOfFruits;

    // =============================================================

    // Constructors

    // No-arg constructor
    public Fruit() {}

    // Complete constructor
    public Fruit(Color color, int calories, double pricerPerPound) {
        this.color = color;
        this.calories = calories;
        this.pricerPerPound = pricerPerPound;
    }

    // =============================================================

    // Getter methods
    public Color getColor() {
        return color;
    }

    public int getCalories() {
        return calories;
    }

    public double getPricePerPound() {
        return pricerPerPound;
    }

    public static int getNumberOfFruits() {
        return numberOfFruits;
    }

    // =============================================================

    // Setter methods
    public void setColor(Color color) {
        this.color = color;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setPricePerPound(double pricerPerPound) {
        this.pricerPerPound = pricerPerPound;
    }

    // =============================================================

    // Prints string readout of class attributes
    public String toString() {
        return "Color: " + color + '\n' +
               "Calories: " + calories + '\n' +
               "Price per pound: " + pricerPerPound + '\n' +
               "Number of fruits: " + numberOfFruits; 
    }
}
