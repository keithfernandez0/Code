
/**************************************************************
 * Kean University
 * Spring 2023
 * Course: CPS*2231 - Computer Programming in Java
 * Author: Keith Michelangelo Fernandez
 * 
 * HW Assignment 7
 **************************************************************
 */

import java.io.*;
import java.util.*;

public class fernkayl_program 

{

    public static void main(String[] args) throws Exception
    {
        String num, name, birthDate, price, special, specialFeature;

        File file = new File("input.csv");

        Scanner input = new Scanner(file);
        input.useDelimiter(",");

        while(input.hasNext())
        {
            name = input.next();
            birthDate = input.next();
            price = input.next();
            special = input.next();
            specialFeature = input.next();

            System.out.println("Name: " + name + " BirthDate: " + birthDate + " Price: " + " Variety: " + special + " Special Feature: " + specialFeature);
        }
    }

}
