/**
 Name: Aguilar, Aaron Kyle M.

 Class Code, Course Number, Schedule: 9315, 1:00 - 2:30 MW

 Date: November 14, 2022

 Problem: Develop a program that will allow the computer to accept some numbers that are not sorted. The numbers
 should be stored in a one-dimensional array. The computer will then display the numbers following descending
 order and ascending order. Apply the Bubble Sort algorithm.
 */

package firstYear.finals;
import java.util.Scanner;
import java.lang.*;

public class FinalExercise4B {
    public static void main(String []args) {
        Scanner keyboard = new Scanner(System.in);

        int num = 0;
        int temp = 0;

        introduction();

        System.out.println("\nEnter the number of integers: ");
        num = keyboard.nextInt();

        int array[] = new int[num];

        System.out.println("Enter the " + num + " integers: ");
        for (int i = 0; i < num; i++) {
            array[i] = keyboard.nextInt();
        }  // end of for loop

        descendingOrder(num, temp, array);

        ascendingOrder(num, temp, array);
    }  // end of main method
    public static void introduction(){
        System.out.println("This program will accept some numbers that are not sorted.");
        System.out.println("The numbers will be stored in a one-dimensional array.");
        System.out.println("This program will display the numbers both in descending and ascending order.");
    }  // end of introduction method
    public static void descendingOrder(int num, int temp, int[] array){
        for (int i = 0; i < ( num - 1 ); i++) {
            for (int j = 0; j < num - i - 1; j++) {
                if (array[j] < array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }  // end of if statement
            }  // end of second for loop
        }  // end of first for loop

        System.out.println("The descending order of the integers: ");

        for (int i = 0; i < num; i++) {
            System.out.print(array[i] + "  ");
        }  // end of for loop
    }  // end of descendingOrder method

    public static void ascendingOrder(int num, int temp, int[] array){
        for (int i = 0; i < ( num - 1 ); i++) {
            for (int j = 0; j < num - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }  // end of if statement
            }  // end of second for loop
        }  // end of first for loop

        System.out.println("\nThe ascending order of the integers: ");
        for (int i = 0; i < num; i++) {
            System.out.print(array[i] + "  ");
        }  // end of for loop
    }  // end of ascendingOrder method
}  // end of class FinalExercise4B




