/**
 Name: Aguilar, Aaron Kyle M.

 Class Code, Course Number, Schedule: 9315, 1:00 - 2:30 MW

 Date: November 14, 2022

 Problem: Develop a program that will allow the computer to accept some numbers that are not sorted. The numbers
 should be stored in a one-dimensional array. The computer will then display the numbers following descending
 order and ascending order. Apply the Selection Sort algorithm.
 */

package firstYear.finals;
import java.util.Scanner;
import java.lang.*;

public class FinalExercise4C {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int length = -1;
        int[] array, sortedArray;
        String sortType;

        introduction();

        length = lengthInput(2);

        System.out.println("Would you like to sort in ascending or descending order? ");
        sortType = keyboard.nextLine();

        array = populateArray(length);
        sortedArray = selectionSort(array, sortType);

        System.out.println("The original array: ");
        showArray(array);

        System.out.println("The sorted order of the array: ");
        showArray(sortedArray);

        System.exit(0);
    }  // end of main method

    public static void introduction(){
        System.out.println("This program will accept some numbers that are not sorted.");
        System.out.println("The numbers will be stored in a one-dimensional array.");
        System.out.println("This program will be able to display the numbers both in descending and ascending order depending on the user's choice.");
    }  // end of introduction method

    public static int lengthInput(int minNumber){
        Scanner keyboard = new Scanner(System.in);

        int length = -1;

        do {
            try {
                System.out.println("\nEnter the number of integers: ");
                length = Integer.parseInt(keyboard.nextLine());
                if(length <= minNumber-1) System.out.println("Please enter a number more than "+(minNumber - 1));
            } catch (NumberFormatException numberException) {
                System.out.println("Please enter a number");
            }  // end of try catch
        }while(length <= minNumber-1 );
        // end of do while

        return length;
    }  // end of lengthInput method

    public static void showArray(int[] array){
        for(int x = 0; x < array.length; x++){
            System.out.print(array[x]+"  ");
        }  // end of for loop
        System.out.println();
    }  // end of showArray method

    public static int[] populateArray(int length){
        Scanner keyboard = new Scanner(System.in);

        int[] outputArray = new int[length];

        for(int i = 0; i < length; i++){
            System.out.print("Enter the value for index number "+i+": ");
            outputArray[i] = Integer.parseInt(keyboard.nextLine());
        }  // end of for loop

        return outputArray;
    }  // end of populateArray method

    public static int[] selectionSort(int[] array, String type){
        int[] sortedArray = cloneArray(array);
        int length = sortedArray.length;

        if(type.charAt(0) == 'd'){
            for (int x = 0; x < length - 1; x++) {
                int mindIndex = x;
                for (int y = x + 1; y < length; y++) {
                    if (sortedArray[mindIndex] < (sortedArray[y])) {
                        mindIndex = y;
                    }  // end of if statement
                }  // end of second for loop
                int temp = sortedArray[x];
                sortedArray[x] = sortedArray[mindIndex];
                sortedArray[mindIndex] = temp;

            }  // end of first for loop

        }else {
            for (int x = 0; x < length - 1; x++) {
                int mindIndex = x;
                for (int y = x + 1; y < length; y++) {
                    if (sortedArray[mindIndex] > (sortedArray[y])) {
                        mindIndex = y;
                    }  // end of if statement
                }  // end of second for loop
                int temp = sortedArray[x];
                sortedArray[x] = sortedArray[mindIndex];
                sortedArray[mindIndex] = temp;
            }  // end of first for loop
        }  // end of if-else statement

        return sortedArray;
    }  // end of selectionSort method

    public static int[] cloneArray (int[] array){
        int length = array.length;
        int[] clonedArray = new int[length];

        for(int i= 0; i < length; i++){
            clonedArray[i] = array[i];
        }  // end of for loop
        return clonedArray;
    }  // end of cloneArray method

}  // end of class FinalExercise4C