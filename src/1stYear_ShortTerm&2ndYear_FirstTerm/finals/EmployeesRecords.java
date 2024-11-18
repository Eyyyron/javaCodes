/*
Name: Aaron Kyle Aguilar
Date: May 2, 2023

Sample Run:
List of departments and corresponding number of employees
Human Resource: 4
IT Services: 3
Marketing: 6
Software Development Team: 2
=====================================================================

Five newest employees who are hired as permanent:
257908    	Arjun Panlilio      	Software Development Team     	M	58Permanent      	30383.25  	5
302284    	Jordon Gatdula      	IT Services                   	M	33Permanent      	21605.75  	7
385442    	Solomon Rivera      	Marketing                     	M	32Permanent      	31622.25  	8
297836    	Janet Alegre        	Marketing                     	F	57Permanent      	26950.00  	10
255168    	Rigoberto Cuenca    	Software Development Team     	M	38Permanent      	35574.00  	11
=====================================================================

Lowest Paid Employees with less than 5 years of service (salary in descending order)
380966    	Juanita Ignacio     	IT Services                   	F	47NotPermanent   	35157.25  	3
374872    	Nicholas Dimalanta  	Human Resource                	M	30NotPermanent   	31152.50  	1
394392    	Corazon Lualhati    	Human Resource                	F	47NotPermanent   	31040.75  	1
353810    	Jamie Lingao        	Marketing                     	M	34NotPermanent   	20444.25  	4
=====================================================================

Total years of service of employees in the IT Services Department: 15
=====================================================================

List of employees per department partitioned by employment status
Human Resource
	Not Permanent
		278667    	Blas Palad          	Human Resource                	M	32NotPermanent   	32098.50  	8
		394392    	Corazon Lualhati    	Human Resource                	F	47NotPermanent   	31040.75  	1
		374872    	Nicholas Dimalanta  	Human Resource                	M	30NotPermanent   	31152.50  	1
	Permanent
		253360    	Brigida Casta�ares  	Human Resource                	F	50Permanent      	28433.25  	15
IT Services
	Not Permanent
		257033    	Blanca Capulong     	IT Services                   	F	44NotPermanent   	33676.25  	5
		380966    	Juanita Ignacio     	IT Services                   	F	47NotPermanent   	35157.25  	3
	Permanent
		302284    	Jordon Gatdula      	IT Services                   	M	33Permanent      	21605.75  	7
Marketing
	Not Permanent
		329953    	Aura Villegas       	Marketing                     	F	26NotPermanent   	27381.00  	6
		299334    	Jaiden Yllana       	Marketing                     	M	28NotPermanent   	32379.25  	5
		353810    	Jamie Lingao        	Marketing                     	M	34NotPermanent   	20444.25  	4
	Permanent
		250400    	Conrado Ylagan      	Marketing                     	M	36Permanent      	27568.00  	13
		297836    	Janet Alegre        	Marketing                     	F	57Permanent      	26950.00  	10
		385442    	Solomon Rivera      	Marketing                     	M	32Permanent      	31622.25  	8
Software Development Team
	Permanent
		257908    	Arjun Panlilio      	Software Development Team     	M	58Permanent      	30383.25  	5
		255168    	Rigoberto Cuenca    	Software Development Team     	M	38Permanent      	35574.00  	11
=====================================================================
 */

