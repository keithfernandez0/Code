/**************************************************************
 * Kean University
 * Spring 2023
 * Course: CPS*2231 - Computer Programming in Java
 * Author: Keith Michelangelo Fernandez, CPS*2231
 * 
 * HW Assignment 1
 **************************************************************
 */

package semester2;

import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numOfStudents;
        int[] studentIds;
        String[] studentNames;
        String[] studentMajors;
        int choice;

        System.out.print("Enter the number of students: ");

        numOfStudents = input.nextInt();
        studentIds = new int[numOfStudents];
        studentNames = new String[numOfStudents];
        studentMajors = new String[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {
            System.out.print("Enter the ID for student " + (i + 1) + ": ");
            studentIds[i] = input.nextInt();

            System.out.print("Enter the name for student " + (i + 1) + ": ");
            studentNames[i] = input.next();

            System.out.print("Enter the major for student " + (i + 1) + ": ");
            studentMajors[i] = input.next();
        }

        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. ID Search");
            System.out.println("2. Major Enrollment");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice == 1) {
                System.out.print("Enter the student ID to search: ");
                int id = input.nextInt();
                boolean found = false;

                for (int i = 0; i < numOfStudents; i++) {
                    if (studentIds[i] == id) {
                        System.out.println("Name: " + studentNames[i]);
                        System.out.println("Major: " + studentMajors[i]);

                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student Not Found");
                }
            } 
            
            else if (choice == 2) {
                System.out.print("Enter the major to search: ");
                String major = input.next();
                boolean found = false;
                System.out.println("Students enrolled in " + major + " major:");
                for (int i = 0; i < numOfStudents; i++) {
                    if (studentMajors[i].equals(major)) {
                        System.out.println(studentNames[i]);
                        found = true;
                    }
                }

                if (!found) {
                    System.out.println("No students are enrolled in this major!");
                }
            }
        } while (choice != 3);

        System.out.println("Program terminated: system status [1]");
        input.close();
        System.exit(1);
    }
}