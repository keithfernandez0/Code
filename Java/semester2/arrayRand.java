package semester2;
import java.util.Scanner;

public class arrayRand {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] numArray = {34,67,89,32,15,11}; 
        int tmp = numArray[0];

        for (int i=1; i < numArray.length; i++)
        {
            numArray[i-1] = numArray[i]; // Shifts to left side 
            System.out.println("Index " + i + ": " + numArray[i]);
        }

        numArray[numArray.length-1] = tmp;
        System.out.println("Temp var: " + tmp);

    }

        public static void printArray(int[] arr) 
        {
            for (int i=0; i < arr.length; i++)
            {
                System.out.println(arr[i] + " ");
            }
        }
}