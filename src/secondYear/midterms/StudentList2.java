package secondYear.midterms;
import java.util.ArrayList;
import java.util.Collections;

public class StudentList2 {
    public static void main(String[] args) {
        StudentList2 myProgram = new StudentList2();
        myProgram.run();
    }  //End of main method

    public void run(){
        ArrayList<Student> studs = new ArrayList<Student>();
        studs.add(new Student());
        studs.add(new Student("Anne", 85));
        studs.add(new Student("Raba", 89));
        studs.add(new Student("Lene", 70));
        System.out.println("Original order");
        showStudents(studs);

        System.out.println("Arranged Students");
        Collections.sort(studs);  //if studs is an ArrayList of Student
        showStudents(studs);

    }  //End of run method

    public void showStudents(ArrayList<Student> students){
        for (int index=0; index<students.size(); index++){
            System.out.println(students.get(index));
        }  //End of for loop
    }  //End of showStudents method

}  //End of StudentList2 class

