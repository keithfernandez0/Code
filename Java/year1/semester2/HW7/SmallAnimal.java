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

public class SmallAnimal extends MyPetStore
{
    // ================================================================

    // Data fields
    private boolean isBites;

    // ================================================================

    // Constructors
    public SmallAnimal() {}

    public SmallAnimal(String name, LocalDate birthDate, double price, String speciesType, String specialFeature, boolean isBites)
    {
        super(name, birthDate, price, speciesType, specialFeature);
        this.isBites = isBites;
    }

    // ================================================================

    // Getter methods
    public boolean getIsBites()
    {
        return isBites;
    }

    // ================================================================

    // Setter methods
    public void setIsBites(boolean isBites)
    {
        this.isBites = isBites;
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
               "Bites: " + isBites;        
    }
}

