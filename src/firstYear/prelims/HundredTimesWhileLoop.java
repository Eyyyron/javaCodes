/**
 * Name: Aguilar, Aaron Kyle M.
 * Programming Date: September 21, 2022

 Problem: Create a program that prints your name a hundred times.

 Analysis:
 Input: Number

 Process:
 1. Create a while-loop statement so that the number the user would input will be looped while it is less than or equal to 100,
 and print the name at the same time.
 2. Display the results.
 3. End the process.

 Output: The name printed a hundred times

 Algorithm:
 1. Assign n as a variable that would be used for the while-loop statement.
 2. Create a while-loop statement so that the number the user would input will be looped while it is less than or equal to 100,
 and print the name at the same time.
 3. Print the statement 1.
 4. Create an iteration.
 5. End the program.
 */

package firstYear.prelims;
import java.lang.*;

public class HundredTimesWhileLoop {
    public static void main(String[] args) {

        int n = 0; //Variable declaration

        //While-loop statement
        while (n <= 100) {
            System.out.println("Aaron Kyle Aguilar");   //Statement 1
            n++; //Iteration
        }//End of while-loop statement

        System.exit(0);//End the program

    }//End of the main method
}//End of the class HundredTimesWhileLoop

