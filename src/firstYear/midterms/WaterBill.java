/**
 Name: Aguilar, Aaron Kyle M.
 Date: October 31, 2022
 Activity Name: WaterBill

 Problem:
 (Simplified Water Bill Computation)
 The bill for a water service subscriber is prepared as follows:
 1. Read the name of the water consumer
 2. Read the previous water meter reading in cubic meters (reading last month) from the
 consumer’s meter.
 The meter reading cannot be less than zero.
 3. Read the present water meter reading in cubic meters (reading this month) from the
 consumer’s meter.
 The present water meter reading cannot be less than the previous water meter reading.
 4. Compute the volume of water consumed (consumption = CMUSed) by subtracting the
 previous reading from the present reading.
 5. Read the classification of the consumer (c for commercial or r for residential)
 6. Compute the amount due from the consumer. The amount due is computed based on the
 following
 For residential consumers
 If Cubic Meters Consumed is then Amount Due (pesos)
 ==============================================
 Less than or equal to 12 180.00
 More than 12 180.00 + (cubicMetersConsumed – 12) * 30.00

 For commercial consumers
 If Cubic Meters Consumed is then Amount Due (pesos)
 ==============================================
 Less than or equal to 30 600.00
 More than 30 600.00 + (cubicMetersConsumed – 30) * 50.00
 7. Print a bill statement. The bill statement should show the name of the subscriber, the readings,
 the consumption and the amount due.

 Complete the following program for the Water Bill problem described above.
 The program should provide validation of data entries so that the billing process will be
 constrained to dealing with valid values.

 Analysis:
 Input: Consumer's Name, Meter Reading Last Month, Meter Reading This Month, Type of Consumer

 Process:
 1. Assign the value to the consumer's name
 2. Assign the value to the meter reading last month
 3. Assign the value to the meter reading this month
 4. Assign the value to the type of consumer
 5. Compute the water consumed
 6. Compute the amount due
 7. End the process

 Output: Water Consumed, Amount Due

 Algorithm:
 1. Let consumer represent the consumer's name
 2. Let previousReading represent the meter reading last month
 3. Let presentReading represent the meter reading this month
 4. Let cType represent the type of consumer
 5. Display a prompt to input the value of the consumer's name
 6. Display a prompt to input the value of the meter reading last month
 7. Display a prompt to input the value of the meter reading this month
 8. Display a prompt to input the value of the type of consumer
 9. Assign the value to the consumer's name
 10. Assign the value to the meter reading last month
 11. Assign the value to the meter reading this month
 12. Assign the value to the type of consumer
 13. Compute the water consumed
 14. Compute the amount due
 15. Display the results
 16. End the program
*/

package firstYear.midterms;
import java.lang.*;
import java.util.Scanner;

public class WaterBill {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int presentReading = 0;
        int previousReading = 0;
        String consumer = ""; // to hold name of consumer
        char cType; // to hold type of consumer
        String input = "";

        int nCMUsed; // to hold number of cubic meters of water used

        int minCMResidential = 12; // to hold cut-off for minimum Bill for residential consumers
        double minBillResidential = 180.00; // minimum bill for <= 12 Cubic Meters used
        float rateResidential = 30.00F; // cost of 1 Cubic Meter above the min. consumption

        int minCMCommercial = 30; // to hold cut-off for minimum Bill for commercial consumers
        double minBillCommercial = 600.00; // minimum bill for <= 20Cubic Meters used
        float rateCommercial = 50.00F; // cost of 1 Cubic Meter above the min. consumption for commercial consumers

        double amountDue = 0.0; // to hold the amount due

        System.out.print("Enter the consumer's name: ");
        consumer = keyboard.nextLine();

        do {
            System.out.print("Enter the meter reading last month: ");
            previousReading = Integer.parseInt(keyboard.nextLine());
            if (previousReading < 0) {
                System.out.println("The meter reading cannot be negative.");
            }
        } while (previousReading < 0);

        do {
            System.out.print("Enter the meter reading this month: ");
            presentReading = Integer.parseInt(keyboard.nextLine());
            if (presentReading < previousReading) {
                System.out.println("The meter reading cannot be less than the previous water reading.");
            }
        } while (presentReading < previousReading);

        nCMUsed = presentReading - previousReading;

        do {
            System.out.print("Which type of consumer are you? r = residential, c = commercial: ");
            input = keyboard.nextLine();
            cType = input.charAt(0);
            if (cType != 'r' && cType != 'R' && cType != 'c' && cType != 'C') {
                System.out.println("The valid types are r for residential and c for commercial.");
            }
        } while (cType != 'r' && cType != 'R' && cType != 'c' && cType != 'C');

        switch (cType){
            case 'r':
                if (nCMUsed > minCMResidential) {
                    amountDue = minBillResidential + (nCMUsed - minCMResidential) * rateResidential;
                } else if (nCMUsed <= minCMResidential) {
                    amountDue = minBillResidential;
                }
                break;

            case 'c':
                if (nCMUsed > minCMCommercial){
                    amountDue = minBillCommercial + (nCMUsed - minCMCommercial) * rateCommercial;
                } else if (nCMUsed <= minCMCommercial) {
                    amountDue = minBillCommercial;
                }
                break;

            default:
                break;
        }

        System.out.println("\n====================================================");
        System.out.println("Customer: " + consumer);
        if (cType == 'r'){
            System.out.println("Customer Type: Residential");
        } else if (cType == 'c') {
            System.out.println("Customer Type: Commercial");
        }
        System.out.println("====================================================");
        System.out.printf("%-20s%-20d%-20s%n", "Previous Reading:", previousReading, "Cubic Meters");
        System.out.printf("%-20s%-20d%-20s%n", "Current Reading:", presentReading, "Cubic Meters");
        System.out.printf("%-20s%-20d%-20s%n", "Water Consumed:", nCMUsed, "Cubic Meters");
        System.out.printf("%-20s%-20.2f%-20s%n", "Amount Due:", amountDue, "Pesos");
        System.out.println("====================================================");

    }  // end of main method
}  // end of class



