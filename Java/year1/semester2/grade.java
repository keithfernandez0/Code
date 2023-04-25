import java.util.Scanner;

public class grade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double score; 

        System.out.println("Enter your number grade: ");
        score = input.nextDouble();
        String result = printGrade(score);

        System.out.println("Your letter grade is: " + result);
        input.close();
    }

    public static String printGrade(double score) {

        if (score>= 97.0) {
            return "A+";
        }
        else if (score >= 93.0) {
            return "A";
        }
        else if (score >= 90.0) {
            return "A-";
        }
        else if (score >= 87.0) {
            return "B+";
        }
        else if (score >= 83.0) {
            return "B";
        }
        else if (score >= 80.0) {
            return "B-";
        }
        else if (score >= 77.0) {
            return "C+";
        }
        else if (score >= 73.0) {
            return "C";
        }
        else if (score >= 70.0) {
            return "C-";
        }
        else if (score >= 65.0) {
            return "D";
        }
        else {
            return "F";
        }
    }
}
