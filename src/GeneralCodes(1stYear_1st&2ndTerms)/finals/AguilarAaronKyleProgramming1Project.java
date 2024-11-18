package FirstYearFirstTermAndSecondTerm.finals;
import java.lang.*;
import java.util.Scanner;
import java.util.Random;

public class AguilarAaronKyleProgramming1Project {  //start of AguilarAaronKyleProgramming1Project class
    public static void main(String[] args) {  //start of main method
        Scanner keyboard = new Scanner(System.in);  //object of scanner

        int myChoice = 0;  //variable declaration

        showIntroduction();  //invocation of showIntroduction method
        keyboard.nextLine();

        do {  //start of do while loop
            showMainMenu();  //invocation of showMainMenu method
            myChoice = enterChoice(1, 4);  //invocation of enterChoice method
            switch (myChoice) {  //start of switch case
                case 1:
                    mathSolver();  //invocation of mathSolver method
                    break;
                case 2:
                    recordKeeping();  //invocation of recordKeeping method

                    break;
                case 3:
                    miscellaneousProcesses();  //invocation of miscellaneousProcesses method

                    break;
                case 4:
                    System.out.println("Thank you for using my program.");
                    System.out.println("Enjoy the rest of your day.");
            } //end of switch case
        } while (myChoice != 4);  //end of do while loop
    }  //end of main method

    /** This part was created on Nov. 25, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static void showIntroduction() {  //start of showIntroduction method
        System.out.println("");
        System.out.println("College of Information and Computing Sciences");
        System.out.println("Saint Louis University");
        System.out.println("Baguio City");
        System.out.println("---------------------------------------------");
        System.out.println("");
        System.out.println("Aaron Kyle Aguilar");
        System.out.println("Programmer");
        System.out.println("");
        System.out.print("Please press a key to see the Main Menu...");
    }  //end of showIntroduction method

    /** This part was created on Nov. 25, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static void showMainMenu() {  //start of showMainMenu method
        System.out.println("Main Menu");
        System.out.println("----------------------------");
        System.out.println("1. Math Routines");
        System.out.println("2. Recording Routines");
        System.out.println("3. Miscellaneous Routines");
        System.out.println("4. Exit");
        System.out.println("------------------------------");
    }  //end of showMainMenu method

    /** This part was created on Nov. 25, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static void showMenu1() {  //start of showMenu1 method
        System.out.println("Math Routine Submenu");
        System.out.println("-----------------------------------------------");
        System.out.println("1. Determine whether an integer is odd or even");
        System.out.println("2. Determine the sum of a series");
        System.out.println("3. Determine the factors of a number");
        System.out.println("4. Determine if a number is prime");
        System.out.println("5. Determine the area of a circle");
        System.out.println("6. Determine the area of a square");
        System.out.println("7. Determine the area of a triangle");
        System.out.println("8. Determine the area of a rectangle");
        System.out.println("9. Determine the area of a trapezoid");
        System.out.println("10. Determine the area of a parallelogram");
        System.out.println("11. Determine if an integer is a perfect number");
        System.out.println("12. Generate a multiplication table");
        System.out.println("13. Determine the roots of a quadratic equation");
        System.out.println("14. Generate a Fibonacci Sequence");
        System.out.println("15. Generate a Pascal's Triangle");
        System.out.println("16. Back to Main Menu");
        System.out.println("------------------------------------------------");
    }  //end of showMenu1 method

    /** This part was created on Nov. 25, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static void showMenu2() {  //start of showMenu2 method
        System.out.println("Recording Routine Submenu");
        System.out.println("-----------------------------------------------");
        System.out.println("1. Accept and sort list of students");
        System.out.println("2. Accept and sort list of salesmen");
        System.out.println("3. Accept pairs of names and grades and sort list according to name");
        System.out.println("4. Accept pairs of names and grades and sort list according to grade");
        System.out.println("5. Back to Main Menu");
        System.out.println("------------------------------------------------");
    }  //end of showMenu2 method

    /** This part was created on Nov. 25, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static void showMenu3() {  //start of showMenu3 method
        System.out.println("Miscellaneous Routine Submenu");
        System.out.println("-----------------------------------------------");
        System.out.println("1. Number Guessing Game");
        System.out.println("2. Covid19 Self-Assessment Procedure ");
        System.out.println("3. Bills Distribution of an Amount of Money");
        System.out.println("4. Interest of Money Invested ");
        System.out.println("5. Income Tax Computation");
        System.out.println("6. Insect Population Growth Rate");
        System.out.println("7. Water Bill Computation.");
        System.out.println("8. Electric Bill Computation.");
        System.out.println("9. Mobile Phone Load Balance Computation.");
        System.out.println("10. Back to Main Menu");
        System.out.println("------------------------------------------------");
    }  // end of showMenu3 method

    /** This part was created on Nov. 25, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static int enterChoice(int min, int max) {  //start of enterChoice method
        Scanner keyboard = new Scanner(System.in);  //object for scanner

        int choice = 0;  //variable declaration

        do {  //start of do while loop
            System.out.print("Input the number corresponding to your choice: ");
            choice = keyboard.nextInt();
            if (choice < min || choice > max) {  //start of if statement
                System.out.println("Invalid choice. Please ensure that you enter a number from " + min + " to " + max + ".");
            }  //end of if statement
        } while (choice < min || choice > max);  //end of do while loop
        return (choice);
    }  //end of enterChoice method


    /** START OF THE MATH ROUTINES*/


