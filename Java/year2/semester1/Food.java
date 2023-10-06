// ====================================================================================
// Keith Michelangelo Fernandez
// ID: 1209266
// Email: fernkayl@kean.edu
//
// ASSIGNMENT: UNIT 1, INTERFACES AND ABSTRACT METHODS
// FA23 CPS 2232-02
// 9/8/2023
// ====================================================================================

package Java.year2.semester1; // MISCELLANEOUS FILESTRUCTURE STUFF

// ====================================================================================

public class Food 
{
    public static void main(String[] args) 
    {
        // CREATE NEW INSTANCES
        Steak steak1 = new Steak("Filet Mignon", 28.99);
        Steak steak2 = new Steak("Flank Cut", 12.99);

        Stew stew1 = new Stew("Oxtail", 300);
        Stew stew2 = new Stew("Beef Chuck", 275);

        // STD OUT
        System.out.println(steak1.howToEat());
        System.out.println(steak1.howToCook());
        System.out.println(steak1);

        System.out.println(steak2.howToEat());
        System.out.println(steak2.howToCook());
        System.out.println(steak2);

        System.out.println(stew1.howToEat());
        System.out.println(stew1.howToCook());
        System.out.println(stew1);

        System.out.println(stew2.howToEat());
        System.out.println(stew2.howToCook());
        System.out.println(stew2);

        // CREATE ARRAY
        Edible[] edibles = new Edible[4];
        edibles[0] = steak1;
        edibles[1] = stew2;
        edibles[2] = steak2;
        edibles[3] = stew2;

        // PRINT STD-OUT OF METHODS
        for (int i = 0; i < edibles.length; i++) 
        {
            Edible edible = edibles[i];
            if (edible != null) {
                System.out.println(edible.howToEat());
                System.out.println(edible.howToCook());
            }
        }
    }

}

// ====================================================================================

interface Edible 
{
    // ABSTRACT METHOD
    String howToEat();

    default String howToCook() 
    {
        return "Cook as described on the package.";
    }
}

// ====================================================================================

class Steak implements Edible 
{
    private String type;
    private double price;

    public Steak(String type, double price) 
    {
        this.type = type;
        this.price = price;
    }

    // GETTER AND SETTER CONSTRUCTORS
    public String getType() 
    {
        return type;
    }

    public void setType(String type) 
    {
        this.type = type;
    }

    public double getPrice() 
    {
        return price;
    }

    public void setPrice(double price) 
    {
        this.price = price;
    }

    // STD OUT
    @Override
    public String toString() 
    {
        return "[Steak Class] [Type = " + type + ", Price = $" + price + "/lb]";
    }

    @Override
    public String howToEat() 
    {
        return "Enjoy with a side of mashed potatoes, asparagus, and topped with rosemary infused butter. Complimented with red wine.";
    }
}

// ====================================================================================

class Stew implements Edible 
{
    private String brothBase;
    private int calories;

    public Stew(String brothBase, int calories) 
    {
        this.brothBase = brothBase;
        this.calories = calories;
    }

    // GETTER AND SETTER CONSTRUCTORS
    public String getBrothBase() 
    {
        return brothBase;
    }

    public void setFlavor(String brothBase) 
    {
        this.brothBase = brothBase;
    }

    public int getCalories() 
    {
        return calories;
    }

    public void setCalories(int calories) 
    {
        this.calories = calories;
    }

    // STD OUT
    @Override
    public String toString() 
    {
        return "[Stew Class] [Broth Base = " + brothBase + ", calories = " + calories + "kcals]";
    }

    @Override
    public String howToEat() 
    {
        return "Serve with lemom and saltine crackers on a cold winter day.";
    }
}

// ====================================================================================
