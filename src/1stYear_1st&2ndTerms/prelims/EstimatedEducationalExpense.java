/**
 * Name: Aguilar, Aaron Kyle M.
 * Programming Date: September 19, 2022
 * Activity Name and Number: Prelim Exercise Number 10
 -------------------------------------------------------------------
 Problem: Write a program that will let the computer ask the user to enter the estimated amount
 needed by a student for Tuition Fees for one semester, estimated amount needed by a
 fulltime student for Basic Board and Lodging for one month, and the estimated amount
 needed by a fulltime student for his/her Living Allowance for one month.

 Analysis:
 Input:
 1. Estimated amount needed by a student for Tuition Fees for one semester.
 2. Estimated amount needed by a fulltime student for basic board and lodging for one month.
 3. Estimated amount needed by a fulltime student for his/her living allowance for one month.

 Process:
 1. Assign the value to the estimated amount needed by a student for Tuition Fees for one semester.
 2. Assign the value to the estimated amount needed by a fulltime student for basic board and lodging for one month.
 3. Assign the value to the estimated amount needed by a fulltime student for his/her living allowance for one month.
 4. Compute the amount needed by a fulltime student for one semester.
 5. Compute the amount needed by a fulltime student for one short term.
 6. Compute the amount needed by a fulltime student for the whole duration of his/her studies in
 the university assuming that the student needs to enroll for 8 semesters and 3 short terms.
 7. Display the results.
 8. End the process.

 Output:
 1. The amount needed by a fulltime student for one semester.
 2. The amount needed by a fulltime student for one short term.
 3. The amount needed by a fulltime student for the whole duration of his/her studies in
 the university assuming that the student needs to enroll for 8 semesters and 3 short
 terms.

 Algorithm:
 1. Let tuitionFee represent the estimated tuition fee of a fulltime student for one semester.
 2. Let boardAndLodging represent the estimated cost for one month of basic board and lodging.
 3. Let livingAllowance represent the estimated living allowance needed by a fulltime student for one month.
 4. Let semesterExpense represent the estimated amount needed by a fulltime student for one semester.
 5. Let summerExpense represent the estimated amount needed by a fulltime student for one short term.
 6. Let totalEstimatedExpense represent the amount needed by a fulltime student in order to finish his/her course for 8 semesters and 3 short terms.
 7. Display a prompt to input the estimated amount needed by a student for Tuition Fees for one semester.
 8. Display a prompt to input the estimated amount needed by a fulltime student for basic board and lodging for one month.
 9. Display a prompt to input the estimated amount needed by a fulltime student for his/her living allowance for one month.
 10. Read the value for tuitionFee.
 11. Read the value for boardAndLodging.
 12. Read the value for livingAllowance.
 13. Compute the value for semesterExpense.
 14. Compute the value for summerExpense.
 15. Compute the value for totalEstimatedExpense.
 16. Display the values.
 17. End the program.
 -------------------------------------------------------------------
 */

package FirstYearFirstTermAndSecondTerm.prelims;
import java.lang.*;
import java.util.Scanner;

public class EstimatedEducationalExpense {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        //Object of scanner that represents the keyboard

        double tuitionFee = 0;              //Variable declaration
        double boardAndLodging = 0;         //Variable declaration
        double livingAllowance = 0;         //Variable declaration
        double semesterExpense = 0;         //Variable declaration
        double summerExpense = 0;           //Variable declaration
        double totalEstimatedExpense = 0;   //Variable declaration

        System.out.print("How much is your estimated tuition fee for one semester?");
        tuitionFee = Double.parseDouble(keyboard.nextLine());
        //read the estimated tuition fee for one semester
        System.out.print("Approximately, how much does your board and lodging for one-month cost?");
        boardAndLodging = Double.parseDouble(keyboard.nextLine());
        //read the estimated board and lodging cost for one month
        System.out.print("How much is your estimated living allowance for one-month?");
        livingAllowance = Double.parseDouble(keyboard.nextLine());
        //read the estimated living allowance for one month

        System.out.println("--------------------------------------------------------------------------------");

        System.out.printf("Estimated Tuition Fee per Semester: %.2f%n", tuitionFee);
        //display the estimated tuition fee for one semester
        System.out.printf("Estimated Board and Lodging cost per Semester: %.2f%n", (boardAndLodging * 5));
        //display the estimated board and lodging cost for one month
        System.out.printf("Estimated living Allowance per Semester: %.2f%n", (livingAllowance * 5));
        //display the estimated living allowance for one month

        System.out.println("--------------------------------------------------------------------------------");

        semesterExpense = tuitionFee + (boardAndLodging * 5) + (livingAllowance * 5);
        //compute the estimated amount needed by a student for one semester
        System.out.printf("Estimated Amount Needed by a Student for one Semester: %.2f%n", semesterExpense);
        //display the results

        summerExpense = 0.35 * semesterExpense;
        //compute the estimated amount needed by a student for one short term
        System.out.printf("Estimated Amount Needed by a Student for one Short-term: %.2f%n", summerExpense);
        //display the results

        totalEstimatedExpense = (semesterExpense * 8) + (summerExpense * 3);
        //compute the estimated amount needed by a student to graduate
        System.out.printf("Estimated Amount Needed by a Student to graduate: %.2f%n", totalEstimatedExpense);
        //display the results


        System.exit(0); //End the program


    } //End of the main method
} //End of the class EstimatedEducationalExpense



