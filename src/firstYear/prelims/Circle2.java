/**
 * Name: Aguilar, Aaron Kyle M.
 * Programming Date: August 31, 2022
 * Activity Name and Number: Prelim Exercise Number 3
 -------------------------------------------------------------------
 Problem:
 Write a program that will show the radius of a circle with a given area.

 Analysis:
 Input: area of the circle (areaOfTheCircle)

 Processes:
 1. Compute the radius of the circle (radiusOfTheCircle)
 2. Display the data associated with the circle
 3. End the process

 Output: radius of the circle (radiusOfTheCircle)

 Algorithm:
 1. Assign the area of the circle (areaOfTheCircle)
 2. Compute the radius: radius = square root of (areaOfTheCircle/PI)
 3. Show the given area of a circle (areaOfTheCircle)
 4. Show the computed radius of the circle with a given area (radiusOfTheCircle)
 5. End the program
 */

package firstYear.prelims;
import java.lang.*;

public class Circle2 {
    public static void main(String[] args) {

        double radiusOfTheCircle;
        double areaOfTheCircle;

        areaOfTheCircle=100; //Assigns 100 as the area of the circle

        radiusOfTheCircle = Math.sqrt(areaOfTheCircle / Math.PI);
        //Computes the radius of the circle with a given area

        System.out.println(" *****************************************************");
        System.out.println(" * Given area of the circle = " + areaOfTheCircle + "                  *");
        System.out.println(" * Computed radius of the circle = " + radiusOfTheCircle + " *");
        System.out.println(" *****************************************************");

        System.exit(0);//End the program

    }  //End of the main method
} //End of class Circle2