    /** This part was created on Nov. 25, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static void mathSolver() {  //start of mathSolver method
        Scanner keyboard = new Scanner(System.in);  //object for scanner
        int choice = 0;  //variable declaration
        do {  //start of do while loop
            showMenu1();  //invocation of showMenu1 method
            choice = enterChoice(1, 16);  //invocation of enterChoice method
            switch (choice) {  //start of switch case
                case 1: //determine whether an integer is odd or even
                    int integerA = 0;  //variable declaration

                    System.out.print("Enter an integer: ");
                    integerA = keyboard.nextInt();

                    System.out.println(getOddEven(integerA));  //invocation of getOddEven method
                    System.out.println();

                    System.out.print("Press enter to continue...");
                    keyboard.nextLine();
                    break;

                case 2: //determine the sum of a series
                    int integerB;  //variable declaration

                    System.out.print("Enter an integer: ");
                    integerB = keyboard.nextInt();

                    System.out.println("The sum of the series is " + getSumOfSeries(integerB));  //invocation of getSumOfSeries method
                    System.out.println();

                    System.out.print("Press enter to continue...");
                    keyboard.nextLine();

                    break;

                case 3: //determine the factors of a number
                    int integerC;  //variable declaration

                    System.out.println("Enter an integer: ");
                    integerC = keyboard.nextInt();

                    getFactors(integerC);  //invocation of getFactors method
                    System.out.println();

                    System.out.println("Press enter to continue...");
                    keyboard.nextLine();

                    break;

                case 4: //determine if a number is prime
                    int integerD;  //variable declaration

                    System.out.println("Enter an integer: ");
                    integerD = keyboard.nextInt();

                    System.out.println(getPrime(integerD));  //invocation of getPrime method
                    System.out.println();

                    System.out.println("Press enter to continue...");
                    keyboard.nextLine();

                    break;

                case 5: //determine the area of a circle
                    double radius = 0;  //variable declaration

                    System.out.println("Enter the radius: ");
                    radius = keyboard.nextDouble();

                    System.out.println("The area of circle is " + getAreaOfCircle(radius));  //invocation of getAreaOfCircle method
                    System.out.println();

                    System.out.println("Press enter to continue...");
                    keyboard.nextLine();

                    break;

                case 6: //determine the area of a square
                    double side = 0;  //variable declaration

                    System.out.println("Enter the side: ");
                    side = keyboard.nextDouble();

                    System.out.println("The area of square is " + getAreaOfSquare(side));  //invocation of getAreaOfSquare method
                    System.out.println();

                    System.out.println("Press enter to continue...");
                    keyboard.nextLine();

                    break;

                case 7: //determine the area of a triangle
                    double base = 0;  //variable declaration
                    double height = 0;  //variable declaration

                    System.out.println("Enter the base: ");
                    base = keyboard.nextDouble();

                    System.out.println("Enter the height: ");
                    height = keyboard.nextDouble();

                    System.out.println("The area of triangle is " + getAreaOfTriangle(base, height));  //invocation of getAreaOfTriangle method
                    System.out.println();

                    System.out.println("Press enter to continue...");
                    keyboard.nextLine();

                    break;

                case 8: //determine the area of a rectangle
                    double length = 0;  //variable declaration
                    double width = 0;  //variable declaration

                    System.out.println("Enter the length: ");
                    length = keyboard.nextDouble();

                    System.out.println("Enter the width: ");
                    width = keyboard.nextDouble();

                    System.out.println("The area of rectangle is " + getAreaOfRectangle(length, width));  //invocation of getAreaOfRectangle method
                    System.out.println();

                    System.out.println("Press enter to continue...");
                    keyboard.nextLine();

                    break;

                case 9: //determine the area of a trapezoid
                    double firstBase = 0;  //variable declaration
                    double secondBase = 0;  //variable declaration
                    double heightOfTrapezoid = 0;  //variable declaration

                    System.out.println("Enter the first base: ");
                    firstBase = keyboard.nextDouble();

                    System.out.println("Enter the second base: ");
                    secondBase = keyboard.nextDouble();

                    System.out.println("Enter the height: ");
                    heightOfTrapezoid = keyboard.nextDouble();

                    System.out.println("The area of trapezoid is " + getAreaOfTrapezoid(firstBase, secondBase, heightOfTrapezoid));  //invocation of getAreaOfTrapezoid method
                    System.out.println();

                    System.out.println("Press enter to continue...");
                    keyboard.nextLine();

                    break;

                case 10: //determine the area of a parallelogram
                    double baseOfParallelogram = 0;  //variable declaration
                    double heightOfParallelogram = 0;  //variable declaration

                    System.out.println("Enter the base: ");
                    baseOfParallelogram = keyboard.nextDouble();

                    System.out.println("Enter the height: ");
                    heightOfParallelogram = keyboard.nextDouble();

                    System.out.println("The area of parallelogram is " + getAreaOfParallelogram(baseOfParallelogram, heightOfParallelogram));  //invocation of getAreaOfParallelogram method
                    System.out.println();

                    System.out.println("Press enter to continue...");
                    keyboard.nextLine();

                    break;

                case 11: //determine if an integer is a perfect number
                    int integerE;  //variable declaration

                    System.out.println("Enter an integer: ");
                    integerE = keyboard.nextInt();

                    System.out.println(getPerfect(integerE));  //invocation of getPerfect method
                    System.out.println();

                    System.out.println("Press enter to continue...");
                    keyboard.nextLine();

                    break;

                case 12: //generate a multiplication table
                    int numberOfRows=0;  //variable declaration
                    int numberOfColumns=0;  //variable declaration

                    System.out.println("Enter the number of rows: ");
                    numberOfRows = keyboard.nextInt();

                    System.out.println("Enter the number of columns: ");
                    numberOfColumns = keyboard.nextInt();

                    System.out.println("\n          M U L T I P L I C A T I O N    T A B L E");

                    showMultiplicationTable(numberOfRows,numberOfColumns);  //invocation of showMultiplicationTable method
                    System.out.println();

                    System.out.println("Press enter to continue...");
                    keyboard.nextLine();

                    break;

                case 13: //Determine the roots of a quadratic equation
                    double a;  //variable declaration
                    double b;  //variable declaration
                    double c;  //variable declaration
                    double root1 = 0.0;  //variable declaration
                    double root2 = 0.0;  //variable declaration
                    String r1 = "";  //variable declaration
                    String r2 = "";  //variable declaration

                    System.out.println("Enter coefficient a: ");
                    a = keyboard.nextDouble();

                    System.out.println("Enter coefficient b: ");
                    b = keyboard.nextDouble();

                    System.out.println("Enter coefficient c: ");
                    c = keyboard.nextDouble();

                    System.out.println(solveRootsOfQuadraticEquation(a, b, c));  //invocation of solveRootsOfQuadraticEquation method
                    System.out.println();

                    System.out.println("Press enter to continue...");
                    keyboard.nextLine();

                    break;

                case 14: //generate a fibonacci sequence
                    int integerF;  //variable declaration

                    System.out.print("\nHow many terms do you want? ");
                    integerF = keyboard.nextInt();

                    generateFibonacciSequence(integerF);  //invocation of generateFibonacciSequence method
                    System.out.println();

                    System.out.print("Press enter to continue...");
                    keyboard.nextLine();
                    break;

                case 15: //generate a pascal's triangle
                    int integerG;  //variable declaration

                    System.out.println("Enter an integer: ");
                    integerG = keyboard.nextInt();


                    generatePascalTriangle(integerG);  //invocation of generatePascalTriangle method

                    System.out.println("Press enter to continue...");
                    keyboard.nextLine();

                    break;

            } // end of switch case
        } while (choice != 16);  //end of do while loop
    }  //end of mathSolver method

    /** END OF THE MATH ROUTINES*/


