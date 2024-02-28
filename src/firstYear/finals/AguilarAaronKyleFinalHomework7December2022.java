/**
 Name: Aguilar, Aaron Kyle M.

 Class Code, Course Number, Schedule: 9315, 1:00 - 2:30 MW

 Date: December 11, 2022

 Problem:
 Objectives of the Activity
 1. Define and invoke methods in a class
 2. Declare and instantiate one-dimensional arrays
 3. Perform parallel array processing.
 4. Apply the selection sort algorithm
 5. Apply the linear search algorithm
 6. Apply method overloading (ex. In this program, the computeAverage method is overloaded )
 REQUIRED:
 Complete the program given below by replacing each blank line by the missed expression so that the completed program is a possible solution to the following
 problem. The blank line (i.e. missing expressions) is associated with a number as shown in a comment.
 Problem:
 In a typical water service distribution system, each consumer is billed on a monthly basis. The volume (in cubic meters)
 of water consumed is determined through reading the water meter ("Kontador") installed for the household of the consumer. Essentially, the water meter
 readings at the beginning and end of the billing period (one month) are recorded.
 A water distribution service subscriber is classified as either a residential or a commercial consumer. Different
 payment rates are applied for each classification of consumer. In addition, there is a minimum bill for both classifications
 of consumer. Assume that the following specifications are being followed with regards to the payment rates and minimum bills.
 If consumer classification is residential and water consumed(consumption) is at most 12 cubic meters, then the amount to be paid is 180.00
 If consumer classification is residential and water consumed(consumption) is greater than 12 cubic meters, then the amount to be paid is 180.00 +
 (consumption - 12)*30.00
 If consumer classification is commercial and water consumed(consumption) is at most 30 cubic meters, then the amount to be paid is 600.00
 If consumer classification is commercial and water consumed(consumption) is greater than 30 cubic meters, then the amount to be paid is 600.00 +
 (consumption - 30)*50.00
 Suppose a water service distribution system consumer wants to make a summary of his/her consumption for the 12 months of the past year. Suppose further
 that the water bills for the 12 months of a year by a water distribution service
 subscriber is summarized as follows.

 Inputs:
 Name of Water Distribution Service Consumer
 Classification of Consumer (Residential or Commercial)
 Water Meter Reading at the beginning of the year (i.e. January 1)
 Water Meter Readings at the end of each of the 12 months
 Consumption corresponding to minimum bills for each classification of consumer
 Payment Rates for each classification of consumer (Minimum Bill, price of water per cubic meter)
 Outputs:
 Cubic meters of water consumed for each month (monthly consumption)
 Amount paid for each month based on given rates (monthly payment)
 Average of monthly consumptions
 Average of monthly payments
 The month during which the amount of water consumed is highest
 The month during which the amount of water consumed is lowest
 Sorted presentation of the monthly water consumption following descending order
 Algorithm
 1. Declare the necessary variables.
 2. Assign the consumption corresponding to minimum bills.
 3. Assign the payment rates to be applied.
 4. Read the name of the water consumer (consumer).
 5. Read The classification (cType) of the consumer such that
 the only valid values for cType is "commercial" or
 "residential".
 6. Read Water Meter reading in cubic meters at the beginning of
 the year(previousR[0]).
 7. For month 1 (January) to 12 (December)
 Input the Water Meter reading in cubic meters at the end of
 the month (presentR) such that presentR cannot be less than
 the reading at the start of the month. Store the value in
 an array.
 Compute the volume of water consumed for the month
 consumption) by subtracting the previousR from presentR.
 Store the value in an array.
 Compute the amount due (amountDue) from the consumer based
 on the following rules

 If cType is residential and consumption <= 12, the amount due is 180.00
 If cType is residential and consumption > 12, the amount due is 180.00 + (consumption - 12)*30.00
 If cType is commercial and consumption <= 30, the amount due is 600.00
 If cType is commercial and consumption > 30, the amount due is 600.00 + (consumption - 30)*50.00
 Store the value in an array.
 8. Print the name of the consumer.
 9. Print the consumer type.
 10. Print the Water Meter reading at the beginning of the year.
 11. Print a table showing the 12 months, Water Meter readings at the end of each month, the amount paid due to the water consumption for each month.
 12. Determine and print the average of the monthly water consumptions.
 13. Determine and print the average of the monthly payments.
 14. Determine and print the month during which water consumption is highest.
 15. Determine and print the month during which water consumption is lowest.
 16. Present the monthly water consumption arranged in descending order.
 Sample Run
 This program will prepare a summary of the annual consumption of water of a water distribution consumer.
 You will be asked to enter the name and type of the consumer,
 the water meter reading at the start of the year,
 and the water meter reading at the end of each month.
 Enter the name of the water consumer: Agua Bebemos
 Enter the type of the consumer< you may type r for residential or c for commercial>: q
 The valid types are r for residential and c for commercial.
 Enter the type of the consumer< you may type r for residential or c for commercial>: r
 Enter the meter reading at the beginning of the year: -1
 The beginning meter reading cannot be negative.
 Enter the meter reading at the beginning of the year: 0
 Enter the meter reading for month January :12

 Enter the meter reading for month February :35
 Enter the meter reading for month March :30
 Invalid datum entry! The present reading must be greater than the previous reading.
 Enter the meter reading for month March :50
 Enter the meter reading for month April :sd
 You have to enter a number.
 Invalid datum entry! The present reading must be greater than the previous reading.
 Enter the meter reading for month April :55
 Enter the meter reading for month May :79
 Enter the meter reading for month June :96

 Enter the meter reading for month July :110
 Enter the meter reading for month August :128
 Enter the meter reading for month September :132
 Enter the meter reading for month October :140
 Enter the meter reading for month November :155
 Enter the meter reading for month December :170
 Annual Water Bill Summary
 Name of Consumer: Agua Bebemos
 Type of consumer: Residential
 Meter reading at the beginning of year = 0 cubic meters
 --------------- -----------------------------------------------------------------
 Month End Reading Consumption Amount Paid
 --------------- ------------------------------------------------------------------
 January 12 12 180.00
 February 35 23 510.00
 March 50 15 270.00
 April 55 5 180.00
 May 79 24 540.00
 June 96 17 330.00
 July 110 14 240.00
 August 128 18 360.00
 September 132 4 180.00
 October 140 8 180.00
 November 155 15 270.00
 December 170 15 270.00
 --------------- ----------------------------------------------------------
 Average Monthly Reading = 14.166666666666666 cubic meters
 Average Monthly Payment = 292.5
 Month with Lowest Water Consumption = September
 Month with Highest Water Consumption = May
 --------------- -------------------------------------------------
 Descending Order of Water Consumption
 Month Consumption
 -----------------------------------
 May 24
 February 23
 August 18

 June 17
 March 15
 November 15
 December 15
 July 14
 January 12
 October 8
 April 5
 September 4
 -----------------------------------
 */
