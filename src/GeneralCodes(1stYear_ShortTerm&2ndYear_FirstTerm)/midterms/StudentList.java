package FirstYearShortTermAndSecondYearFirstTerm.midterms;

public class StudentList {
    public static void main(String[] args) {
        StudentList myProgram = new StudentList();
        myProgram.run();
    }  //End of main method

    public void run(){
        Student[] studs = new Student[4];
        studs[2] = new Student();
        studs[1] = new Student("Anne", 85);
        studs[0] = new Student("Raba", 89);
        studs[3] = new Student("Lene", 70);


        System.out.println("Original order");
        showStudents(studs);

        System.out.println("Arranged Students");
        // Collections.sort(studs);  if studs is an ArrayList of Student
        sortStudents(studs);
        showStudents(studs);

    }  //End of run method

    public void showStudents(Student[] students){
        for (int index=0; index<students.length; index++){
            System.out.println(students[index]);
        }  //End of for loop
    }  //End of showStudents method

    public void sortStudents(Student[] list){
        for ( int x=0; x<list.length-1; x++){
            for (int y = x+1; y<list.length; y++){
                if (list[x].getGWA() < list[y].getGWA()){
                    Student temp = list[x];
                    list[x]= list[y];
                    list[y]= temp;
                }  //End of if statement
            }  //End of second for loop
        }  //End of first for loop
    }  //End of sortStudents method
}  //End of StudentList class
