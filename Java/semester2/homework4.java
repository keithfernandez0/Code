package semester2;
import java.util.Random;

public class homework4 {
    public static void main(String[] args) {
        // Part 1
        // A
        double randomDouble = new Random().nextDouble() * (200 - 100) + 100;
        Double doubleWrapper = randomDouble;
        
        // B
        System.out.println("Double instance value as an int: " + doubleWrapper.intValue());
        
        // C
        System.out.println("Double value as a float: " + doubleWrapper.floatValue());
        
        // D
        System.out.println("Double value as a long: " + doubleWrapper.longValue());
        
        // E
        String binaryString = "1110000";
        double parsedBinaryDouble = Double.parseDouble(binaryString);
        System.out.println("Parsed double value of " + binaryString + ": " + parsedBinaryDouble);
        
        // F
        String hexadecimalString = "4B2A";
        long parsedHexLong = Long.parseLong(hexadecimalString, 16);
        double parsedHexDouble = Double.longBitsToDouble(parsedHexLong);
        System.out.println("Parsed double value of " + hexadecimalString + ": " + parsedHexDouble);

        // Part 2
        // A
        String keanUniversity = "Kean University New Jersey";
        
        // B
        String newJerseySubstring = keanUniversity.substring(keanUniversity.indexOf("New Jersey"));
        System.out.println("Substring 'New Jersey': " + newJerseySubstring);
        
        // C
        String keanUniversityWithDelimiters = "Kean#University$New:Jersey";
        
        // D
        System.out.println("Comparison result of 'keanUniversity' and 'keanUniversityWithDelimiters': " +
                keanUniversity.equals(keanUniversityWithDelimiters));
        
        // E
        String[] splitString = keanUniversityWithDelimiters.split("#|\\$|:");
        System.out.print("Split string: ");
        for (String s : splitString) {
            System.out.print(s + " ");
        }
        System.out.println();
        
        // F
        String replacedDelimiters = keanUniversityWithDelimiters.replaceAll("#|:", " ");
        System.out.println("Replaced delimiters: " + replacedDelimiters);
        
        // Part 3
        // A
        StringBuilder midtermExamStringBuilder = new StringBuilder("Prepare for your Midterm Exam");
        
        // B
        System.out.println("Capacity of the StringBuilder: " + midtermExamStringBuilder.capacity());
        
        // C
        int index = midtermExamStringBuilder.indexOf("y");
        System.out.println("Index of the letter 'y': " + index);
        
        // D
        midtermExamStringBuilder.delete(0, index);
        
        // E
        midtermExamStringBuilder.insert(0, "Good luck on ");
        
        // F
        midtermExamStringBuilder.append('!');
        
        // G
        System.out.println("Final StringBuilder: " + midtermExamStringBuilder);
    }
}
