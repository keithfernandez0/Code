/*  Keith Michelangelo Fernandez
 *  Kean University
 *  CPS 1231 Section 01 - Fundamentals of CompSci
 *  Dr. Jean Chu
 */

package Java;
import java.text.DecimalFormat;
import java.util.Scanner;

public class GenderMag {
    public static void main(String[] args) {

        double taxRate, income, taxedAmount, netIncome;
        int status;

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00"); // formats doubles to not have extra trailing zeroes
        
        System.out.println("\nWhat is your yearly income? (enter numbers only)");
        income = input.nextDouble();

        if (income < 0) {
            System.out.println("Please enter a valid income! (greater than 0)");
            System.out.println("Program exit status: [1]");
            System.exit(1);
        }

        System.out.println("Your yearly income is " + df.format(income) + " USD.\n");

        System.out.println("Please select your filing status (1 - 2).");
        System.out.println("[1] - Single Filer");
        System.out.println("[2] - Married Filer\n");
        status = input.nextInt();

        switch (status) {
            case 1:
                taxRate = 0.20;
                taxedAmount = income * taxRate;
                netIncome = income - taxedAmount;
                System.out.println("\nMarital status: Single Filer");
                System.out.println("Your total taxed amount from your income is $" + df.format(taxedAmount));
                System.out.println("Your tax rate is " + df.format(taxRate) + " and your net income is $" + df.format(netIncome));
                break;

            case 2:
                taxRate = 0.25;
                taxedAmount = income * taxRate;
                netIncome = income - taxedAmount;
                System.out.println("\nMarital status: Married Filer");
                System.out.println("Your total taxed amount from your income is $" + df.format(taxedAmount));
                System.out.println("Your tax rate is " + df.format(taxRate) + " and your net income is $" + df.format(netIncome));
                break;
            
            default:
                System.out.println("\nPlease enter a valid status number!");
                System.out.println("Program exit status: [1]");
                System.exit(1);
        }
        input.close(); // prevents resource leak
    }
}
