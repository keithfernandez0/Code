package Java.year2.lab4;

import java.util.ArrayList;

public class NewArrayList 
{
    public static void main(String[] args) 
    {
        // CREATE A LIST
        var myArrayList = new MyArrayList<Integer>();

        // ADD 4 ELEMENTS
        long startTime = System.nanoTime();

        for (int i = 1; i < 5; i++)
            myArrayList.add(i);

        long endTime = System.nanoTime();
        long addOneElementTime = endTime - startTime;
        System.out.println(">> Initial list: " + myArrayList);

        // ADD 4 MORE IN FRONT OF THE LIST
        startTime = System.nanoTime();
        for (int i = 1; i < 5; i++)
            myArrayList.add(0, i + 10);

        endTime = System.nanoTime();
        long addInFrontTime = endTime - startTime;
        System.out.println(">> List after modification: " + myArrayList);

        // REMOVE 3 LAST ELEMENTS
        startTime = System.nanoTime();
        for (int i = 0; i < 3; i++)
            myArrayList.remove(myArrayList.size() - 1);
        endTime = System.nanoTime();
        long deleteOneElementTime = endTime - startTime;
        System.out.println(">> List after removal: " + myArrayList);

        // OUTPUT TIME IN NANSECONDS
        System.out.println("ArrayList (nanoseconds)");
        System.out.println(">> Time to add one element: " + addOneElementTime);
        System.out.println(">> Time to add in front: " + addInFrontTime);
        System.out.println(">> Time to delete one element: " + deleteOneElementTime);
    }
}

class MyArrayList<E> extends ArrayList<E> 
{
    // LEAVE AS IS
}