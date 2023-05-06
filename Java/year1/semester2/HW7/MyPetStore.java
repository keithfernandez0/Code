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

public class MyPetStore 
{
    // ================================================================

    // Data fields
    private String name;
    private LocalDate birthDate;
    private double price;
    private String speciesType;
    private String specialFeature;

    // ================================================================

    // no-arg constructor
    public MyPetStore() {}

    // Complete constructor
    public MyPetStore(String name, LocalDate birthDate, double price, String speciesType, String specialFeature) 
    {
      this.name = name;
      this.birthDate = birthDate;
      this.price = price;
      this.speciesType = speciesType;
      this.specialFeature = specialFeature;
    }
  
    // ================================================================

    // Getter methods
    public String getName() 
    {
        return name;
    }

    public LocalDate getBirthDate() 
    {
        return birthDate;
    }

    public double getPrice() 
    {
        return price;
    }

    public String getSpeciesType() 
    {
        return speciesType;
    }

    public String getSpecialFeature() 
    {
        return specialFeature;
    }

    // ================================================================

    // Setter methods
    public void setName(String name) 
    {
        this.name = name;
    }

    public void setBirthDate(LocalDate birthDate) 
    {
        this.birthDate = birthDate;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setSpeciesType(String speciesType) 
    {
        this.speciesType = speciesType;
    }

    public void setSpecialFeature(String specialFeature) 
    {
        this.specialFeature = specialFeature;
    }

    // ================================================================

    // toString method
    public String toString() 
    {
        return "Name: " + name + "\n" +
               "Birth Date: " + birthDate + "\n" +
               "Price: " + price + "\n" +
               "Species Type: " + speciesType + "\n" +
               "Special Feature: " + specialFeature;
    }

  }

