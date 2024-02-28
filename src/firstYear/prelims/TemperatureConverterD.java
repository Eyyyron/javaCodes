package firstYear.prelims;

/*
Name: Aaron Kyle Aguilar
Date: September 19, 2022

Problem:
Write a program that will make the computer read a temperature in Degrees Fahrenheit
or Degrees Celsius. Then, the computer prints the equivalent temperature in Degrees
Celsius or Degrees Fahrenheit.
*Analysis
Input: Temperature in Fahrenheit or Celsius
Processes:
Input temperature
Convert the temperature entered
Display temperatures
Output: Temperature in Celsius or Fahrenheit
*Algorithm:
1. Declare needed variables
2. Print introductory messages
3. Show choices
Menu:
a. Convert from Fahrenheit to Celsius
b. Convert from Celsius to Fahrenheit
c. Quit
4. Read choice
5. If choice is a,
Read temperature in Fahrenheit (fahrenheit)
Convert the temperature: celsius = 5.0 / 9 * (fahrenheit - 32)
Show temperatures
6. If choice is b,
Read temperature in Celsius (celsius)
Convert the temperature: fahrenheit = 9.0 / 5 * celsius + 32
Show temperatures
7. If choice is c
Print parting message
8. If choice is not a, not b and not c
Show an error message
9. Exit
*/
/*
Problem:
Write a program that will make the computer read a temperature in Degrees Fahrenheit
or Degrees Celsius. Then, the computer prints the equivalent temperature in Degrees
Celsius or Degrees Fahrenheit.  The process repeats until the user decides to quit.

*Analysis
Input: Temperature in Fahrenheit or Celsius
Output: Temperature in Celsius or Fahrenheit

*Algorithm:
1. Declare needed variables
2. Print introductory messages
3. Show choices
    Menu:
    1. Convert from Fahrenheit to Celsius
    2. Convert from Celsius to Fahrenheit
    3. Quit

4. Read choice
5. If choice is not 1 and choice is not 2 and choice is not 3, display an error message for the user
             and repeat from step 2

6. If choice is 1,
    Read temperature in Fahrenheit (fahrenheit)
    Convert the temperature:celsius = 5.0 / 9 * (fahrenheit - 32)
    Show temperatures
    Wait for the cue of the user to continue
    Repeat from step 2

7. If choice is 2,
    Read temperature in Celsius (celsius)
    Convert the temperature: fahrenheit = 9.0 / 5 * celsius + 32
    show temperatures
    Wait for the cue of the user to continue
    Repeat from step 2

8. If choice is 3
    Print parting message
    Close the program

    NOTE: steps 5 to 8 may be handled by a switch-case statement
*/

import java.util.Scanner;
import java.lang.*;
public class TemperatureConverterD {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double celsius = 0.0; // to hold temperature in degrees celsius
        double fahrenheit = 0.0; // to hold temperature in degrees fahrenheit
        int choice = '0';
        double convertedValue = 0.0;
        do {
            while (choice != 1 && choice != 2 && choice != 3) {
                System.out.println("This program helps you convert temperature measures.");
                System.out.println("----------------Menu----------------------");
                System.out.println("1: Convert from Fahrenheit to Celsius");
                System.out.println("2: Convert from Celsius to Fahrenheit");
                System.out.println("3: Quit");
                System.out.println("----------------Menu----------------------");
                System.out.print("Enter your choice<1/2/3>: ");
                choice = Integer.parseInt(keyboard.nextLine());
                if (choice != 1 && choice != 2 && choice != 3) {
                    System.out.println("Invalid choice! You have to enter 1 or 2 or 3. ");
                    System.out.print("Press enter to continue.");
                    keyboard.nextLine();
                }
            } // end of while

            switch (choice) {
                case 1:
                    System.out.print("Enter the temperature in Fahrenheit: ");
                    fahrenheit = Float.parseFloat(keyboard.nextLine());
                    //Compute then display the equivalent temperature in Celsius
                    celsius = 5.0 / 9.0 * (fahrenheit - 32);
                    System.out.println(fahrenheit + " degrees Fahrenheit equals " + celsius + " degrees Celsius ");
                    System.out.println("\nPress enter to continue");
                    keyboard.nextLine();
                    choice = 0; // To let computer wait for a valid choice
                    break;

                case 2:
                    System.out.print("Enter the temperature in celsius: ");
                    celsius = Float.parseFloat(keyboard.nextLine());
                    //Compute then display the equivalent temperature in Celsius
                    fahrenheit = 9.0 / 5.0 * celsius + 32;
                    System.out.println(celsius + " degrees celsius equals " + fahrenheit + " degrees farenheit.");
                    System.out.println("\nPress enter to continue");
                    keyboard.nextLine();
                    choice = 0; // To let computer wait for a valid choice
                    break;

                case 3:
                    System.out.println("Thank you for using the program.");
                    System.out.println("Press enter to close the program");
                    keyboard.nextLine();
                    System.exit(0);
                    break;

                default:
                    //Actually, this part will not be reached because the previous loop
                    // ensured that choice is eith 1, 2 or 3.
                    System.out.println("No process will happen for other choices");
            } // end of switch case
        } while ( choice != 3 ); // end of do -hile
    } // end of main
} // end of class