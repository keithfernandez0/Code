public class Laptop extends Computer {

    private double weight;

    public Laptop() {}

    public Laptop(double weight, String model, String brandName, String manufacturingDate, int coreCount) {
        this.weight = weight;
        this.model = model;
        this.brandName = brandName;
        this.manufacturingDate = manufacturingDate;
        this.coreCount = coreCount;
    }

    // ============================================

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // ============================================

    @Override
    public String toString() {
        return "Model: " + this.model + "\n" +
               "Brand Name: " + this.brandName + "\n" +
               "Manufacturing Date: " + this.manufacturingDate + "\n" +
               "CPU Core Count: " + this.coreCount + "\n";
    }
}
