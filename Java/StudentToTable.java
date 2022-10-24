package Java;

public class StudentToTable {
    public static void main(String[] args) {

        System.out.print("\n////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "\n");
        System.out.print("=============Student Points=============" + "\n");
        System.out.print("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\////////////////////");
        System.out.print("\n\n");

        String heading1 = "Name";
        String heading2 = "Lab";
        String heading3 = "Bonus";
        String heading4 = "Total";
        String divider1 = "---";
        String divider2 = "----";

        String name1 = "Joe";
        String name2 = "William";
        String name3 = "Mary Sue";

        char grade1 = 'C';
        char grade2 = 'B';
        char grade3 = 'G';

        int bonus1 = 7;
        int bonus2 = 8;
        int bonus3 = 10;

        double total1 = 50.5;
        double total2 = 58.2;
        double total3 = 49.9;

        System.out.printf("%-10s %-10s %-10s %-10s\n", heading1, heading2, heading3, heading4);

        System.out.printf("%-11s", divider1);
        System.out.printf("%-11s", divider1);
        System.out.printf("%-11s", divider2);
        System.out.printf("%-11s\n", divider2);

        System.out.printf("%-10s %-10c %-10d %-10.2f\n", name1, grade1, bonus1, total1);
        System.out.printf("%-10s %-10c %-10d %-10.2f\n", name2, grade2, bonus2, total2);
        System.out.printf("%-10s %-10c %-10d %-10.2f\n\n", name3, grade3, bonus3, total3);
    }
}
