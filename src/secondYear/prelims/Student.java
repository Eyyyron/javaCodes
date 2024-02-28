package secondYear.prelims;

public class Student {
    private String firstName = "";
    private String midName = "";
    private String lastName = "";
    private String course = "";
    private int age;
    private double gPA;

    public Student(){
        firstName = "Adel";
        midName = "Man";
        lastName = "Tamano";
        course = "Computer Science";
        age = 39;
        gPA = 95.0;

    }  // end of Student

    public Student(String f, String m, String l, String c, int a, double g){
        firstName = f;
        midName = m;
        lastName = l;
        course = c;
        age = a;
        gPA = g;
    }  // end of Student

    public String getFirstName(){

        return firstName;
    }  // end of getFirstName

    public String getMidName(){

        return midName;
    }  // end of getMidName

    public String getLastName(){

        return lastName;
    }  // end of getLastName

    public String getCourse(){

        return course;
    }  // end of getCourse

    public int getAge(){

        return age;
    }  // end of getAge

    public double getGPA(){

        return gPA;
    }  // end of gPA

    public void setFirstName(String fName){

        firstName = fName;
    }  // end of setFirstName

    public void setMidName(String mName){

        midName = mName;
    }  // end of setMidName

    public void setLastName(String lName){

        lastName = lName;
    }  // end of setLastName

    public void setCourse(String c){

        course = c;
    }  //end of setCourse

    public void setAge(int a){

        age = a;
    }  // end of setAge

    public void setGPA(double gpa){

        gPA = gpa;
    }  // end of setGPA

    public String toString(){
        return "First Name: " + firstName + "\n"
                +"Middle Mame: " + midName + "\n"+
                "Last Name: " + lastName + "\n"+
                "Course: " + course + "\n"+
                "Age: " + age +"\n"+
                "GPA: " + gPA;

    }  // end of toString

    public int equals(Student other){
        int r;
        r = (firstName.compareToIgnoreCase(other.getFirstName()));
        return r;
    }  // end of equals

}  // end of class Student