package FirstYearShortTermAndSecondYearFirstTerm.finals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeesRecords {
    public static void main(String[] args) {
        EmployeesRecords program;
        try{
            program = new EmployeesRecords();
            program.run();
        }catch (Exception x){
            x.printStackTrace();
        }
        System.exit(0);
    }

    public void run() throws Exception{
        List<Employee> employees = readDataFileIntoList("src/prog2/samcis/slu/data01.csv");
        showPopulationPerDepartment(employees);
        showFiveNewestHiredPermanentEmployees(employees);
        showEmployeesWithLessThanFiveYearsOfServiceSortedBySalaryInDescendingOrder(employees);
        showTotalServiceYearsInITServicesDepartment(employees);
        showEmployeeListPerDepartmentPartitionedByEmploymentStatus(employees);
    }

    private List<Employee> readDataFileIntoList(String filename){
        try{
            List<Employee> employees = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            while (true){
                String line = reader.readLine();
                if(line == null){
                    break;
                }
                String[] data = line.split(",");
                boolean permanent = data[7].equalsIgnoreCase("permanent");
                Employee emp = new Employee(data[0], data[1], data[4], data[2].charAt(0),
                        Integer.parseInt(data[3]), permanent, Double.parseDouble(data[6]), Integer.parseInt(data[5]));
                employees.add(emp);
            }
            reader.close();
            return employees;
        }catch (Exception e){
            throw new RuntimeException("Data file read error.");
        }
    }

    private void showEmployeesWithLessThanFiveYearsOfServiceSortedBySalaryInDescendingOrder(List<Employee>employees){
        System.out.println("Lowest Paid Employees with less than 5 years of service (salary in descending order)");
        Comparator<Employee> comparator = (emp1, emp2) -> {
            if(emp1.getSalary() > emp2.getSalary()){
                return -1;
            } else if(emp1.getSalary() < emp2.getSalary()){
                return 1;
            } else {
                return 0;
            }
        };
        employees
                .stream()
                .filter(emp -> emp.getYrsOfService() < 5).sorted(comparator)
                .forEach(System.out::println);
        System.out.println("=====================================================================\n");
    }

    private void showFiveNewestHiredPermanentEmployees(List<Employee>employees){
        System.out.println("Five newest employees who are hired as permanent:");
        employees
                .stream()
                .filter(emp -> emp.isPermanent())
                .sorted(
                        (emp1, emp2) -> {
                            if(emp1.getYrsOfService() < emp2.getYrsOfService()){
                                return -1;
                            } else if (emp1.getYrsOfService() == emp2.getYrsOfService()){
                                return 0;
                            }
                            return 1;
                        }
                )
                .limit(5)
                .forEach(System.out::println);
        System.out.println("=====================================================================\n");
    }

    private void showTotalServiceYearsInITServicesDepartment(List<Employee>employees){
        System.out.print("Total years of service of employees in the IT Services Department: ");
        int sumYrs = employees.stream()
                .filter(emp -> emp.getDepartment().compareTo("IT Services") == 0)
                .mapToInt(Employee::getYrsOfService)
                .sum();
        System.out.println(sumYrs);
        System.out.println("=====================================================================\n");
    }

    private void showPopulationPerDepartment(List<Employee>employees){
        System.out.println("List of departments and corresponding number of employees");
        Map<String, List<Employee>> deptInfo = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        Set<String> departments = deptInfo.keySet();
        for(String dept:departments){
            List<Employee> emps = deptInfo.get(dept);
            int total = (int) emps.stream().count();
            System.out.printf("%s: %d%n", dept, total);
        }
        System.out.println("=====================================================================\n");
    }

    private void showEmployeeListPerDepartmentPartitionedByEmploymentStatus(List<Employee>employees){
        System.out.println("List of employees per department partitioned by employment status");
        Map<String, Map<Boolean, Set<Employee>>> allEmployees = new TreeMap<>();
        for(Employee emp: employees){
            String dept = emp.getDepartment();
            boolean empStatus = emp.isPermanent();
            Map<Boolean, Set<Employee>> deptList = allEmployees.computeIfAbsent(dept, k -> new TreeMap<>());
            Set<Employee> empStatusList = deptList.computeIfAbsent(empStatus, k -> new TreeSet<>());
            empStatusList.add(emp);
        }
        Set<String> departments = allEmployees.keySet();
        for(String dept: departments){
            System.out.printf("%s%n", dept);
            Map<Boolean, Set<Employee>> empStatusList = allEmployees.get(dept);
            Set<Boolean> empStats = empStatusList.keySet();
            for(boolean empStat: empStats){
                System.out.printf("\t%s%n", empStat ? "Permanent": "Not Permanent");
                Set<Employee> empStatList = empStatusList.get(empStat);
                for(Employee emp: empStatList){
                    System.out.println("\t\t" + emp.toString());
                }
            }
        }
        System.out.println("=====================================================================\n");

    }
}
