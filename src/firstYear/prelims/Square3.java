/**
 * Name: Aguilar, Aaron Kyle M.
 * Programming Date: September 5, 2022
 * Activity Name and Number: Prelim Exercise Number 4
 -------------------------------------------------------------------
 Problem: Write a program that computes and shows the perimeter and the area of a square.
 Let the side be entered through the keyboard at program runtime.

 Analysis:
 Input: Side of a Square

 Output: Perimeter and Area of a Square

 Processes:
 1. Compute the Side of a Square
 2. Compute the Perimeter of the Square
 3. Compute the Area of the Square
 4. Display the Results
 5. End the process

 Algorithm:
 1. Assign the Side of the Square
 2. Compute the Perimeter : perimeter = 4*side
 3. Compute the Area: area = side*side
 4. Show the Side of the Square
 5. Show the Perimeter of the Square
 6. Show the Area of the Square
 7. End the program
 -------------------------------------------------------------------
 */

package firstYear.prelims;
import java.lang.*;
import java.util.Scanner;

public class Square3 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);  // Make an object of Scanner that represents the keyboard

        float sideOfSquare; // variable declaration
        float perimeterOfSquare;    // variable declaration
        float areaOfSquare; // variable declaration
        // Assignment statement that stores a value to a variable.

        System.out.print("Please enter the side of the square: "); // Read the side. Print a prompt message
        sideOfSquare = Float.parseFloat(keyboard.nextLine());   // Assigns an integer entered through the keyboard to side

        perimeterOfSquare = 4*sideOfSquare;
        // A mathematical expression represents a value that may be assigned to a variable
        areaOfSquare = sideOfSquare*sideOfSquare;
        // A mathematical expression represents a value that may be assigned to a variable

// Show some outputs on the screen
        System.out.println();
        System.out.println();
        System.out.println(" **********************************************************");
        System.out.println(" * Side of Square is " + sideOfSquare +"                                 *");
        System.out.println(" * Perimeter of Square is " + perimeterOfSquare + "                            *");
        System.out.println(" * Area of Square is " + areaOfSquare +"                                *");
        System.out.println(" **********************************************************");
        System.out.println();
        System.out.println();
        System.exit(0); // End the program
    }//End of the main method
}//End of the class Square3



