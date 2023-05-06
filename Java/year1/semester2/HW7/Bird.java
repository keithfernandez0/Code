/**************************************************************
 * Kean University
 * Spring 2023
 * Course: CPS*2231 - Computer Programming in Java
 * Author: Keith Michelangelo Fernandez
 * 
 * HW Assignment 7
 **************************************************************
 */

import java.time.LocalDate;

public class Bird extends MyPetStore 

{
    // ================================================================

    // Data fields
    private String movementType; 

    // ================================================================

    // Constructors 

    public Bird() {}

    public Bird(String name, LocalDate birthDate, double price, String speciesType, String specialFeature, String movementType) 
    {
        super(name, birthDate, price, speciesType, specialFeature);
        this.movementType = movementType;
    }

    // ================================================================

    // Getter methods
    public String getMovementType() 
    {
        return movementType;
    }

    // ================================================================

    // Setter method
    public void setMovementType(String movementType) 
    {
        this.movementType = movementType;
    }

    // ================================================================

    // toString() method (overridden)
    @Override
    public String toString() 
    {
        return "Name: " + getName() + "\n" +
               "Birth Date: " + getBirthDate() + "\n" +
               "Price: " + getPrice() + "\n" +
               "Species Type: " + getSpeciesType() + "\n" +
               "Special Feature: " + getSpecialFeature() + "\n" +
               "Can fly: " + movementType;
    }

}
