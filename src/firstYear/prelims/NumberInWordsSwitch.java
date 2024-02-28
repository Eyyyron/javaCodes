/**
 * Name: Aguilar, Aaron Kyle M.
 * Programming Date: September 20, 2022

 Problem: Get a number as input from the user, and output the equivalent of the number in words. The
 number inputted should range from 1-10. If the user inputs a number that is not in the range,
 output, "Invalid number".

 Analysis:
 Input: Numbers

 Process:
 1. Assign the value of the number.
 2. Create a switch statement to determine the equivalence of the number into words.
 3. Display the results.
 4. End the process.

 Output: Words that are equivalent to the numbers

 Algorithm:
 1. Let number represent the number the user will input.
 2. Display a message that will show the user to input a value that would only range from 1-10.
 3. Create a switch statement to create multiple cases to convert the number the user would input into words, with a
 default in the end to print "Invalid number" when the number is not from the range of 1-10.
 4. End the program.
 */

package firstYear.prelims;
import java.lang.*;
import java.util.Scanner;

public class NumberInWordsSwitch {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        //Object of scanner

        int number = 0;     //Variable declaration

        System.out.println("Enter number that would range from 1-10: ");
        number = Integer.parseInt(keyboard.nextLine());
        //Display a prompt to input the number that would range from 1-10

        //Switch statement
        switch(number){

            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.print("Two");
                break;
            case 3:
                System.out.print("Three");
                break;
            case 4:
                System.out.print("Four");
                break;
            case 5:
                System.out.print("Five");
                break;
            case 6:
                System.out.print("Six");
                break;
            case 7:
                System.out.print("Seven");
                break;
            case 8:
                System.out.print("Eight");
                break;
            case 9:
                System.out.print("Nine");
                break;
            case 10:
                System.out.print("Ten");
                break;
            default:
                System.out.print("Invalid number");

        }//End of switch statement

        System.exit(0);//End of the program

    }//End of the main method
}//End of the class NumberInWordsSwitch