    /** START OF THE MATH ROUTINES METHODS*/


    /** This part was created on Nov. 25, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static String getOddEven(int integerA) {  //start of getOddEven method
        if (integerA % 2 != 0)  //start of if-else statement
            return ("The number is odd");
        else  //end of if-else statement
            return ("The number is even");
    }  //end of getOddEven method

    /** This part was created on Nov. 25, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static int getSumOfSeries(int integerB) {  //start of getSumOfSeries method
        int sum = 0;  //variable declaration

        for(int i=1; i<=integerB; i++) {  //start of for loop
            sum = sum + i;
        }  //end of for loop
        return sum;
    } //end of getSumOfSeries method

    /** This part was created on Nov. 25, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static int getFactors(int integerC){  //start of getFactors method
        int factors = 0;  //variable declaration

        for (int i = 1; i <= integerC; ++i) {  //start of for loop
            if (integerC % i == 0) {  //start of if statement
                System.out.print(i + " ");
            }  //end of if statement
        }  //end of for loop
        System.out.println("are the factors of " + integerC);
        return factors;
    }  //end of getFactors method

    /** This part was created on Nov. 25, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static String getPrime(int integerD){  //start of getPrime method
        int factorsFound = 0;  //variable declaration
        int i = 1;  //variable declaration

        while (i <= integerD){  //start of while
            if(integerD%i == 0){  //start of if statement
                factorsFound++;
            }  //end of if statement
            i++;
        }  //end of while

        if(factorsFound == 2){  //start of if-else statement
            return (integerD+ " is a prime number");
        }else  //end of if-else statement
            return (integerD+ " is not a prime number (composite)");
    }  //end of getPrime method

    /** This part was created on Nov. 25, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static double getAreaOfCircle(double radius){  //start of getAreaOfCircle method
        double area = 0;  //variable declaration

        area = 3.1416 * radius * radius;  //formula of the area of the circle

        return area;
    }  //end of getAreaOfCircle method

    /** This part was created on Nov. 25, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static double getAreaOfSquare(double side){  //start of getAreaOfSquare method
        double area = 0;  //variable declaration

        area = side*side;  //formula of the area of the square

        return area;
    }  //end of getAreaOfSquare method

    /** This part was created on Nov. 25, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static double getAreaOfTriangle(double base, double height){  //start of getAreaOfTriangle method
        double area = 0;  //variable declaration

        area = 0.5 * base * height;  //formula of the area of the triangle

        return area;
    }  //end of getAreaOfTriangle method

    /** This part was created on Nov. 25, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static double getAreaOfRectangle(double length, double width){  //start of getAreaOfRectangle method
        double area = 0;  //variable declaration

        area = length*width;  //formula of the area of the rectangle

        return area;
    }  //end of getAreaOfRectangle method

    /** This part was created on Nov. 25, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static double getAreaOfTrapezoid(double firstBase, double secondBase, double heightOfTrapezoid){  //start of getAreaOfTrapezoid method
        double area = 0;  //variable declaration

        area = ((firstBase + secondBase) / 2 ) * heightOfTrapezoid;  //formula of the area of the trapezoid

        return area;
    }  //end of getAreaOfTrapezoid method

    /** This part was created on Nov. 25, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static double getAreaOfParallelogram(double baseOfParallelogram, double heightOfParallelogram){  //start of getAreaOfParallelogram method
        double area = 0; //variable declaration

        area = baseOfParallelogram * heightOfParallelogram;  //formula of the area of the parallelogram

        return area;
    }  //end of getAreaOfParallelogram method

    /** This part was created on Nov. 25, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static String getPerfect(int integerE){  //start of getPerfect method
        int pSum = 0;  //variable declaration

        for(int i = 1; i < integerE; i++){  //start of for loop

            if(integerE%i == 0){
                pSum = pSum + i;
            }  //end of if statement
        }  //end of for loop

        if(integerE == pSum){  //start of if-else statement
            return (integerE+ " is a perfect number");
        }else  //end of if-else statement
            return (integerE+ " is not a perfect number");
    }  //end of getPerfect method

    /** This part was created on Nov. 25, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static void showMultiplicationTable(int nRows, int nColumns){  //start of showMultiplicationTable method
        for (int row=1 ; row<= nRows; row++){  //start of first for loop
            for (int column = 1; column <= nColumns; column++){  //start of second for loop
                System.out.printf("%8d", row*column );
            }  //end of second for loop
            System.out.println();
        }  //end of first loop
        return;
    }  // end of showMultiplicationTable method

    /** This part was created on Nov. 25, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static String solveRootsOfQuadraticEquation(double b, double a, double c){  //start of solveRootsOfQuadraticEquation method
        double root1 = 0;  //variable declaration
        double root2 = 0;  //variable declaration
        String r1 = "";  //variable declaration
        String r2 = "";  //variable declaration

        if (b * b - 4 * a * c >= 0) {  //start of if-else statement
            double root = 0.0;  //variable declaration
            root1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            root2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            return ("The roots are: " + root1 + " and " + root2 + ".");
        }
        else {
            r1 += -b / (2 * a) + " + (square root of (" + (-1) * (b * b - 4 * a * c) + ") * i) / " + (2 * a);
            r2 += -b / (2 * a) + " - (square root of (" + (-1) * (b * b - 4 * a * c) + ") * i) / " + (2 * a);
            return ("The imaginary roots are: " + r1 + " and " + r2 + ".");
        }  //end of if-else statement
    }  //end of solveRootsOfQuadraticEquation method

    /** This part was created on Nov. 25, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static void generateFibonacciSequence(int integerF) {  //start of generateFibonacciSequence
        int first = 0;  //variable declaration
        int second = 1;  //variable declaration
        int temp;  //variable declaration
        int count = integerF;  //variable declaration

        System.out.println("Terms: ");

        if (integerF == 1)  //if statement
            System.out.println(first);
        if (integerF == 2)  //if statement
            System.out.println(first + " , " + second);
        if (integerF > 2) {  //if statement
            System.out.print(first + " , " + second);
            count = count - 2; // remaining terms to print
            while (count > 0) {  //start of while
                temp = first;
                first = second;
                second = temp + second;
                System.out.print(" , " + second);
                count--;
            } // end of while
            System.out.println();
        } // end of if nTerms > 2
    } // end of generateFibonacciSequence method

    /** This part was created on Nov. 25, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static void generatePascalTriangle(int integerG){  //start of generatePascalTriangle
        for (int lines = 1; lines <= integerG; lines++) {  //start of first for loop
            for (int j = 0; j <= integerG - lines; j++) {  //start of second for loop
                System.out.print(" ");
            }  //end of second for loop

            int g = 1;  //variable declaration
            for (int i = 1; i <= lines; i++) {  //start of third for loop

                // The first value in a line is always 1
                System.out.print(g + " ");
                g = g * (lines - i) / i;
            }  //end of third for loop
            System.out.println();
        }  //end of first for loop
    }  //end of generatePascalTriangle

    /** END OF THE MATH ROUTINES METHODS*/


