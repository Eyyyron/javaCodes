/**
 Name: Aguilar, Aaron Kyle M.
 Date of Programming: January 24, 2023
 Activity Name: (Prelim Exercise 1)
 Problem and other specifications: Create an illustrative Java application by completing the code presented below. Read the comments for specific items(completion tasks) to be done.

 (Hypothetical Annual Water Bill Summary Problem )
 The water bills for the 12 months of a year by a water service
 subscriber is summarized as follows.

 Inputs:
 Water Meter Reading at the beginning of the year (i.e. January 1)
 Water Meter Readings at the end of each of the 12 months
 Payment Rates (Minimum Bill, price of water per cubic meter)

 Outputs:
 Cubic meters of water consumed for each month (monthly consumption)
 Amount paid for each month based on given rates (monthly payment)
 Average of monthly consumptions
 Average of monthly payments
 The month during which the amount of water consumed is highest
 The month during which the amount of water consumed is lowest

 Algorithm
 1.Read the name of the water consumer (consumer).
 2.Read The classification (cType) of the consumer such
 that the only valid values for cType is "commercial" or "residential".
 3.Read water meter reading in cubic meters at the beginning of the year(previousR[0]).
 4.For month 1 to 12
 Read the water meter reading in cubic meters at the end of the month (presentR) such
 that presentR cannot be less than previousR. Store the value in an array.
 Compute the volume of water consumed for the month (consumption)
 by subtracting the previousR from presentR. Store the value in an array.
 Compute the amount due (amountDue) from the consumer based on
 the following rules
 If cType is residential and consumption <= 12, the amount due is 180.00
 If cType is residential and consumption > 12, the amount due is 180.00 + (consumption –
 12)*30.00
 If cType is commercial and consumption <= 30, the amount due is 600.00
 If cType is commercial and consumption > 30, the amount due is 600.00 + (consumption –
 30)*50.00
 Store the value in an array.
 5. Determine the average of the monthly water consumptions.
 6. Determine the average of the monthly payments.
 7. Determine the month during which water consumed is highest.
 8. Determine the month during which water consumed is least.
 9. Print the name of the consumer.
 10. Print the consumer type.
 11. Print the water meter reading at the beginning of the year.
 12. Print a table showing the 12 months, water meter readings at the end of each month, the amount paid due to the water
 consumption for each month.
 13. Print the average of the monthly water consumptions.
 14. Print the average of the monthly payments.
 15. Print the month during which water consumption is highest.
 16. Print the month during which water consumption is lowest.
 */

package secondYear.prelims;
import java.lang.*;
import java.util.Scanner;

public class AguilarWaterBillAnnualSummary {
    public static void main(String[] args) {
        int[] presentReading= new int[12];
        int[] startReading= new int[12];
        Scanner scanner = new Scanner(System.in);
        String consumer=""; // to hold name of consumer
        char cType = 'x'; // to hold type of consumer
        int[] nCMUsed = new int[12]; /* to hold number of cubic meters of water used for 12
months */
        int minCMResidential=12; /*to hold cut-off for minimum Bill for residential consumers */
        double minBillResidential=180.00; // minimum bill for <= 12 Cubic Meters used
        float rateResidential =30.00F; //cost of 1 Cubic Meter above the min. consumption
        int minCMCommercial=30; /* to hold cut-off for minimum Bill for commercial consumers*/
        double minBillCommercial=600.00; // minimum bill for <= 20Cubic Meters used
        float rateCommercial =50.00F; /*cost of 1 Cubic Meter above the min. consumption for
commercial consumers*/
        double[] amountDue= new double[12]; // to hold the amount paid for 12 months
        showIntroduction();
        System.out.print("Enter the name of the water consumer: ");
        consumer = scanner.nextLine();
        cType = readTypeOfConsumer();
        startReading[0] = readStartReading();
        for (int index=0; index < nCMUsed.length; index++){
            presentReading[index] = readEndOfMonthReading(startReading[index], (index+1));
            if (index < (nCMUsed.length - 1))
                startReading[index+1] = presentReading[index];
            nCMUsed[index] = presentReading[index] - startReading[index];
            amountDue[index] = computeAmountDue(nCMUsed[index], cType, minCMResidential,
                    minBillResidential, minCMCommercial, minBillCommercial, rateResidential, rateCommercial);
        }
        showSummary(consumer, cType, startReading, presentReading, nCMUsed, amountDue);
        System.exit(0);
    } // end of main method
    /**
     *Computes and returns the average of the elements an array of floating point numbers*/
    public static double computeAverage(double[] values){
        double total=0; // to hold the total of all elements
        double average=0; // to hold the average
        for (double element : values) // add the elements
            total = total + element;
//compute the average

        average = total/values.length ; // total divided by number of elements
        return average;
    }
    /**
     *Computes and returns the average of the elements an array of integers
     */
    public static double computeAverage(int[] values){
        double total=0; // to hold the total of all elements
        double average=0; // to hold the average
        for (int element : values) // add the elements
            total = total + element;
//compute the average
        average = (double) total/values.length ; //total divided by number of elements
        return average;
    }
    /**
     * The following method finds and returns the index of the element with the lowest value
     * from an array of positive integers.
     * The Linear Search algorithm is applied.*/
    public static int findLowest(int[] values){
        int result = 0; // let lowest be the first element
        for (int element = 1; element < values.length; element++) {  // find out if an element after the first is lower
            if (values[element] < values[result]) {
                result = element; // then set the lowest index to the index of lower element
            }
        }
        return result;
    }
    /**
     *Finds and returns the index of the element with the highest value from an array of
     integers*/
    public static int findHighest(int[] values){
        int result = 0; // let highest be the first element
        for (int element = 1; element < values.length; element++) { // find out if an element after the first is higher
            if (values[element] > values[result]) {
                result = element; //then set the highest index to the index of higher element
            }
        }
        return result;
    }

