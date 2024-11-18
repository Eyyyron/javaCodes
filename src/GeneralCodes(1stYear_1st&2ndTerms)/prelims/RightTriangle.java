/**
 Name: Aguilar, Aaron Kyle M.
 Date of completion: August 24, 2022
 Class Code and Course Number: 9315, CS112

 Problem: Given the base and height of a Right Triangle, the perimeter is computed as the sum of the base,
 height and hypotenuse. The hypotenuse is the square root of base2 + height2. In addition, the area
 is computed as (1/2) * base * height. Create a program for computing the perimeter and area of a
 Right Triangle. Show the appropriate algorithm through a multiline comment before the class
 declaration.

 Analysis:
 Input: Base of the right triangle, Height of the right triangle, Hypotenuse of the right triangle

 Process:
 1. Assign the value to the base of the right triangle.
 2. Assign the value to the height of the right triangle.
 3. Assign the value to the hypotenuse of the right triangle.
 4. Compute the perimeter of the right triangle.
 5. Compute the area of the right triangle.
 6. Display the results.
 7. End the process.

 Output: Perimeter of the right triangle, Area of the right triangle

 Algorithm:
 1. Let baseOfRightTriangle represent the base of the right triangle.
 2. Let heightOfRightTriangle represent the height of the right triangle.
 3. Let hypotenuseOfRightTriangle represent the hypotenuse of the right triangle.
 4. Let perimeterOfRightTriangle represent the perimeter of the right triangle.
 5. Let areaOfRightTriangle represent the area of the right triangle.
 1. Assign the value to the base of the right triangle.
 2. Assign the value to the height of the right triangle.
 3. Assign the value to the hypotenuse of the right triangle.
 4. Compute the perimeter of the right triangle : perimeter = base+height+hypotenuse.
 5. Compute the area of the right triangle: area = 1/2*base*height.
 6. Show the base of the right triangle.
 7. Show the height of the right triangle.
 8. Show the hypotenuse of the right triangle.
 9. Show the perimeter of the right triangle.
 10. Show the area of the right triangle.
 11. End the program.
 */

package FirstYearFirstTermAndSecondTerm.prelims;
import java.lang.*;

public class RightTriangle {
    public static void main(String[] args) {

        float baseOfRightTriangle = 0;          //Variable declaration
        float heightOfRightTriangle = 0;        //Variable declaration
        float hypotenuseOfRightTriangle = 0;    //Variable declaration
        float perimeterOfRightTriangle = 0;     //Variable declaration
        float areaOfRightTriangle = 0;          //Variable declaration

        baseOfRightTriangle = 10;
        heightOfRightTriangle = 10;
        hypotenuseOfRightTriangle = 10;

        perimeterOfRightTriangle = baseOfRightTriangle+heightOfRightTriangle+hypotenuseOfRightTriangle;
        //A mathematical expression represents a value that is assigned to the variable
        areaOfRightTriangle = (baseOfRightTriangle*heightOfRightTriangle)/2;
        //A mathematical expression represents a value that is assigned to the variable

        System.out.println("");
        System.out.println(" **********************************************************");
        System.out.println(" * Base of Right Triangle is " + baseOfRightTriangle +"                         *");
        System.out.println(" * Height of Right Triangle is " + heightOfRightTriangle +"                       *");
        System.out.println(" * Hypotenuse of Right Triangle is " + hypotenuseOfRightTriangle +"                   *");
        System.out.println(" * Perimeter of Right Triangle is " + perimeterOfRightTriangle + "                    *");
        System.out.println(" * Area of Right Triangle is " + areaOfRightTriangle +"                         *");
        System.out.println(" **********************************************************");

        System.exit(0); //End the program

    } //End of the main method
} //End of the class RightTriangle


