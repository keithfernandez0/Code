package Java;
import java.util.Scanner;

public class RadiationCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Average radiation per x-ray =  10 mrem
        // Elevation radiation at Kean = 2 mrem
        // 

        int choice;
        int cigarettePackCount, xrayCount, ctCount, 
        final double backgroundHourlyDoseRem = 0.008; // uSv per hour at Kean University, map.safecast.org
        final double radonDoseNJRem = 616.32; // mrem, radon level in the state of NJ
        
        String logo = "\n╔═══╗────╔╗───╔╗────────╔═══╗──╔╗──────╔╗───╔╗\n" +
                        "║╔═╗║────║║──╔╝╚╗───────║╔═╗║──║║──────║║──╔╝╚╗\n" +
                        "║╚═╝╠══╦═╝╠╦═╩╗╔╬╦══╦═╗─║║─╚╬══╣║╔══╦╗╔╣║╔═╩╗╔╬══╦═╗\n" +
                        "║╔╗╔╣╔╗║╔╗╠╣╔╗║║╠╣╔╗║╔╗╗║║─╔╣╔╗║║║╔═╣║║║║║╔╗║║║╔╗║╔╝\n" +
                        "║║║╚╣╔╗║╚╝║║╔╗║╚╣║╚╝║║║║║╚═╝║╔╗║╚╣╚═╣╚╝║╚╣╔╗║╚╣╚╝║║\n" +
                        "╚╝╚═╩╝╚╩══╩╩╝╚╩═╩╩══╩╝╚╝╚═══╩╝╚╩═╩══╩══╩═╩╝╚╩═╩══╩╝\n\n";
        
        System.out.print(logo);
        System.out.println("===================================================\n");
        System.out.println("            Select an option from 1-3.\n");
        System.out.println("            [1] ~ Isotope information");
        System.out.println("            [2] ~ EPA Radiation calculator");
        System.out.println("            [3] ~ Blast radius calc.\n");
        System.out.println("===================================================\n");

        choice = input.nextInt();

        switch (choice) { // breaks out to separate conditions and submenus
            case 1:
                System.out.println("===================================================\n");
                System.out.println("            Select an option from 1-3.\n");
                System.out.println("            [1] ~ Uranium-235");
                System.out.println("            [2] ~ Americium-")
                break;
            case 2: 
                break;
            case 3:
                break;
            default:
                System.out.println("Not a valid input!\nSystem exit status [1].");
                System.exit(1);
        }
    }
}