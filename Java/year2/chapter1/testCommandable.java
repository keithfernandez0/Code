package Java.year2.chapter1;

interface Commandable<T> 
{
    void setCommand(String commandType, T commandValue);
    T getCommandValue();

    default void executeCommand()
    {
        System.out.print("Do it now for " + getCommandValue());
    }
}


