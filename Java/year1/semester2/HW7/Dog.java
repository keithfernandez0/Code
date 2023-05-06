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

public class Dog extends MyPetStore 

{
    // ================================================================

    // Data fields
    private String breed;

    // ================================================================

    // Constructors
    public Dog() {}

    public Dog(String name, LocalDate birthDate, double price, String speciesType, String specialFeature, String breed)
    {
        super(name, birthDate, price, speciesType, specialFeature);
        this.breed = breed;

    }

    // ================================================================

    // Getter method
    public String getBreed() 
    {
        return breed;
    }

    // ================================================================

    // Setter method
    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    // ================================================================

    // toString method

    @Override
    public String toString() 
    {
        return "Name: " + getName() + "\n" +
               "Birth Date: " + getBirthDate() + "\n" +
               "Price: " + getPrice() + "\n" +
               "Species Type: " + getSpeciesType() + "\n" +
               "Special Feature: " + getSpecialFeature() + "\n" +
               "Breed: " + breed;
    }

}
