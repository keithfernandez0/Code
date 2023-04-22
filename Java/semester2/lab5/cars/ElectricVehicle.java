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


public abstract class ElectricVehicle extends Vehicle {

    // ================================================

    // Data fields
    private int batteryCapacity;

    // ================================================

    // Constructors

    // No-arg constructor
    public ElectricVehicle() {
        super();
    }
    
    // Complete constructor
    public ElectricVehicle(String name, String model, int year, int vehicleID, int batteryCapacity) {
        super(name, model, year, vehicleID);
        this.batteryCapacity = batteryCapacity;
    }

    // ================================================

    // Getter methods
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public abstract int getSeatingCapacity();

    // ================================================

    // Setter methods
    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    // ================================================

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", vehicleID=" + vehicleID +
                ", batteryCapacity=" + batteryCapacity +
                "}";
    }


}
