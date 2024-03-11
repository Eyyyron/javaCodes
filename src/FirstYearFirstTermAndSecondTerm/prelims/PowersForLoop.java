/**
 * Name: Aguilar, Aaron Kyle M.
 * Programming Date: September 21, 2022

 Problem: Compute the power of a number given the base and exponent.

 Analysis:
 Input: Base, Exponent, Results

 Process:
 1. Create a do-while-loop statement
 2. Display the results.
 3. End the process.

 Output: The power of a number

 Algorithm:
 1. Let baseNumber represent the base.
 2. Let exponent represent the exponent.
 3. Let value as a variable.
 4. Display a prompt to input the base.
 5. Display a prompt to input the exponent.
 6. Create a for expression.
 7. Create the initialization.
 8. Create the loop condition.
 9. Create the step expression.
 10. Print the statement.
 11. Create an iteration for the base.
 12. Display the results.
 13. End the program.
 */

package FirstYearFirstTermAndSecondTerm.prelims;
import java.lang.*;
import java.util.Scanner;

public class PowersForLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Object of scanner

        double baseNumber = 0;     //Variable declaration
        int exponent = 0;       //Variable declaration

        System.out.print("Enter the Base Number: ");
        baseNumber = scanner.nextInt();
        //Display a prompt to input the base number

        System.out.print("Enter the Exponent: ");
        exponent = scanner.nextInt();
        //Display a prompt to input the exponent


        double value = baseNumber;     //Variable declaration

        //For-loop
        for(int i = 1; i < exponent; i++)
        {
            value = value * baseNumber;
        }//End of for-loop statement

        System.out.println("");

        System.out.println("The value is = " + value);

        System.exit(0);//End the program

    }//End of the main method
}//End of the class PowersForLoop



