/**
 * Name: Aguilar, Aaron Kyle M.
 * Programming Date: August 31, 2022
 * Activity Name and Number: Prelim Exercise Number 3
 -------------------------------------------------------------------
 Problem: Write a program that will show the hypotenuse of a right triangle with a given base and height.

 Analysis:
 Input: base and height of the right triangle (baseOfTheRightTriangle) (heightOfTheRightTriangle)

 Processes:
 1. Compute the hypotenuse of the right triangle (hypotenuseOfTheRightTriangle)
 2. Display the data associated with the right triangle
 3. End the process

 Output: hypotenuse (hypotenuseOfTheRightTriangle)

 Algorithm:
 1. Assign the hypotenuse of the right triangle (hypotenuseOfTheRightTriangle)
 2. Compute the hypotenuse: hypotenuse = square root of (base^2 + height^2)
 3. Show the given base and height of the right triangle (baseOfTheRightTriangle) (heightOfTheRightTriangle)
 4. Show the computed hypotenuse of the right triangle with a given base and height (hypotenuseOfTheRightTriangle)
 5. End the program
 */

package firstYear.prelims;
import java.lang.*;

public class RightTriangle2 {
    public static void main(String[] args) {

        int baseOfRightTriangle;
        int heightOfRightTriangle;
        double hypotenuseOfRightTriangle;

        baseOfRightTriangle=10;  //Assigns 10 as the given base of the right triangle
        heightOfRightTriangle=20;  //Assigns 20 as the given height of the right triangle

        hypotenuseOfRightTriangle = Math.sqrt((Math.pow(baseOfRightTriangle, 2)) + (Math.pow(heightOfRightTriangle, 2)));
        //Computes the hypotenuse of the right triangle with a given base and height

        System.out.println(" ******************************************************************");
        System.out.println(" * Given base of the right triangle = " + baseOfRightTriangle + "                          *");
        System.out.println(" * Given height of the right triangle = " + heightOfRightTriangle + "                        *");
        System.out.println(" * Computed hypotenuse of the right triangle = " + hypotenuseOfRightTriangle + " *");
        System.out.println(" ******************************************************************");

        System.exit(0);//End the program

    }  //End of the main method
}  //End of the class RightTriangle2
