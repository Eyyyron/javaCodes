package secondYear.prelims;

public class Course {
    private String courseNumber;
    private String descriptiveTitle;
    private int units;

    /**
     * constructs a course with "CS 000" as course number,
     * "Computer Fundamentals" as descriptive title, and
     * 3 as units
     * */
    public Course(){
        courseNumber = "CS 000";
        descriptiveTitle = "Computer Fundamentals";
        units = 3;
    }

    /**
     * constructs a course with a given course number,
     * descriptive title and units
     * */
    public Course(String courseNumber, String descriptiveTitle, int units) {
        this.courseNumber = courseNumber;
        this.descriptiveTitle = descriptiveTitle;
        this.units = units;
    }

    /**
     * sets course number to a given string
     * */
    public void setCourseNumber(String courseNumber){
        this.courseNumber = courseNumber;
    }

    public void setDescriptiveTitle(String dTitle){
        descriptiveTitle = dTitle;
    }

    public void setUnits(int units){
        this.units = units;
    }

    /**
     * returns the course number of this course
     * */
    public String getCourseNumber(){
        return courseNumber;
    }

    public String getDescriptiveTitle(){
        return descriptiveTitle;
    }

    public int getUnits(){
        return units;
    }

    public String toString(){
        return courseNumber +","+descriptiveTitle+","+units;
    }
}
