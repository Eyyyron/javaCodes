/**
 * Name: Aguilar, Aaron Kyle M.
 * Programming Date: September 21, 2022

 Problem: Create a program that prints your name a hundred times.

 Analysis:
 Input: Number

 Process:
 1. Create a do-while-loop statement so that the name would be repeated while it is less than or equal to 100,
 and print the name at the same time.
 2. Display the results.
 3. End the process.

 Output: The name printed a hundred times

 Algorithm:
 1. Assign n as a variable that would be used for the do-while-loop statement.
 2. Create a do-while-loop statement so that the name would be repeated while it is less than or equal to 100.
 3. Print the statement 1.
 4. Create an iteration.
 5. End the program.
 */

package firstYear.prelims;
import java.lang.*;

public class HundredTimesDoWhileLoop {
    public static void main(String[] args) {

        int n = 0; //Variable declaration

        //Do-while-loop
        do {
            System.out.println("Aaron Kyle Aguilar"); //Statement 1
            n++; //Iteration
        } //End of do expression
        while (n <= 100);
        //End of while expression

        System.exit(0);//End the program

    }//End of the main method
}//End of the class HundredTimesDoWhileLoop


