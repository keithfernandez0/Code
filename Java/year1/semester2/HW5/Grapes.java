package HW5;
/**************************************************************
 * Kean University
 * Spring 2023
 * Course: CPS*2231 - Computer Programming in Java
 * Author: Keith Michelangelo Fernandez, CPS*2231
 * 
 * HW Assignment 5
 **************************************************************
 */

public class Grapes extends Fruit {

    // Data fields
    private String taste;
    private boolean hasSeed;

    // =============================================================

    // Constructors

    // No-arg constructor
    public Grapes() {}

    // Complete constructor
    public Grapes(String taste, boolean hasSeed, Color color, int calories, double pricerPerPound) {
        super(color, calories, pricerPerPound);
        this.taste = taste;
        this.hasSeed = hasSeed;
    }

    // =============================================================

    // Getter methods
    public String getTaste() {
        return taste;
    }

    public boolean getHasSeed() {
        return hasSeed;
    }

    // =============================================================

    // Setter methods
    public void setTaste(String taste) {
        this.taste = taste;
    }

    public void setHasSeed(boolean hasSeed) {
        this.hasSeed = hasSeed;
    }

    // =============================================================

    // Prints overridden method string readout of class attributes
    @Override
    public String toString() {
        return "Taste: " + taste + '\n' +
               "Contains seeds: " + hasSeed + '\n' +
               "Color: " + getColor() + '\n' +
               "Calories: " + getCalories() + '\n' +
               "Price per pound: " + getPricePerPound() + '\n' +
               "Number of fruits: " + getNumberOfFruits(); 
    } 
    
}
