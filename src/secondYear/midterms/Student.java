package secondYear.midterms;

public class Student implements Comparable<Student>{
    private String name;
    private double gwa;

    public Student(){
        name = "John";
        gwa = 99.0;
    }

    public Student(String n, double g){
        this.name=n;
        this.gwa=g;
    } 

    // getters here
    public String getName(){
        return name;
    }  //End of getName method
    public double getGWA(){
        return gwa;
    }  //End of getGWA method
    // setters here

    public String toString(){
        return name+","+gwa;
    }  //End of toString method

    public int compareTo(Student another){
        //return (this.getName().compareToIgnoreCase(another.getName()));

        // the code below may be used if comparing will be based on gwa
        int result=0;
        if (this.gwa < another.getGWA())
            result = -1;
        else
            if (this.gwa > another.getGWA())
                result = 1;
            else
                result = 0;
        return result;



    }  //End of compareTo method
}  //End of Student class