    //REQUIRED: Provide the algorithm
    /**
     1. Create the showSummary method in order to give the summary, composition, and the results the user wanted to see.
     2. Let the variable n be the name of the user.
     3. Let the variable t be the type of consumer.
     4. Let the variable previous be the previous meter reading at the beginning of the year.
     5. Let the variable present be the end reading.
     6. Let the variable c be the consumption.
     7. Let the variable amount be the amount paid.
     8. Print the data the user entered during the runtime on the showSummary method.
     9. Print the data from the result of the method computeAverage as the average monthly reading.
     10. Print the data from the result of the method computeAverage as the average monthly payment.
     11. Print the data from the result of the method monthInWord as the month with the lowest water consumption.
     12. Print the data from the result of the method monthInWord as the month with the highest water consumption.
     13. End the process.
     */
    public static void showSummary(String n, char t, int[] previous, int[] present, int[] c, double[] amount){
        System.out.println();
        System.out.println("Annual Water Bill Summary");
        System.out.println("Name of Consumer: " + n);
        System.out.print("Type of consumer: ");
        if (Character.toLowerCase(t) == 'r')
            System.out.println("Residential");
        if (Character.toLowerCase(t) == 'c')
            System.out.println("Commercial");
        System.out.println("Meter reading at the beginning of year = " + previous[0] + " cubic meters");
        System.out.printf("%15s%15s%15s%20s%n", "---------------", "--------------", "---------- -----", "--------------------");
        System.out.printf("%15s%15s%15s%20s%n", "Month", "End Reading", "Consumption", "Amount Paid");
        System.out.printf("%15s%15s%15s%20s%n", "---------------", "--------------", "---------- -----", "--------------------");
        for (int index=0; index < previous.length; index++){
            System.out.printf("%15s%15d%15d%20.2f%n", monthInWord(index+1), present[index],c[index] , amount[index]);
        }
        System.out.printf("%15s%15s%15s%20s%n", "---------------", "--------------", "---------- -----", "--------------------");
        System.out.println("Average Monthly Reading = "+ computeAverage(c));
        System.out.println("Average Monthly Payment = "+ computeAverage(amount));
        System.out.println("Month with Lowest Water Consumption = "+ monthInWord((findLowest(c) + 1)));
        System.out.println("Month with Highest Water Consumption = "+ monthInWord((findHighest(c) + 1)));
        System.out.printf("%15s%15s%15s%20s%n", "---------------", "--------------", "---------- -----", "--------------------");
        return;
    }
    // REQUIRED: Provide the algorithm
    /**
     1. Create the monthInWord method in order to determine the months that will be used for the program and to get the readings individually.
     2. Let the variable m as the variable for the switch case.
     3. Let the variable r as the variable for each case.
     4. Use a switch case in order to separate the readings from each month.
     5. Return r.
     6. End the process.
     */
    public static String monthInWord(int m){
        String r="";
        switch ( m ){
            case 1 : r = "January";
                break;
            case 2 : r = "February";
                break;
            case 3 : r = "March";
                break;
            case 4 : r = "April";
                break;
            case 5 : r = "May";
                break;
            case 6 : r = "June";
                break;
            case 7 : r = "July";
                break;
            case 8 : r = "August";
                break;
            case 9 : r = "September";
                break;
            case 10 : r = "October";
                break;
            case 11 : r = "November";
                break;
            case 12 : r = "December";
        } // end of switch
        return r;
    } // end of monthInWord method

