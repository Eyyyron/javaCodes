package FirstYearShortTermAndSecondYearFirstTerm.prelims;
import java.util.Scanner;

public class StudentList {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Student[] list;  // variable declaration
        int number;  // variable declaration
        int sort;  // variable declaration

        System.out.print("How many students will be listed? ");
        number = Integer.parseInt(keyboard.nextLine());

        list = new Student[number];

        System.out.println("\nEnter the student information.");
        for (int x = 0; x < list.length; x++) {
            System.out.println("\nFor student " + (x + 1) + " :");
            list[x] = readStudent();
        }  // end of for loop

        sort = integerInput("\nIn which order would you like the data to be arranged?\n" +
                "1. First Name   2. Last Name   3. Age   4. GPA:  ", 1, 4);

        System.out.println();
        System.out.println("Unsorted List");
        showList(list);  // invocation of showList method

        System.out.println();
        System.out.println("Sorted List");
        sortList(list, number, sort);  // invocation of sortList method
        showList(list);  // invocation of showList method

        System.exit(0);
    }  // end of main method

    private static void showList(Student[] studs) {
        for (int x = 0; x < studs.length; x++) {
            System.out.println("\nStudent "+(x+1));
            System.out.println(studs[x].toString());
        }  // end of for loop
    }  // end of showList method
    private static Student readStudent() {
        System.out.print("\nFirst Name: ");
        String f = keyboard.nextLine();
        System.out.print("Middle Name: ");
        String m = keyboard.nextLine();
        System.out.print("Last Name: ");
        String l = keyboard.nextLine();
        System.out.print("Course: ");
        String c = keyboard.nextLine();
        int a = integerInput("Age: ",17);
        double g = gPAInput("Grade Point Average: ", 0);

        Student s = new Student(f, m, l, c ,a, g);

        return s;

    }  // end of readStudent

    private static void sortList(Student[] s, int length, int sort) {
        switch (sort) {
            case 1 -> sortByFirstName(s, 0, length);
            case 2 -> sortByLastName(s, 0, length);
            case 3 -> sortByAge(s, 0, length);
            case 4 -> sortByGPA(s, 0, length);
        }
    } // end of sortList method

    private static void sortByFirstName(Student[] s, int xIndex, int length){
        Student temp;  // variable declaration
        int minIndex = xIndex;  // variable declaration

        for(int sIndex = xIndex + 1; sIndex < length; sIndex++){
            if(s[minIndex].getFirstName().compareToIgnoreCase(s[sIndex].getFirstName()) > 0)
                minIndex = sIndex;
        }  // end of for loop
        if(minIndex != xIndex){
            temp = s[xIndex];
            s[xIndex] = s[minIndex];
            s[minIndex] = temp;
        }  // end of if statement
        if(xIndex + 1 < length) {
            sortByFirstName(s, xIndex + 1, length);
        }  // end of if statement

    }  // end of sortByFirstName method

    private static void sortByLastName(Student[] s, int xIndex, int length){
        Student temp;  // variable declaration
        int minIndex = xIndex;  // variable declaration

        for(int sIndex = xIndex + 1; sIndex < length; sIndex++){
            if(s[minIndex].getLastName().compareToIgnoreCase(s[sIndex].getLastName()) > 0)
                minIndex = sIndex;
        }  // end of for loop
        if(minIndex != xIndex){
            temp = s[xIndex];
            s[xIndex] = s[minIndex];
            s[minIndex] = temp;
        }  // end of if statement
        if(xIndex + 1 < length) {
            sortByLastName(s, xIndex + 1, length);
        }  // end of if statement

    }  // end of sortByLastName method

    private static void sortByAge(Student[] s, int xIndex, int length){
        Student temp;  // variable declaration
        int minIndex = xIndex;  // variable declaration

        for(int sIndex = xIndex + 1; sIndex < length; sIndex++){
            if(s[minIndex].getAge() < s[sIndex].getAge())
                minIndex = sIndex;
        }  // end of for loop
        if(minIndex != xIndex){
            temp = s[xIndex];
            s[xIndex] = s[minIndex];
            s[minIndex] = temp;
        }  // end of if statement
        if(xIndex + 1 < length) {
            sortByAge(s, xIndex + 1, length);
        }  // end of if statement

    }  // end of sortByAge method

    private static void sortByGPA(Student[] s, int xIndex, int length){
        Student temp;  // variable declaration
        int minIndex = xIndex;  // variable declaration

        for(int sIndex = xIndex + 1; sIndex < length; sIndex++){
            if(s[minIndex].getGPA() < s[sIndex].getGPA())
                minIndex = sIndex;
        }  // end of for loop
        if(minIndex != xIndex){
            temp = s[xIndex];
            s[xIndex] = s[minIndex];
            s[minIndex] = temp;
        }  // end of if statement
        if(xIndex + 1 < length) {
            sortByGPA(s, xIndex + 1, length);
        }  // end of if statement

    }  // end of sortByGPA method

    private static int integerInput(String promptMessage, int min, int max){
        boolean valid = true;  // variable declaration
        int result = -1;  // variable declaration

        do {
            try {
                System.out.print(promptMessage);
                result = Integer.parseInt(keyboard.nextLine());
                if (result < min || result > max) throw new ArithmeticException();
                valid = true;
            } catch (NumberFormatException exc) {
                System.out.println("Only enter a number.");
                valid = false;
            }catch(ArithmeticException aEXC){
                System.out.println("Number must be between " + min + " and " + max + ".");
                valid = false;
            }
        }while(!valid);
        // end of do while
        return result;

    }  // end of integerInput method

    private static int integerInput(String promptMessage, int min){
        boolean valid = true;  // variable declaration
        int result = -1;  // variable declaration

        do {
            try {
                System.out.print(promptMessage);
                result = Integer.parseInt(keyboard.nextLine());
                if (result < min) throw new ArithmeticException();
                valid = true;
            } catch (NumberFormatException exc) {
                System.out.println("Only enter a number.");
                valid = false;
            }catch(ArithmeticException aEXC){
                System.out.println("Number must be at least " + min + ".");
                valid = false;
            }
        }while(!valid);
        // end of do while
        return result;
    }  // end of integerInput method

    private static double gPAInput(String promptMessage, int min){
        boolean valid = true;  // variable declaration
        double result = -1;  // variable declaration

        do{
            try{
                System.out.print(promptMessage);
                result = Double.parseDouble(keyboard.nextLine());
                if(result < min) throw new ArithmeticException();
                valid = true;
                if(result < 65) {
                    result = 65.00;
                }else if(result > 100) {
                    result = 100.00;
                }
            }catch(NumberFormatException nFExc) {
                System.out.println("Only enter a number.");
                valid = false;
            }catch(ArithmeticException aExc){
                System.out.println("Number must be at least " + min + ".");
                valid = false;
            }
        }while(!valid);
        // end of do while
        return result;

    }  // end of gPAInput method

} // end of class StudentList
