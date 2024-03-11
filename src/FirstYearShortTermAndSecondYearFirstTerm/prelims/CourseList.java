package FirstYearShortTermAndSecondYearFirstTerm.prelims;

public class CourseList {
    public static void main(String[] args) {
        CourseList course = new CourseList();
    }

    public CourseList(){
        run();
    }

    public void run(){
        Course course1 = new Course();  //
        Course course2 = new Course("CFE 102", "Christian Morality", 3);

        System.out.println("Course 1: " + course1.toString());
        System.out.println("Course 2: " + course2.toString());

        course1.setCourseNumber("CS 121");
        course1.setDescriptiveTitle("Digital Logic");
        course1.setUnits(2);

        System.out.println("Modified course 1 : " + course1.toString());

        System.out.println("Course Number of 2nd course: "+ course2.getCourseNumber());
        System.out.println("Descriptive Title of 2nd course: " + course2.getDescriptiveTitle());
        System.out.println("Units for 2nd course: "+ course2.getUnits());
    }


}
