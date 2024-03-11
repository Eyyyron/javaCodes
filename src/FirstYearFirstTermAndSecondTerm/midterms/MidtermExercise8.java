/**
 Name: Aguilar, Aaron Kyle M.
 Date: October 31, 2022
 Activity Name: MidtermExercise8

 Problem:
 Test the program given below with different possible input values. Note that the program allows
 the computer to determine and show the roots of a quadratic equation after the computer is given
 the numerical coefficients of the quadratic equation. Note further that if the roots of the quadratic
 equation are imaginary, the program gives a String representation of the imaginary roots. The
 given program is written such that aside from the main method, other methods are included.
 However, you may not mind the other methods at this point. Focus on seeing and
 understanding sample runs of the program.

 Rewrite the following program such that the program has only the main method.

 Analysis:
 Input: Coefficient A, Coefficient B, Coefficient C

 Process:
 1. Assign the value to the coefficient a
 2. Assign the value to the coefficient b
 3. Assign the value to the coefficient c
 4. Compute the roots / imaginary roots of the quadratic equation
 5. Display the result
 6. End the process

 Output: Roots of Quadratic Equation / Imaginary Roots of Quadratic Equation

 Algorithm:
 1. Let a represent the coefficient a
 2. Let b represent the coefficient b
 3. Let c represent the coefficient c
 4. Let root1 represent the first root
 5. Let root2 represent the second root
 6. Let r1 represent the first imaginary root
 7. Let r2 represent the second imaginary root
 8. Display a prompt to input the coefficient a
 9. Display a prompt to input the coefficient b
 10. Display a prompt to input the coefficient c
 11. Assign the value to the coefficient a
 12. Assign the value to the coefficient b
 13. Assign the value to the coefficient c
 14. Compute the roots / imaginary roots of the quadratic equation
 15. Display the result
 16. End the program
 */

package FirstYearFirstTermAndSecondTerm.midterms;
import java.lang.*;
import java.util.Scanner;

public class MidtermExercise8 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        double a, b, c;
        double root1 = 0.0;
        double root2 = 0.0;
        String r1 = "";
        String r2 = "";

        System.out.println("This program helps you solve for the roots of a quadratic equation.");
        System.out.println("You should enter the coefficients of the quadratic equation.");

        System.out.print("Enter coefficient a: ");
        a = Double.parseDouble(kbd.nextLine());
        System.out.print("Enter coefficient b: ");
        b = Double.parseDouble(kbd.nextLine());
        System.out.print("Enter coefficient c: ");
        c = Double.parseDouble(kbd.nextLine());

        if (b * b - 4 * a * c >= 0) {
            double root = 0.0;
            root1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            root2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            System.out.println("The roots are: " + root1 + " and " + root2 + ".");
        }
        else {
            r1 += -b / (2 * a) + " + (square root of (" + (-1) * (b * b - 4 * a * c) + ") * i) / " + (2 * a);
            r2 += -b / (2 * a) + " - (square root of (" + (-1) * (b * b - 4 * a * c) + ") * i) / " + (2 * a);
            System.out.println("The imaginary roots are: " + r1 + " and " + r2 + ".");
        }
    }  // end of main method
}  // end of class


