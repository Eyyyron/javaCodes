package FirstYearShortTermAndSecondYearFirstTerm.finals;

public class Employee2 {
    private String id;
    private String name;
    private String department;
    private char gender;
    private int age;
    private boolean isPermanent;
    private double salary;
    private int yrsOfService;

    public Employee2(String id, String name, String department, char gender, int age,
                    boolean isPermanent, double salary, int yrsOfService){
        this.id = id;
        this.name = name;
        this.department = department;
        this.gender = gender;
        this.age = age;
        this.isPermanent = isPermanent;
        this.salary = salary;
        this.yrsOfService = yrsOfService;
    }

    @Override
    public String toString(){
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", gender =" + gender +
                ", age=" + age +
                ", employment status=" +
                (isPermanent ? "Permanent" : "Not Permanent") +
                ", salary=" + salary +
                ", years of service" + yrsOfService +
                '}';
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getDepartment(){
        return department;
    }

    public char getGender(){
        return gender;
    }

    public int getAge(){
        return age;
    }

    public boolean isPermanent(){
        return isPermanent;
    }

    public double getSalary(){
        return salary;
    }

    public int getYrsOfService(){
        return yrsOfService;
    }

}

