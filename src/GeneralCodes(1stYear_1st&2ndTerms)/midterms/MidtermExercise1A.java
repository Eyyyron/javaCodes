/**
 Name: Aguilar, Aaron Kyle M.
 Date: October 10, 2022
 Activity Name: MidtermExercise1A

 Problem:
 Suppose the computerProgramming1.prelim grade for a student is computed as follows:
 Given a student’s Total Quiz Score, the student’s Examination Score, the Perfect Quiz score, and the Perfect
 Examination Score, the Prelim Grade is computed by using the following formulas:
 - Quiz Grade = (Total Quiz Score) / (Perfect Quiz Score) * 50 + 50.
 - Exam Grade = (Examination Score) / (Perfect Examination Score) * 50 + 50.
 - Prelim Grade = (Quiz Grade + Exam Grade)/2 and if the computed Prelim Grade is more than 99, the Prelim
 Grade is set to 99 but if the computed Prelim Grade is less than 65, the Prelim Grade is set to 65.
 - Develop a computer program for the computation of a Prelim Grade based on the above formulas. The program
 will allow the computer to accept a student’s Total Quiz Score, a student’s Examination Score, the Perfect Total
 Quiz Score and the Perfect Examination Score. The computer will then show the corresponding grade. In addition,
 the remark “PASSED” will be given if the grade is at least 75 and the remark “FAILED” will be given if the grade is
 less than 75.

 Sample run1
 Enter the Perfect Quiz Score: 100
 Enter the Perfect Examination Score: 100
 Enter a student’s quiz score: 100
 Enter a student’s examination score: 100
 Grade = 99 Remark: PASSED
 Sample run 2
 Enter the Perfect Quiz Score: 200
 Enter the Perfect Examination Score: 10
 Enter a student’s quiz score: 10
 Enter a student’s examination score: 1
 Grade = 65 Remark: FAILED

 Analysis:
 Inputs: Total Quiz Score, Examination Score, Perfect Quiz Score, Perfect Exam Score

 Processes:
 1. Read the scores
 2. Compute the grade for the quiz
 3. Compute the grade for the exam
 4. Compute the Prelim Grade
 5. Display the grades and a remark

 Outputs: Prelim Grade, Remark

 Algorithm:
 a. Let quizScore be a variable to hold the Total Quiz Score
 b. Let examScore be a variable to hold the Examination Score
 c. Let perfectQuizScore be a variable to hold the Perfect Quiz Score
 d. Let perfectExamScore a variable to hold the Perfect Exam Score
 e. Let quizGrade be a variable to hold the Quiz Grade.
 f. Let examGrade be a variable to hold the Exam Grade
 g. Let prelimGrade be a variable to hold the Prelim Grade
 h. Read the value of perfectQuizScore
 i. Read the value of perfectExamScore
 j. Read the value of quizScore
 k. Read the score for the examScore
 l. quizGrade = quizScore / perfectQuizScore * 50 + 50
 m. examGrade = examScore / perfectExamScore * 50 +50
 n. prelimGrade = (quizGrade + examGrade)/2
 o. If prelimGrade is greater than 99 then set prelimGrade to 99
 p. If prelimGrade is less than 65 then set prelimGrade to 65
 q. If prelimGrade is greater than or equal to 75 then display the grade together with the
 remark “PASSED”.
 r. If prelimGrade is less than 75 then display the grade together with the remark “FAILED”
 */

package FirstYearFirstTermAndSecondTerm.midterms;
import java.lang.*;
import java.util.Scanner;

public class MidtermExercise1A {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int quizScore = 0; // declare an int variable to hold total quiz score
        int examScore = 0; // declare an int variable to hold exam score
        int perfectQuizScore = 0; // declare an int variable to hold perfect total quiz score
        int perfectExamScore = 0; // declare an int variable to hold perfect exam score
        double quizGrade = 0; // 1. declare a double variable to hold quiz grade.
        double examGrade = 0; // 2. declare a double variable to hold examination grade
        double prelimGrade = 0; // 3. declare a double variable to hold the computerProgramming1.prelim grade

/* Accept the perfect total quiz score. The perfect score must be greater than 0. The do while construct
enables the computer to let the user re-enter a perfect score in case the value entered is invalid. */

        do {
            System.out.print("Enter the Perfect Total Quiz Score: ");
            perfectQuizScore = Integer.parseInt(keyboard.nextLine()); // 4
            if (perfectQuizScore <= 0) {
                System.out.println("Invalid value! Value must be greater than 0.");
            }
        } while (perfectQuizScore <= 0);

/* Accept the perfect exam score. The perfect score must be greater than 0. The do while construct
enables the computer to let the user re-enter a perfect score in case the value entered is invalid. */

        do {
            System.out.print("Enter the Perfect Examination Score: ");
            perfectExamScore = Integer.parseInt(keyboard.nextLine()); // 5
            if (perfectExamScore <= 0) {
                System.out.println("Invalid value! Value must be greater than 0.");
            }
        } while (perfectExamScore <= 0);
/* Accept the total quiz score. The total quiz score must not be greater than the perfect quiz score. The
do while construct enables the computer to let the user re-enter a score in case the value entered
is invalid. */

        do {
            System.out.print("Enter a student's total quiz score: ");
            quizScore = Integer.parseInt(keyboard.nextLine()); // 6
            if (quizScore > perfectQuizScore) {

                System.out.println("Invalid value! Score must not be greater than perfect score.");
            }
        } while (quizScore > perfectQuizScore);
/* Accept the exam score. The exam score must not be greater than the perfect exam score. The do
while construct enables the computer to let the user re-enter a score in case the value entered is
invalid. */

        do {
            System.out.print("Enter a student's examination score: ");
            examScore = Integer.parseInt(keyboard.nextLine()); // 7
            if (examScore > perfectExamScore) {
                System.out.println("Invalid value! Score must not be greater than perfect score.");
            }
        } while (examScore > perfectExamScore);
// Compute the quiz grade
        quizGrade = ((double)quizScore / perfectQuizScore) * 50 + 50; // 8
// Compute the exam grade
        examGrade = ((double)examScore / perfectExamScore) * 50 + 50; // 9
// Compute the subject grade
        prelimGrade = (quizGrade + examGrade)/2; // 10
// Check if computerProgramming1.prelim grade is greater than 99 then reset it to 99
        if (prelimGrade > 99) {
            prelimGrade = 99; // 11
        }
//Check if computerProgramming1.prelim grade is less than 65 then reset it to 65
        if (prelimGrade < 65) {
            prelimGrade = 65; // 12
        }
// Check if computerProgramming1.prelim grade is passing then display the grade together with a remark
        if (prelimGrade >= 75) { // 13
            System.out.println("\nPrelim Grade: " + prelimGrade); // 14
            System.out.println("Remark : PASSED");
        }
// Check if computerProgramming1.prelim grade is failing then display the grade together with a remark
        if (prelimGrade <75){ // 15
            System.out.println("\nPrelim Grade: " + prelimGrade);
            System.out.println("Remark : FAILED");
            }

        System.exit(0);

    } //end of the main method
} //end of class

