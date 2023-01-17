package semester1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class CommissionRate {
    public static void main(String[] args) {

        double commission, commissionRate, sales;
        int count;
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Total Sales                            Commission Rate %");
        System.out.println("=========================================================");
        System.out.println("Less than 200 sold                     8%");
        System.out.println("Greater than or equal to 200 sold      10%");
        System.out.println("Greater than or equal to 400 sold      12%\n");

        System.out.println("Enter total sales: ");
        count = input.nextInt();
        System.out.println("\n");

        if (count < 200) {
            commissionRate = 0.08;
            commission = count * commissionRate;
            sales = count + commission;

            System.out.println("Total sales is $" + df.format(count) + " and commission is " + (commissionRate*100)+"%");
            System.out.println("Total income is $" + df.format(sales));
        }
        else if (count <= 200) {
            commissionRate = 0.10;
            commission = count * commissionRate;
            sales = count + commission;

            System.out.println("Total sales is $" + df.format(count) + " and commission is " + (commissionRate*100)+"%");
            System.out.println("Total income is $" + df.format(sales));
        }
        else {
            commissionRate = 0.12;
            commission = count * commissionRate;
            sales = count + commission;

            System.out.println("Total sales is $" + df.format(count) + " and commission is " + (commissionRate*100)+"%");
            System.out.println("Total income is $" + df.format(sales));
        }

        input.close(); // prevents resource leak

        }        
    }


