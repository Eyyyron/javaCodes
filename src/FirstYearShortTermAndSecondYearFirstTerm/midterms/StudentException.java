package FirstYearShortTermAndSecondYearFirstTerm.midterms;

public class StudentException implements Comparable<Student>{
    private String name;
    private double average;

    public StudentException(){
        name = "Bong";
        average = 75.0;
    }

    public StudentException(String n, double a){
        this.name=n;
        this.average=a;
    }

    //getters here
    public String getName(){
        return name;
    }
    public double getAverage(){
        return average;
    }
    // other methods may be placed here
    public boolean equals(Object another){
        return(this.toString().equals(((Student)another).toString()));
    }

    public String toString(){
        return name+"," +average;
    }
    public int compareTo(Student another){
        return(another.getName().compareToIgnoreCase(this.getName()));
    }
}


