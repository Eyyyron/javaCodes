/**
 Name: Aguilar, Aaron Kyle M.
 Date: October 31, 2022
 Activity Name: MidtermExercise5

 Problem: Test the program given below with different possible input values. Note that the program requires
 the user to enter 10 pairs of grades and number of units. Note also that the program allows the user
 to enter invalid values. Note further that the computation process involved is repetitive and that
 the computation process can be handled by a loop construct.

 Write another version of the program so that the following specifications are satisfied:
 • The number of pairs of grades and units is an input value at run time. Hence, the
 program may be used to compute the average of 5 grades, 8 grades, 10 grades, etc.
 • There are validation processes for the input values. Grades must be integers from 65 to
 99. The number of units must be at least 1 but not more than 12. If an input value is
 invalid, the user should be given a directive to enter another value and that processing
 will continue after the user enters a valid value.

 • The repetitive computation process is handled using an iteration construct. (while, do-
 while or for construct)

 • The computer will display a running average after every pair of grades and units is
 entered. The running average is the average of the grades entered so far.

 Analysis:
 Input: Number of Pairs of Grade and Units, Student's Grade, Number of Units

 Process:
 1. Assign the value to the number of pairs of grades and units to be computed
 2. Assign the value to the student's grade for the subject
 3. Assign the value to the number of units for the subject
 4. Compute the total grade
 5. Compute the total units
 6. Compute the average grade
 7. Display the results
 8. End the process

 Output: Total Grade, Total Units, Average Grade

 Algorithm:
 1. Let pairs represent the number of pairs of grade and units
 2. Let grade represent the student's grade
 3. Let units represent the number of units
 4. Let totalGrade represent the total grade
 5. Let totalUnits represent the total units
 6. Let average represent the average grade
 7. Display a prompt to input the number of pairs of grades and units to be computed
 8. Display a prompt to input the student's grade
 9. Display a prompt to input the number of units
 10. Assign the value to the number of pairs of grades and units to be computed
 11. Assign the value to the student's grade
 12. Assign the value to the number of units
 13. Compute the total grade
 14. Compute the total units
 15. Compute the average grade
 16. Display the results
 17. End the program
 */

package FirstYearFirstTermAndSecondTerm.midterms;
import java.lang.*;
import java.util.Scanner;

public class MidtermExercise5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int counter = 1;
        int pairs = 0;
        int grade = 0;
        int units = 0;
        int totalGrade = 0;
        int totalUnits = 0;
        double average = 0.0;

        System.out.print("Enter the number of pairs of grades and units to be computed: ");
        pairs = Integer.parseInt(keyboard.nextLine());

        for (; counter <= pairs; counter++) {

            System.out.print("Enter the student's grade for the subject " + counter + ": ");
            grade = Integer.parseInt(keyboard.nextLine());
            while (grade > 99 || grade < 65) {
                System.out.print("The grade value must be between 65 and 99. Please enter a valid value: ");
                grade = Integer.parseInt(keyboard.nextLine());
            }

            System.out.print("Enter the number of units for the subject " + counter + ": ");
            units = Integer.parseInt(keyboard.nextLine());
            while (units > 12 || units < 1) {
                System.out.print("The number of units must be at least 1 but not more than 12. " +
                        "Please enter a valid number: ");
                units = Integer.parseInt(keyboard.nextLine());
            }
            totalGrade += grade * units;
            totalUnits += units;

        }

        average = (double) totalGrade / totalUnits;

        System.out.println("\nTotal Grade = " + totalGrade + "");
        System.out.println("Total Units = " + totalUnits + "");
        System.out.printf("%s%.2f%n", "Average Grade = ", average);

        System.exit(0);
    }//end of main method
}//end of class


