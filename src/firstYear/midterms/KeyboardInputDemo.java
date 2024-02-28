/**
 Name: Aguilar, Aaron Kyle M.
 Date: October 31, 2022
 Activity Name: KeyboardInputDemo

 Problem:
 Getting Inputs from the keyboard
 If an input stream is connected to the keyboard,
 data flow from the keyboard into the program.

 Analysis:
 Input: Dividend, Divisor

 Process:
 1. Assign the value to the dividend
 2. Assign the value to the divisor
 3. Compute the quotient
 4. Display the result
 5. End the process

 Output: Quotient

 Algorithm:
 1. Let dividend represent the dividend
 2. Let divisor represent the divisor
 3. Let quotient represent the quotient
 4. Display a prompt to input the dividend
 5. Display a prompt to input the divisor
 6. Assign the value to the dividend
 7. Assign the value to the divisor
 8. Compute the quotient
 9. Display the result
 10. End the program
*/

package firstYear.midterms;
import java.io.*;


public class KeyboardInputDemo {
    public static void run(){
        BufferedReader keyboard=null;
        double dividend=0, divisor=0, quotient=0;
        try{
            keyboard=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the dividend: ");
            dividend = Double.parseDouble( keyboard.readLine());
            System.out.print("Enter the divisor: ");
            divisor = Double.parseDouble( keyboard.readLine());
            System.out.println();
            quotient = dividend/divisor;
            System.out.println("Quotient = " + quotient);
        } catch (Exception exception){
            System.out.println("Problem detected!");
            System.out.println(exception.getMessage());
        }
    }// end run
    public static void main(String[] args) {
        run();
        System.exit(0);
    }  // end main method

}// end of class