    /** START OF THE RECORDING ROUTINES*/


    /** This part was created on Nov. 30, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static void recordKeeping() {  //start of recordKeeping method
        Scanner keyboard = new Scanner(System.in);  //object for scanner

        int myChoice = 0;  //variable declaration

        do {  //start of do while loop
            showMenu2();  //invocation of showMenu2 method
            myChoice = enterChoice(1, 5);  //invocation of enterChoice method
            switch (myChoice) {  //start of switch case
                case 1:  //accept and sort list of student
                    acceptAndSortNames("Student");

                    System.out.println("Press enter to continue...");
                    keyboard.nextLine();

                    break;
                case 2:  //accept and sort list of salesmen
                    acceptAndSortNames("Salesmen");

                    System.out.println("Press enter to continue...");
                    keyboard.nextLine();

                    break;
                case 3:  //accept pairs of names and grades and sort list according to name
                    acceptStringOrIntAndPairSortNames("Student", "String");

                    System.out.println("Press enter to continue...");
                    keyboard.nextLine();

                    break;
                case 4:  //accept pairs of names and grades and sort list according to grade
                    acceptStringOrIntAndPairSortNames("Student", "Integer");

                    System.out.println("Press enter to continue...");
                    keyboard.nextLine();

                    break;
            } // end of switch case
        } while (myChoice != 5);  //end of do while loop
    } // end of recordKeeping method

    /** END OF THE RECORDING ROUTINES*/


    /** START OF THE RECORDING ROUTINES METHODS*/


    /** This part was created on Nov. 30, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static void acceptAndSortNames (String type){  //start of acceptAndSortNames method
        Scanner keyboard = new Scanner(System.in);  //object for scanner

        int length = 0;  //variable declaration
        String [] names;  //variable declaration
        String [] sortedNames;  //variable declaration

        length = integerInput(1, 10000, "How many "+type+" will be sorted? ");  //invocation of integerInput method

        names = new String[length];
        sortedNames = new String[length];

        for(int i = 0; i < length; i++){  //start of for loop
            names[i] = stringInput("Please enter the name of "+type+" "+(i+1)+": ");  //invocation of stringInput method
        }  //end of for loop

        sortedNames = bubbleSort(names);  //invocation of bubbleSort method
        showArray(sortedNames);  //invocation of showArray method

    }  //end of acceptAndSortNames method

    /** This part was created on Nov. 30, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static void acceptStringOrIntAndPairSortNames(String type, String sortBy){  //start of acceptStringOrIntAndPairSortNames method
        int[] grades;  //variable declaration
        int length = 0;  //variable declaration
        String[] names;  //variable declaration


        length = integerInput(0, 1000,"Please enter the number of " + type);

        names = new String[length];
        grades = new int[length];

        for(int i = 0; i< length; i++){  //start of for loop
            names[i] = stringInput("Please enter the name of " + type+" "+(i + 1)+": ");
            grades[i] = integerInput("Please enter the grade of " + names[i]+": ");
        }  //end of for loop

        if(sortBy.toLowerCase().charAt(0) == 's')  //start of if-else statement
            parallelSelectionSortString(names, grades);  //invocation of parallelSelectionSortString method
        else
            parallelSelectionSortInt(names, grades);  //invocation of parallelSelectionSortInt method
        //end of if-else statement

        showArray(names);  //invocation of showArray
        showArray(grades);  //invocation of showArray

    }  //end of acceptStringOrIntAndPairSortNames

    /** This part was created on Nov. 30, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static String[] bubbleSort(String[] stringArray){  //start of bubbleSort
        String[] sortedArray = cloneArray(stringArray);  //invocation of cloneArray method
        int length = sortedArray.length;

        for(int i = 0; i < length-1; i++){  //start of first for loop
            for(int y = 0; y < length - i - 1; y++){  //start of second for loop
                if(sortedArray[y].compareToIgnoreCase(sortedArray[y+1]) > 0){  //start of if statement
                    String temp = sortedArray[y];
                    sortedArray[y] = sortedArray[y+1];
                    sortedArray[y+1] = temp;
                }  //end of if statement
            }  //end of second for loop
        }  //end of first for loop

        return sortedArray;
    }  //end of bubbleSort method

    /** This part was created on Nov. 30, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static void parallelSelectionSortString(String[] stringArray, int[] intArray){  //start of parallelSelectionSortString method
        int length = intArray.length;

        for(int i = 0; i < length - 1 ; i++){  //start of for first for loop
            int minIndex = i;
            for(int y = i+1; y < length; y++){  //start of second for loop
                if(stringArray[minIndex].compareToIgnoreCase(stringArray[y]) > 0){  //start of if statement
                    minIndex = y;
                }  //end of if statement
            }  //end of second for loop
            if(!(minIndex == i)){  //start of if statement
                String sTemp = stringArray[i];
                stringArray[i] = stringArray[minIndex];
                stringArray[minIndex] = sTemp;

                int iTemp = intArray[i];
                intArray[i] =  intArray[minIndex];
                intArray[minIndex] = iTemp;
            }  //end of if statement
        }  //end of first for loop
    }  //end of parallelSelectionSortString

    /** This part was created on Nov. 30, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static void parallelSelectionSortInt(String[] stringArray, int[] intArray){  //start of parallelSelectionSortInt method
        int length = intArray.length;

        for(int i = 0; i < length - 1 ; i++){  //start of first for loop
            int minIndex = i;
            for(int y = i+1; y < length; y++){  //start of second for loop
                if(intArray[minIndex] < intArray[y]){  //start of if statement
                    minIndex = y;
                }  //end of if statement
            }  //end of second for loop
            if(!(minIndex == i)){  //start of if statement
                String sTemp = stringArray[i];
                stringArray[i] = stringArray[minIndex];
                stringArray[minIndex] = sTemp;

                int iTemp = intArray[i];
                intArray[i] =  intArray[minIndex];
                intArray[minIndex] = iTemp;
            }  //end of if statement
        }  //end of first for loop
    }  //end of parallelSelectionSortInt method

    /** END OF THE RECORDING ROUTINES METHODS*/


