/**
 Name: Aguilar, Aaron Kyle M.

 Class Code, Course Number, Schedule: 9315, 1:00 - 2:30 MW

 Date: November 9, 2022

 Notes:
 a. Array Initialization
 b. Sorting the Elements of an Array
 * */

package firstYear.finals;
import javax.swing.*;
import java.util.Scanner;

public class ArraySortingDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] array1 = {86, 90, 87, 79, 94, 88, 95, 84, 90, 93};
        String[] participants = {"Liam","Billy", "Joey", "Karina", "Wency", "Marah"};
        System.out.print("Press enter to show the elements of the array of integers");
        keyboard.nextLine();
        showArray(array1);

        System.out.print("Press enter to show the elements of the array of strings");
        keyboard.nextLine();
        showArray(participants);

        System.out.print("Press enter to show the sorted elements of the array of integers");
        keyboard.nextLine();
        int[] modifiedArray =new int[array1.length];
        modifiedArray = balloonSortArray(array1);
        showArray(modifiedArray);

        System.out.print("Press enter to show the sorted elements of the array of strings");
        keyboard.nextLine();
        String[] modifiedStringArray =new String[participants.length];
        modifiedStringArray = balloonSortArray(participants);
        showArray(modifiedStringArray);

        System.exit(0);
    }
    /**
     Shows the elements of an array of int
     * */
    public static void showArray(int[] array){
        String stringToDisplay="Elements of the Array\n";
        for (int index=0; index<array.length; index++)
            stringToDisplay += (index + 1) + ". " + array[index]+"\n";
        JOptionPane.showMessageDialog(null, stringToDisplay);
    }

    /**
     Shows the elements of an array of String
     * */
    public static void showArray(String[] array){
        String stringToDisplay="Elements of the Array\n";
        for (int index=0; index<array.length; index++)
            stringToDisplay += (index + 1) + ". " + array[index]+"\n";
        JOptionPane.showMessageDialog(null, stringToDisplay);
    }

    /**
     Returns a sorted version of a given array of int
     following the ascending order
     */
    public static int[] balloonSortArray(int[] givenArray) {
        int[] sortedArray = copyArray(givenArray); // to be sorted
        for (int x = 0; x < sortedArray.length - 1; x++) {
            for (int y = x + 1; y < sortedArray.length; y++) {
                if (sortedArray[x] > sortedArray[y]) {
                    int temp = sortedArray[x];
                    sortedArray[x] = sortedArray[y];
                    sortedArray[y] = temp;
                } // end of if
            }     // end of second for
        }         // end of first for
        return sortedArray;
    }             // end of balloonSortArray1 method

    /**
     Returns a sorted version of a given array of String
     following lexicographic ordering
     (i.e. alphabetical ordering)
     */
    public static String[] balloonSortArray(String[] givenArray) {
        String[] sortedArray = copyArray(givenArray); // to be sorted
        for (int x = 0; x < sortedArray.length - 1; x++) {
            for (int y = x + 1; y < sortedArray.length; y++) {
                if (sortedArray[x].compareToIgnoreCase (sortedArray[y]) > 0) {
                    String temp = sortedArray[x];
                    sortedArray[x] = sortedArray[y];
                    sortedArray[y] = temp;
                } // end of if
            }     // end of second for
        }         // end of first for
        return sortedArray;
    } // end of balloonSortArray2 method

    /**
     Returns a copy of a given array of integers
     * */
    public static int[] copyArray(int[] array1) {
        int[] copied = new int[array1.length];
        for (int index = 0; index < array1.length; index++) {
            copied[index] = array1[index];
        }
        return copied;
    }  // end of copyArray method

    /**
     Returns a copy of a given array of strings
     * */
    public static String[] copyArray(String[] array1){
        String[] copied = new String[array1.length];
        for (int index=0; index< array1.length; index++){
            copied[index] = array1[index];
        }
        return copied;
    }  // end of copyStringArray method

    /**
     Returns a sorted version of a given array of int following the ascending
     order
     */
    public static int[] sortIntegerArray(int[] givenArray) {
        int minIndex = 0;
        int[] sorted = copyArray(givenArray);
        int temp = 0;
        for (int x=0; x < sorted.length - 1; x++) {
            minIndex = x;
            for (int y = x + 1; y < sorted.length; y++)
                if (sorted[minIndex] > sorted[y])
                    minIndex = y;
            if (minIndex != x) {
                temp = sorted[x];
                sorted[x] = sorted[minIndex];
                sorted[minIndex] = temp;
            }
        }
        return sorted;
    } // end of sortIntegerArray

    /**
     Returns a sorted version of a given array of Strings following
     lexicographic ordering
     */
    public static String[] sortStringArray(String[] given){
        int minIndex = 0;
        String[] sorted = copyArray(given);
        String temp = "";
        for (int x = 0; x < sorted.length - 1; x++) {
            minIndex = x;
            for (int y = x + 1; y < sorted.length; y++)
                if (sorted[y].compareToIgnoreCase(sorted[minIndex]) < 0)
                    minIndex = y;
            if (minIndex != x) {
                temp = sorted[x];
                sorted[x] = sorted[minIndex];
                sorted[minIndex] = temp;
            } // end of if (minIndex != x)
        }
        return sorted;
    }  // end of sortStringArray
} //end of class

