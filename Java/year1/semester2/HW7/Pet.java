/**************************************************************
 * Kean University
 * Spring 2023
 * Course: CPS*2231 - Computer Programming in Java
 * Author: Keith Michelangelo Fernandez
 * 
 * HW Assignment 7
 **************************************************************
 */

package HW7;


public class Pet 

{
    // ================================================================

    // Data fields
    private String name;
    private int age;
    private String breed;

    // ================================================================

    // no-arg constructor
    public Pet() {}

    // Complete constructor
    public Pet(String name, int age, String breed) 
    {
      this.name = name;
      this.age = age;
      this.breed = breed;
    }
  
    // ================================================================

    // Getter methods
    public String getName() 
    {
        return name;
    }

    public int getAge() 
    {
        return age;
    }

    public String getBreed() 
    {
        return breed;
    }

    // ================================================================

    // Setter methods
    public void setName(String name) 
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setBreed(String breed) 
    {
        this.breed = breed;
    }



  }

