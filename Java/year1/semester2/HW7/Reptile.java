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

public class Reptile extends MyPetStore {

    // ================================================================
    
    // Data fields
    private String bloodType;

    // ================================================================

    // Constructors
    public Reptile() {}

    public Reptile(String name, LocalDate birthDate, double price, String speciesType, String specialFeature, String bloodType) 
    {
        super(name, birthDate, price, speciesType, specialFeature);
        this.bloodType = bloodType;
    }

    // ================================================================

    // Getter methods
    public String getBloodType()
    {
        return bloodType;
    }

    // ================================================================

    // Setter method
    public void setBloodType(String bloodType)
    {
        this.bloodType = bloodType;
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
               "Blood type: " + bloodType;
    }
    
}
