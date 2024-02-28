/**
 * Name: Aguilar, Aaron Kyle M.
 * Programming Date: September 5, 2022
 * Activity Name and Number: Prelim Exercise Number 4
 -------------------------------------------------------------------
 Problem: Write a program that computes and shows the perimeter and the area of a right triangle.
 Let the base, height, and hypotenuse be entered through the keyboard at program runtime.

 Analysis:
 Input: Base of a Triangle, Height of a Triangle

 Processes:
 1. Assign the Base of the Right Triangle
 2. Assign the Height of the Right Triangle
 3. Compute the Hypotenuse of the Right Triangle
 4. Compute the Perimeter of the Right Triangle
 5. Compute the Area of the Right Triangle
 4. Display the Results
 5. End the Process

 Output: Perimeter, Area, and Hypotenuse of a Right Triangle

 Algorithm:
 1. Assign the Base of the Right Triangle
 2. Assign the Height of the Right Triangle
 3. Assign the Hypotenuse of the Right Triangle
 4. Compute the Perimeter : perimeter = base+height+hypotenuse
 5. Compute the Area: area = 1/2*base*height
 6. Compute the Hypotenuse: hypotenuse = square root of (base^2)+(height^2)
 6. Show the Base of the Right Triangle
 7. Show the Height of the Right Triangle
 8. Show the Hypotenuse of the Right Triangle
 9. Show the Perimeter of the Right Triangle
 10. Show the Area of the Right Triangle
 11. End the program
 -------------------------------------------------------------------
 */

package firstYear.prelims;
import java.lang.*;
import java.util.Scanner;

public class RightTriangle3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);  // Make an object of Scanner that represents the keyboard

        float baseOfRightTriangle;  // variable declaration
        float heightOfRightTriangle;    // variable declaration
        double hypotenuseOfRightTriangle = 0;    // variable declaration
        double perimeterOfRightTriangle; // variable declaration
        float areaOfRightTriangle;  // variable declaration
        // Assignment statement that stores a value to a variable.

        System.out.print("Please enter the base of the right triangle: "); // Read the base. Print a prompt message
        baseOfRightTriangle = Float.parseFloat(keyboard.nextLine());    // Assigns an integer entered through the keyboard to base

        System.out.print("Please enter the height of the right triangle: ");   // Read the height. Print a prompt message
        heightOfRightTriangle = Float.parseFloat(keyboard.nextLine());  // Assigns an integer entered through the keyboard to height


        perimeterOfRightTriangle = baseOfRightTriangle+heightOfRightTriangle+hypotenuseOfRightTriangle;
        // A mathematical expression represents a value that is assigned to the variable
        areaOfRightTriangle = (baseOfRightTriangle*heightOfRightTriangle)/2;
        // A mathematical expression represents a value that may be assigned to a variable
        hypotenuseOfRightTriangle = Math.sqrt((Math.pow(baseOfRightTriangle, 2)) + (Math.pow(heightOfRightTriangle, 2)));
        //Computes the hypotenuse of the right triangle with a given base and height

// Show some outputs on the screen
        System.out.println();
        System.out.println();
        System.out.println(" **********************************************************");
        System.out.println(" * Base of Right Triangle is " + baseOfRightTriangle +"                         *");
        System.out.println(" * Height of Right Triangle is " + heightOfRightTriangle +"                       *");
        System.out.println(" * Hypotenuse of Right Triangle is " + hypotenuseOfRightTriangle +"     *");
        System.out.println(" * Perimeter of Right Triangle is " + perimeterOfRightTriangle + "                    *");
        System.out.println(" * Area of Right Triangle is " + areaOfRightTriangle +"                         *");
        System.out.println(" **********************************************************");
        System.out.println();
        System.out.println();
        System.exit(0); // End the program
    }//End of the main method
}//End of the class RightTriangle3



