import java.util.Scanner;
import java.lang.Math;


public class arrayActivity {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int [] arr1 = new int[10];
        char [] arr2 = new char[4];
        double [] arr3 = new double[3];
        String [] arr4 = new String[4];

        double[] num2 = {2.3, 5.7, 1.2};
        double[] num3 = new double[4];

        num3[0] = 2.3;
        num3[1] = 5.7;
        num3[2] = 1.2;
        num3[3] = (num3[0]+num3[1]+num3[2]) / 3;

        //System.out.println("Enter " + arr4.length + " string elements"); 

        //for (int i=0; i<arr4.length; i++) {
          //  arr4[i] = input.next();
        //}

        for (int i=0; i < num3.length; i++) {
            num3[i] = Math.random() * 100;
        }

        for (int i=0; i<num3.length; i++) {
            System.out.println("Array value :: " + num3[i]);
        }

        double total = 0;
        for (int i=0; i<num3.length; i++) {
            total += num3[i];
        }
        System.out.println("The total is " + total);

        input.close();

    }
}
