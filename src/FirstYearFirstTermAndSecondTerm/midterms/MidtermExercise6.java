/**
 Name: Aguilar, Aaron Kyle M.
 Date: October 31, 2022
 Activity Name: MidtermExercise6

 Problem:
 Write a program for the computation of the tax due corresponding to a given taxable income.
 The tax due is determined based on the following table:
 Taxable Income                      Tax Due
 <= 25,000.00                        4,000.00
 > 25,000.00 but <= 125,000.00       4,000.00 + 8% (taxable income - 25,000.00)
 > 125,000.00 but <= 525,000.00      12,000.00 + 10% (taxable income - 125,000.00)
 > 525,000.00                        52,000.00 + 12% (taxable income - 525,000.00)

 Tax computation procedure of the Philippines:
 Taxable Income                          Tax Due
 <= 250,000.00                           0.00
 > 250,000.00 but <= 400,000.00          20% of the excess over 250000
 > 400,000.00 but <= 800,000.00          30,000.00 + 25% of the excess over 400000
 > 800,000.00 but <= 2,000,000.00        130,000.00 + 30% of the excess over 800000
 > 2,000,000.00 but <= 8,000,000.00      490,000 + 32% of the excess over 2000000
 > 800,000.00                            2,410,000 + 35% of the excess over 8000000

 Analysis:
 Input: Taxable Income

 Process:
 1. Assign the value to the taxable income
 2. Compute the tax due
 3. Display the result
 4. End the process

 Output: Tax Due

 Algorithm:
 1. Let taxableIncome represent the taxable income
 2. Let taxDue represent the tax due
 3. Display a prompt to input the taxable income
 4. Assign the value to the taxable income
 5. Compute the tax due
 6. Display the result
 7. End the program
 */

package FirstYearFirstTermAndSecondTerm.midterms;
import java.lang.*;
import java.util.Scanner;

public class MidtermExercise6 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in); // creates an object for scanner

        double taxableIncome;
        double taxDue = 0.0;
        byte bracket = 0;

        System.out.println("Income Tax Computation");
        System.out.print("Enter the taxable income: ");
        taxableIncome = keyboard.nextDouble();

        // the income entered will determine which bracket the input income falls into
        if (taxableIncome < 0)
            System.out.println("Only positive or valid values should allow the computer to continue the process.");
            System.exit(1);  // end the program if the user enters a negative value of the taxable income
        if (taxableIncome <= 250000.00) //<= 250,000.00
            bracket = 1;
        if (taxableIncome > 250000.00 && taxableIncome <= 400000.00)// > 250,000.00 but <= 400,000.00
            bracket = 2;
        if (taxableIncome > 400000.00 && taxableIncome <= 800000.00)// > 400,000.00 but <= 800,000.00
            bracket = 3;
        if (taxableIncome > 800000.00 && taxableIncome <= 2000000.00)// > 800,000.00 but <= 2,000,000.00
            bracket = 4;
        if (taxableIncome > 2000000.00 && taxableIncome <= 8000000.00)// > 2,000,000.00 but <= 8,000,000.00
            bracket = 5;
        if (taxableIncome > 8000000.00)// > 800,000.00
            bracket = 6;

        // determine the tax due based on which bracket the entered income falls into
        switch (bracket) {
            case 1:
                taxDue = 0.00; // 0%
                break;
            case 2:
                taxDue = (taxableIncome - 250000.00) * 0.20; // 20% of the excess over 250000
                break;
            case 3:
                taxDue = 30000.00 + (taxableIncome - 400000.00) * 0.25; // 30,000.00 + 25% of the excess over 400000
                break;
            case 4:
                taxDue = 130000.00 + (taxableIncome - 800000.00) * 0.30; // 130,000.00 + 30% of the excess over 800000
                break;
            case 5:
                taxDue = 490000.00 + (taxableIncome - 2000000.00) * 0.32; // 490,000 + 32% of the excess over 2000000
                break;
            case 6:
                taxDue = 2410000.00 + (taxableIncome - 8000000.00) * 0.35; // 2,410,000 + 35% of the excess over 8000000
                break;
            default:
                taxDue = 0.00;
        } // end of switch case

        System.out.printf("%s %.2f%n", "Tax Due = ", taxDue);
        System.exit(0);
    }  // end of main method
}  // end of class


