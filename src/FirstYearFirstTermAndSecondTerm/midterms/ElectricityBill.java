/**
 Name: Aguilar, Aaron Kyle M.
 Date: October 31, 2022
 Activity Name: ElectricityBill

 Problem:
 Create an application that is similar to the sample program for water consumer but is in
 the context of electricity consumption. The program should involve appropriate methods.
 a. Give a brief description of the problem (Specification and assumptions)
 b. Show an algorithm for the program
 c. Show the source code for the program

 Analysis:
 Input: Name of consumer, previous reading, present reading, type of consumer

 Process:
 1. Ask for user's input
 2. Compute for watts used
 3. Ask for consumer type
 4. Display electric bill

 Output: Name of consumer, previous reading, present reading, type of consumer

 Algorithm:
 1. Read the name of the consumer
 2. Read the previous water meter reading in watts (reading last month) from the
 consumer’s meter. The meter reading cannot be less than zero.
 3. Read the present water meter reading in watts (reading this month) from the
 consumer’s meter. The present meter reading cannot be less than the previous water
 meter reading.
 4. Compute the watts consumed (consumption = CWUSed) by subtracting the
 previous reading from the present reading.
 5. Read the classification of the consumer (c for commercial, r for residential, i for industrial, p for public building)
 6. Compute the amount due from the consumer. The amount due is computed based on the
 following:
 For residential consumers
 10.277 per watt
 For commercial consumers
 9.7068 per watt
 For industrial consumers
 9.6754 per watt
 For public building consumers
 9.6790 per watt
 Source: BENECO Facebook Page
 7. Print a bill statement. The bill statement should show the name of the subscriber, the
 readings, the consumption and the amount due.
 */
package FirstYearFirstTermAndSecondTerm.midterms;
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // create scanner

        // declaring variables
        int presentReading = 0, previousReading = 0;
        String consumer;
        char t; // to hold type of consumer
        int nWUsed; // to hold number of watts of current used
        double amountDue = 0.0; // to hold the amount due

        // prompt for user's input
        System.out.print("Enter the consumer's name: ");
        consumer = sc.nextLine();
        // prompt for previous reading
        do {
            System.out.print("Enter the meter reading last month: ");
            previousReading = Integer.parseInt(sc.nextLine());
            if (previousReading < 0)
                System.out.println("The meter reading cannot be negative.");
        } while (previousReading < 0);
        // prompt for current reading
        do {
            System.out.print("Enter the meter reading this month: ");
            presentReading = Integer.parseInt(sc.nextLine());
            if (presentReading < previousReading)
                System.out.println("The current meter reading cannot be lesser than the previous meter reading.");
        } while (presentReading < previousReading);
        // compute for Watts used
        nWUsed = presentReading - previousReading;
        // prompt for consumer type
        do {
            System.out.print("Enter your classification:\n< Type 'r' " +
                    "for residential; 'c' for commercial; 'i' for industrial; " + "p for public building >: ");
            String input = sc.nextLine();
            t = input.charAt(0);
            if (t != 'r' && t != 'R' && t != 'c' && t != 'C' && t != 'i' && t != 'I' && t != 'p' && t != 'P') {
                System.out.println("The valid types are r for residential " +
                        "and c for commercial.");
            }
        } while (t != 'r' && t != 'R' && t != 'c' && t != 'C' && t != 'i' && t != 'I' && t != 'p' && t != 'P');
        // compute for amount due
        switch (t) {
            case 'r':
            case 'R':
                amountDue = nWUsed * 10.4277;
                break;
            case 'c':
            case 'C':
                amountDue = nWUsed * 9.7068;
                break;
            case 'i':
            case 'I':
                amountDue = nWUsed * 9.6754;
                break;
            case 'p':
            case 'P':
                amountDue = nWUsed * 9.6790;
                break;
        } // end of switch
        // display results
        System.out.println();
        System.out.println("Electric Billing Statement");
        System.out.println("Name of Consumer: " + consumer);
        System.out.print("Type of consumer: ");
        if (Character.toLowerCase(t) == 'r')
            System.out.println("Residential");
        if (Character.toLowerCase(t) == 'c')
            System.out.println("Commercial");
        if (Character.toLowerCase(t) == 'i')
            System.out.println("Industrial");
        if (Character.toLowerCase(t) == 'p')
            System.out.println("Public Building");
        System.out.println("Meter reading last month = " + previousReading +
                " Watts");
        System.out.println("Meter reading this month = " + presentReading +
                " Watts");
        System.out.println("Watts Consumed = " + nWUsed + " Watts");
        System.out.println("Amount Due = Php " + amountDue);

    }  // end of main method
}  // end of class


