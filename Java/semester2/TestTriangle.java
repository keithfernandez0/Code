package semester2;
import java.util.Random;

public class TestTriangle {
    public static void main(String[] args) {
        // Create two Triangle objects
        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle(3, 4, 5);

        // Print the contents of both objects using toString() method
        System.out.println("Triangle 1: " + triangle1.toString());
        System.out.println("Triangle 2: " + triangle2.toString());

        // Randomly pick a number between 1 to 15
        Random rand = new Random();
        int numTriangles = rand.nextInt(15) + 1;

        // Create an array of triangle objects equal to the random number
        Triangle[] triangles = new Triangle[numTriangles];

        // Construct the triangle objects in the array by invoking the overloaded constructor
        for (int i = 0; i < numTriangles; i++) {
            // Randomly assign values for the data fields in range 10 to 50
            int oppositeSide = rand.nextInt(41) + 10; // range: 10-50
            int adjacentSide = rand.nextInt(41) + 10; // range: 10-50
            int hypotenuse = rand.nextInt(41) + 10; // range: 10-50
            triangles[i] = new Triangle(oppositeSide, adjacentSide, hypotenuse);
        }

        // Display the total number of triangle objects created by invoking the getNumOfTriangles() method
        System.out.println("Number of triangles created: " + Triangle.getNumOfTriangles());

        // Display the values of opposite side, adjacent side and hypotenuse only for those triangle objects that are right-angled
        boolean hasRightAngledTriangle = false;
        for (Triangle triangle : triangles) {
            if (triangle.isRightAngled()) {
                System.out.println("Opposite side: " + triangle.getOppositeSide() +
                                   ", Adjacent side: " + triangle.getAdjacentSide() +
                                   ", Hypotenuse: " + triangle.getHypotenuse());
                hasRightAngledTriangle = true;
            }
        }

        // Display message if no right-angled triangles are found
        if (!hasRightAngledTriangle) {
            System.out.println("There is no right-angled triangles in the object array");
        }
    }

    public class Triangle {
        private int oppositeSide;
        private int adjacentSide;
        private int hypotenuse;
        public static int numOfTriangles;
    
        // Default constructor
        public Triangle() {
            oppositeSide = 0;
            adjacentSide = 0;
            hypotenuse = 0;
            numOfTriangles++;
        }
    
        // Overloaded constructor
        public Triangle(int oppositeSide, int adjacentSide, int hypotenuse) {
            this.oppositeSide = oppositeSide;
            this.adjacentSide = adjacentSide;
            this.hypotenuse = hypotenuse;
            numOfTriangles++;
        }
    
        // Getter and setter methods for private variables
        public int getOppositeSide() {
            return oppositeSide;
        }
    
        public void setOppositeSide(int oppositeSide) {
            this.oppositeSide = oppositeSide;
        }
    
        public int getAdjacentSide() {
            return adjacentSide;
        }
    
        public void setAdjacentSide(int adjacentSide) {
            this.adjacentSide = adjacentSide;
        }
    
        public int getHypotenuse() {
            return hypotenuse;
        }
    
        public void setHypotenuse(int hypotenuse) {
            this.hypotenuse = hypotenuse;
        }
    
        public static int getNumOfTriangles() {
            return numOfTriangles;
        }
    
        // Method to check if the triangle is right-angled
        public boolean isRightAngled() {
            return ((oppositeSide * oppositeSide) + (adjacentSide * adjacentSide) == (hypotenuse * hypotenuse));
        }
    
        // toString method to display triangle details
        public String toString() {
            return "Triangle: Opposite Side = " + oppositeSide + ", Adjacent Side = " + adjacentSide + ", Hypotenuse = " + hypotenuse;
        }
    }
    
}
