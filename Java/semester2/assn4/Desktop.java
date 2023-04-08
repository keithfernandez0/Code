package semester2.assn4;

public class Desktop extends Computer {

    private double width;
    private double height;

    // ============================================

    public Desktop() {}

    public Desktop(double width, double height, String model, String brandName, String manufacturingDate, int coreCount) {
        this.width = width;
        this.height = height;
        this.model = model;
        this.brandName = brandName;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight() {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Model: " + this.model + "\n" +
               "Brand Name: " + this.brandName + "\n" +
               "Manufacturing Date: " + this.manufacturingDate + "\n" +
               "CPU Core Count: " + this.coreCount + "\n";
    }

}
