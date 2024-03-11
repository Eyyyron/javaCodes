/**
 * Name: Aguilar, Aaron Kyle M.
 * Programming Date: September 12, 2022
 * Activity Name and Number: Prelim Exercise Number 9
 -------------------------------------------------------------------
 Problem: Write a program that will compute the average grade of a student for a semester.

 Analysis:

 Input: 10 Pairs of Grades and Units

 Process:
 1. Read the Grades and Units
 2. Compute the Sum of the Products of Grades and Units
 3. Compute the Total of the Units
 4. Compute the Average : (sum of products of grades and units)/total_units
 5. Show the Average
 6. Give an Appropriate message
 7. End the process

 Output: Average and Message

 Algorithm:
 1. Let grade represent a grade for a subject
 2. Let units represent number of units for a subject
 3. Let totalGrade = 0 where totalGrade represents the sum of the products of grades and corresponding units
 4. Let totalUnits = 0 where totalUnits represents the total number of units
 5. Let average represent the average grade of the student
 6. Read the first grade
 7. Read the number of units for the first grade
 8. Add the product of first grade and the corresponding units to totalGrade
 9. Add the units for the first grade to totalUnits
 10. Repeat steps 6, 7, 8 and 9 for the 2nd to the 10th grade
 11. Compute the average where average = totalGrades/totalUnits
 12. Display the average
 13. If (average >= 85) print "Congratulations! You belong to the dean's list."
 14. If (average < 85) print "Sorry! You did not make it to the dean's list. Do better next term."\
 15. End the program
 -------------------------------------------------------------------
 */

package FirstYearFirstTermAndSecondTerm.prelims;
import java.lang.*;
import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        int grade = 0; //variable declaration
        int units = 0;  //variable declaration
        int totalGrade = 0; //variable declaration
        int totalUnits = 0; //variable declaration
        double average = 0.0;  //variable declaration

        System.out.print("Enter the grade of the student for the 1st subject: ");
        grade = Integer.parseInt(kbd.nextLine());
        //Read the first grade

        System.out.print("Enter the number of units for the 1st subject: ");
        units = Integer.parseInt(kbd.nextLine());
        //Read the number of units for the first grade

        System.out.println();

        totalGrade = totalGrade + grade * units; // OR totalGrade += grade* units;

        totalUnits = totalUnits + units;

        //--------------------------------------------------------------------

        System.out.print("Enter the grade of the student for the 2nd subject: ");
        grade = Integer.parseInt(kbd.nextLine());
        //Read the second grade

        System.out.print("Enter the number of units for the 2nd subject: ");
        units = Integer.parseInt(kbd.nextLine());
        //Read the number of units for the second grade

        System.out.println();

        totalGrade = totalGrade + grade * units; // totalGrade += grade* units;

        totalUnits = totalUnits + units;

        //--------------------------------------------------------------------

        System.out.print("Enter the grade of the student for the 3rd subject: ");
        grade = Integer.parseInt(kbd.nextLine());
        //Read the third grade

        System.out.print("Enter the number of units for the 3rd subject: ");
        units = Integer.parseInt(kbd.nextLine());
        //Read the number of units for the third grade

        System.out.println();

        totalGrade = totalGrade + grade * units; // OR totalGrade += grade* units;

        totalUnits = totalUnits + units;

        //--------------------------------------------------------------------

        System.out.print("Enter the grade of the student for the 4th subject: ");
        grade = Integer.parseInt(kbd.nextLine());
        //Read the fourth grade

        System.out.print("Enter the number of units for the 4th subject: ");
        units = Integer.parseInt(kbd.nextLine());
        //Read the number of units for the fourth grade

        System.out.println();

        totalGrade = totalGrade + grade * units; // OR totalGrade += grade* units;

        totalUnits = totalUnits + units;

        //--------------------------------------------------------------------

        System.out.print("Enter the grade of the student for the 5th subject: ");
        grade = Integer.parseInt(kbd.nextLine());
        //Read the fifth grade

        System.out.print("Enter the number of units for the 5th subject: ");
        units = Integer.parseInt(kbd.nextLine());
        //Read the number of units for the fifth grade

        System.out.println();

        totalGrade = totalGrade + grade * units; // OR totalGrade += grade* units;

        totalUnits = totalUnits + units;

        //--------------------------------------------------------------------

        System.out.print("Enter the grade of the student for the 6th subject: ");
        grade = Integer.parseInt(kbd.nextLine());
        //Read the sixth grade

        System.out.print("Enter the number of units for the 6th subject: ");
        units = Integer.parseInt(kbd.nextLine());
        //Read the number of units for the sixth grade

        System.out.println();

        totalGrade = totalGrade + grade * units; // OR totalGrade += grade* units;

        totalUnits = totalUnits + units;

        //--------------------------------------------------------------------

        System.out.print("Enter the grade of the student for the 7th subject: ");
        grade = Integer.parseInt(kbd.nextLine());
        //Read the seventh grade

        System.out.print("Enter the number of units for the 7th subject: ");
        units = Integer.parseInt(kbd.nextLine());
        //Read the number of units for the seventh grade

        System.out.println();

        totalGrade = totalGrade + grade * units; // OR totalGrade += grade* units;

        totalUnits = totalUnits + units;

        //--------------------------------------------------------------------

        System.out.print("Enter the grade of the student for the 8th subject: ");
        grade = Integer.parseInt(kbd.nextLine());
        //Read the eighth grade

        System.out.print("Enter the number of units for the 8th subject: ");
        units = Integer.parseInt(kbd.nextLine());
        //Read the number of units for the eighth grade

        System.out.println();

        totalGrade = totalGrade + grade * units; // OR totalGrade += grade* units;

        totalUnits = totalUnits + units;

        //--------------------------------------------------------------------

        System.out.print("Enter the grade of the student for the 9th subject: ");
        grade = Integer.parseInt(kbd.nextLine());
        //Read the ninth grade

        System.out.print("Enter the number of units for the 9th subject: ");
        units = Integer.parseInt(kbd.nextLine());
        //Read the number of units for the ninth grade

        System.out.println();

        totalGrade = totalGrade + grade * units; // OR totalGrade += grade* units;

        totalUnits = totalUnits + units;

        //--------------------------------------------------------------------

        System.out.print("Enter the grade of the student for the 10th subject: ");
        grade = Integer.parseInt(kbd.nextLine());
        //Read the tenth grade

        System.out.print("Enter the number of units for the 10th subject: ");
        units = Integer.parseInt(kbd.nextLine());
        //Read the number of units for the tenth grade

        System.out.println();

        totalGrade = totalGrade + grade * units; // OR totalGrade += grade* units;

        totalUnits = totalUnits + units;


        average = totalGrade / totalUnits;


        System.out.println("Your Average Grade = " + average +"  ");

        if(average >= 85){
            System.out.print("Congratulations! You belong to the dean's list.");
        }   //P

        if(average < 85){
            System.out.print("Sorry! You did not make it to the dean's list. Do better next term.");
        }

        System.out.println();

        System.exit(0); //End the Program

    }   //End of the main Method
}   //End of the class GradeAverage



