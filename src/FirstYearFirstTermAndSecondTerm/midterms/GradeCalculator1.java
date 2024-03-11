/**
 Name: Aguilar, Aaron Kyle M.
 Date: October 3, 2022
 Activity Name: GradeCalculator1

 Problem:
 Create a program that has a method that is invoked by the main method.
 Create a program that computes and displays the grade that is corresponding
 to a given score based on the following specifications:

 - The grade is the integer value of (rawScore/perfectScore * 50 +50 )
 - The perfectScore is an input by the program user at runtime.
 - The perfectScore should be validated such that a perfectScore that is
 0 or negative should let the program user re-enter a valid perfectScore.
 - The rawScore is an input by the program user at runtime.
 - The rawScore should be validated such that a rawScore that is greater than the
 perfectScore should let the program user re-enter a valid rawScore.
 - In addition, a rawScore that is less than 0 should let the program user
 re-enter a valid rawScore.
 - The program execution will stop only if the user answers no to the question
 Do you want to compute another grade<Yes/No> ?

 Sample Run:
 Enter the perfect score: 0
 The perfect score should be greater than 0. Please enter a valid perfect score

 Enter the perfect score: 100

 Enter a raw score:   101

 The raw score cannot be higher than the perfect score.
 Please enter a valid raw score.

 Enter a raw score: -5

 The raw score cannot be lower than 0.
 Please enter a valid raw score.

 The raw score cannot be higher than the perfect score.
 Please enter a valid raw score. 90

 Grade = 95

 Do you want to compute another grade<Yes/No>: Yes

 Enter the perfect score: 10
 Enter a raw score:   5

 Grade = 95

 Do you want to compute another grade<Yes/No>: No

 Analysis:
 Input: Perfect Score and Raw Score

 Process:
 1. Assign the value to the rawScore
 2. Assign the value to the perfectScore
 3. Assign the value to the grade
 4. Assign the value to the computeAgain
 5. Assign the value to the compute
 6. Compute the grade
 7. Display the result
 8. End the process

 Output: Grade

 Algorithm:
 1. Construct keyboard as an object of the Scanner class
 2. Declare and initialize rawScore and perfectScore
 3. Declare and initialize grade
 4. Declare and initialize computeAgain to true.
 5. while computeAgain = true;
 5.1 do {
 Print a prompt message for the user to enter a perfect score
 Read the value of perfectScore
 if (perfectScore <= 0 )
 Print a message informing the user that an invalid perfect score has been entered
 } while (perfectScore <= 0)
 5.2  do {
 Print a prompt message for the user to enter a raw score
 Read the value of rawScore
 if (rawScore < 0)
 print a message informing the user that the raw score must not be lower than 0
 if (rawScore > perfectScore)
 print a message informing the user that the raw score must not be greater than the perfect score
 } while (rawScore <0 or rawScore > perfectScore)
 5.3 Compute the grade by using the computeGrade method
 5.4. Print the computed grade
 5.5. Print a prompt message "Do you want to compute again<Yes/No>?"
 5.6. Read the response to the prompt message "Do you want to compute again<Yes/No>?" and assign to computeAgain
 5.7. Repeat from  step 5
 6. Close the program
 */

package FirstYearFirstTermAndSecondTerm.midterms;
import java.util.Scanner;
import java.lang.*;

public class GradeCalculator1 {
    public static int GradeCalculate(int rawScore, int perfectScore, int grade ){
        grade = (int) ((double) rawScore / (double)perfectScore * 50 + 50);
        return grade;
    } // end of GradeCalculate method

    public static void main(String[] args){

        int rawScore = 0;                           // variable initialization
        int perfectScore = 0;                       // variable initialization
        int grade = 50;                             // variable initialization
        boolean computeAgain = true;                // variable initialization
        String compute = "";                        // variable initialization

        Scanner keyboard = new Scanner(System.in);    // creates a scanner object

        System.out.println("This program will let you compute a grade corresponding to a raw score");
        System.out.println("based on the formula grade = rawScore/perfectScore*50 + 50.");
        System.out.println("You will be asked to enter the perfect score and the raw score.");

        while(computeAgain){

            do{
                System.out.print("\nEnter the perfect score: ");
                perfectScore = Integer.parseInt(keyboard.nextLine());
                // Prompts a message for user to respond to

                if (perfectScore <= 0)
                    System.out.println("The perfect score should be greater than 0. Please enter a valid perfect score.");
            }while(perfectScore <= 0); // end of do while loop

            do{
                System.out.print("Enter a raw score: ");
                rawScore = Integer.parseInt(keyboard.nextLine());
                if (rawScore < 0){
                    System.out.println("The raw score cannot be lower than 0. Please enter a valid raw score.");
                }else if(rawScore > perfectScore){
                    System.out.println("The raw score cannot be higher than the perfect score. Please enter a valid raw score.");
                }
            }while(rawScore < 0 || rawScore > perfectScore);   // end of do while loop

            System.out.println("");
            System.out.println(GradeCalculate(rawScore, perfectScore, grade));

            boolean x = false;
            while(!x){
                System.out.print("\nDo you want to compute another grade <Yes/No>:");
                compute = keyboard.nextLine();
                switch(compute){
                    case "yes", "Yes":
                        computeAgain = true;
                        x = true;
                        break;
                    case "no", "No":
                        computeAgain = false;
                        x = true;
                        break;
                    default:
                        System.out.println("\nPlease answer Yes or No \n\n\n\n");
                        x = false;

                }  // end of switch case

            }  // end of while Loop

        }  // end of while loop

        System.exit(0); //end the program

    } // end of main method

}   // end of class

