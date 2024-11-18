/**
 * Name: Aguilar, Aaron Kyle M.
 * Programming Date: September 5, 2022
 * Activity Name and Number: Prelim Exercise Number 4
 -------------------------------------------------------------------
 Problem: Write a program that computes and shows the area and the circumference of a circle with
 a given radius. Let the radius be entered through the keyboard at program runtime.

 Analysis:
 Input: Radius of a Circle

 Processes:
 1. Assign the Radius of the Circle
 2. Compute the Circumference of the Circle
 3. Compute the Area of the circle
 4. Display Results
 5. End the Process

 Output: Circumference and Area of a Circle

 Algorithm:
 1. Assign the Radius of the Circle
 2. Compute the Circumference: circumference = 2 * PI * radius
 3. Compute the Area: area = PI * radius * radius
 4. Show the Radius of the Circle
 5. Show the Circumference of the Circle
 6. Show the Area of the Circle
 7. End the program
 -------------------------------------------------------------------
 */

package FirstYearFirstTermAndSecondTerm.prelims;
import java.lang.*;
import java.util.Scanner;

public class Circle3 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);  // Make an object of Scanner that represents the keyboard

        int radiusOfCircle;             // variable declaration
        double circumferenceOfCircle;   // variable declaration
        double areaOfCircle;            // variable declaration
        // Assignment statement that stores a value to a variable.

        System.out.print("Please enter the radius of the circle: ");       // Read the radius. Print a prompt message
        radiusOfCircle = Integer.parseInt(keyboard.nextLine());     // Assigns an integer entered through the keyboard to radius

        circumferenceOfCircle = 2 * Math.PI * radiusOfCircle;       // A mathematical expression represents a value that is assigned to the variable
        // Instead of typing 3.1.416, you may type Math.PI

        areaOfCircle = Math.PI * radiusOfCircle * radiusOfCircle;   // A mathematical expression represents a value that is assigned to the variable

        // Show some outputs on the screen
        System.out.println();
        System.out.println();
        System.out.println(" **********************************************************");
        System.out.println(" * Radius of Circle is " + radiusOfCircle +"                                 *");
        System.out.println(" * Circumference of Circle is " + circumferenceOfCircle + "           *");
        System.out.println(" * Area of Circle is " + areaOfCircle +"                    *");
        System.out.println(" **********************************************************");
        System.out.println();
        System.out.println();
        System.exit(0); // End the program
    }//End of the main method
}//End of the class Circle3

