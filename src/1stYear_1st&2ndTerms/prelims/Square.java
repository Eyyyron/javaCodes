/**
 * Name: Aguilar, Aaron Kyle M.
 * Programming Date: August 24, 2022
 * Activity Name and Number: Prelim Exercise Number 2
 -------------------------------------------------------------------
 Problem: Create a Program that Computes and Shows the Perimeter and the Area of a Square with a Given Side

 Analysis:
 Input: Side of a Square

 Output: Perimeter and Area of a Square

 Processes:
 1. Compute the Side of a Square
 2. Compute the Perimeter of the Square
 3. Compute the Area of the Square
 4. Display the Results
 5. End the Process

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

package FirstYearFirstTermAndSecondTerm.prelims;
import java.lang.*;


public class Square {
    public static void main(String[] args) {

         /* Every variable must be declared with a data type with reference to the kind of
value that is to be assigned to it.
*/
        float sideOfSquare;
        float perimeterOfSquare;
        float areaOfSquare;
        // Assignment statement that stores a value to a variable.

        sideOfSquare = 10;
        perimeterOfSquare = 4*sideOfSquare;
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

        System.exit(0);//End the program
    }//End of the main method
}//End of the class Square



