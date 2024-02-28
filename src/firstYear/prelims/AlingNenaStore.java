/**
 Name: Aguilar, Aaron Kyle M.
 Date of completion: September 7, 2022
 Class Code and Course Number: 9315, CS112

 Problem: Create a program that will be used at the check-out counter of Aling Nena's Sari-Sari Store.
 Follow the assumptions given in the following description of Aling Nena’s store.
 The customers of Aling Nena's store always buy only one type of product, but they may buy one
 or more pieces of the said product. For example, a customer may buy 12 pieces of eggs or 2
 packs of milk.

 Analysis:
 Input: Product, Quantity, Unit price, Discount, Cash tendered

 Processes:
 1. Assign the value to the product.
 2. Assign the value to the quantity.
 3. Assign the value to the unit price.
 4. Assign the value to the discount.
 5. Assign the value to the cash tendered.
 6. Compute the total purchase amount.
 7. Compute the total discount.
 8. Compute the amount to be paid.
 9. Compute the change.
 10. Display the results.
 11. End the process.

 Output: Total purchase amount, Total discount, Amount to be paid, Change

 Algorithm:
 1. Let quantity represent the quantity.
 2. Let unitPrice represent the unit price.
 3. Let discount represent the discount.
 4. Let cashTendered represent the cash tendered.
 5. Let totalPurchase represent the total purchase amount.
 6. Let totalDiscount represent the total discount.
 7. Let amount represent the amount to be paid.
 8. Let change represent the change.
 9. Display a prompt to input the product.
 10. Display a prompt to input the quantity.
 11. Display a prompt to input the unit price.
 12. Display a prompt to input the discount.
 13. Display a prompt to input the cash tendered.
 14. Assign the value to the product.
 15. Assign the value to the quantity.
 16. Assign the value to the unit price.
 17. Assign the value to the discount.
 18. Assign the value to the cash tendered.
 19. Compute the total purchase amount.
 20. Compute the total discount.
 21. Compute the amount to be paid.
 22. Compute the change.
 23. Display the results.
 24. End the process.
 */

package firstYear.prelims;
import java.lang.*;
import java.util.Scanner;

public class AlingNenaStore {
    public static void main(String[] args) {

        Scanner cashier = new Scanner(System.in);
        //Object of scanner

        int quantity = 0;       //Variable declaration
        float unitPrice = 0;    //Variable declaration
        int discount = 0;       //Variable declaration
        float cashTendered = 0; //Variable declaration
        float totalPurchase = 0;    //Variable declaration
        float totalDiscount = 0;    //Variable declaration
        float amount = 0;           //Variable declaration
        float change = 0;           //Variable declaration

        System.out.print("Product: ");
        String product = cashier.nextLine();
        //Display a prompt to input the product

        System.out.print("Quantity: ");
        quantity = Integer.parseInt(cashier.nextLine());
        //Display a prompt to input the quantity

        System.out.print("Unit Price: ");
        unitPrice = Float.parseFloat(cashier.nextLine());
        //Display a prompt to input the unit price

        System.out.print("Discount: ");
        discount = Integer.parseInt(cashier.nextLine());
        //Display a prompt to input the discount

        System.out.print("Cash Tendered: ");
        cashTendered = Integer.parseInt(cashier.nextLine());
        //Display a prompt to input the cash tendered

        totalPurchase = quantity * unitPrice;
        System.out.println("\nTotal Purchase Amount: " + totalPurchase);
        //Multiply the quantity and the unit price and display the result

        totalDiscount = (totalPurchase*discount) / 100;
        System.out.println("Total Discount: " + totalDiscount);
        //Divide the product of the total purchase amount and the discount by 100 and display the result

        amount = totalPurchase - totalDiscount;
        System.out.println("Amount To Be Paid: " + amount);
        //Subtract the total discount from the total purchase amount and display the result

        change = cashTendered - amount;
        System.out.println("Change: " + change);
        //Subtract the amount to be paid from the cash tendered and display the results

        System.exit(0); //End the program

    }// End of the main method
}// End of the class AlingNenaStore


