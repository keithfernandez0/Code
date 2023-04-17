
import java.util.*;

public class GeometricObject {
    
    // Data fields
    private Date dateCreated;
    private String color;
    private boolean filled;

    // Constructors
    public GeometricObject() {
        dateCreated = new java.util.Date();
    }

    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "Color: " + color + 
               "\nIs Filled: " + filled + 
               "\nDate created: "  + dateCreated;
    }

    public String Output() {
        return "Output is from method present in GeometricObject's class."; 
    }

    }




    
    