    /** START OF THE MISCELLANEOUS ROUTINES*/

    /** This part was created on Dec. 4, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static void miscellaneousProcesses() {  //start of miscellaneousProcesses method
        Scanner keyboard = new Scanner(System.in);  //object for scanner

        int choice = 0;  //variable declaration
        do {  //start of do while loop
            showMenu3();  //invocation of showMenu3 method
            choice = enterChoice(1, 10);  //invocation of enterChoice method
            switch (choice) {  //start of switch case
                case 1:  //run the number guessing game
                    randomNumberGuessingGame(1, 100);  //invocation of the randomNumberGuessingGame method

                    System.out.println("Press enter to continue...");

                    keyboard.nextLine();
                    break;
                case 2:  //run the A(H1N1) self-diagnostic procedure
                    selfDiagnostic();  //invocation of the selfDiagnostic method

                    System.out.println("Press enter to continue...");

                    keyboard.nextLine();

                    break;
                case 3:  //bills distribution of an amount of money
                    billsDistribution();  //invocation of the billDistribution method

                    System.out.println("Press enter to continue...");

                    keyboard.nextLine();

                    break;
                case 4:  //interest of money invested
                    interestOfMoneyInvested();  //invocation of interestOfMoneyInvested method

                    System.out.println("Press enter to continue...");

                    keyboard.nextLine();

                    break;
                case 5:  //computes the income tax
                    incomeTaxComputation();  //invocation of incomeTaxComputation

                    System.out.println("Press enter to continue...");

                    keyboard.nextLine();

                    break;
                case 6:  //insect population growth rate
                    insectPopulationGrowthRate();  //invocation of insectPopulationGrowthRate

                    System.out.println("Press enter to continue...");

                    keyboard.nextLine();

                    break;

                case 7:  //computes the water bill
                    waterBillComputation();  //invocation of waterBillComputation method

                    System.out.println("Press enter to continue...");

                    keyboard.nextLine();

                    break;
                case 8:  //computes the electric bill
                    electricBillComputation();  //invocation of electricBillComputation method

                    System.out.println("Press enter to continue...");

                    keyboard.nextLine();

                    break;
                case 9:  //computes the mobile phone load balance
                    loadBalanceComputer();  //invocation of loadBalanceComputer method

                    System.out.println("Press enter to continue...");

                    keyboard.nextLine();

                    break;

            } // end of switch case
        } while (choice != 10);  //end of do while loop
    } // end of miscellaneousProcesses method

    /**  END OF THE MISCELLANEOUS ROUTINES*/

    /** START OF THE MISCELLANEOUS ROUTINES METHODS*/

