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

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class fernkayl_program {

  
  private Pet[] pets;

  public fernkayl_program() 
  {
    // Initialize the pets array with a default size of 10
    this.pets = new Pet[10];
  }

  public void readInputFile(String filename) 
  {
    try (BufferedReader br = new BufferedReader(new FileReader(filename))) 
    {
        String line;
        int index = 0;

        while ((line = br.readLine()) != null) 
        {
            String[] tokens = line.split(",");
            String name = tokens[0].trim();
            int age = Integer.parseInt(tokens[1].trim());
            String breed = tokens[2].trim();
            Pet pet = new Pet(name, age, breed);

            this.pets[index++] = pet;
        }

        } 

        catch (IOException e) 
        {
        e.printStackTrace();
        }
  }

  // Other methods can be added as needed

  public static void main(String[] args) 
  {
    fernkayl_program program = new fernkayl_program();
    program.readInputFile("input.csv");
    // Do something with the pets array
  }
}
