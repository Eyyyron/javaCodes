/**
 * Name: Aguilar, Aaron Kyle M.
 * Programming Date: August 24, 2022
 * Activity Name and Number: Prelim Exercise Number 2
 -------------------------------------------------------------------
 Problem: Create a Program that Computes and Shows the Perimeter and the Area of a Rectangle with a Given Length and Width

 Analysis:
 Input: Length of the Rectangle, Width of the Rectangle

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

package FirstYearFirstTermAndSecondTerm.prelims;
import java.lang.*;

public class Rectangle {
    public static void main(String[] args) {

        /* Every variable must be declared with a data type with reference to the kind of
value that is to be assigned to it.
*/
        float lengthOfRectangle;
        float widthOfRectangle;
        float perimeterOfRectangle;
        float areaOfRectangle;
        // Assignment statement that stores a value to a variable.

        lengthOfRectangle = 10;
        widthOfRectangle = 10;
        perimeterOfRectangle = 2*lengthOfRectangle + 2*widthOfRectangle;
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
        System.exit(0);//End the program
    }//End of the main method
}//End of the class Rectangle



