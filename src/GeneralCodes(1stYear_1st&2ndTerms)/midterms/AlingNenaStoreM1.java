/**
 Name: Aguilar, Aaron Kyle M.
 Date: November 1, 2022
 Activity Name: AlingNenaStoreM1

 Problem:
 Write an improved version of the following program by providing validation processes for
 the input values. Debug the given program if needed. The following should be imposed:
 ✓ The product name should be restricted to five different products (i.e. egg, sugar, rice, salt,
 oil)
 ✓ The quantity cannot be a negative number.
 ✓ The unit price must be greater than zero
 ✓ The discount rate cannot be negative and it cannot be more than 100 percent.
 ✓ The amount tendered cannot be lower than the amount to be paid.
 If an input value is invalid, the user should be given an appropriate error message and a directive
 to enter another value. The user may repeatedly supply an invalid value. The processing should
 continue only if the user enters a valid value.

 Analysis:
 Input: Product Name, Quantity, Unit Price, Discount, Cash tendered

 Process:
 1. Assign the value to the product name
 2. Assign the value to the quantity
 3. Assign the value to the unit price
 4. Assign the value to the discount
 5. Assign the value to the cash tendered
 6. Compute the total purchase amount
 7. Compute the total discount
 8. Compute the amount to be paid
 9. Compute the change
 10. Display the results
 11. End the process

 Output: Total Purchase Amount, Total Discount, Amount to be Paid, Change

 Algorithm:
 1. Let pName represent the product name
 2. Let qty represent the quantity
 3. Let uPrice represent the unit price
 4. Let discount represent the discount
 5. Let amountTendered represent the cash tendered
 6. Let totalCost represent the total purchase amount
 7. Let discount represent the total discount
 8. Let discountedCost represent the amount to be paid
 9. Let change represent the change
 10. Display a prompt to input the product name
 11. Display a prompt to input the quantity
 12. Display a prompt to input the unit price
 13. Display a prompt to input the discount
 14. Display a prompt to input the cash tendered
 15. Assign the value to the product name
 16. Assign the value to the quantity
 17. Assign the value to the unit price
 18. Assign the value to the discount
 19. Assign the value to the cash tendered
 20. Compute the total purchase amount
 21. Compute the total discount
 22. Compute the amount to be paid
 23. Compute the change
 24. Display the results
 25. End the program
 */

package FirstYearFirstTermAndSecondTerm.midterms;
import java.lang.*;
import java.util.Scanner;

public class AlingNenaStoreM1 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String pName;
        double uPrice, totalCost, discount, discountedCost, amountTendered, change;
        int qty, dRate;

        System.out.print("Product (egg, sugar, rice, salt, oil): ");
        pName = keyboard.nextLine();

        switch (pName) {
            case "egg", "sugar", "rice", "salt", "oil" -> System.out.println();
            default -> {
                System.out.println("Sorry the item is not available.");
                System.exit(1);
            }
        }

        System.out.print("Quantity: ");
        qty = Integer.parseInt(keyboard.nextLine());
        if (qty < 0 ){
            System.out.println("The quantity cannot a negative number.");
            System.exit(1);
        }

        System.out.print("Unit Price: ");
        uPrice = Double.parseDouble(keyboard.nextLine());
        if (uPrice <= 0){
            System.out.println("The unit price must be greater than 0.");
            System.exit(1);
        }
        System.out.print("Discount: ");
        dRate = Integer.parseInt(keyboard.nextLine());

        if (dRate < 0 || dRate > 100){
            System.out.println("The discount rate cannot be negative and it cannot be more than 100 percent.");
            System.exit(1);
        }

        totalCost = uPrice * qty;
        discount = totalCost * (dRate / 100.0);
        discountedCost = totalCost - discount;
        System.out.print("Cash Tendered: ");
        amountTendered = Double.parseDouble(keyboard.nextLine());
        if (amountTendered<totalCost){
            System.out.println("The amount tendered cannot be lower than the amount to be paid.");
            System.exit(1);
        }
        change = amountTendered - discountedCost;
        System.out.printf("%-25s%12s%n", "----------------------", "--------------");
        System.out.printf("%-25s%12.2f%n", "Total Purchase Amount: ", totalCost);
        System.out.printf("%-25s%12.2f%n", "Total Discount: ", discount);
        System.out.printf("%-25s%12.2f%n", "Amount to be Paid: ", discountedCost);
        System.out.printf("%-25s%12.2f%n", "Change: ", change);
        System.exit(0);
    } // end of main method
} // end of class