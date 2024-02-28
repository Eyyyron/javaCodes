/**
 * Name: Aguilar, Aaron Kyle M.
 * Name of Activity: Midterm Exam Part 2
 * Date: December 5, 2022
 */
package firstYear.midterms;
import java.util.Scanner;

public class MidtermExamPart2 {  //start of class AguilarAaronKyleMidtermExamPart2
    public static void main(String[] args) {  //start of the main method

        System.out.println("This application helps you determine if a year is a leap year or not.");
        System.out.println("This program will let the computer ask the user to enter a year and then the computer will determine if the entered year is a leap year or not.");
        //informs the user of what the program does

        isLeapYear(readYear());  //invocation of the isLeapYear method
        repeatProcess();  //invocation of the repeatProcess method
    }  //end of the main method

    public static int readYear(){  //start of readYear method
        Scanner keyboard = new Scanner(System.in);  //object for scanner
        int year;  //variable declaration for year

        do {  //start of do while loop
            System.out.println("\nEnter an integer representing a valid year of the Gregorian Calendar System (an integer that is at least 1582): ");
            year = Integer.parseInt(keyboard.nextLine());
            //allows the user to enter an integer representing a valid year of the Gregorian Calendar System (an integer that is at least 1582)

            if (year < 1582) {  //start of if statement
                System.out.println("");
                System.out.println(year + " is an invalid year. The year must be at least 1582.");
                //allows the user to notice if the year he/she inputs is invalid
            }  //end of if statement
        }while(year<1582);  //end of do while loop
        return year;  //returns the year
    }  //end of readYear method

    public static boolean isLeapYear(int year){  //start of isLeapYear method
        boolean valid = false;  //variable declaration for valid

        if(year%4==0 || year%400==0 && year%100!=0){  //start of if statement
            valid = true;
            System.out.println("");
            System.out.println(year + " is a leap year.");
            //allows the user to know if the year he/she input is a leap year or not
        }else{
            System.out.println("");
            System.out.println(year + " is not a leap year.");
            //allows the user to know if the year he/she input is a leap year or not
        } //end of if statement
        return valid;  //returns the valid

    }  //end of isLeapYear method

    public static String repeatProcess(){  //start of repeatProcess method
        Scanner keyboard = new Scanner(System.in);  //object for scanner
        String response;  //variable declaration for response

        System.out.println("Do you want to check another year? <Y>es/<N>o");
        response = keyboard.nextLine();
        //allows the user to check another year

        if(response.equalsIgnoreCase("y")){  //start of if statement
            isLeapYear(readYear());  //invocation of isLeapYear method
            repeatProcess();  //invocation of repeatProcess method
        }  //end of if statement

        if(response.equalsIgnoreCase("n")){  //start of if statement
            System.out.println("\nThank you.");
            System.exit(0);
        }  //end of if statement

        if(!response.equalsIgnoreCase("y") || !response.equalsIgnoreCase("n")){  //start of if statement
            System.out.println("\nYou have to type Y or N.");
            repeatProcess();  //invocation of repeatProcess method
        }  //end of if statement
        return response;  //returns the response

    }  //end of repeatProcess method
}  //end of class AguilarAaronKyleMidtermExamPart2