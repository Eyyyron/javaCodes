/**
 * Name: Aguilar, Aaron Kyle M.
 * Programming Date: September 21, 2022

 Problem: Compute the power of a number given the base and exponent.

 Analysis:
 Input: Base, Exponent, Results

 Process:
 1. Create a while-loop statement
 2. Display the results.
 3. End the process.

 Output: The power of a number

 Algorithm:
 1. Let baseNumber represent the base.
 2. Let exponent represent the exponent.
 3. Let value as a variable.
 4. Let currentExp as a variable.
 5. Display a prompt to input the base.
 6. Display a prompt to input the exponent.
 7. Assign the value to the base.
 8. Assign the value to the exponent.
 9. Create a while expression
 10. Create an iteration.
 11. Display the results.
 12. End the program.
 */

package FirstYearFirstTermAndSecondTerm.prelims;
import java.lang.*;
import java.util.Scanner;

public class PowersWhileLoop {
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

        double value = baseNumber;      //Variable declaration
        int currentExp = 1;                //Variable declaration

        //While-loop
        while (currentExp < exponent)
        {
            value = value * baseNumber;
            currentExp++;
        }//End of while-loop statement

        System.out.println("");

        System.out.println("The value is = " + value);

        System.exit(0);//End the program

    }//End of the main method
}//End of the class PowersWhileLoop


