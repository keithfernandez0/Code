/**************************************************************
 * Kean University
 * Spring 2023
 * Course: CPS*2231 - Computer Programming in Java
 * Author: Keith Michelangelo Fernandez, CPS*2231
 * 
 * HW Assignment 4
 **************************************************************
 */

package semester2;
import java.util.Random;

public class homework4 {
    public static void main(String[] args) {

        // ========================================================================================
        // SECTION 1: DOUBLE WRAPPER DATA READ-OUT + BIN/HEX CONVERSION
        // ========================================================================================

        double randDouble = new Random().nextDouble() * (200 - 100) + 100;
        Double doubleWrapper = randDouble;

        String binStr = "1110000";
        double convertedBinDouble = Double.parseDouble(binStr);

        String hexStr = "4B2A";
        long convertedHexLong = Long.parseLong(hexStr, 16);
        double convertedHexDouble = Double.longBitsToDouble(convertedHexLong);
        
        System.out.println("Double instance as integer data value: " + doubleWrapper.intValue());
        System.out.println("Double value as a float data value: " + doubleWrapper.floatValue());
        System.out.println("Double value as a long data value: " + doubleWrapper.longValue());
        
        System.out.println("Converted double value of " + binStr + ": " + convertedBinDouble);
        System.out.println("Converted double value of " + hexStr + ": " + convertedHexDouble);

        // ========================================================================================
        // SECTION 2: SUBSTRING + DELIMITER MANIPULATION
        // ========================================================================================

        String kean = "Kean University New Jersey";
        String njSubStr = kean.substring(kean.indexOf("New Jersey"));
        String keanWithDelim = "Kean#University$New:Jersey";
        String[] splitStr = keanWithDelim.split("#|\\$|:");
        String replacedDelim = keanWithDelim.replaceAll("#|:", " ");

        System.out.println("Substring 'New Jersey': " + njSubStr);
        System.out.println("Result of 'kean' and 'keanWithDelim': " + kean.equals(keanWithDelim));
        
        System.out.print("Split string: ");

        for (String s : splitStr) {
            System.out.print(s + " ");
        }

        System.out.println();
        System.out.println("Replaced delimiters: " + replacedDelim);

        // ========================================================================================
        // SECTION 3: STRINGBUILDER OBJECT MANIPULATION
        // ========================================================================================
        
        StringBuilder midtermSB = new StringBuilder("Prepare for your midterm exam");
        int index = midtermSB.indexOf("y");
    
        System.out.println("Capacity of the StringBuilder: " + midtermSB.capacity());
        System.out.println("Index of the letter 'y': " + index);
        
        midtermSB.delete(0, index);
        midtermSB.insert(0, "Good luck on ");
        midtermSB.append('!');
    
        System.out.println("Final StringBuilder: " + midtermSB);
    }
}
