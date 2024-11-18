/**
 * Name: Aguilar, Aaron Kyle M.
 * Programming Date: September 12, 2022
 * Activity Name and Number: Prelim Exercise Number 7
 -------------------------------------------------------------------
 Problem: Write a program that will read the amount of money that will be withdrawn from an ATM (e.g. P500 or P1200)
 then compute and output the least number of peso bills (P100 peso bills, P500 peso bills, P1000 peso bills) that
 will be dispensed by the machine for the requested amount. Determine also the amount of money corresponding
 to each peso bill dispensed, the sum total of number of bills dispensed, and sum total of amounts per
 denomination as shown below. Assume that enough bills are always available from the machine. Assume
 further that the machine can only dispense P100 peso bills, P500 peso bills, and P1000 peso bills.

 Analysis:
 Input: Peso bills (1000, 500, 100)

 Process:
 1. Assign the value of the peso bills.
 2. Compute the total of quantity dispensed.
 3. Compute the total amount of money.
 4. Display the results.
 5. End the process.

 Output: Total number of bills, Total of quantity dispensed, Total amount

 Algorithm:
 1. Let peso represent the peso bill.
 2. Let pb1 represent the 1000 peso bill.
 3. Let pb2 represent the 500 peso bill.
 4. Let pb3 represent the 100 peso bill.
 5. Let qd1 represent the quantity dispensed for 1000 peso bill.
 6. Let qd2 represent the quantity dispensed for 500 peso bill.
 7. Let qd3 represent the quantity dispensed for 100 peso bill.
 8. Let peso4 represent the total of quantity dispensed.
 9. Let peso1A represent the total amount for 1000 peso bill.
 10. Let peso2A represent the total amount for 500 peso bill.
 11. Let peso3A represent the total amount for 100 peso bill.
 12 Let peso4A represent the total of total amount.
 13. Display a prompt to input the peso bill.
 14. Assign the value to the peso bill.
 15. Compute the quantity dispensed.
 16. Compute the total of quantity dispensed.
 17. Compute the amount.
 18. Compute the total amount.
 19. Display the results.
 20. End the program.
 */

package FirstYearFirstTermAndSecondTerm.prelims;
import java.lang.*;
import java.util.Scanner;

public class Dispenser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);   // Make an object of Scanner that represents the keyboard

        System.out.print("Peso Bill To Be Dispensed: ");    //Displays a prompt to input peso bill to be dispensed
        int peso = Integer.parseInt(scan.nextLine());
        System.out.println("");

        //Assigns variable and value to Peso Bills
        int pb1 = 1000;  //variable declaration
        int pb2 = 500;   //variable declaration
        int pb3 = 100;   //variable declaration

        int qd1 = peso/pb1;     // A mathematical expression represents a value that is assigned to the variable
        int qd2 = (peso%pb1)/pb2;    // A mathematical expression represents a value that is assigned to the variable
        int qd3 = (peso%pb1%pb2)/pb3;     // A mathematical expression represents a value that is assigned to the variable
        //Computes the quantity dispensed

        int peso4 = (qd1 + qd2 + qd3);     // A mathematical expression represents a value that is assigned to the variable
        //Computes the total of quantity dispensed

        double peso1a = pb1 * qd1; // A mathematical expression represents a value that is assigned to the variable
        double peso2a = pb2 * qd2; // A mathematical expression represents a value that is assigned to the variable
        double peso3a = pb3 * qd3; // A mathematical expression represents a value that is assigned to the variable
        //Computes the amount

        double peso4a = (peso1a + peso2a + peso3a); // A mathematical expression represents a value that is assigned to the variable
        //Computes the total amount

        System.out.println("PESO BILLS             QUANTITY DISPENSED             AMOUNT");
        System.out.println("==========             ==================             ======");
        System.out.println("" +(pb1)+"                                    "+(qd1)+"             "+(peso1a)+"");
        System.out.println("" +(pb2)+"                                     "+(qd2)+"              "+(peso2a)+"");
        System.out.println("" +(pb3)+"                                     "+(qd3)+"              "+(peso3a)+"");
        System.out.println("----------             ------------------             ------");
        System.out.println("");
        System.out.println("Total No. Of Bills:                     "+(peso4)+"             "+(peso4a)+"");
        //Displays the output

        System.exit(0); //End of the Program

    } //End of Main Method
}//End of Class



