/**
 Name: Aguilar, Aaron Kyle M.
 Date: October 31, 2022
 Activity Name: MoneyInBank

 Problem:
 Below is the MoneyInBank program that needs to be improved
 as specified on page 9 of module4_112~.pdf.

 The improved program should be included in midterm.activities package.

 Input: opNumber, principal, and year
 Process:
 showIntroduction method
 Use a while loop on the user input
 try class was used to catch the invalid inputs of the user
 Prints out the box that shows the decision.
 User then will input the number corresponding to the program
 switch case is use here and inside the case is the program makeADeposit, withdrawAccount, and showData methods and quit the application command line
 Use the formula in the Initial moneyInBank.java program for method 3.
 Keep looping until the user wants to quit the program.
 Output: Final amount, balance, and etc.
 */

package firstYear.midterms;
import javax.swing.*;
import java.lang.*;

public class MoneyInBank {
    public static double balance = 0.0;
    public static void showIntroduction(){
        JOptionPane.showMessageDialog(null,"""
                This program is a modified program of the MoneyInBank.java program
                The initial version of the program allows you to input the year and the principal amount in order\s
                to calculate the final amount you will have a year after including your interest
                The new version of the program has included the usage of methods to allow you to switch
                into cases you want to execute.
                """);
    }
    public static void makeADeposit (){
        String inputString;
        double deposit;
        inputString = JOptionPane.showInputDialog("Enter the amount you want to deposit: ");
        deposit = Double.parseDouble(inputString);
        balance += deposit;
        JOptionPane.showMessageDialog(null,"Balance: " + balance);
    }

    public static void withdrawAccount(){
        String inputString;
        double withdraw;
        inputString = JOptionPane.showInputDialog("Enter the amount you want to withdraw: ");
        withdraw = Double.parseDouble(inputString);
        balance -= withdraw;
        JOptionPane.showMessageDialog(null,"Balance: " + balance);
    }
    public static void showData(){
        boolean valid = false;
        String inputString;
        StringBuilder displayString= new StringBuilder();
        int year;
        double interest;
        float annualRate = 0.05F, quarterlyRate;
        ADB();
        while (!valid) {
            try {
                inputString = JOptionPane.showInputDialog("Enter the year: ");
                year = Integer.parseInt(inputString);
                displayString.append(String.format("%s%.2f%n", "Principal = ", balance));
                displayString.append(String.format("%s%.2f%c%n", "Interest Rate = ", annualRate * 100, '%'));
                displayString.append(String.format("%s%10s%20s%30s%n", "Year", "Quarter", "Interest Earned", "Amount at end of quarter"));
                quarterlyRate = annualRate/4;
                for (int quarter = 1; quarter <=4 ; quarter++){
                    interest = balance * quarterlyRate;
                    balance += interest;
                    displayString.append(String.format("%s%10d%20.2f%30.2f%n", year, quarter, interest, balance));
                }
                JOptionPane.showMessageDialog(null, displayString.toString());
                valid = true;
            }catch (Exception exception) {
                JOptionPane.showMessageDialog(null,"Invalid input");
            }
        }
    }
    public static void ADB(){
        double ADB;
        String stringDisplay = "";
        stringDisplay += ( """
                The ADB or the Average Daily Balance is assuming that there is 30 days in a month and the\s
                balance in each day is the same which would mean that that the for the month the average daily balance\s
                is the same as the initial balance
                """);
        ADB = (balance * 0.05 * 30.00)/365;
        stringDisplay += String.format("%6s%.2f%n","The Average Daily Balance is: " , ADB);
        JOptionPane.showMessageDialog(null, stringDisplay);
    }
    public static boolean quitProgram(){
        JOptionPane.showMessageDialog(null, "The Program is exiting...");
        return false;
    }

    public static void main(String[] args) {
        showIntroduction();
        boolean repeat = true;
        String inputString;
        int decision;
        while (repeat) {
            try {
                inputString = JOptionPane.showInputDialog("""
                        1. Make a Deposit to Account\s
                        2. Withdraw from Account\s
                        3. Show the data associated with the account at the end of each quarter within a year\s
                        4. Quit the Application
                        
                        Enter the number of the corresponding process you want to conduct:
                        """);
                decision = Integer.parseInt(inputString);
                if (decision ==3 && balance == 0.0) throw new Exception();
                switch (decision) {
                    case 1 -> makeADeposit();
                    case 2 -> withdrawAccount();
                    case 3 -> showData();
                    case 4 -> repeat = quitProgram();
                    default -> throw new Exception();
                }
            }catch (Exception exception){
                JOptionPane.showMessageDialog(null, "Invalid input");
            }
        }
        System.exit(0);
    } // end of the main method
} // end of the class

