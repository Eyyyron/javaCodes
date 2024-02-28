/**
 * Sample Run:
 *
 * Unsorted List of Students
 * Bong,75.0
 * Riza,85.0
 * Bea,89.0
 * Kim,70.0
 *
 * Sorted List of Students
 * Riza,85.0
 * Kim,70.0
 * Bong,75.0
 * Bea,89.0
 */

package secondYear.midterms;
import java.util.ArrayList;
import java.util.Collections;

public class StudentList2Exception {
    public static void main(String[] args) {
        StudentList2 myProgram = new StudentList2();
        myProgram.run();
    }

    public void run(){
        ArrayList<Student>studs = new ArrayList<Student>();
        studs.add(new Student());
        studs.add(new Student("Riza", 85));
        studs.add(new Student("Bea", 89));
        studs.add(new Student("Kim", 70));
        System.out.println("Unsorted List of Students");
        showStudents(studs);

        System.out.println("\nSorted List of Students");
        Collections.sort(studs); //if studs is an ArrayList of Student
        showStudents(studs);

    }

    public void showStudents(ArrayList<Student> students){
        for(int index=0; index<students.size(); index++){
            System.out.println(students.get(index));
        }
    }
}
