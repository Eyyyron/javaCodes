/**
 * Name: Aguilar, Aaron Kyle
 * Date of Programming: January 31, 2023
 * Activity Name: ( e.g. Prelim Exercise 3)
 * Problem and other specifications: Read the comment section for the requirement of this activity.
 *
 * Name of Student/Programmer: Aguilar, Aaron Kyle
 * CLASS CODE & Schedule: CS 122L, 9:00-10:30 Tuesday & Friday
 * Date: January 31, 2023
 * Student Records Keeping Using Parallel Arrays
 * <p>
 * An ID number, a name, a course, a year level and others are
 * attributed to a student. Hence, eight arrays are
 * used: An array that stores ID numbers, an array that
 * stores names, an array that stores courses, an array
 * that stores year levels, etc. The eight arrays are treated
 * as parallel arrays such that the first elements of the
 * eight arrays are actual attributes (ID number, name, course,
 * year level, etc. ) of one student, the second elements are
 * actual attributes of another student, and so on.
 * <p>
 * <p>
 * REQUIRED:
 * Complete and show a sample run (sample output) of the following
 program.
 *The sample run should be shown below as part of this multiline comment
 * How many student records will be created? 3
 *
 * Enter the ID Number of the Student 1
 * 1
 * Enter the Name of the Student 1
 * aaron
 * Enter the Course of the Student 1
 * comsci
 * Enter the Year Level of the Student 1
 * 1
 * Enter the Prelim Grade of the Student 1
 * 89
 * Enter the Midterm Grade of the Student 1
 * 89
 * Enter the Tentative Final Grade of the Student 1
 * 89
 * Enter the Final Grade of the Student 1
 * 89
 *
 * Enter the ID Number of the Student 2
 * 2
 * Enter the Name of the Student 2
 * kyle
 * Enter the Course of the Student 2
 * comsci
 * Enter the Year Level of the Student 2
 * 1
 * Enter the Prelim Grade of the Student 2
 * 98
 * Enter the Midterm Grade of the Student 2
 * 98
 * Enter the Tentative Final Grade of the Student 2
 * 98
 * Enter the Final Grade of the Student 2
 * 98
 *
 * Enter the ID Number of the Student 3
 * 3
 * Enter the Name of the Student 3
 * aguilar
 * Enter the Course of the Student 3
 * comsci
 * Enter the Year Level of the Student 3
 * 1
 * Enter the Prelim Grade of the Student 3
 * 78
 * Enter the Midterm Grade of the Student 3
 * 78
 * Enter the Tentative Final Grade of the Student 3
 * 78
 * Enter the Final Grade of the Student 3
 * 78
 *
 * Original Order Data
 *
 * ID Numbers: 1
 * Names: aaron
 * Courses: comsci
 * Year Levels: 1
 * Prelim Grades: 89
 * Midterm Grades: 89
 * Tentative Final Grades: 89
 * Final Grades: 89
 *
 * ID Numbers: 2
 * Names: kyle
 * Courses: comsci
 * Year Levels: 1
 * Prelim Grades: 98
 * Midterm Grades: 98
 * Tentative Final Grades: 98
 * Final Grades: 98
 *
 * ID Numbers: 3
 * Names: aguilar
 * Courses: comsci
 * Year Levels: 1
 * Prelim Grades: 78
 * Midterm Grades: 78
 * Tentative Final Grades: 78
 * Final Grades: 78
 *
 * Sorted Data
 *
 * ID Numbers: 1
 * Names: aaron
 * Courses: comsci
 * Year Levels: 1
 * Prelim Grades: 89
 * Midterm Grades: 89
 * Tentative Final Grades: 89
 * Final Grades: 89
 *
 * ID Numbers: 3
 * Names: aguilar
 * Courses: comsci
 * Year Levels: 1
 * Prelim Grades: 78
 * Midterm Grades: 78
 * Tentative Final Grades: 78
 * Final Grades: 78
 *
 * ID Numbers: 2
 * Names: kyle
 * Courses: comsci
 * Year Levels: 1
 * Prelim Grades: 98
 * Midterm Grades: 98
 * Tentative Final Grades: 98
 * Final Grades: 98
 **/

package secondYear.prelims;
import java.util.Scanner;

