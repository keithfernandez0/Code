// ====================================================================================
// Keith Michelangelo Fernandez
// ID: 1209266
// Email: fernkayl@kean.edu
// FA23 CPS 2232-02
// ====================================================================================

package Java.year2.chapter1.edible;

// ====================================================================================

interface Edible 
{
    // ABSTRACT METHOD
    String howToEat();

    default String howToCook() 
    {
        return "Cook as described on package.";
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

    @Override
    public String toString() 
    {
        return "Stew [Broth Base = " + brothBase + ", calories = " + calories + "kcals]";
    }

    @Override
    public String howToEat() 
    {
        return "Serve with lemom and saltine crackers on a cold winter day.";
    }
}

// ====================================================================================

public static void main(String[] args) 
    {
        // Step 6: Create instances of Steak and Stew
        Steak steak = new Steak("Filet Mignon", 28.99);      


        // Test methods and print information
        System.out.println(steak.howToEat());
        System.out.println(steak.howToCook());
        System.out.println(steak);

        System.out.println(stew.howToEat());
        //System.out.println(stew.howToCook());
        //System.out.println(stew);

        // Create an array of type Edible and add instances
        Edible[] edibles = new Edible[4];
        edibles[0] = steak;
        edibles[1] = steak;
        //edibles[2] = stew;
        //edibles[3] = stew;

        // Iterate through the array and call howToEat() for each element
        for (Edible edible : edibles) 
        {
            System.out.println(edible.howToEat());
        }
    }


