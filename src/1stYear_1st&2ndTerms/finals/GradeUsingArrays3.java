/**
 Name: Aguilar, Aaron Kyle M.

 Class Code, Course Number, Schedule: 9315, 1:00 - 2:30 MW

 Date: November 16, 2022

 Problem: Program that implements the selection sort algorithm
 A program that create a class record. The names, quiz scores, exam scores,
 quiz grades, exam grades and subject grades are stored by parallel arrays.
 */

package FirstYearFirstTermAndSecondTerm.finals;
import java.util.Scanner;
import java.lang.*;

public class GradeUsingArrays3 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        int[] quizScore; // array to hold quiz scores of students
        int[] examScore; // array to hold exam scores of students
        String[] names; // array to hold names of students
        int perfectQuizScore; // variable to hold perfect quiz score
        int perfectExamScore; // variable to hold perfect exam score
        double[] quizGrade; // array to hold quiz grades of students.
        double[] examGrade; // array to hold examination grades of students
        double[] subjectGrade; // array to hold subject grades of students
        int size;
/* Accept the number of students( class size). The class size must be greater than 0 but
less than 100. */
        size = readInteger(0, 100, "Enter number of students");
// Instantiate arrays, the number of cells for each array must be equal to size
        quizScore = new int[size];
        examScore = new int[size];
        names = new String[size];
        quizGrade = new double[size];
        examGrade = new double[size];
        subjectGrade = new double[size];
/* Accept the perfect quiz score. The perfect score must be greater than 0 but less than
1000. */
        perfectQuizScore = readInteger(0, 1000, "Enter the perfect quiz score");
/* Accept the perfect exam score. The perfect score must be greater than 0 but less than
1000. */
        perfectExamScore = readInteger(0, 1000, "Enter the perfect exam score");
// Accept names and scores and compute the grade of each student
        for (int x = 0; x < size; x++) {
            names[x] = readString("Enter the name of student " + (x + 1));
/* Accept the quiz score of a student. The quiz score must be at least 0 and must not
be greater than the perfect quiz score. */
            quizScore[x] = readInteger(0, perfectQuizScore, "Enter the quiz score of " +
                    names[x]);
/* Accept the exam score. The exam score must be at least 0 and must not be greater
than the perfect exam score. */
            examScore[x] = readInteger(0, perfectExamScore, "Enter the examination score of " +
                    names[x]);
// Compute the grade for the quiz
            quizGrade[x] = computeGrade(quizScore[x], perfectQuizScore);
// Compute the grade for the exam
            examGrade[x] = computeGrade(examScore[x], perfectExamScore);
// Compute the grade for the subject
            subjectGrade[x] = (quizGrade[x] + examGrade[x]) / 2;
        } // end of for

// Display the scores and grades of students
        System.out.println("\n\nPerfect Quiz Score = " + perfectQuizScore);
        System.out.println("\nPerfect Exam Score = " + perfectExamScore);
        showData(names, quizScore, examScore, quizGrade, examGrade, subjectGrade);
// Compute and show the average of the subject grades
        double averageGrade = computeAverage(subjectGrade);
        System.out.printf("%n%25s%5.2f%n", "Average Grade = ", averageGrade);
// determine and show the lowest subject grade
        double lowestGrade = findLowest(subjectGrade);
        System.out.printf("%n%25s%5.2f%n", "Lowest Grade = ", lowestGrade);
// determine and show the highest subject grade
        double highestGrade = findHighest(subjectGrade);
        System.out.printf("%n%25s%5.2f%n", "Highest Grade = ", highestGrade);
