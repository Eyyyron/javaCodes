/**
 * Name: Aguilar, Aaron Kyle M.
 * Programming Date: September 5, 2022
 * Activity Name and Number: Prelim Exercise Number 4
 -------------------------------------------------------------------
 Problem: Write a program that computes and shows the perimeter and the area of a rectangle.
 Let the length and width be entered through the keyboard at program runtime.

 Analysis:
 Input: Length and Width of the Rectangle

 Output: Perimeter and Area of a Rectangle

 Processes:
 1. Compute the Length of the Rectangle
 2. Compute the Width of the Rectangle
 3. Compute the Perimeter of the Rectangle
 4. Compute the Area of the Rectangle
 5. Display the Results
 6. End the Process

 Algorithm:
 1. Assign the Length of the Rectangle
 2. Assign the Width of the Rectangle
 4. Compute the Perimeter : perimeter = 2*length + 2*width
 5. Compute the Area: area = length*width
 6. Show the Length of the Rectangle
 7. Show the Width of the Rectangle
 9. Show the Perimeter of the Rectangle
 10. Show the Area of the Rectangle
 11. End the program
 -------------------------------------------------------------------
 */

package firstYear.prelims;
import java.lang.*;
import java.util.Scanner;

public class Rectangle3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);  // Make an object of Scanner that represents the keyboard

        float lengthOfRectangle;    // variable declaration
        float widthOfRectangle; // variable declaration
        float perimeterOfRectangle; // variable declaration
        float areaOfRectangle;  // variable declaration
        // Assignment statement that stores a value to a variable.

        System.out.print("Please enter the length of the rectangle: ");    // Read the length. Print a prompt message
        lengthOfRectangle = Float.parseFloat(keyboard.nextLine());  // Assigns an integer entered through the keyboard to length

        System.out.print("Please enter the width of the rectangle: "); // Read the width. Print a prompt message
        widthOfRectangle = Float.parseFloat(keyboard.nextLine());   // Assigns an integer entered through the keyboard to width

        perimeterOfRectangle = 2*lengthOfRectangle + 2*widthOfRectangle;
        // A mathematical expression represents a value that may be assigned to a variable
        areaOfRectangle = lengthOfRectangle*widthOfRectangle;
        // A mathematical expression represents a value that may be assigned to a variable

// Show some outputs on the screen
        System.out.println();
        System.out.println();
        System.out.println(" **********************************************************");
        System.out.println(" * Length of Rectangle is " + lengthOfRectangle +"                            *");
        System.out.println(" * Width of Rectangle is " + widthOfRectangle +"                             *");
        System.out.println(" * Perimeter of Rectangle is " + perimeterOfRectangle + "                         *");
        System.out.println(" * Area of Rectangle is " + areaOfRectangle +"                             *");
        System.out.println(" **********************************************************");
        System.out.println();
        System.out.println();
        System.exit(0); // End the program
    }//End of the main method
}//End of the class Rectangle3



