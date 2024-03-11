package FirstYearShortTermAndSecondYearFirstTerm.finals;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Name: Aguilar, Aaron Kyle M.

public class Exam {

    public static void main(String[] args) {

        try {
            List<Employee2> employees = doRequirement1("res/data.csv");
            doRequirement2(employees);
            doRequirement3(employees);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        // Implementations of the methods are to be provided below
    }

    private static List<Employee2> doRequirement1(String s) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(s));

        List<Employee2> employeeList = new ArrayList<>();

        String[] tempArray;
        String lineOfText;
        boolean value;


            do {
                lineOfText = reader.readLine();

                if (lineOfText != null) {

                    tempArray = lineOfText.split(",");

                    value = tempArray[5].equalsIgnoreCase("permanent");

                    employeeList.add(new Employee2(tempArray[0], tempArray[1], tempArray[2], tempArray[3].charAt(0), Integer.parseInt(tempArray[4]),
                            value, Double.parseDouble(tempArray[6]), Integer.parseInt(tempArray[7])));
                }

            } while (lineOfText != null);

        return employeeList;
    }

    private static void doRequirement2(List<Employee2> employees) throws IOException {

        PrintWriter outputStream = new PrintWriter(new FileWriter("res/requirement2B.txt", true));

        double averageSalary;

        averageSalary = employees.stream()
                .filter(employee -> employee.isPermanent())
                .mapToDouble(Employee2::getSalary)
                .average().getAsDouble();

        outputStream.println(averageSalary);
        outputStream.close();

    }

    private static void doRequirement3(List<Employee2> employees) throws IOException {

        PrintWriter outputStream = new PrintWriter(new FileWriter("res/requirement3B.txt", true));

        employees = employees
                .stream()
                .filter(employee -> employee.isPermanent())
                .filter(employee -> employee.getGender() == 'F')
                .filter(employee -> employee.getGender() == 'M')
                .filter(employee -> employee.getYrsOfService() > 10)
                .collect(Collectors.toList());

        for (Employee2 employee : employees)
        {
            outputStream.println(employee);
        }

        outputStream.close();
    }

}
