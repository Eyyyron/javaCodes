/**
 * Name: Aguilar, Aaron Kyle M.
 * Programming Date: September 21, 2022

 Problem: Get three exam grades from the user and compute the average of the grades. Output the average
 of the three exams. Together with the average, also include a good remark in the output if the
 average is greater than or equal to 75, otherwise output :-(.

 Analysis:
 Input: Exam grades(1,2, and 3)

 Process:
 1. Assign the value of the first exam.
 2. Assign the value of the second exam.
 3. Assign the value of the third exam.
 4. Compute the total of exam grades.
 5. Compute the average of exam grades.
 6. Display the results.
 7. End the process.

 Output: Total of exam grades, Average of exam grades, Remarks

 Algorithm:
 1. Assign stringToDisplay as a variable for the JOption Pane.
 2. Assign inputString as a variable for the JOption Pane.
 1. Let exam1 represent the first exam grade.
 2. Let exam2 represent the second exam grade.
 3. Let exam3 represent the third exam grade.
 4. Let total represent the total of exam grades.
 5. Let average represent the average of exam grades.
 6. Let remark represent the remark based on the average of exam grades.
 7. Display a prompt to input the first exam grade.
 8. Display a prompt to input the second exam grade.
 9. Display a prompt to input the third exam grade.
 10. Assign the value to the first exam grade.
 11. Assign the value to the second exam grade.
 12. Assign the value to the third exam grade.
 13. Compute total of exam grades.
 14. Compute the average of exam grades.
 15. Create an if/else statement wherein if the average of exam grades >= 75, show a good remark, else, print ":-C".
 16. Display the results.
 17. End the program.
 */

package FirstYearFirstTermAndSecondTerm.prelims;
import java.lang.*;
import javax.swing.*;

public class GradesJOptionPane {
    public static void main(String[] args) {

        String stringToDisplay = "";    //Variable declaration
        String inputString="";          //Variable declaration
        float exam1 = 0;                //Variable declaration
        float exam2 = 0;                //Variable declaration
        float exam3 = 0;                //Variable declaration
        float total = 0;                //Variable declaration
        float average = 0;              //Variable declaration
        String remark = "";             //Variable declaration

        inputString = JOptionPane.showInputDialog("Enter the first exam grade: ");
        exam1 = Float.parseFloat(inputString);
        //Display a prompt to input the first exam grade

        inputString = JOptionPane.showInputDialog("Enter the second exam grade: ");
        exam2 = Float.parseFloat(inputString);
        //Display a prompt to input the first exam grade

        inputString = JOptionPane.showInputDialog("Enter the third exam grade: ");
        exam3 = Float.parseFloat(inputString);
        //Display a prompt to input the first exam grade

        total = exam1 + exam2 + exam3;  //A mathematical expression represents a value that is assigned to the variable
        average = total/3;              //A mathematical expression represents a value that is assigned to the variable

        //If-else statement
        if (average>=75) {
            remark = "You passed! :-)";
        }
        else {
            remark = ":-(";
        }//End of if-else statement

        stringToDisplay = stringToDisplay + "Total of Exams Grades = " + total + "\n";
        stringToDisplay = stringToDisplay + "Average of the Three Exams = " + average + "\n";
        stringToDisplay = stringToDisplay + "Remarks = " + remark + "\n";

        JOptionPane.showMessageDialog(null, stringToDisplay);

        System.exit(0);//End the program

    }//End of the main method

}//End of the class GradesJOptionPane