public class StudentRecordsViaParallelArrays {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        String[] id; // Array that will store ID numbers
        String[] names; // Array that will store names
        String[] course;// Array that will store courses
        int[] yearLevel; // array that will store year levels
        int count; // variable that will store the number of students
        byte[] pGrade; // to store prelim grade
        byte[] mGrade; // to store midterm grade
        byte[] tFGrade; // to store tentative Final Grade
        byte[] fGrade; // to store final grade
// Read the number of students to be recorded from the keyboard
        System.out.print("How many student records will be created? ");
        count = Integer.parseInt(keyboard.nextLine());
// TO DO: Instantiate the arrays such that each will have a length=size
        id = new String[count];
        names = new String[count];
        course = new String[count];
        yearLevel = new int[count];
        pGrade = new byte[count];
        mGrade = new byte[count];
        tFGrade = new byte[count];
        fGrade = new byte[count];

// TO DO: Invoke the method that will fill the arrays with elements
        populateArrays(id, names, course, yearLevel, pGrade, mGrade, tFGrade, fGrade);  //invocation of populateArrays method

// Show the students following the order by which they were entered
        System.out.println("\nOriginal Order Data");

//TO DO: Invoke the method for displaying the array elements
        showData(id, names, course, yearLevel, pGrade, mGrade, tFGrade, fGrade);  //invocation of showData method

// TO DO : Invoke the method that will sort the arrays in parallel
        sortDataBasedOnNames(id, names, course, yearLevel, pGrade, mGrade, tFGrade, fGrade);  //invocation of sortDataBasedOnNames method

// TO DO: Invoke the method for displaying the array elements

// Show the students in sorted order
        System.out.println("\nSorted Data");

//TO DO: Invoke appropriate method
        showData(id, names, course, yearLevel, pGrade, mGrade, tFGrade, fGrade);  //invocation of showData method

    }  // end of main method

    /**
     * Put elements into arrays (parallel arrays) for ID numbers, names, course, year levels, prelim grade,
     * midterm grade, tentative final grade, and final grade
     **/
    public static void populateArrays(String[] id, String[] n, String[] c, int[] y, byte[] p, byte[] m, byte[] t, byte[] f) {
//TO DO. Insert appropriate lines of codes
        for (int i = 0; i < id.length; i++) {
            id[i] = stringInput("\nEnter the ID Number of the Student " + (i + 1));
            n[i] = stringInput("Enter the Name of the Student " + id[i]);
            c[i] = stringInput("Enter the Course of the Student " + id[i]);
            y[i] = integerInput("Enter the Year Level of the Student " + id[i]);
            p[i] = byteInput("Enter the Prelim Grade of the Student " + id[i]);
            m[i] = byteInput("Enter the Midterm Grade of the Student " + id[i]);
            t[i] = byteInput("Enter the Tentative Final Grade of the Student " + id[i]);
            f[i] = byteInput("Enter the Final Grade of the Student " + id[i]);
        }  // end of for loop
    }  // end of populateArrays method

    /**
     * Sort the elements of the eight arrays in parallel (i.e. When
     * there is a need to swap elements of the array n,
     * the corresponding elements in other arrays should also
     * be swapped.) such that the elements of array n
     * are lexicographically arranged. (SPECIFY the Apply a Sort Algorithm
     * that you will follow
     */
    public static void sortDataBasedOnNames(String[] id, String[] n, String[] c, int[] y, byte[] p, byte[] m, byte[] t, byte[] f) {
//TO DO. Insert appropriate lines of codes
        for(int x = 0; x < n.length - 1 ; x++) {
            int minIndex = x;
            for (int i = x + 1; i < n.length; i++) {
                if (n[minIndex].compareToIgnoreCase(n[i]) > 0) {
                    minIndex = i;
                }  // end of for loop
            }
            if (!(minIndex == x)) {

                String tempName = n[x];
                n[x] = n[minIndex];
                n[minIndex] = tempName;

                String tempID = id[x];
                id[x] = id[minIndex];
                id[minIndex] = tempID;

                String tempCourse = c[x];
                c[x] = c[minIndex];
                c[minIndex] = tempCourse;

                int tempYear = y[x];
                y[x] = y[minIndex];
                y[minIndex] = tempYear;

                byte tempPrelim = p[x];
                p[x] = p[minIndex];
                p[minIndex] = tempPrelim;

                byte tempMidterm = m[x];
                m[x] = m[minIndex];
                m[minIndex] = tempMidterm;

                byte tempTentative = t[x];
                t[x] = t[minIndex];
                t[minIndex] = tempTentative;

                byte tempFinal = f[x];
                f[x] = f[minIndex];
                f[minIndex] = tempFinal;
            }  // end of if statement
        }  // end of for loop
    } // end of sortBasedOnNames method

    /**
     * Show the elements of the arrays on the screen.
     **/
    public static void showData(String[] id, String[] n, String[] c, int[] y, byte[] p, byte[] m, byte[] t, byte[] f) {
//TO DO. Insert appropriate lines of codes
        for (int i = 0; i < id.length; i++) {
            System.out.println("\nID Numbers: " + id[i]);
            System.out.println("Names: " + n[i]);
            System.out.println("Courses: " + c[i]);
            System.out.println("Year Levels: " + y[i]);
            System.out.println("Prelim Grades: " + p[i]);
            System.out.println("Midterm Grades: " + m[i]);
            System.out.println("Tentative Final Grades: " + t[i]);
            System.out.println("Final Grades: " + f[i]);
        }  // end of for loop
    } // end of showData method

    public static String stringInput(String promptMessage) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(promptMessage);
        return keyboard.nextLine();
    }  // end of stringInput method

    public static int integerInput(String promptMessage) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(promptMessage);
        return Integer.parseInt(keyboard.nextLine());
    }  // end of integerInput method

    public static byte byteInput(String promptMessage) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(promptMessage);
        return Byte.parseByte(keyboard.nextLine());
    }  // end of byteInput method

    public static void swapArrays(int index1, int index2, String[] array) {
        String temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }  // end of swapArrays

}  // end of class StudentRecordsViaParallelArrays
