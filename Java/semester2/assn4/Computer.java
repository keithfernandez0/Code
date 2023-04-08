package semester2.assn4;

/**************************************************************
 * Kean University
 * Spring 2023
 * Course: CPS*2231 - Computer Programming in Java
 * Author: Keith Michelangelo Fernandez, CPS*2231
 * 
 * Lab Assignment 4
 * 
 * Practicing with extended classes and object-oriented
 * programming in Java.
 **************************************************************
 */

public class Computer {

    // ============================================

    // Data field
    protected String model;
    protected String brandName;
    protected String manufacturingDate;
    protected int coreCount;

    // ============================================

    // Constructors
    public Computer() {}
    
    public Computer(String model, String brandName, String manufacturingDate, int coreCount) {
        this.model = model;
        this.brandName = brandName;
        this.manufacturingDate = manufacturingDate;
        this.coreCount = coreCount;
    }

    // ============================================

    // Getters
    public String getModel() {
        return this.model;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public String getManufacturingDate() {
        return this.manufacturingDate;
    }

    public int getCoreCount() {
        return this.coreCount;
    }

    // ============================================

    // Setters
    public void setModel(String model) {
        this.model = model;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setManufacturingDate(String manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public void setCoreCount(int coreCount) {
        this.coreCount = coreCount;
    }

    // ============================================

    // toString(): displays details

    public String toString() {
        return "Model: " + this.model + "\n" +
               "Brand Name: " + this.brandName + "\n" +
               "Manufacturing Date: " + this.manufacturingDate + "\n" +
               "CPU Core Count: " + this.coreCount + "\n";
    }

    // ============================================

    public static void main(String[] args) {

        // Defining the new objects
        Computer a = new Computer("Inspiron 1545", "DELL", "April 1, 2020", 2);
        Computer b = new Computer("A2338", "MacBook", "March 31, 2020", 4);
        Computer c = new Computer("Custom PC", "Ryzen", "January 1, 2023", 12);

    }
    
}
