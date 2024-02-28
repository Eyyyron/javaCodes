/**
 * Name: Aguilar, Aaron Kyle M.
 * Programming Date: September 12, 2022
 * Activity Name and Number: Prelim Exercise Number 8
 -------------------------------------------------------------------
 Problem: Write a program for determining the roots of a quadratic equation. A quadratic equation
 has the form ax2 + bx + c = 0. The numerical coefficients a, b and c should be entered at
 run time. The literal coefficient is assumed to be x (i.e. There is no need to read the
 literal coefficient).

 Analysis:
 Input: Coefficients a, b, and c

 Processes:
 1. Read the Coefficients
 2. Compute the Roots
 3. Show the Roots
 4. End the process

 Output: First Root and Second Root

 Algorithm
 1. Let a represent the coefficient of x squared
 2. Let b represent the coefficient of x
 3. Let c represent in constant
 4. Let root1 represent the first root
 5. Let root2 represent the second root
 6. Show an introduction of the application/program
 7. Read the value of a
 8. Read the value of b
 9. Read the value of c
 10. Compute root1: root1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a)
 11. Compute root2: root2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a)
 12. Display the roots.
 13. End the program
 -------------------------------------------------------------------
 */

package firstYear.prelims;
import java.lang.*;
import java.util.Scanner;

public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);  // Make an object of Scanner that represents the keyboard

        System.out.println("This program determines the roots of a quadratic equation of the form ax^2 +bx +c = 0.");
        System.out.println("");

        System.out.print("Enter the coefficient of x^2 (a): "); //Enter the value of coefficient a
        double a = Double.parseDouble(keyboard.nextLine());

        System.out.print("Enter the coefficient of x (b): "); //Enter the value of coefficient b
        double b = Double.parseDouble(keyboard.nextLine());

        System.out.print("Enter the constant (c): "); //Enter the value of coefficient c
        double c = Double.parseDouble(keyboard.nextLine());
        //Displays a prompt to input coefficient to be solved

        double root1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
        System.out.printf("\nFirst Root = %-20f", root1); //First Root

        double root2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
        System.out.printf("\nSecond Root = %-20f", root2); //Second Root
        System.out.println("");
        System.out.println("");

        System.out.printf("The roots of " + a + " x^2 " + " + " + b + " x " + " + " + c + " are " + root1 + " and " + root2);

        System.exit(0); //End the program

    }//End of the main method
}//End of the class QuadraticSolver



