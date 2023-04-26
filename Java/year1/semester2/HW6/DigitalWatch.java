package HW6;

public class DigitalWatch extends Watch {

    // Data fields
    private int hourFormat;

    // ================================================================

    // Constructors

    // No-arg constructor
    public DigitalWatch() {
        super();
    }

    // Complete constructor
    public DigitalWatch(int hourFormat, String brand, String material, double price) {
        super(brand, material, price);
        this.hourFormat = hourFormat;
    }

    // ================================================================

    // Getter and setter methods
    public int getHourFormat() {
        return hourFormat;
    }

    public void setHourFormat(int hourFormat) {
        this.hourFormat = hourFormat;
    }

    // ================================================================

    @Override
    public String toString() {
        return "Brand: " + brand + "\n" +
               "Material: " + material + "\n" +
               "Price: " + price + "\n";
    }

    // ================================================================

    // Implementing the abstract method (placeholder)
    @Override
    public boolean isWaterProof() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isWaterProof'");
    }
    
}
