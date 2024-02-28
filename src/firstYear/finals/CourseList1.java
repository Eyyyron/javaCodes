/**
 Name: Aguilar, Aaron Kyle M.

 Class Code, Course Number, Schedule: 9315, 1:00 - 2:30 MW

 Date: November 7, 2022

 Write a program that will accept your enrolled courses
 (i.e. course numbers) and your grades(i.e. computerProgramming1.prelim grade)
 for the courses.  The following must be done.
 1. The number of courses is entered at run time.
 2. An array where the course numbers will be stored
 is declared and instantiated.
 3. An array where the grades are stored is declared
 and instantiated
 4. The courses and grades are entered at runtime
 5. The list of courses and grades are displayed on the
 output screen.
 6. The list of courses and grades are printed as
 comma separated values(csv) in a file
 * */

package firstYear.finals;
import javax.swing.*;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CourseList1 {
    public static void main(String[] args) {
        // Declare the pointer to an output file
        PrintWriter fileWriter=null;
        // Read the number of pair of course names and grades to be entered
        int nCourses = readInteger("How many pairs of course names and grade will be entered");
        // Declare and instantiate the array for the course names
        String[] courseNames = new String[nCourses];
        // Declare and instantiate the array for the grades
        int[] grades = new int[nCourses];
        // Read the pairs of course name and grade from the keyboard
        for (int index=0; index < courseNames.length; index++){
            courseNames[index] = JOptionPane.showInputDialog("Enter a course name");
            grades[index] = readInteger("Enter the grade for "+ courseNames[index]);
        }

        // Display on the screen the list of pairs of course name and grade
        System.out.printf("%-25s%-8s%n", "Course Name", "Grade");
        for (int index=0; index < courseNames.length; index++){
            System.out.printf("%-25s%-8d%n", courseNames[index], grades[index]);
        }

        // Print the pairs of course name and grade to a file
        String fileName="";
        fileName = JOptionPane.showInputDialog("Enter the name of the file where the pairs of course names and grades will be printed");
        try {
            fileWriter = new PrintWriter(new FileWriter(fileName));
            fileWriter.println("Course Name,Grade");
            for (int index = 0; index < courseNames.length; index++) {
                fileWriter.println(courseNames[index] + "," + grades[index]);
            }
        } catch (Exception exception){
            exception.printStackTrace();
        } finally {
            fileWriter.close();
        }
        System.exit(0);
    }

    /**
     * Returns an integer that is read from the keyboard
     * */
    public static int readInteger(String promptMessage){
        int number=0;
        boolean validValueRead = false;
        while (!validValueRead) {
            try {
                number = Integer.parseInt(JOptionPane.showInputDialog(promptMessage));
                validValueRead = true;
            } catch (NumberFormatException exception) {
                System.out.println(exception.getMessage());
                JOptionPane.showMessageDialog(null, "You have to enter a valid number");
            }
        } // end of while
        return number;
    }
}

