/**
 Name: Aguilar, Aaron Kyle M.
 Date: November 1, 2022
 Activity Name: ModularizedQuadraticSolverG2

 Problem: Study, debug if needed, test, trace and try to improve the following program. (Be able to
 explain how the JOptionPane class is used)

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
 4. Let root represent the root
 5. Let root1 represent the first root / first imaginary root in the methods
 6. Let root2 represent the second root / second imaginary root in the methods
 7. Display a prompt to input the coefficient a
 8. Display a prompt to input the coefficient b
 9. Display a prompt to input the coefficient c
 10. Assign the value to the coefficient a
 11. Assign the value to the coefficient b
 12. Assign the value to the coefficient c
 13. Compute the roots / imaginary roots of the quadratic equation
 14. Display the result using JOption
 15. End the program
 */

package FirstYearFirstTermAndSecondTerm.midterms;
import javax.swing.JOptionPane;
import java.lang.*;

public class ModularizedQuadraticSolverG2 {
    public static void main(String[] args) {
        double a, b, c, root1, root2;
        String input = "";

        showIntroduction(); // invoke showIntroduction method method

        input = JOptionPane.showInputDialog("Please enter the coefficient of x^2, (a in ax^2+bx+c=0): ");
        a = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Please enter the coefficient of x, (b in " + "ax^2+bx+c=0): ");
        b = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Please enter the constant, (c in ax^2+bx+c=0): ");
        c = Double.parseDouble(input);

        if (b * b - 4 * a * c >= 0)
            determineAndShowTheRealRoots(a, b, c);
        else
            determineAndShowTheImaginaryRoots(a, b, c);

        System.exit(0);
    }  // end of main method
    public static void showIntroduction() {
        JOptionPane.showMessageDialog(null, "This program helps you solve for the roots of a " +
                "quadratic equation. \nThe quadratic equation should be written in the form ax^2 + bx+ c = 0 \nYou " +
                "will be asked to enter the coefficients of the quadratic equation.");
        return;
    }  // end of showIntroduction method
    public static double computeFirstRoot(double a, double b, double c) {
        double root = 0.0; // local variable with initial value
        root = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        return root;
    }  // end of computeFirstRoot method
    public static double computeSecondRoot(double a, double b, double c) {
        double root = 0.0; // local variable with initial value
        root = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        return root;
    }  // end of computeSecondRoot method
    public static String representFirstImaginaryRoot(double a, double b, double c) {
        String root = "";
        root += -b / (2 * a) + " + (square root of (" + (-1) * (b * b - 4 * a * c) + ") * i) / " + (2 * a);
        return root;
    }  // end of representFirstImaginaryRoot method
    public static String representSecondImaginaryRoot(double a, double b, double c) {
        String root = "";
        root += -b / (2 * a) + " - (square root of (" + (-1) * (b * b - 4 * a * c) + ") * i) / " + (2 * a);
        return root;
    }  // end of representSecondImaginaryRoot method
    public static void determineAndShowTheRealRoots(double a, double b, double c) {
        double root1 = computeFirstRoot(a, b, c); // invoke computeFirstRoot method
        double root2 = computeSecondRoot(a, b, c); // invoke computeSecondRoot method
        JOptionPane.showMessageDialog(null, "The roots of (" + a + ")x^2 + (" + b +
                ")x + (" + c + ") = 0 are " + root1 + " and " + root2 + ".");
        return;
    }  // end of determineAndShowTheRealRoots method
    public static void determineAndShowTheImaginaryRoots(double a, double b, double c) {
        // invoke representFirstImaginaryRoot method
        String root1 = representFirstImaginaryRoot(a, b, c);

        // invoke method representSecondImaginaryRoot method
        String root2 = representSecondImaginaryRoot(a, b, c);

        JOptionPane.showMessageDialog(null, "The roots of (" + a + ")x^2 + (" + b +
                ")x + (" + c + ") = 0 are " + root1 + " and " + root2 + ".");
        return;
    }  // end of determineAndShowTheImaginaryRoots
}  // end of class

