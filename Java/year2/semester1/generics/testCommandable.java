// ====================================================================================
// Keith Michelangelo Fernandez
// ID: 1209266
// Email: fernkayl@kean.edu
//
// ASSIGNMENT: UNIT 3, BASIC DATA STRUCTURES
// FA23 CPS 2232-02
// 10/1/2023
// ====================================================================================


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


