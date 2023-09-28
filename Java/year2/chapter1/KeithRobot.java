// ====================================================================================
// Keith Michelangelo Fernandez
// ID: 1209266
// Email: fernkayl@kean.edu
//
// ASSIGNMENT: UNIT 2, RECURSIVE THINKING
// FA23 CPS 2232-02
// 9/27/2023
// ====================================================================================


package Java.year2.chapter1;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

interface Commandable<T> 
{
    void setCommand(String commandType, T commandValue);
    T getCommandValue();
    void executeCommand();
}

public class KeithRobot<T> implements Commandable<T> 
{
    private int robotId;
    private String robotType;
    private String commandType;
    private T commandValue;
    private String brand;
    private String modelNumber;

    public KeithRobot(int robotId, String robotType, String commandType, T commandValue, String brand) 
    {
        this.robotId = robotId;
        this.robotType = robotType;
        this.commandType = commandType;
        this.commandValue = commandValue;
        this.brand = brand;
        this.modelNumber = generateModelNumber();
    }

    @Override
    public void setCommand(String commandType, Object object) 
    {
        this.commandType = commandType;
        this.commandValue = (T) object;
    }

    @Override
    public T getCommandValue() 
    {
        return commandValue;
    }

    public String getBrand() 
    {
        return brand;
    }

    public void setBrand(String brand) 
    {
        this.brand = brand;
    }

    public int getRobotId() 
    {
        return robotId;
    }

    public String getModelNumber() 
    {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) 
    {
        this.modelNumber = modelNumber;
    }

    @Override
    public void executeCommand() 
    {
        System.out.println("Executing command: " + commandType + " with value: " + commandValue);
    }

    private String generateModelNumber() 
    {
        Random random = new Random();
        int modelNumber = 100000 + random.nextInt(900000); // GENERATES 6-DIGIT NUMBER
        return String.valueOf(modelNumber);
    }

    public void displayRobotInfo() 
    {
        System.out.println("Bot ID: " + robotId);
        System.out.println("Bot type: " + robotType);
        System.out.println("Command type: " + commandType);
        System.out.println("Command value: " + commandValue);
        System.out.println("Brand: " + brand);
        System.out.println("Model #: " + modelNumber);
    }

    public static void executeCommands(List<? extends Commandable<?>> list) 
    {
        for (Commandable<?> commandable : list) 
        {
            System.out.println("Executing command for bot:");
            commandable.executeCommand();
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        // CREATE NEW ARRAY LIST
        ArrayList<KeithRobot<?>> robotList = new ArrayList<>();

        // CREATE ROBOTS WITH DIFFERNT PARAMETERS
        KeithRobot<String> robot3 = new KeithRobot<>(3, "TypeC", "Speak", "Hello", "Sony");
        KeithRobot<Character> robot4 = new KeithRobot<>(4, "TypeD", "Jump", 'A', "Microsoft");
        KeithRobot<Integer> robot5 = new KeithRobot<>(5, "TypeE", "Turn", 180, "Samsung");

        // ADD TO LIST
        robotList.add(robot3);
        robotList.add(robot4);
        robotList.add(robot5);

        for (KeithRobot<?> robot : robotList) {
            robot.setCommand("NewCommand", robot.getCommandValue());
        }

        for (KeithRobot<?> robot : robotList) {
            robot.displayRobotInfo();
            System.out.println();
        }

        executeCommands(robotList);
    }
}