    //REQUIRED: Provide the algorithm and the code
    /**
     1. Create the showIntroduction method in order to give a certain guideline in order for the user to have an idea about the program they will use.
     2. Print the necessary information in order to guide the user of the program regarding the data they will need to input and the expected output of the program.
     3. End the process.
     */
    public static void showIntroduction(){
// REQUIRED: Provide the code
        System.out.println("This program will create an illustrative Java application by completing the code presented below. Read the comments for\n" + "specific items(completion tasks) to be done.");
        System.out.println("This program will need:");
        System.out.println("Water Meter Reading at the beginning of the year (i.e. January 1)\n" + "Water Meter Readings at the end of each of the 12 months\n" + "Payment Rates (Minimum Bill, price of water per cubic meter)");
        System.out.println("This program will output:");
        System.out.println("Cubic meters of water consumed for each month (monthly consumption)\n" + "Amount paid for each month based on given rates (monthly payment)\n" + "Average of monthly consumptions\n" + "Average of monthly payments\n" + "The month during which the amount of water consumed is highest\n" + "The month during which the amount of water consumed is lowest");
        return;
    }
    // REQUIRED: Provide the algorithm and provide missing statements to complete the code
    /**
     1. Create the readStartReading method in order for the program to determine the meter reading at the beginning of the year.
     2. Initialize and let the variable problemFlag as the variable for the boolean.
     3. Initialize and let the variable reading as the variable for the meter reading at the beginning of the year.
     4. The program will ask the user to input the meter reading at the beginning of the year (reading) using a do while loop.
     5. Use the scanner in order to obtain the input from the user.
     6. Use a try catch in order to prompt a message if the user did not enter a number.
     7. Use a try catch in order to prompt a message if the user entered a negative number.
     8. Return reading.
     9. End the process.
     */
    public static int readStartReading(){
        /* REQUIRED: Declare local variables *
         */
        Scanner scanner = new Scanner(System.in);
        boolean problemFlag;
        int reading = 0;
        do {
            problemFlag = false;
            try {
                System.out.print("Enter the meter reading at the beginning of the year: ");
                reading = Integer.parseInt(scanner.nextLine());
// REQUIRED: Provide the input statement
            } catch (NumberFormatException x){
                problemFlag = true;
                System.out.println("You have to enter a number.");
            }
            if (reading < 0){
                System.out.println("The beginning meter reading cannot be negative.");

            }
        } while (reading < 0 || problemFlag);
        return reading;
    }
    // REQUIRED: Provide the algorithm and provide the missing statements to complete the code
    /**
     1. Create the readEndOfMonthReading method in order for the program to determine the meter reading for the specific month.
     2. Initialize and let the variable pFlag as the variable for the boolean.
     3. Initialize and let the variable reading as the variable for the meter reading for the specific month.
     4. The program will ask the user to input the meter reading at the beginning of the year (reading) using a do while loop.
     5. Use the scanner in order to obtain the input from the user.
     6. Use a try catch in order to prompt a message if the user did not enter a number.
     7. Use a try catch in order to prompt a message if the user entered a number lesser than the previous reading.
     8. Return reading.
     9. End the process.
     */
    public static int readEndOfMonthReading(int start, int month){
        Scanner scanner = new Scanner(System.in);
        boolean pFlag;
        int reading = 0;
        /*REQUIRED: Declare local variables */
        do {
            try {
                pFlag = false;
                System.out.print("Enter the meter reading for month " + monthInWord(month) + ":");
                reading = Integer.parseInt(scanner.nextLine());
//REQUIRED: Provide the necessary input statement
            } catch (NumberFormatException x){
                pFlag = true;
                System.out.println("You have to enter a number.");
            }
            if (reading < start){
                System.out.println("Invalid datum entry! The present reading must be greater than the previous reading.");
            }
        } while (reading < start || pFlag);
        return reading;
    }
    // REQUIRED: Provide the algorithm and provide the missing statements to complete the code
    /**
     1. Create the readTypeOfConsumer method in order for the program to determine which type the consumer is.
     2. Initialize and let the variable t as the variable for the type of consumer.
     3. The program will ask the user to input the type of consumer whether they are residential or commercial type (t) using a do while loop.
     4. Use the scanner in order to obtain the input from the user.
     5. Return t.
     6. End the process.
     */
    public static char readTypeOfConsumer(){
        Scanner scanner = new Scanner(System.in);
        char t = 'a';

        /*REQUIRED: Declare local variables */
        do {
            System.out.print("Enter the type of the consumer< you may type r for residential or c for commercial>: ");
            t = scanner.nextLine().charAt(0);
//REQUIRED: Provide needed statement(s)
            if (t != 'r' && t !='R' && t != 'c' && t != 'C'){
                System.out.println("The valid types are r for residential and c for commercial.");
            }
        } while (t != 'r' && t !='R' && t != 'c' && t != 'C');
        return t;
    }
    // REQUIRED: Provide the algorithm
    /**
     1. Create the computeAmountDue method in order for the program to compute the amount due for the user.
     2. Initialize and let the variable amount as the amount due.
     3. Let the variable c as the consumption.
     4. Let the variable t as the variable for the switch case.
     5. Use a switch case in order for the program to compute the amount due.
     6. Return amount.
     7. End the process.
     */
    public static double computeAmountDue(int c, char t, int min1, double minB1, int min2, double minB2, float rate1, float rate2){
        double amount = 0;
        switch (t){
            case 'r':
            case 'R':
                if ( c <= min1 ) {
                    amount = minB1;
                }
                else {
                    amount = minB1 + (c-min1)*rate1;
                }
                break;

            case 'c':
            case 'C':
                if ( c <= min2 ) {
                    amount = minB2;
                }
                else {
                    amount = minB2 + (c-min2)*rate2;
                }
        }
        return amount;
    }
} // end of class
