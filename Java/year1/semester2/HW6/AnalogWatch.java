package HW6;

public class AnalogWatch extends Watch {

    // Data fields
    private int numOfHands;

    // ================================================================

    // Constructors

    // No-arg constructor
    public AnalogWatch() {
        super();
    }

    // Complete constructor
    public AnalogWatch(int numOfHands, String brand, String material, double price) {
        super(brand, material, price);
        this.numOfHands = numOfHands;
    }

    // ================================================================

    // Getter and setter methods
    public int getNumOfHands() {
        return numOfHands;
    }

    public void setNumOfHands(int numOfHands) {
        this.numOfHands = numOfHands;
    }

    // ================================================================

    @Override
    public String toString() {
        return "Brand: " + getBrand() + "\n" +
               "Material: " + getMaterial() + "\n" +
               "Price: " + getPrice() + "\n" +
               "Number of hands: " + numOfHands + "\n";
    }

    // ================================================================

    // ================================================================

    // Implementing the abstract method (placeholder)
    @Override
    public boolean isWaterProof() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isWaterProof'");
    }
    
}
