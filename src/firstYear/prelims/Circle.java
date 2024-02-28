/**
 * Name: Aguilar, Aaron Kyle M.
 * Programming Date: August 24, 2022
 * Activity Name and Number: Prelim Exercise Number 2
 -------------------------------------------------------------------
 Problem: Create a Program

 Analysis:
 Input: Radius of a Circle (radius)

 Process:
 1. Compute the Circumference of the Circle
 2. Compute the Area of the Circle
 3. Display the Results
 4. End the Process

 Output: Circumference and Area of a Circle

 Algorithm:
 1. Assign the Radius of the Circle
 2. Compute the Circumference : circumference = 2*(3.1416)*radius
 3. Compute the Area: area = PI*radius*radius
 4. Show the Radius of the Circle
 5. Show the Circumference of the Circle
 6. Show the Area of the Circle
 7. End the program
 ------------------------------------------------------------------
 */

package firstYear.prelims;
import java.lang.*;

public class Circle {
    public static void main(String[] args) {

        /* Every variable must be declared with a data type with reference to the kind of
value that is to be assigned to it.
*/
        int radius;
        double circumference;
        double areaOfCircle;
        // Assignment statement that stores a value to a variable.
        radius = 10; //Assigns the integer value 10 to radius.
        // A mathematical expression represents a value that may be assigned to a variable
        circumference = 2 * 3.1416 * radius;
        // Instead of typing 3.1.416, you may type Math.PI
        areaOfCircle = 3.1416 * radius * radius;
        // Show some outputs on the screen
        System.out.println();
        System.out.println();
        System.out.println(" **********************************************************");
        System.out.println(" * Radius of Circle is " + radius +"                                 *");
        System.out.println(" * Circumference of Circle is " + circumference + "                      *");
        System.out.println(" * Area of Circle is " + areaOfCircle +"                               *");
        System.out.println(" **********************************************************");
        System.exit(0);//End the program
    } // End of the main method
} // End of the class Circle