    /** This part was created on Dec. 4, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static void  billsDistribution(){  //start of billDistribution method
        billsDistributionIntroduction();  //invocation of billsDistributionIntroduction

        int amountToWithdraw;  //variable declaration
        int temp;  //variable declaration
        int[] bills = new int[3];
        do{  //start of do while loop
            amountToWithdraw = integerInput(0, "How much would you like to withdraw?\nPlease enter an amount that is divisible by 100.");
            if(amountToWithdraw % 100 != 0)  //if statement
                System.out.println("You can only withdraw an amount that is divisible by 100.");
        }while(amountToWithdraw % 100 != 0);  //end of do while loop

        try {  //start of try catch
            temp = amountToWithdraw;
            bills[0] = amountToWithdraw / 1000;
            temp %= 1000;
            bills[1] = temp / 500;
            temp %= 500;
            bills[2] = temp/100;

            if(temp != 0) throw new ArithmeticException("Error!");  //if statement
        }catch(ArithmeticException billError) {
            System.out.println("There is an error in calculating the bills.");
        }  //end of try catch

        System.out.println("============================================");
        System.out.printf("%-20s%20s%40s%n","P1000",bills[0]+"x",bills[0]*1000+"PHP");
        System.out.printf("%-20s%20s%40s%n","P1000",bills[1]+"x",bills[1]*500+"PHP");
        System.out.printf("%-20s%20s%40s%n","P1000",bills[2]+"x",bills[2]*100+"PHP");
        System.out.println("============================================");
        System.out.println("Total: "+((bills[0]*1000)+(bills[1]*500)+(bills[2]*100)));

        stringInput("Please press enter to continue...");  //invocation of stringInput method
    }

    /** This part was created on Dec. 4, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static void billsDistributionIntroduction(){  //start of billsDistributionIntroduction method
        System.out.println("This program calculates the amount of PHP50-PHP1000 that will be dispensed");
    }  //end of billsDistributionIntroduction method

    /** This part was created on Dec. 4, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static void selfDiagnostic(){  //start of selfDiagnostic method
        String stringToDisplay;  //variable declaration
        String prompt= "";  //variable declaration
        String [] symptoms = {"Fever","Difficulty Breathing","Diarrhea","Cough","Cold","Sore Throat"};
        char [] responses = new char[6];

        prompt += "Please enter (yes) if you are experiencing any\n";
        prompt += "of the following for the last 7 days and type (no) if not.\n";
        System.out.println(prompt);
        for (int index = 0 ; index<5; index++){  //start of for loop
            responses[index] = stringInput("Are you experiencing / did you have " + symptoms[index] + "\n").toLowerCase().charAt(0);
        }  //end of for loop
        if(linearSearch1(responses, 'y'))  //start of if-else statement
            System.out.println("Kindly go see your doctor.");
        else
            System.out.println("You are not ill.");  //end of if-else statement
    }  //end of selfDiagnostic method

    /** This part was created on Dec. 4, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static void waterBillComputation(){  //start of waterBillComputation method
        String[] input = new String[4];
        int pastReading = 0;  //variable declaration
        int presentReading = 0;  //variable declaration
        int i=0;  //variable declaration
        double result = 0;  //variable declaration
        String classification;  //variable declaration
        String name;  //variable declaration

        input = userInput();  //invocation of userInput method

        name = input[0];
        pastReading = Integer.parseInt(input[1]);
        presentReading = Integer.parseInt(input[2]);
        classification = input[3];

        i = presentReading - pastReading;

        if(classification.equals("c")){  //start of if-else statement
            result = commercialCompute(i);
        }else{
            result = residentialCompute(i);
        }  //end of if-else statement

        System.out.printf("%s %10s %n","Name:", name);
        System.out.printf("%s %10f %n","Amount Due:", result);

    }  //end of waterBillComputation method

    /** This part was created on Dec. 4, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static double residentialCompute(int cubicMeterConsumed){  //start of residentialCompute method
        double result;  //variable declaration

        if(cubicMeterConsumed <= 12){  //start of if-else statement
            result = 180;
        }else{
            result = 180.00 + (cubicMeterConsumed - 12 ) * 30.00;
        }  //end of if-else statement

        return result;
    }  //end of residentialCompute method

    /** This part was created on Dec. 4, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static double commercialCompute(int cubicMeterConsumed){  //start of commercialCompute method
        double result;  //variable declaration

        if(cubicMeterConsumed <= 30){  //start of if-else method
            result = 600;
        }else{
            result = 600 + (cubicMeterConsumed - 30 ) * 50.00;
        }  //end of if-else method
        return result;
    }  //end of commercialCompute method

    /** This part was created on Dec. 4, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static String[] userInput(){  //start of userInput method
        Scanner keyboard = new Scanner (System.in);  //object for scanner

        String[] input = new String[4];
        int pastReading = 0;  //variable declaration
        int presentReading = 0;  //variable declaration
        boolean valid = false;  //variable declaration

        input[0] =  stringInput("Enter the consumer's name: ");  //invocation of stringInput method

        do{  //start of do while loop
            input[1] = stringInput("Enter previous reading in cubic meters:");
            pastReading = Integer.parseInt(input[1]);
            if(pastReading < 0)  //if statement
                System.out.println("Value cannot be less than 0");
        }while(pastReading < 0);  //end of do while loop

        do{  //start of do while loop
            System.out.print("Please enter the present reading in cubic meters: ");
            input[2] = keyboard.nextLine();
            presentReading = Integer.parseInt(input[2]);
            if(pastReading > presentReading)  //if statement
                System.out.println("Present reading cannot be less than the previous reading");
        }while(pastReading > presentReading);  //end of do while method

        do{  //start of do while method
            System.out.print("Please enter classification [c for commercial and r for residential]: ");
            input[3] =  keyboard.nextLine();

            if(!(input[3].equalsIgnoreCase("c") || input[3].equalsIgnoreCase("r")))
                System.out.println("Please enter C or R");  //if statement

        }while(!(input[3].equalsIgnoreCase("c") || input[3].equalsIgnoreCase("r")));  //end of do while loop

        return input;
    }  //end of userInput method

    /** This part was created on Dec. 4, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static void randomNumberGuessingGame (int min, int max) {  //start of randomNumberGuessingGame
        int input;  //variable declaration
        int randomInt; //variable declaration

        randomNumIntro();  //invocation of randomNumIntro method

        stringInput("Press the enter key to continue...");  //invocation of stringInput method
        System.out.println("Number generated!");
        randomInt = randomInt(min, max);  //invocation of randomInt method
        System.out.println("Please enter your guess below:");

        char repeat;
        do {  //start of do while loop
            for (int x = 1; x <= 5; x++) {  //start of for loop
                System.out.println("You have "+(5 - x)+" tries remaining");

                input = integerInput("Guess Number " + x + ": ");  //invocation of userInput method

                if(input == randomInt){  //start of if-else statement
                    System.out.println("You guessed it right :) !!");
                    break;
                } else if (input > randomInt) {
                    System.out.println("Guess lower.");
                } else if (input < randomInt) {
                    System.out.println("Guess higher.");
                }  //end of if-else statement

            }  //end of for loop
            repeat = stringInput("Would you like to go again ?" +
                    "\n Y for yes || N for no").toLowerCase().charAt(0);  //invocation of stringInput method
        } while (repeat == 'y');  //end of do while loop

    }  //end of randomNumberGuessingGame method

    /** This part was created on Dec. 4, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static void randomNumIntro(){  //start of randomNumIntro method
        System.out.println("This is a number guessing game where you" +
                "\n guess a random number from 1-100" +
                "\n You only get 5 tries)");
    }  //end of randomNumIntro method

    /** This part was created on Dec. 4, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static void incomeTaxComputation(){  //start of incomeTaxComputation method
        double taxableIncome;  //variable declaration
        double taxDue = 0;  //variable declaration

        taxComputationIntroduction();  //invocation of taxComputationIntroduction

        do {  //start of do while loop
            taxableIncome = doubleInput(0, "Please enter your taxable income: ");
            if (taxableIncome < 250000) {  //start of if-else statement
                taxDue = 0;
            } else if (taxableIncome <= 400000) {
                taxDue = .20F * (taxableIncome - 250000);
            } else if (taxableIncome <= 800000) {
                taxDue = 30000 + .25F * (taxableIncome - 400000);
            } else if (taxableIncome <= 2000000) {
                taxDue = 130000 + .30F * (taxableIncome - 800000);
            } else if (taxableIncome <= 8000000) {
                taxDue = 490000 + .32F * (taxableIncome - 2000000);
            } else if (taxableIncome > 8000000) {
                taxDue = 2410000 + .35F * (taxableIncome - 8000000);
            }  //end of if-else statement

            System.out.printf("%n %s %.2f %n", "Your Tax Due is: ", taxDue);
        }while(repeat("Would you like to compute again?"));  //end of do while loop
        stringInput("Press enter to continue...");  //invocation of stringInput method
    }  //end of incomeTaxComputation method

    /** This part was created on Dec. 4, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static void taxComputationIntroduction(){  //start of taxComputationIntroduction method
        System.out.println("This computes your tax due based on your taxable income");
    }  //end of taxComputationIntroduction method

    /** This part was created on Dec. 4, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static void loadBalanceComputer(){  //start of loadBalanceComputer method
        double prepaidLoad;  //variable declaration
        double callTime;  //variable declaration
        double callRate;  //variable declaration
        double textRate;  //variable declaration
        int totalTexts;  //variable declaration

        prepaidLoadIntroduction();  //invocation of prepaidLoadIntroduction

        do {  //start of do while loop
            prepaidLoad = doubleInput("Please enter your existing load balance: ");  //invocation of doubleInput method
            totalTexts = integerInput("Total texts sent: ");  //invocation of integerInput method
            textRate = doubleInput(-1, "Rate per text sent: ");  //invocation of doubleInput method
            callTime = doubleInput(0, "Total minutes of call: ");  //invocation of doubleInput method
            callRate = doubleInput(-1, "Rate per minute(call): ");  //invocation of doubleInput method

            prepaidBalanceComputation(prepaidLoad, totalTexts, textRate, callTime, callRate);  //invocation of prepaidBalanceComputation method


        }while(repeat("Would you like to repeat this program? "));  //end of do while loop

    }  //end of loadBalanceComputer method

    /** This part was created on Dec. 4, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static void prepaidBalanceComputation(double prepaidLoad, int totalTexts, double textRate, double totalCallTime, double callRate){  //start of prepaidBalanceComputation method
        double balance;  //variable declaration
        balance = (prepaidLoad - (totalTexts * (textRate) + totalCallTime * (callRate)));  //formula for the balance
        if(balance < 0){  //start of if statement
            System.out.println("You have an overdrawn balance.");
            System.out.println("Amount to be paid: "+balance);
        }else
            System.out.println("Balance: "+balance);  //end of if-else statement
    }  //end of prepaidBalanceComputation method

    /** This part was created on Dec. 4, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static void prepaidLoadIntroduction(){  //start of prepaidLoadIntroduction method
        System.out.println("This is a program that calculates the amount to be paid" +
                "\n in your prepaid sim account.");
    }  //end of prepaidLoadIntroduction method

    /** This part was created on Dec. 4, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static void interestOfMoneyInvested(){  //start of interestOfMoneyInvested method
        float annualRate;  //variable declaration
        double principal;  //variable declaration
        int year;  //variable declaration

        investedMoneyIntroduction();  //invocation of investedMoneyIntroduction method

        year = integerInput("Enter the year: ");  //invocation of integerInput method
        principal = doubleInput("Enter the initial principal: ");  //invocation of doubleInput method
        annualRate = (float) integerInput("Please enter the annual interest rate(by %): ")/100;  //formula for annual rate

        computeInvestedInterest(annualRate, year, principal);  //invocation of computeInvestedInterest method

    }  //end of interestOfMoneyInvested method

    /** This part was created on Dec. 4, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static void computeInvestedInterest(float annualRate, int year, double principal){  //start of computeInvestedInterest method
        double finalAmount = 0;  //variable declaration
        double quarterlyRate = annualRate / 4;  //variable declaration
        double interest;  //variable declaration

        System.out.printf("%6s%8s%16s%30s%n","Year","Quarter","Interest earned","Amount at the end of the year");

        for(int i = 1; i <= 4; i++){  //start of for loop
            interest = quarterlyRate * principal;  //formula for interest
            finalAmount = interest + principal;  //formula for final amount
            System.out.printf("%6s%8d%16.2f%30.2f%n", year, i, interest, finalAmount);
            principal = finalAmount;  //formula for principal
        }  //end of for loop
    }  //end of computeInvestedInterest method

    /** This part was created on Dec. 4, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static void investedMoneyIntroduction(){  //start of investedMoneyIntroduction method
        System.out.println("This program calculates the interest of money invested");
        System.out.println("Interest and money invested is taken at runtime\n\n");
    }  //end of investedMoneyIntroduction method

    /** This part was created on Dec. 4, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static void insectPopulationGrowthRate() {  //start of insectPopulationGrowthRate method
        int finalSize;  //variable declaration
        int initialSize;  //variable declaration
        double rateOfGrowth;  //variable declaration

        System.out.println("Kindly enter the following:");
        initialSize = integerInput("Initial Population: ");  //invocation of integerInput method
        finalSize = integerInput("Current Population: ");  //invocation of integerInput method
        rateOfGrowth = (finalSize - initialSize) * 100.0 / initialSize;  //formula for rate of growth
        System.out.print("\nThe rate of growth is " + rateOfGrowth + "%");
        System.out.println(" because (" + finalSize + " - " + initialSize + ") * 100 / " + initialSize + " is " + rateOfGrowth + "%");
    }  //end of insectPopulationGrowthRate method

    /** This part was created on Dec. 4, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static void electricBillComputation(){  //start of electricBillComputation method
        Scanner keyboard = new Scanner(System.in);  //object for scanner

        int presentReading = 0;  //variable declaration
        int pastReading = 0;  //variable declaration
        String consumer;  //variable declaration
        char i;  //variable declaration
        int wattsUsed; //variable declaration
        double amountDue = 0.0; //variable declaration

        System.out.print("Enter the consumer's name: ");
        consumer = keyboard.nextLine();

        do {  //start of do while loop
            System.out.print("Enter the meter reading last month: ");
            pastReading = Integer.parseInt(keyboard.nextLine());

            if (pastReading < 0)  //if statement
                System.out.println("The meter reading cannot be negative.");
        } while (pastReading < 0);  //end of do while loop

        do {  //start of do while loop
            System.out.print("Enter the meter reading this month: ");
            presentReading = Integer.parseInt(keyboard.nextLine());

            if (presentReading < pastReading)  //if statement
                System.out.println("The current meter reading cannot be lesser than the past meter reading.");
        } while (presentReading < pastReading);  //end of do while loop

        wattsUsed = presentReading - pastReading;  //formula for watts used

        do {  //start of do while loop
            System.out.print("Enter your classification:\n< Type 'r' " +
                    "for residential; 'c' for commercial; 'i' for industrial; " + "p for public building >: ");
            String input = keyboard.nextLine();
            i = input.charAt(0);
            if (i != 'r' && i != 'R' && i != 'c' && i != 'C' && i != 'i' && i != 'I' && i != 'p' && i != 'P') {  //start of if statement
                System.out.println("The valid types are r for residential " +
                        "and c for commercial.");
            }  //end of if statement
        } while (i != 'r' && i != 'R' && i != 'c' && i != 'C' && i != 'i' && i != 'I' && i != 'p' && i != 'P');  //end of do while loop

        switch (i) {  //start of switch case
            case 'r':
            case 'R':
                amountDue = wattsUsed * 10.4277;
                break;
            case 'c':
            case 'C':
                amountDue = wattsUsed * 9.7068;
                break;
            case 'i':
            case 'I':
                amountDue = wattsUsed * 9.6754;
                break;
            case 'p':
            case 'P':
                amountDue = wattsUsed * 9.6790;
                break;
        } // end of switch case

        System.out.println();
        System.out.println("Electric Billing Statement");
        System.out.println("Name of consumer: " + consumer);
        System.out.print("Type of consumer: ");
        if (Character.toLowerCase(i) == 'r')
            System.out.println("Residential");
        if (Character.toLowerCase(i) == 'c')
            System.out.println("Commercial");
        if (Character.toLowerCase(i) == 'i')
            System.out.println("Industrial");
        if (Character.toLowerCase(i) == 'p')
            System.out.println("Public Building");
        System.out.println("Meter reading last month = " + pastReading +
                " Watts");
        System.out.println("Meter reading this month = " + presentReading +
                " Watts");
        System.out.println("Watts consumed = " + wattsUsed + " watts");
        System.out.println("Amount due = PHP " + amountDue);

    }  //end of electricBillComputation method

    /** END OF THE MISCELLANEOUS ROUTINES METHODS*/

