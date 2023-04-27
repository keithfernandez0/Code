package HW6;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;


public abstract class Watch {

    public static void main(String[] args) {
        Watch analog = new AnalogWatch(3, "SEIKO", "Silver/Stainless Steel", 199.95);
        Watch digital = new DigitalWatch(12, "CASIO", "Carbon Fiber/Nylon", 59.95);
    
        System.out.println(analog.toString());
        System.out.println(digital.toString());
    
        // Get the current time for the analog watch
        Calendar analogTime = Calendar.getInstance();
        analogTime.set(Calendar.HOUR_OF_DAY, 6);
        analogTime.set(Calendar.MINUTE, 30);
        analogTime.set(Calendar.SECOND, 0);
    
        // Get the current time for the digital watch
        Calendar digitalTime = Calendar.getInstance();
        digitalTime.set(Calendar.HOUR_OF_DAY, 15);
        digitalTime.set(Calendar.MINUTE, 45);
        digitalTime.set(Calendar.SECOND, 0);
    
        System.out.println("Analog watch time: " + analogTime.getTime());
        System.out.println("Digital watch time: " + digitalTime.getTime());
    }
    
    // ================================================================

    // Data fields
    private String brand;
    private String material;
    private double price;

    // ================================================================

    // Constructors

    // No-arg constructor
    public Watch() {}

    // Complete constructor
    public Watch(String brand, String material, double price) {
        this.brand = brand;
        this.material = material;
        this.price = price;
    }

    // ================================================================

    // Getter methods
    public String getBrand() {
        return brand;
    }

    public String getMaterial() {
        return material;
    }

    public double getPrice() {
        return price;
    }

    // ================================================================

    // Setter methods
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    // ================================================================

    // Abstract methods
    public abstract boolean isWaterProof();

    // ================================================================

    // String output method
    public String toString() {
        return "Brand: " + getBrand() + "\n" +
               "Material: " + getMaterial() + "\n" +
               "Price: " + getPrice()+ "\n";
    }
    
}