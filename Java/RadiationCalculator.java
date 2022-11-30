package Java;
import java.util.Scanner;

public class RadiationCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Average radiation per x-ray =  10 mrem
        // Elevation radiation at Kean = 2 mrem
        // Average CT scan = 500 mrem
        // Pocelain teeth (y/n) = 0.07 mrem
        // Fire detector = 0.008 mrem
        // Living within the radius of the Salem NJ powerplant = 0.009 mrem
        // Living within radius of coal plant = 0.03 mrem

        int choice, choice1, choice2, choice3, choice4;
        int cigarettePackCount, xrayCount, ctCount, porcelainCount;
        
        final double HOURLY_BACKGROUND_DOSE = 0.008; // uSv per hour at Kean University, map.safecast.org
        final double NJ_RADON_DOSE = 616.32; // mrem, radon level in the state of NJ
        
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
        System.out.println("            [2] ~ EPA Radiation calculator\n");
        System.out.println("===================================================\n");

        choice = input.nextInt();

        switch (choice) { // breaks out to separate conditions and submenus
            case 1:
                // menu 1
                System.out.println("===================================================\n");
                System.out.println("            Select an option from 1-3.\n");
                System.out.println("            [1] ~ Uranium-235");
                System.out.println("            [2] ~ Americium-241");
                System.out.println("            [3] ~ Cobalt-60");
                System.out.println("            [4] ~ Plutonium-238\n");
                System.out.println("===================================================\n");

                choice1 = input.nextInt();
                switch (choice1) {
                    case 1:
                        System.out.println("\nU-235 is an isotope of Uranium making up 0.72% of naturally occurring uranium.\n"
                                         + " U-235 is a fissile material, meaning it can sustain a self-sustaining energetic\n"
                                         + " reaction. U-235 is known for its uses in both nuclear power plants to generate\n"
                                         + " electricity to the power grid, but as well as its application in bombs.");
                        break;

                    case 2:
                        System.out.println("\nAm-241 is an isotope of americium, with a half-life of 432.2 years.\n"
                                         + " It is commonly found in ionization-type smoke detectors for households.\n"
                                         + " Am-241 is also used in radioisotope thermoelectric generators (RTGs)\n"
                                         + " which are used in spacecraft. Additionally, this isotope has application\n"
                                         + " in medicine to help diagnose issues with the thyroid.");
                        break;

                    case 3:
                        System.out.println("\nCobalt-60 is a synthetic (manmade) radioactive isotope, with a\n"
                                         + " half-life of 5.3 years. It is produced synthetically in nuclear reactors\n"
                                         + " and is a high-intensity isotope when compared to other radioactive elements.\n"
                                         + " Its applications are in the sterilization of medical equipment, and industrial\n"
                                         + " testing of materials. In radiotherapy, a technician can use a machine built\n"
                                         + " for Co-60 and treat cancers without invasive surgery."); 
                        break;     

                    case 4:
                        System.out.println("\nPu-238 is an isotope with a half-life of 87.7 years, and is also used as\n"
                                         + " spacecraft energy generators. Plutonium was first synthesized in 1940-1941\n"
                                         + " and its use in the now extremely unethical *Plutonium Injection Experiments*\n"
                                         + " carried out by researchers and physicians at the Los Alamos National Lab, from\n"
                                         + " 1945-1947. Plutonium-238 was critical in the development of US-sponsored Manhatten\n"
                                         + " Project on the cusp of World War II. It is also notably used in the energy systems"
                                         + " of the Pioneer 10 and 11, Voyager 1 and 2, and the 2020 Mars Perserverance Rover.\n\n"

                                         + "For more information regarding the controversial human radiation experiments, a free\n"
                                         + " archival PDF is provided in the following link:\n\n"
                                         + "https://ia803202.us.archive.org/16/items/1999-ew-the-plutonium-files/1999%20EW%20The%20Plutonium%20Files.pdf\n");

                        break;

                    default:
                        System.out.println("Not a valid input!\nSystem exit status [1].");
                        System.exit(1);
                }

                break;

            case 2: // yearly "test", some paramenters are hardset for living at Kean NJ
                System.out.println("===================================================\n");
                System.out.println(" This is meant to serve as a shortened, simple test\n"
                                 + "  adapted from the EPA.gov website regarding your\n"
                                 + "  estimated yearly exposure to radiation. Some\n"
                                 + "  values assume that you live in NJ and nearby\n"
                                 + "  Kean University, so this may not be totally\n"
                                 + "  accurate. Answer to the best of your ability, \n"
                                 + "          using integer answers only.\n");
                System.out.println("=================================================\n");
                break;

            default:
                System.out.println("Not a valid input!\nSystem exit status [1].");
                System.exit(1);
        }
    }
}