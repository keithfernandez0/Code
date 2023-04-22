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


public class ConcreteElectricVehicle extends ElectricVehicle {
    public ConcreteElectricVehicle() {
        super();
    }

    public ConcreteElectricVehicle(String name, String model, int year, int vehicleID, int batteryCapacity) {
        super(name, model, year, vehicleID, batteryCapacity);
    }

    @Override
    public int getSeatingCapacity() {
        return 5;
    }
}
