public class TestPolymorphism {

    public static void main(String[] args) {

        // =============================================================

        // Setting up objects
        Fruit fruit1 = new Fruit();
        Fruit fruit2 = new Fruit(Color.YELLOW, 100, 1.5);

        System.out.println("Total number of fruits: " + Fruit.getNumberOfFruits());
    
        Fruit apple1 = new Apple();
        Fruit apple2 = new Apple("Red", "Sweet", Color.RED, 120, 2.0);
    
        Fruit grape1 = new Grapes();
        Fruit grape2 = new Grapes("Sour", true, Color.PURPLE, 80, 1.0);
    
        // =============================================================

        // Begin displaying out class and object attributes
        System.out.println("Total number of fruits: " + Fruit.getNumberOfFruits());
    
        System.out.println("The actual class of fruit1 is " + fruit1.getClass());
        System.out.println("The actual class of fruit2 is " + fruit2.getClass());
        System.out.println("The actual class of apple1 is " + apple1.getClass());
        System.out.println("The actual class of apple2 is " + apple2.getClass());
    
        // =============================================================
        
        // Check equalities
        if (fruit1.equals(apple1)) {
            System.out.println("fruit1 and apple1 are equal.");
        } else {
            System.out.println("fruit1 and apple1 are not equal.");
        }
    
        // =============================================================

        // Check class for object-grape
        System.out.println("The actual class of grape1 is " + grape1.getClass());
        System.out.println("The actual class of grape2 is " + grape2.getClass());
    
        // Check equalities
        if (fruit2.equals(grape2)) {
            System.out.println("fruit2 and grape2 are equal.");
        } else {
            System.out.println("fruit2 and grape2 are not equal.");
        }
    
        // Step (k)
        // No, because the getTexture() method is not defined in the Fruit or any of its superclasses.
    
        // Step (l)
        // Yes, because the getTaste() method is defined in the Grapes class.
    
        apple2 = (Apple) apple2;
        //System.out.println("Texture of apple2: " + apple2.getTexture()); // Has Fruit+Apple data type, will error on compile time
        grape2 = (Grapes) grape2;
        //System.out.println("Taste of grape2: " + grape2.getTaste()); // Only has the Fruit data type, will also error when compiled.
    
        // No, because the reference type of "fruit2" is Fruit, and Fruit is not a subclass of Apple.
        
        // =============================================================

        // Display readout of all objects
        displayObject(fruit1);
        displayObject(fruit2);
        displayObject(apple1);
        displayObject(apple2);
        displayObject(grape1);
        displayObject(grape2);
    }
    
    // =============================================================

    // Method to write string readout on console

    public static void displayObject(Object obj) {
        if (obj instanceof Fruit) {
            System.out.println(obj.toString());
        } else if (obj instanceof Apple) {
            System.out.println(obj.toString());
        } else if (obj instanceof Grapes) {
            System.out.println(obj.toString());
        }
    }
}    
        