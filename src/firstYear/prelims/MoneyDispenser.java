/**
 Name: Aguilar, Aaron Kyle M.
 Date of completion: September 12, 2022
 Class Code and Course Number: 9315, CS112

 Problem: Create a program that will read the amount of money that will be withdrawn from an ATM (e.g.
 P500 or P1200) then compute and output the least number of peso bills (P100 peso bills, P500
 peso bills, P1000 peso bills) that will be dispensed by the machine for the requested amount.
 Determine also the amount of money corresponding to each peso bill dispensed, the sum total of
 number of bills dispensed, and sum total of amounts per denomination as shown below. Assume
 that enough bills are always available from the machine. Assume further that the machine can
 only dispense P100 peso bills, P500 peso bills, and P1000 peso bills. Validate the input amount
 such that it should be divisible by 100.

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

package firstYear.prelims;
import java.lang.*;
import java.util.Scanner;

public class MoneyDispenser {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //Object of scanner

        int peso = 0;           //Variable declaration
        int pb1 = 0;            //Variable declaration
        int pb2 = 0;            //Variable declaration
        int pb3 = 0;            //Variable declaration
        int qd1 = 0;            //Variable declaration
        int qd2 = 0;            //Variable declaration
        int qd3 = 0;            //Variable declaration
        int peso4 = 0;          //Variable declaration
        double peso1A = 0;      //Variable declaration
        double peso2A = 0;      //Variable declaration
        double peso3A = 0;      //Variable declaration
        double peso4A = 0;      //Variable declaration


        System.out.print("Peso Bill To Be Dispensed: ");
        peso = Integer.parseInt(scan.nextLine());
        //Display a prompt to input peso bill to be dispensed

        System.out.println("");

        pb1 = 1000;
        pb2 = 500;
        pb3 = 100;

        qd1 = peso/pb1;                         //A mathematical expression represents a value that is assigned to the variable
        qd2 = (peso%pb1)/pb2;                   //A mathematical expression represents a value that is assigned to the variable
        qd3 = (peso%pb1%pb2)/pb3;               //A mathematical expression represents a value that is assigned to the variable
        //Computes the quantity dispensed

        peso4 = (qd1 + qd2 + qd3);              //A mathematical expression represents a value that is assigned to the variable
        //Computes the total of quantity dispensed

        peso1A = pb1 * qd1;                     //A mathematical expression represents a value that is assigned to the variable
        peso2A = pb2 * qd2;                     //A mathematical expression represents a value that is assigned to the variable
        peso3A = pb3 * qd3;                     //A mathematical expression represents a value that is assigned to the variable
        //Computes the amount

        peso4A = (peso1A + peso2A + peso3A);    //A mathematical expression represents a value that is assigned to the variable
        //Computes the total amount

        System.out.println("PESO BILLS             QUANTITY DISPENSED             AMOUNT");
        System.out.println("==========             ==================             ======");
        System.out.println("" +(pb1)+"                                    "+(qd1)+"             "+(peso1A)+"");
        System.out.println("" +(pb2)+"                                     "+(qd2)+"              "+(peso2A)+"");
        System.out.println("" +(pb3)+"                                     "+(qd3)+"              "+(peso3A)+"");
        System.out.println("----------             ------------------             ------");
        System.out.println("");
        System.out.println("Total No. Of Bills:                     "+(peso4)+"             "+(peso4A)+"");

        System.exit(0); //End of the program

    } //End of the main method
}//End of the class MoneyDispenser



