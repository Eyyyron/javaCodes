/**
 Name: Aguilar, Aaron Kyle M.

 Class Code, Course Number, Schedule: 9315, 1:00 - 2:30 MW

 Date: November 14, 2022

 Problem: Develop a program that will allow the computer to accept some names that are not sorted. The numbers
 should be stored in a one-dimensional array. The computer will then display the names following the lexicographic
 order. Apply the Balloon Sort algorithm.
 */

package firstYear.finals;
import java.util.Scanner;
import java.lang.*;

public class FinalExercise4D {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int count = 0;
        String temp = "";

        introduction();

        System.out.println("\nEnter the number of names: ");
        count = keyboard.nextInt();

        String string[] = new String[count];

        System.out.println("Enter the " + count + " names: ");
        for (int i = 0; i < count; i++) {
            string[i] = keyboard.next();
        }  // end of for loop

        descendingOrder(count, temp, string);

        ascendingOrder(count, temp, string);
    }  // end of main method

    public static void introduction(){
        System.out.println("This program will accept some names that are not in alphabetical order.");
        System.out.println("The names will be stored in a one-dimensional array.");
        System.out.println("This program will display the names in lexicographic order.");
    }  // end of introduction method

    public static void descendingOrder(int count, String temp, String[] string) {
        for (int i = 0; i < string.length - 1; i++) {
            for (int j = i + 1; j < string.length; j++) {
                if (string[i].compareToIgnoreCase(string[j]) < 0) {
                    temp = string[i];
                    string[i] = string[j];
                    string[j] = temp;
                }  // end of if statement
            }  // end of second for loop
        }  // end of first for loop

        System.out.println("The descending order of the names: ");
        for (int i = 0; i < count; i++) {
            System.out.print(string[i] + "  ");
        }  // end of for loop
    }  // end of descendingOrder method

    public static void ascendingOrder(int count, String temp, String[] string) {
        for (int i = 0; i < string.length - 1; i++) {
            for (int j = i + 1; j < string.length; j++) {
                if (string[i].compareToIgnoreCase(string[j]) > 0) {
                    temp = string[i];
                    string[i] = string[j];
                    string[j] = temp;
                }  // end of if statement
            }  // end of second for loop
        }  // end of first for loop

        System.out.println("\nThe ascending order of the names: ");
        for (int i = 0; i < count; i++) {
            System.out.print(string[i] + "  ");
        }  // end of for loop
    }  // end of ascendingOrder method
}  // end of FinalExercise4D class
