package assn4;
import java.util.Date;

public class Computer {

    // ============================================

    // Data field
    private String model;
    private String brandName;
    private String manufacturingDate;
    private int coreCount;

    // ============================================

    // Constructors
    public Computer() {}
    
    public Computer(String model, String brandName, String manufacturingDate, int coreCount) {
        this.model = model;
        this.brandName = brandName;
        this.manufacturingDate = manufacturingDate;
        this.coreCount = coreCount;
    }

    // ============================================

    // Getters
    public String getModel() {
        return this.model;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public String getManufacturingDate() {
        return this.manufacturingDate;
    }

    public int getCoreCount() {
        return this.coreCount;
    }

    // ============================================

    // Setters
    public void setModel(String model) {
        this.model = model;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setManufacturingDate(String manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public void setCoreCount(int coreCount) {
        this.coreCount = coreCount;
    }

    // ============================================

    // toString(): displays details

    public String toString() {
        return "Model: " + this.model + "\n" +
               "Brand Name: " + this.brandName + "\n" +
               "Manufacturing Date: " + this.manufacturingDate + "\n" +
               "CPU Core Count: " + this.coreCount + "\n";
    }

    public static void main (String[] args) {

    }
    
}
