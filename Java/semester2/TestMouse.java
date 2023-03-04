/**************************************************************
 * Kean University
 * Spring 2023
 * Course: CPS*2231 - Computer Programming in Java
 * Author: Keith Michelangelo Fernandez, CPS*2231
 * 
 * HW Assignment 3
 **************************************************************
 */

package semester2;
import java.awt.Color;

public class TestMouse {
   public static void main(String[] args) {
      // create object using default constructor
      ComputerMouse mouse1 = new ComputerMouse();
      // create object using overloaded constructor
      ComputerMouse mouse2 = new ComputerMouse("Logitech", Color.BLACK, 20.99, true);

      // display details of mouse1 and mouse2
      System.out.println("Details of mouse1: " + mouse1.displayDetails());
      System.out.println("Details of mouse2: " + mouse2.displayDetails());
   }
}

class ComputerMouse {
   // data fields
   private String brand;
   private Color itemColor;
   private double price;
   private boolean isWired;

   // no-argument constructor
   public ComputerMouse() {}

   // constructor with arguments
   public ComputerMouse(String brand, Color itemColor, double price, boolean isWired) {
      this.brand = brand;
      this.itemColor = itemColor;
      this.price = price;
      this.isWired = isWired;
   }

   // setters and getters for data fields
   public void setBrand(String brand) {
      this.brand = brand;
   }
   public String getBrand() {
      return this.brand;
   }

   public void setItemColor(Color itemColor) {
      this.itemColor = itemColor;
   }
   public Color getItemColor() {
      return this.itemColor;
   }

   public void setPrice(double price) {
      this.price = price;
   }
   public double getPrice() {
      return this.price;
   }

   public void setIsWired(boolean isWired) {
      this.isWired = isWired;
   }
   public boolean getIsWired() {
      return this.isWired;
   }

   // method to display all details of the computer mouse
   public String displayDetails() {
      return "Brand: " + this.brand + ", Color: " + this.itemColor.toString() + ", Price: $" + 
            this.price + ", Is Wired: " + this.isWired;
   }
}
