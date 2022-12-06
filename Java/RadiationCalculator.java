package Java;
import java.util.Scanner;
import java.lang.Math;

public class RadiationCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 

        int choice, choice1;
        double envSum;

        // INDIVIDUAL VARS: User will specify how many of each var to be summed.
        int cigarettePackCount, xrayCount, ctCount;
        
        // ENVIRONMENTAL VARS: Background radiation doses from just living in NJ + environmental terrain and objects.
        final double NJ_RADON_DOSE = 616.32;
        final double FIRE_DETECTOR = 0.008; 
        final double ELEVATION_DOSE = 2;
        final double NPP_RADIUS = 0.009;
        final double CPP_RADIUS = 0.03;
        final double FOOD_WATER_DOSE = 40;

        final double CONST_CIGARETTE = 0.49;
        final double CONST_XRAY = 10;
        final double CONST_CT = 500;

        double cigSum, xraySum, ctSum;
        double finalSum;
        double microSievert;

        // Vars for caluculating radioactive decay half-life
        // N(t) = m * e ^ (-t/T) function for telling how much radioactive material
        // remains after a time t

        // Python code adapted to Java: GitHub user tdjsnelling
        // https://github.com/tdjsnelling/radioactive-decay/blob/master/radioactive-decay.py

        // t = user input time (sec)
        // T = time constant (sec)
        // m = initial mass in kilograms

        // while-loop of t seconds : N(t) mapped

        int timeElapsed;
        int atomsRemaining, atoms;

        final int HALFLIFE_CONST = 19;

        // λ = ln(2) / t (half)
        final double DECAY_RATE = Math.log(2) / HALFLIFE_CONST; // d
        
        // Environmental variable that is summed to user input no matter what. 
        envSum = NJ_RADON_DOSE + FIRE_DETECTOR + ELEVATION_DOSE + NPP_RADIUS + CPP_RADIUS + FOOD_WATER_DOSE;
        
        String logo = "\n╔═══╗────╔╗───╔╗────────╔═══╗──╔╗──────╔╗───╔╗\n" +
                        "║╔═╗║────║║──╔╝╚╗───────║╔═╗║──║║──────║║──╔╝╚╗\n" +
                        "║╚═╝╠══╦═╝╠╦═╩╗╔╬╦══╦═╗─║║─╚╬══╣║╔══╦╗╔╣║╔═╩╗╔╬══╦═╗\n" +
                        "║╔╗╔╣╔╗║╔╗╠╣╔╗║║╠╣╔╗║╔╗╗║║─╔╣╔╗║║║╔═╣║║║║║╔╗║║║╔╗║╔╝\n" +
                        "║║║╚╣╔╗║╚╝║║╔╗║╚╣║╚╝║║║║║╚═╝║╔╗║╚╣╚═╣╚╝║╚╣╔╗║╚╣╚╝║║\n" +
                        "╚╝╚═╩╝╚╩══╩╩╝╚╩═╩╩══╩╝╚╝╚═══╩╝╚╩═╩══╩══╩═╩╝╚╩═╩══╩╝\n\n";
        
        System.out.println("\nKeith Fernandez, Jason Zaruma, Ayman Rashiel, James Hernandez");                
        System.out.println("[CPS 1231 Radiation Education + Simple EPA Calculator Project]");
        System.out.print(logo);
        System.out.println("===================================================\n");
        System.out.println("            Select an option from 1-4.\n");
        System.out.println("            [1] ~ Isotope information");
        System.out.println("            [2] ~ EPA Radiation calculator");
        System.out.println("            [3] ~ Links + credits");
        System.out.println("            [4] ~ Carbon-10 Decay calculator\n");
        System.out.println("===================================================\n");

        choice = input.nextInt();

        switch (choice) { // breaks out to separate conditions and submenus

            case 1:
                // menu 1
                System.out.println("===================================================\n");
                System.out.println("            Select an option from 1-4.\n");
                System.out.println("            [1] ~ Uranium-235");
                System.out.println("            [2] ~ Americium-241");
                System.out.println("            [3] ~ Cobalt-60");
                System.out.println("            [4] ~ Plutonium-238\n");
                System.out.println("===================================================\n");

                choice1 = input.nextInt();
                switch (choice1) {
                    case 1:
                        System.out.println("\nU-235 is an isotope of Uranium making up 0.72% of naturally occurring uranium.\n"
                                         + "U-235 is a fissile material, meaning it can sustain a self-sustaining energetic\n"
                                         + "reaction. U-235 is known for its uses in both nuclear power plants to generate\n"
                                         + "electricity to the power grid, but as well as its application in bombs.\n");
                        break;

                    case 2:
                        System.out.println("\nAm-241 is an isotope of americium, with a half-life of 432.2 years.\n"
                                         + "It is commonly found in ionization-type smoke detectors for households.\n"
                                         + "Am-241 is also used in radioisotope thermoelectric generators (RTGs)\n"
                                         + "which are used in spacecraft. Additionally, this isotope has application\n"
                                         + "in medicine to help diagnose issues with the thyroid.\n");
                        break;

                    case 3:
                        System.out.println("\nCobalt-60 is a synthetic (manmade) radioactive isotope, with a\n"
                                         + "half-life of 5.3 years. It is produced synthetically in nuclear reactors\n"
                                         + "and is a high-intensity isotope when compared to other radioactive elements.\n"
                                         + "Its applications are in the sterilization of medical equipment, and industrial\n"
                                         + "testing of materials. In radiotherapy, a technician can use a machine built\n"
                                         + "for Co-60 and treat cancers without invasive surgery.\n"); 
                        break;     

                    case 4:
                        System.out.println("\nPu-238 is an isotope with a half-life of 87.7 years, and is also used as\n"
                                         + "spacecraft energy generators. Plutonium was first synthesized in 1940-1941\n"
                                         + "and its use in the now extremely unethical *Plutonium Injection Experiments*\n"
                                         + "carried out by researchers and physicians at the Los Alamos National Lab, from\n"
                                         + "1945-1947. Plutonium-238 was critical in the development of US-sponsored Manhatten\n"
                                         + "Project on the cusp of World War II. It is also notably used in the energy systems\n"
                                         + "of the Pioneer 10 and 11, Voyager 1 and 2, and the 2020 Mars Perserverance Rover.\n\n"

                                         + "For more information regarding the controversial human radiation experiments, a free\n"
                                         + "archival PDF is provided in the following link:\n\n"
                                         + "https://ia803202.us.archive.org/16/items/1999-ew-the-plutonium-files/1999%20EW%20The%20Plutonium%20Files.pdf\n");

                        break;

                    default:
                        System.out.println("Not a valid input!\nSystem exit status [1].\n");
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
                                 + "          using integer answers only.\n\n"
                                 + " A final calculation and info about radiation will\n"
                                 + "            be given to you. Enjoy!");
                System.out.println("=================================================\n");

                System.out.println("1.) How many packs of cigarettes do you smoke a day? (If none, enter 0.)");
                cigarettePackCount = input.nextInt();
                cigSum = (cigarettePackCount * CONST_CIGARETTE) * 365; // calculates years worth of radiation

                System.out.println("\n2.) How many x-rays did you have this past year? (If none, enter 0.)");
                xrayCount = input.nextInt();
                xraySum = xrayCount * CONST_XRAY;

                System.out.println("\n3.) How many CT scans did you have this past year? (If none, enter 0.)");
                ctCount = input.nextInt();
                ctSum = ctCount * CONST_CT;

                finalSum = cigSum + xraySum + ctSum + envSum;
                microSievert = finalSum * 10; // unit conversion

                System.out.println("\nFINAL YEARLY ESTIMATED DOSE: " + finalSum + " mili-rem, and " + microSievert + " micro-Sieverts.\n");

                System.out.println("Reference Dose Chart:");
                System.out.println("===================================================\n");
                System.out.println("1.) 0.1 micro-Sievert = radiation from eating a banana.");
                System.out.println("2.) 5 micro-Sieverts = dose from getting a dental x-ray.");
                System.out.println("3.) 50 micro-Sieverts = dose from spending one hour on the ground at Chernobyl in 2010.");
                System.out.println("4.) 100 micro-Sieverts = dose from getting a chest x-ray.");
                System.out.println("5.) 400 micro-Sieverts = dose from getting a mammogram.");
                System.out.println("6.) 1,000 micro-Sieverts = US government yearly limit on artificial radiation exposure to the public.");
                System.out.println("7.) 10,000 micro-Sieverts = dose from an average CT scan.");
                System.out.println("8.) 50,000 micro-Sieverts = yearly maximum dose for US radiation workers.");
                System.out.println("9.) 250,000 micro-Sieverts = dose limit for US radiation workers in life-saving operations.");
                System.out.println("10.) 1,000,000 micro-Sieverts = non-fatal radiation sickness, nausea and low blood cell count.");
                System.out.println("11.) 2,000,000 micro-Sieverts = high energy targeted dose in radiotherapy.");
                System.out.println("12.) 4,000,000 micro-Sieverts = severe dose, bleeding / hair-loss, death within 4-6 weeks if untreated.");
                System.out.println("13.) 6,000,000 micro-Sieverts = typically fatal in 2-4 weeks if untreated.");
                System.out.println("14.) 10,000,000 micro-Sieverts = fatal dose, death within 2 weeks.");
                System.out.println("15.) 30,000,000 micro-Sieverts = seizures and tremors, death within 48 hours.");
                System.out.println("16.) 50,000,000 micro-Sieverts = 10 minutes exposure to Chernobyl reactor core after meltdown.\n");

                break;
            
            case 3: 
                System.out.println("\nLink list:\n");
                System.out.println("1.) Pulitzer Prize Winner in Investigative Journalism: *The Plutonium Files* by Eileen Welsome");
                System.out.println("https://ia803202.us.archive.org/16/items/1999-ew-the-plutonium-files/1999%20EW%20The%20Plutonium%20Files.pdf\n");
                System.out.println("2.) Radiation Dosage Chart, *InformationIsBeautiful.net*");
                System.out.println("https://www.informationisbeautiful.net/visualizations/radiation-dosage-chart/\n");
                System.out.println("3.) Python implementation of half-life radioactive decay equation (Github User: tdjsnelling)");
                System.out.println("https://github.com/tdjsnelling/radioactive-decay/blob/master/radioactive-decay.py\n");

                break;

            case 4: 
                System.out.println("===================================================\n");
                System.out.println("       Carbon-10 is a radioactive isotope with");
                System.out.println("            a half-life of ~19 seconds.\n");
                System.out.println("       The half-life of a radionucleotide is");
                System.out.println("       defined by the amount of time needed");
                System.out.println("        for 50% of the initial radioactive");
                System.out.println("                 mass to decay off.\n");
                System.out.println("       This can mathematically defined as a");
                System.out.println("                 function of time:\n");
                System.out.println("               N(t) = n * e ^ (-λt)\n");
                System.out.println("===================================================\n");
                
                System.out.println("Please enter the number of Carbon-10 atoms to start. (Integer answers only.)");
                atoms = input.nextInt();
                atomsRemaining = atoms;

                System.out.println("\nPlease enter the time in seconds you wish to simulate half-life decay.");
                timeElapsed = input.nextInt();

                System.out.println("\nTime (s)       Starting atoms: " + atoms);
                System.out.println("===================================================\n");

                for (int i = 1; i <= timeElapsed; i++) {
                    // N = N0 * e ^ (-λt)
                    atomsRemaining = atoms - (int)(atoms * Math.exp(-DECAY_RATE * i));
    
                    System.out.println(i+" second(s)  ::  Atoms Remaining: " + (atoms - atomsRemaining));
                }
                System.out.print("\n");

                break;

            default:
                System.out.println("Not a valid input!\nSystem exit status [1].\n");
                System.exit(1);

        }
    }
}