package semester2.HWfive;

public class Apple extends Fruit {

    // Data fields
    private String variety;
    private String texture;

    // =============================================================

    // Constructors

    // No-arg constructor
    public Apple() {} 

    // Complete constructor
    public Apple(String variety, String texture, Color color, int calories, double pricerPerPound) {
        super(color, calories, pricerPerPound);
        this.variety = variety;
        this.texture = texture;
    }

    // =============================================================

    // Getter methods
    public String getVariety() {
        return variety;
    }

    public String getTexture() {
        return texture;
    }

    // =============================================================

    // Setter methods
    public void setVariety(String variety) {
        this.variety = variety;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    // =============================================================

    // Prints overridden method string readout of class attributes
    @Override
    public String toString() {
        return "Variety: " + variety + '\n' +
               "Texture: " + texture + '\n' +
               "Color: " + getColor() + '\n' +
               "Calories: " + getCalories() + '\n' +
               "Price per pound: " + getPricePerPound() + '\n' +
               "Number of fruits: " + getNumberOfFruits(); 
    } 
}