    /** START OF THE OTHER METHODS*/

    /** This part was created on Nov. 28, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static boolean linearSearch1(char[] array, char value){  //start of linearSearch1 method
        for(int i = 0; i < array.length-1; i++){  //start of for loop
            if(array[i] == 'y')  //if statement
                return true;
        }  //end of for loop
        return false;
    }  //end of linearSearch1 method

    /** This part was created on Nov. 28, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static boolean repeat(String promptMessage){  //start of repeat method
        String input; //variable declaration

        System.out.println(promptMessage);
        input = stringInput("Y for yes || N for no");  //invocation of stringInput method
        return input.toLowerCase().charAt(0) == 'y';
    }  //end of repeat method

    /** This part was created on Nov. 28, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static int randomInt(int min, int max){  //start of randomInt method
        int generatedInt;  //variable declaration
        Random randomIntGenerator = new Random();

        generatedInt = randomIntGenerator.nextInt(min, max);
        return generatedInt;
    }  //end of randomInt method

    /** This part was created on Nov. 28, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static String[] cloneArray(String[] stringArray){  //start of cloneArray method
        String[] clonedArray = new String[stringArray.length];

        for(int i = 0; i < clonedArray.length; i++){  //start of for loop
            clonedArray[i] = stringArray[i];
        }  //end of for loop

        return clonedArray;
    }  //end of cloneArray method

    /** This part was created on Nov. 28, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static double doubleInput(String promptMessage){  //start of doubleInput method
        return Double.parseDouble(stringInput(promptMessage));
    }  //end of doubleInput method

    /** This part was created on Nov. 28, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static double doubleInput(double min, String promptMessage){  //start of doubleInput method
        double input;  //variable declaration
        do{  //start of do while method
            input = Double.parseDouble(stringInput(promptMessage));
            if (input < min)  //if statement
                System.out.println("Value cannot be lower than "+min);
        }while(input < min);  //end of do while loop
        return input;
    }  //end of doubleInput method

    /** This part was created on Nov. 28, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static double doubleInput(double min, double max, String promptMessage){  //start of doubleInput method
        double input;  //variable declaration
        do{  //start of do while method
            input = Double.parseDouble(stringInput(promptMessage));
            if (input < min ||input > max)  //start of if statement
                System.out.println("Value must be between "+min+" and "+max);  //end of if statement
        }while(input < min || input > max);  //end of do while loop
        return input;
    }  //end of doubleInput method

    /** This part was created on Nov. 28, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static int integerInput(String promptMessage){  //start of integerInput method
        int input = 0;  //variable declaration
        boolean valid = false;  //variable declaration

        do {  //start of do while loop
            try {  //start of try catch
                input = Integer.parseInt(stringInput(promptMessage));
                valid = true;
            } catch (NumberFormatException numberException) {
                System.out.println("Please enter a number.");
            }  //end of try catch
        }while(!valid);  //end of do while loop

        return input;
    }  //end of integerInput method

    /** This part was created on Nov. 28, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static int integerInput(int min, int max,String promptMessage){  //start of integerInput method
        int input = 0;  //variable declaration

        do {  //start of do while loop
            try {  //start of try catch
                input = Integer.parseInt(stringInput(promptMessage));
                if(input < min || input > max)  //start of if statement
                    System.out.println("Please enter a number between "+min+" and "+max);  //end of if statement
            } catch (NumberFormatException numberException) {
                System.out.println("Please enter a number.");
            }  //end of try catch
        }while(input < min || input > max);  //end of do while loop

        return input;
    }  //end of integerInput method

    /** This part was created on Nov. 28, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static int integerInput(int min, String promptMessage){  //start of integerInput method
        int input = 0;  //variable declaration
        do{  //start of do while loop
            try {  //start of try catch
                input = Integer.parseInt(stringInput(promptMessage));
                if (input < min) //start of if statement
                    System.out.println("Number should at least be " + min);  //end of if statement
            }catch(NumberFormatException numberFormatException){
                System.out.println("Please enter a number.");
            }  //end of try catch
        }while(input < min);  //end of do while loop
        return input;
    }  //end of integerInput method

    /** This part was created on Nov. 28, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static String stringInput(String promptMessage){  //start of stringInput method
        Scanner keyboard = new Scanner(System.in);  //object for scanner

        System.out.print(promptMessage);
        return keyboard.nextLine();
    }  //end of stringInput method

    /** This part was created on Nov. 28, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static void showArray(String[] array){  //start of showArray method
        for(int i = 0; i < array.length; i++){  //start of for loop
            System.out.print(array[i]+", ");
        }  //end of for loop
        System.out.println();
    }  //end of showArray method

    /** This part was created on Nov. 28, 2022 by <Aguilar, Aaron Kyle M.>*/
    public static void showArray(int[] array){  //start of showArray method
        for(int i = 0; i < array.length; i++){  //start of for loop
            System.out.print(array[i]+", ");
        }  //end of for loop
        System.out.println();
    }  //end of showArray method

    /** END OF THE OTHER METHODS */

} // end of AguilarAaronKyleProgramming1Project class