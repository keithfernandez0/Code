package Java;
import java.util.Scanner;

public class RadiationCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice;
        double sievert, radius, mwh, energy, power;

        
        String logo = "╔═══╗────╔╗───╔╗────────╔═══╗──╔╗──────╔╗───╔╗\n" +
                      "║╔═╗║────║║──╔╝╚╗───────║╔═╗║──║║──────║║──╔╝╚╗\n" +
                      "║╚═╝╠══╦═╝╠╦═╩╗╔╬╦══╦═╗─║║─╚╬══╣║╔══╦╗╔╣║╔═╩╗╔╬══╦═╗\n" +
                      "║╔╗╔╣╔╗║╔╗╠╣╔╗║║╠╣╔╗║╔╗╗║║─╔╣╔╗║║║╔═╣║║║║║╔╗║║║╔╗║╔╝\n" +
                      "║║║╚╣╔╗║╚╝║║╔╗║╚╣║╚╝║║║║║╚═╝║╔╗║╚╣╚═╣╚╝║╚╣╔╗║╚╣╚╝║║\n" +
                      "╚╝╚═╩╝╚╩══╩╩╝╚╩═╩╩══╩╝╚╝╚═══╩╝╚╩═╩══╩══╩═╩╝╚╩═╩══╩╝\n\n";
        
        System.out.print(logo);
        System.out.println("===================================================");
        System.out.println("            Select an option from 1-3.\n");
        System.out.println("            [1] ~ Isotope information");
        System.out.println("            [2] ~ Radiation calc.");
        System.out.println("            [3] ~ Blast radius calc.");
        System.out.println("===================================================");

        choice = input.nextInt();

        switch (choice) {
            case 1:
                break;
            case 2: 
                break;
            case 3:
                break;
            default:
                System.exit(1);
        }
    }
}