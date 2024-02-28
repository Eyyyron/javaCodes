/**
 Name: Aguilar, Aaron Kyle M.
 Date: November 16, 2022
 Notes:

 1. Aside from the previously discussed way of accessing the elments of an array,
 There are other ways of accessing the elements of an array.

 2. Suppose sampleArray is an array of int.
 The elements of sampleArray may be accessed as follows:

 for (int element: sampleArray)
 System.out.println(element);

 3. Suppose sampleArray is an array of String.
 The elements of sampleArray may be accessed as follows:

 for (String element: sampleArray)
 System.out.println(element);
 */

package firstYear.finals;
import java.util.Scanner;

public class ArrayDisplayDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] array1 = {86, 90, 87, 79, 94, 88, 95, 84, 90, 93};
        String[] players = {"Liam", "Billy", "Joey", "Karina", "Wency", "Marah"};
        System.out.print("Press enter to show the elements of the array of integers");
        keyboard.nextLine();
        showArray1(array1);
        System.out.println("The showArray1 method was used in displaying the elements");
        System.out.print("Press enter to continue");
        keyboard.nextLine();

        System.out.print("Press enter to show the elements of the array of integers");
        keyboard.nextLine();
        showArray2(array1);
        System.out.println("The showArray2 method was used in displaying the elements");
        System.out.print("Press enter to continue");
        keyboard.nextLine();

        System.out.print("Press enter to show the elements of the array of integers");
        keyboard.nextLine();
        showArray4(array1);
        System.out.println("The showArray4 method was used in displaying the elements");
        System.out.print("Press enter to continue");
        keyboard.nextLine();

        System.out.print("Press enter to show the elements of the array of strings");
        keyboard.nextLine();
        showArray3(players);
        System.out.println("The showArray3 method was used in displaying the elements");
        System.out.print("Press enter to continue");
        keyboard.nextLine();

        System.out.print("Press enter to show the elements of the array of strings");
        keyboard.nextLine();
        showArray5(players);
        System.out.println("The showArray5 method was used in displaying the elements");
        System.out.print("Press enter to continue");
        keyboard.nextLine();

        System.out.print("Press enter to show the elements of the array of strings");
        keyboard.nextLine();
        showArray6(players);
        System.out.println("The showArray6 method was used in displaying the elements");
        System.out.print("Press enter to continue");
        keyboard.nextLine();

        System.out.println("Study the different ways of accessing the elements of an array.");
        System.out.println("You may even create your own style of accessing the elements of an array.");

        System.exit(0);

    } // end of main method

    /**
     * Shows the elements of an array of int
     */
    public static void showArray1(int[] array) {
        System.out.println("Elements of the Array");
        for (int index = 0; index < array.length; index++)
            System.out.println((index + 1) + ": " + array[index]);
    } // end of showArray1 method

    /**
     * Shows the elements of an array of int
     */
    public static void showArray2(int[] array) {
        int n = array.length;
        int index = 0;
        System.out.println("Elements of the array");
        if (array.length == 0)
            System.out.println("The array is empty.");
        else {
            while (index < n) {
                System.out.println((index + 1) + ": " + array[index]);
                index += 1;
            } //end of else
        } // end of while
    } // end of showArray2 method

    /**
     * Shows the elements of an array of String
     */
    public static void showArray3(String[] array) {
        int n = array.length;
        int index = 0;
        System.out.println("Elements of the array");
        if (array.length == 0)
            System.out.println("The array is empty.");
        else {
            while (index < n) {
                System.out.println((index + 1) + ": " + array[index]);
                index += 1;
            } //end of else
        } // end of while
    } // end of showArray3 method

    /**
     * Shows the elements of an array of int
     */
    public static void showArray4(int[] array) {
        System.out.println("Elements of the array");
        for (int element : array)
            System.out.println(element);
    } // end of showArray4 method

    /**
     * Shows the elements of an array of String
     */
    public static void showArray5(String[] array) {
        System.out.println("Elements of the array");
        for (String element : array)
            System.out.println(element);
    } // end of showArray5 method

    /**
     * Shows the elements of an array of String
     */
    public static void showArray6(String[] array) {
        System.out.println("Elements of the Array");
        for (int index = 0; index < array.length; index++)
            System.out.println((index + 1) + ": " + array[index]);
    } // end of showArray6 method


} // end of class
