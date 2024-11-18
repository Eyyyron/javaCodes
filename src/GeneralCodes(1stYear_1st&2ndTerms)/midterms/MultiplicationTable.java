/**
 Name: Aguilar, Aaron Kyle M.
 Date: November 1, 2022
 Activity Name: MultiplicationTable

 Problem: Create a program that generates a typical multiplication table. Debug the program if needed.

 Analysis:
 Input: Number of Rows, Number of Columns

 Process:
 1. Assign the value to the number of rows
 2. Assign the value to the number of columns
 3. Compute the multiplication table
 4. Display the results
 5. End the process

 Output: Multiplication Table

 Algorithm:
 1. Let numberOfRows represent the number of rows
 2. Let numberOfColumns represent the number of columns
 3. Display a prompt to input the number of rows
 4. Display a prompt to input the number of columns
 5. Assign the value to the number of rows
 6. Assign the value to the number of columns
 7. Compute the multiplication table
 8. Display the results
 9. End the program
 */

package FirstYearFirstTermAndSecondTerm.midterms;
import java.lang.*;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int numberOfRows=0; // desired number of rows
        int numberOfColumns=0; // desired number of columns

        System.out.print("How many rows will the multiplication table have?");
        numberOfRows = Integer.parseInt(keyboard.nextLine());
        System.out.print("How many columns will the multiplication table have?");
        numberOfColumns = Integer.parseInt(keyboard.nextLine());
        System.out.println("\n          M U L T I P L I C A T I O N    T A B L E");

        showMultiplicationTable(numberOfRows,numberOfColumns); //Exercise: Show
        // the implementation of
        // this method
        System.exit(0);
    }  // end of main method

    public static void showMultiplicationTable(int nRows, int nColumns){
        for (int row=1 ; row<= nRows; row++){
            for (int column = 1; column <= nColumns; column++){
                System.out.printf("%8d", row*column );
            }
            System.out.println();
        }
        return;
    }  // end of showMultiplicationTable method
} // end of  class
