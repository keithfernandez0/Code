package cars;
/**************************************************************
 * Kean University
 * Spring 2023
 * Course: CPS*2231 - Computer Programming in Java
 * Author: Keith Michelangelo Fernandez
 * 
 * Lab Assignment 5
 **************************************************************
 */


public abstract class Vehicle {

    // ================================================

    // Needed to create concrete public class in order to instantiate
    // the object without getting an error message.

    public static void main(String[] args) {
        Vehicle ev1 = new ConcreteElectricVehicle();
        Vehicle ev2 = new ConcreteElectricVehicle("Tesla", "Model S", 2022, 123456, 90);
    
        System.out.println(ev1.toString());
        System.out.println(ev2.toString());
    }
    
    
    // ================================================

    // Data fields
    protected String name;
    protected String model;
    protected int year;
    protected int vehicleID;

    // ================================================

    // Constructors

    // No arg constructor
    public Vehicle() {}

    // Completed constructor
    public Vehicle(String name, String model, int year, int vehicleID) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.vehicleID = vehicleID;
    }

    // ================================================

    // Getter methods
    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getVehicleID() {
        return vehicleID;
    }

    public abstract int getSeatingCapacity();

    // ================================================

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }

    // ================================================

    // toString() method
    
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", vehicleID=" + vehicleID +
                '}';
    }
}
