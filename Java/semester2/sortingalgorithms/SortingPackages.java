import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;


public class SortingPackages {
    
    boolean sorted = false;
    Scanner input = new Scanner(System.in);
    Random seed = new Random();

    public static int[] arrayMaker() {

        int upperLimit;
        Scanner input = new Scanner(System.in);
        Random seed = new Random();

        System.out.println("Enter the length of your integer array: ");
        upperLimit = input.nextInt();

        int[] arr = new int[upperLimit];

        for (int i=0; i < arr.length; i++) {
            arr[i] = seed.nextInt(); // store integers
        }
        return arr;
        input.close();
    }

    public static void main(String[] args) {

        int array[];
        Scanner input = new Scanner(System.in);

        System.out.println("$ Running arrayMaker()...");
        array = arrayMaker();
        
    }


}