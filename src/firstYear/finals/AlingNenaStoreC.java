/**
 Name: Aguilar, Aaron Kyle M.

 Class Code, Course Number, Schedule: 9315, 1:00 - 2:30 MW

 Date: November 16, 2022

 Problem: Upload the given program.
 */

package firstYear.finals;
import java.util.Scanner;

public class AlingNenaStoreC {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String pName = "";
        double uPrice, totalCost, discount, discountedCost, amountTendered, change;
        int qty, dRate;
        System.out.print("Product: ");
        pName = keyboard.nextLine();
        System.out.print("Quantity: ");
        qty = Integer.parseInt(keyboard.nextLine());
        System.out.print("Unit Price: ");
        uPrice = Double.parseDouble(keyboard.nextLine());
        System.out.print("Discount: ");
        dRate = Integer.parseInt(keyboard.nextLine());
        totalCost = uPrice * qty;
        discount = totalCost * (dRate / 100.0);
        discountedCost = totalCost - discount;
        System.out.print("Cash Tendered: ");
        amountTendered = Double.parseDouble(keyboard.nextLine());
        change = amountTendered - discountedCost;
        System.out.printf("%-25s%12s%n", "----------------------", "--------------");
        System.out.printf("%-25s%12.2f%n", "Total Purchase Amount: ", totalCost);
        System.out.printf("%-25s%12.2f%n", "Total Discount: ", discount);
        System.out.printf("%-25s%12.2f%n", "Amount to be Paid: ", discountedCost);
        System.out.printf("%-25s%12.2f%n", "change: ", change);
        System.exit(0);
    }
}