package firstYear.finals;
import java.util.Scanner;

public class AguilarAaronKyleFinalHomework7December2022 {
    /**Computes and returns the average of the elements an array of floating point numbers*/
    public static double computeAverage(double[] values){
        double total=0; // to hold the total of all elements
        double average=0; // to hold the average
        for (int x=0; x<values.length; x++) // add the elements
            total = total + values[x];
//compute the average
        average = total/values.length ; /* 1. Let average be total divided by number of elements in array */
        return average;
    } // end of computeAverage method
    /**Computes and returns the average of the elements an array of integers*/
    public static double computeAverage(int[] values){
        int total=0; // to hold the total of all elements
        double average=0; // to hold the average
        for (int x=0; x<values.length; x++) // add the elements
            total = total + values[x];
//compute the average
        average = (double) total/values.length; /* 2. Let average be total divided by number of elements in array */
        return average;
    } // end of computeAverage method
    /**Uses the linear search algorithm to find and return the index of the element with the lowest element of an array of integers*/
    public static int findLowest(int[] values){
        int result=0; // let lowest be the first element

        for (int x=1; x<values.length; x++) // find out if an element after the first is lower
            if (values[x] < values[result])
                result = x; /* 3. Let the value of result be the index of lower element between value[x] and value[result] */
        return result;
    } // end of findLowest method
    /**Uses the linear search algorithm to find and return the index of the element with the highest element of an array of integers*/
    public static int findHighest(int[] values){
        int result=0; // let highest be the first element
        for (int x=1; x<values.length; x++) // find out if an element after the first is higher
            if (values[x] > values[result])
                result = x; /* 4. Let the value of result be the index of higher element */
        return result;
    } // end of findHighest method
    /* Displays the menu of this application */
    private static void showIntroduction(){
        System.out.println("This program will prepare a summary of the annual consumption of water of a water distribution consumer.");
        System.out.println("You will be asked to enter the name and type of the consumer,\n\tthe Water Meter reading at the start of the year,\n\tand the Water Meter reading at the end of each month.");
                System.out.println();
        return; /* 5. Write the appropriate return statement */
    } // end of showIntroduction method
    /**
     * Returns an int representing a start reading that is accepted from the keyboard
     */
    public static int readStartReading(){ /* 6. Write the correct return type. Except writing the missing parts, no modification should be done in the code in
this block. */
        int reading = 0;
        Scanner keyboard = new Scanner(System.in);
        boolean problemFlag = false;
        do {
            problemFlag = false;
            try {
                System.out.print("Enter the meter reading at the beginning of the year: ");
                reading = Integer.parseInt(keyboard.nextLine()); /* 7. Assign a value to reading through the keyboard. */
            } catch (NumberFormatException x){
                problemFlag = true;
                System.out.println("You have to enter a number.");

            }
            if (reading < 0){
                System.out.println("The beginning meter reading cannot be negative.");
            }
        } while (reading < 0 || problemFlag);
        return reading;
    } // end of readStartReading method
    /** Returns a copy of a given array of integers */
    public static int[] copyArray(int[] arrayGiven){ // 8. return type
        int[] kopya = new int[arrayGiven.length];
        for (int index=0; index<arrayGiven.length; index++)
            kopya[index] = arrayGiven[index];
        return kopya;
    } // end of copyArray method
    /**
     * Returns an int that is accepted through the keyboard: the int represents a meter reading at the end of a billing month,
     * hence, the int cannot be less than a given startReading
     * */
    public static int readEndOfMonthReading(int startReading, String month){
        int reading = 0;
        Scanner keyboard = new Scanner(System.in);
        boolean pFlag = false;
        do {
            pFlag = false;
            try {
                System.out.print("Enter the meter reading for month " + month + " :");
                reading = Integer.parseInt(keyboard.nextLine());/* 9. Assign a value to reading through the keyboard */
            } catch (NumberFormatException x){
                pFlag = true;
                System.out.println("You have to enter a number.");
            }
            if (reading < startReading){
                System.out.println("Invalid entry! The present reading must be greater than " + startReading + " , the reading at the start of the month.");
            }
        } while (reading < startReading || pFlag);

        return reading;
    } // end of readEndOfMonthReading method
    /**
     *Returns the character r or c, whichever is entered through the keyboard, representing
     * residential or commercial type of consumer
     **/
    public static char readTypeOfConsumer(){
        char t='x';
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.print("Enter the type of the consumer< you may type r for residential or c for commercial>: ");
            String input = keyboard.nextLine();
            t = input.charAt(0); /* 10. Assign the first character of input to t */
            if (t != 'r' && t !='R' && t != 'c' && t != 'C'){
                System.out.println("The valid types are r for residential and c for commercial.");
            }
        } while (t != 'r' && t !='R' && t != 'c' && t != 'C');
        return t;
    } // end of readTypeOfConsumer method
    /**
     *Returns a value representing an amount paid for a month by a consumer with a given consumption, type, and
     * other values relevant to the computation of an amount due (e.g. minimum consumption cutoff, minimum bill amount,
     * rate per unit of consumption above the minimum.*/
    public static double computeAmountDue(int c, char t, int min1, double minB1, int min2, double minB2, float rate1, float rate2){
        double amount = 0;
        switch (t){ /* 11. What is missed here? */
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
    } // end of computeAmountDue method
    /** displays in parallel the elements of two arrays on the screen */
    public static void showArrayElements(int[] a, String[] m){
        System.out.println("\nDescending Order of Water Consumption");
        System.out.printf("%20s%15s%n", "Month","Consumption");
        System.out.printf("%20s%15s%n", "--------------------","---------------");
        for (int index=0; index<a.length; index++){
            System.out.printf("%-15s%-15d%n", m[index],a[index]); /* 12. Complete the format string for this printf statement */
        }
        System.out.printf("%20s%15s%n", "--------------------","---------------");
        return;
    } // end of showArrayElements method
    /**Uses the selection sort algorithm to sort in descending order an array of integers in parallel with an array of strings.
     * The original array of integers is preserved while the original form of the array of strings is not preserved.
     * The sorted array of integer is returned. */
    public static int[] sortArray(int[] array, String[] month){
        int minIndex=0;
        int[] sorted= copyArray(array);
        int temp=0;
        String dummy="";
        for (int x=0; x < sorted.length-1; x++){
            minIndex = x;
            for (int y=x+1; y<sorted.length; y++)
                if (sorted[minIndex] < sorted[y] )
                    minIndex = y;
            if (minIndex != x){
                temp = sorted[x];
                sorted[x] = sorted[minIndex];
                sorted[minIndex] = temp;
                dummy = month[x];

                month[x]= month[minIndex]; /* 13. What must be here so that elements of array month are swapped? */
                month[minIndex] = dummy; /* 14. What must be here so that elements of array month are swapped? */
            }
        } // end of first for
        return sorted;
    } // end of sortArray method
    /**
     *Displays a formatted program output
     **/
    public static void showSummary(String n, char t, String[] months, int[] previous, int[] present, int[] c, double[] amount){
        System.out.println();
        System.out.println("Annual Water Bill Summary");
        System.out.println("Name of Consumer: " + n);
        System.out.print("Type of consumer: ");
        if (Character.toLowerCase(t) == 'r')
            System.out.println("Residential");
        if (Character.toLowerCase(t) == 'c')
            System.out.println("Commercial");
        System.out.println("Meter reading at the beginning of year = " + previous[0] + " cubic meters");
        System.out.printf("%15s%15s%15s%20s%n", "---------------", "--------------", "---------------", "--------------------");
        System.out.printf("%15s%15s%15s%20s%n", "Month", "End Reading", "Consumption", "Amount Paid");
        System.out.printf("%15s%15s%15s%20s%n", "---------------", "--------------", "---------------", "--------------------");
        for (int index=0; index < previous.length; index++){
            System.out.printf("%15s%15d%15d%20.2f%n", months[index], present[index],c[index] , amount[index]);
        }
        System.out.printf("%15s%15s%15s%20s%n", "---------------", "--------------", "---------------", "--------------------");
        System.out.println("Average Monthly Reading = "+ computeAverage(c) + " cubic meters");
        System.out.println("Average Monthly Payment = "+ computeAverage(amount) );
        /* 15. Use a method to get the average of the elements of array amount */
        System.out.println("Month with Lowest Water Consumption = "+ months[findLowest(c)]);
        System.out.println("Month with Highest Water Consumption = "+ months[findHighest (c)]);
        /* 16. Get the index of the highest element of array c */
        System.out.printf("%15s%15s%15s%20s%n", "---------------", "--------------", "---------------", "--------------------");
        return;
    } // end of showSummary method
    /**
     * The code for the main flow of the program
     * */

    public static void main(String[] args){
        Scanner kbd = new Scanner(System.in);
        int[] presentReading= new int[12];
        int[] startReading= new int[12];
        int[] nCMUsed = new int[12]; // to hold number of cubic meters of water used for 12 months
        double[] amountDue= new double[12]; // to hold the amount paid for 12 months
        int[] sortedConsumption = new int[12]; // to hold sorted monthly consumption
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] sortedMonths = {"January","February","March","April","May","June","July", "August", "September", "October", "November", "December"};
        String consumer=""; // to hold name of consumer
        char cType = 'x'; // to hold type of consumer
        int minCMResidential=12; // to hold cut-off for minimum Bill for residential consumers
        int minCMCommercial=30; // to hold cut-off for minimum Bill for commercial consumers
        double minBillResidential=180.00; // minimum bill for <= 12 Cubic Meters used
        float rateResidential =30.00F; //cost of 1 Cubic Meter above the minimum consumption
        double minBillCommercial=600.00; // minimum bill for <= 20 cubic Meters used
        float rateCommercial =50.00F; //cost of 1 Cubic Meter above the minimum consumption for commercial consumers
        showIntroduction();
        System.out.print("Enter the name of the water consumer: ");
        consumer = kbd.nextLine();
        cType = readTypeOfConsumer(); /* 17. Invoke an appropriate method in order to assign a value to cType */
        startReading[0] = readStartReading(); // 18. Invoke readStartReading method
        for (int index=0; index < nCMUsed.length; index++){
            presentReading[index] = readEndOfMonthReading(startReading[index], months[index]);
            /* 19. Invoke the appropriate method for accepting a reading at the end of a month */
            if (index < (nCMUsed.length - 1))
                startReading[index+1] = presentReading[index];
            nCMUsed[index] = presentReading[index] - startReading[index];
            amountDue[index] = computeAmountDue(nCMUsed[index], cType, minCMResidential, minBillResidential, minCMCommercial, minBillCommercial,
                    rateResidential, rateCommercial);
        }
        showSummary(consumer, cType, months, startReading, presentReading, nCMUsed, amountDue);
        sortedConsumption = sortArray(nCMUsed, sortedMonths);
        showArrayElements(sortedConsumption,sortedMonths);
        /* 20. Invoke showArrayElements method to display elements of sortedConsumption and sortedMonths arrays */
        System.exit(0);
    } // end of main method
} // end of WaterBillSummary class

