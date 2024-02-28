package firstYear.prelims;

/**
 Problem: Create a program that uses the for statement to computes the value of base raised to exponent
 where base and exponent are whole numbers that are entered at program runtime.

 INPUT: base, exponent

 OUTPUT: value of base raised to exponent

 ALGORITHM:
 1. Declare variables for base, exponent and valueOfPower
 2. Prompt the program user to enter the value of base
 3. Let the computer accept the value of base
 4. Prompt the program user to enter the value of exponent
 5. Let the computer accept the value of exponent
 6. Initialize valueOfPower to 1;
 7. for ( x= 1 to exponent ), let valueOfPower = valueOfPower*base
 8. Show the value of power
 9. End the program
 * */

import java.lang.*;
import java.util.Scanner;

public class DemoClass1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("This program will compute the value of base raised to exponent. ");
        System.out.println("  where exponent is a small integer. ");
        System.out.println("You will be asked to enter the value of base and the exponent");
        //display the instructions of the program

        float base = 0;            //variable declaration
        int exponent = 0;           //variable declaration
        double valueOfPower = 0;    //variable declaration

        System.out.print("Enter the value of base: ");
        //prompt the program user to enter the value of base
        base = Float.parseFloat(keyboard.nextLine());
        //accept the value of the base

        System.out.print("Enter the value of exponent which must be a small integer: ");
        //prompt the program user to enter the value of exponent which must be a small integer
        exponent = Integer.parseInt(keyboard.nextLine());
        //accept the value of exponent which must be a small integer

        valueOfPower = 1;   //initialize the value of power to 1
        for (int x= 1; x<=exponent; x=x+1){
            valueOfPower = valueOfPower * base;
        }
        //for ( x = 1 to exponent ), let valueOfPower = valueOfPower*base

        System.out.println("The value of "+ base + " raised to "+ exponent + " is " + valueOfPower + ".");
        //display the results

        System.exit(0); //End the program

    } //End of main method
} //End of class