// Arrange list from highest to lowest based on subject grade
        System.out.println();
        System.out.println("Sorted Record");
        selectionSortD(names, quizScore, examScore, quizGrade, examGrade, subjectGrade);
        showData(names, quizScore, examScore, quizGrade, examGrade, subjectGrade);

        System.exit(0);
    } // end of the main method
    /**
     Reads and returns an integer from input device after seeing a prompt message. The value
     should be in the range lowLimit to upLimit.
     */
    public static int readInteger(int lowLimit, int upLimit, String prompt) {
        int value = 0;
        do {
            System.out.print(prompt + ": ");
            value = Integer.parseInt(keyboard.nextLine());
            if (value < lowLimit || value > upLimit) {
                System.out.println("You must enter an integer in the range " + lowLimit + " to " +
                        upLimit + ".");
            }
        } while (value < lowLimit || value > upLimit);
        return value;
    }
    /**
     Reads and returns a floating point number from input device after seeing a prompt message.
     The value should be in the range lowLimit to upLimit.
     */
    public static double readDouble(double lowLimit, double upLimit, String prompt) {
        double value = 0;
        do {
            System.out.print(prompt + ": ");
            value = Double.parseDouble(keyboard.nextLine());
            if (value < lowLimit || value > upLimit) {
                System.out.println("You must enter a floating point number in the range " +
                        lowLimit + " to " + upLimit + ".");
            }
        } while (value < lowLimit || value > upLimit);
        return value;
    }
    /**
     Reads and returns a string from input device after seeing
     a prompt message. The String must not be a null string.
     */
    public static String readString(String prompt) {
        String value = "";
        do {
            System.out.print(prompt + " : ");
            value = keyboard.nextLine();
            if (value.compareTo("") == 1) {
                System.out.println("You must type a string that is not null.");
            }
        } while (value.compareTo("") == 0);
        return value;
    }
    /**
     Finds and returns the lowest value from an array of floating point numbers
     */
    public static double findLowest(double[] values) {
        double result = values[0]; // let lowest be the first limit
        for (int x = 1; x < values.length; x++) // find out if an element after the
            if (values[x] < result) // first is lower

                result = values[x]; // then set lowest to such element
        return result;
    }
    /**
     Finds and returns the highest value from an array of floating point numbers
     */
    public static double findHighest(double[] values) {
        double result = values[0]; // let highest be the first limit
        for (int x = 1; x < values.length; x++) // find out if an element after the
            if (values[x] > result) // first is higher
                result = values[x]; // then set highest to such element
        return result;
    }
    /**
     Computes and returns the average of the elements an array of floating point numbers
     */
    public static double computeAverage(double[] values) {
        double total = 0; // to hold the total of all elements
        double average = 0; // to hold the average
        for (int x = 0; x < values.length; x++) // add the elements
            total = total + values[x];
// compute the average
        average = total / values.length; // total divided by number of elements
        return average;
    }
    /**
     Computes and returns a grade corresponding to a score. The grade equals
     score / perfectScore * 50 + 50. If computation yields more than 99, the grade is set to 99.
     If computation yields less than 65, the grade is set to 65.
     */
    public static double computeGrade(int score, int perfect) {
        double result = 65;
        result = (double) score / perfect * 50 + 50;
        if (result > 99)
            result = 99.0;
        if (result < 65)
            result = 65.0;
        return result;
    }
    /**
     The ff. method sorts the 2 arrays in parallel following the selection sort algorithm.
     */
    public static void parallelSort(String[] c, double[] a) {
        for (int x = 0; x < c.length - 1; x++) {
            int minIndex = x;
            for (int y = x + 1; y < c.length; y++) {
                if (c[minIndex].compareToIgnoreCase(c[y]) > 0) {
                    minIndex = y;
                    String temp = c[x];
                    c[x] = c[minIndex];
                    c[minIndex] = temp;
                    double dummy = a[x];
                    a[x] = a[minIndex];
                    a[minIndex] = dummy;
                }
            }
        }
    }

    /**
     The ff. method sorts the 6 arrays in parallel following the selection sort algorithm. Sorting
     is based on the string array c.
     */
    public static void parallelSort(String[] c, int[] q, int[] e, double[] p, double[] a, double[] i) {
        for (int x = 0; x < c.length - 1; x++) {
            int minIndex = x;
            for (int y = x + 1; y < c.length; y++) {
                if (c[x].compareToIgnoreCase(c[y]) > 0) {
                    minIndex = y;
                    String temp = c[x];
                    c[x] = c[minIndex];
                    c[minIndex] = temp;
                    int t = q[x];
                    q[x] = q[minIndex];
                    q[minIndex] = t;
                    t = e[x];
                    e[x] = e[minIndex];
                    e[minIndex] = t;
                    double dummy = p[x];
                    p[x] = p[minIndex];
                    p[minIndex] = dummy;
                    dummy = a[x];
                    a[x] = a[minIndex];
                    a[minIndex] = dummy;
                    dummy = i[x];
                    i[x] = i[minIndex];
                    i[minIndex] = dummy;
                }
            }
        }
    }
    /**
     The ff. method sorts the 6 arrays in parallel following the selection sort algorithm. Sorting
     is based on the double array i.
     */
    public static void selectionSortD(String[] c, int[] q, int[] e, double[] p, double[] a, double[] i) {
        for (int x = 0; x < c.length - 1; x++) {
            int minIndex = x;
            for (int y = x + 1; y < c.length; y++) {
                if (i[x] < (i[y])) {
                    minIndex = y;
                    String temp = c[x];
                    c[x] = c[minIndex];
                    c[minIndex] = temp;
                    int t = q[x];
                    q[x] = q[minIndex];
                    q[minIndex] = t;
                    t = e[x];
                    e[x] = e[minIndex];
                    e[minIndex] = t;
                    double dummy = p[x];
                    p[x] = p[minIndex];

                    p[minIndex] = dummy;
                    dummy = a[x];
                    a[x] = a[minIndex];
                    a[minIndex] = dummy;
                    dummy = i[x];
                    i[x] = i[minIndex];
                    i[minIndex] = dummy;
                }
            }
        }
    }
    /**
     Display the scores and grades of students. Displays elements of parallel arrays
     */
    public static void showData(String[] names, int[] quizScore, int[] examScore,
                                double[] quizGrade, double[] examGrade, double[] subjectGrade) {
        System.out.printf("%10s%10s%10s%10s%10s%10s\n", "", "Quiz", "Exam", "Quiz", "Exam", "");
        System.out.printf("%10s%10s%10s%10s%10s%10s\n", "Name", "Score", "Score", "Grade", "Grade", "Grade");
        System.out.printf("%10s%10s%10s%10s%10s%10s\n", "--------", "--------", "--------",
                "-------", "--------", "--------");
        for (int y = 0; y < subjectGrade.length; y++) {
            System.out.printf("%10s%10d%10d%10.0f%10.0f%10.0f\n", names[y], quizScore[y],
                    examScore[y], quizGrade[y], examGrade[y], subjectGrade[y]);
        }
        System.out.printf("%10s%10s%10s%10s%10s%10s\n", "--------", "--------", "--------",
                "-------", "--------", "--------");
    }
} // end of class

