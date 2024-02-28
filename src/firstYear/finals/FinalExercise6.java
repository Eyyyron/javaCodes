/**
 Name: Aguilar, Aaron Kyle M.

 Class Code, Course Number, Schedule: 9315, 1:00 - 2:30 MW

 Date: November 16, 2022

 Problem: Write an improved version of the program below such that there are validation processes for the input values
 and that appropriate methods are used. The improved version should be named <FinalExercise6.java>. The
 improved program should have other methods aside from the main method. The following should be imposed:
 ✓ The product name should be the same as one of the product names contained in a given array of strings.
 (Hint: Store the names of the valid products in an array and apply the linear search algorithm to check if
 an input product is in the array)
 ✓ The quantity cannot be a negative number.
 ✓ The unit price must be greater than zero
 ✓ The discount rate cannot be negative and it cannot be more than 100 percent.
 ✓ The amount tendered cannot be lower than the amount to be paid.
 If an input value is invalid, the user should be given an appropriate error message and a directive to enter
 another value. The user may repeatedly supply an invalid value. The processing should continue only if the user
 enters a valid value.
 */

package firstYear.finals;
import javax.swing.*;
import java.lang.*;

public class FinalExercise6 {
    public static void main(String[] args){

        String[] availableProducts = {"Apple", "Banana" ,"Pen" , "Paper", "Tang", "Milk"};
        int qty = 0, pIndex = 0;
        String chosenProduct;
        double price ,discount, totalCost, discountedCost, change, cashTendered;


        introduction(availableProducts);


        // validation loop for choosing a product
        do {
            chosenProduct = showPrompt("What would you like to buy ?\n\n" + "Available Products:\n" + arrayToString(availableProducts));
            if(!stringValidation(availableProducts, chosenProduct))
                JOptionPane.showMessageDialog(null, "Sorry the product you have chosen isn't available please choose another one");
        }while(!stringValidation(availableProducts, chosenProduct));
        // end of do while

        qty = showPrompt(0, "How many would you like to buy?");

        price = (double)(showPrompt(0, "Please enter the unit price for "+chosenProduct));

        totalCost = qty * price;

        discount = totalCost * getDiscount();

        discountedCost = totalCost - discount;

        change = amountTendered(discountedCost);

        printReceipt(totalCost, discount, discountedCost, change);

    }  // end of main method

    public static void printReceipt(double totalCost, double discount, double discountedCost, double change){
        String displayString = "";

        displayString += String.format("%-25s%35s%n", "----------------------", "--------------");
        displayString += String.format("%-25s%13.2f%n", "Total Purchase Amount: ", totalCost);
        displayString += String.format("%-25s%21.2f%n", "Total Discount: ", discount);
        displayString += String.format("%-25s%18.2f%n", "Amount to be Paid: ", discountedCost);
        displayString += String.format("%-25s%25.2f%n", "Change: ", change);

        JOptionPane.showMessageDialog(null, displayString);
    }  // end of printReceipt method


    public static int findIndex(String[] products, String chosenProduct){
        for(int x = 0; x < products.length; x++){
            if(chosenProduct.compareToIgnoreCase(products[x]) == 0)
                return x;
        }  // end of for loop
        return 0;
    }  // end of findIndex method

    public static String arrayToString(String[] array){
        String output = "";

        for(int x = 0; x < array.length; x++){
            output += array[x].concat(", ");
        }  // end of for loop
        return output;
    }  // end of arrayToString method

    public static void introduction(String[] products){
        String outputString ="";

        outputString += "Hi welcome to Aling Nena's Store!!\n\n";
        outputString += "Our products for today are: \n";
        outputString += arrayToString(products);

        JOptionPane.showMessageDialog(null, outputString);

    }  // end of introduction method

    public static boolean stringValidation( String[] products, String input){
        boolean valid = false;
        for(int x = 0; x < products.length; x++){
            if(input.compareToIgnoreCase(products[x]) == 0)
                valid = true;
        }  // end of for loop
        return valid;
    }  // end of stringValidation method


    public static int showPrompt(int min, String promptMessage){
        int input = min;

        do {

            try {
                input = Integer.parseInt(JOptionPane.showInputDialog(promptMessage));
                if(input < min)
                    JOptionPane.showMessageDialog(null, "Pleas enter a value between "+min+"-");
            } catch (NumberFormatException nme) {
                JOptionPane.showMessageDialog(null, "Please enter a number!!!");
                input = min - 1;
            }  // end of try catch

        } while(input < min);
        // end of do while

        return input;
    }  // end of showPrompt method

    public static int showPrompt(int min,int max, String promptMessage){
        int input = min;

        do {

            try {
                input = Integer.parseInt(JOptionPane.showInputDialog(promptMessage));
                if(input < min || input > max)
                    JOptionPane.showMessageDialog(null, "Pleas enter a value between "+min+"-"+max);
            } catch (NumberFormatException nme) {
                JOptionPane.showMessageDialog(null, "Please enter a number!!!");
                input = min - 1;
            }  // end of try catch

        } while(input < min || input > max);
        // end of do while

        return input;
    }  // end of showPrompt method

    public static double getDiscount(){
        double discount = 0;

        discount = showPrompt(0, 100, "Please enter the discount rate");

        return discount / 100;
    }  // end of getDiscount method

    public static String showPrompt(String prompMessage){
        return JOptionPane.showInputDialog(prompMessage);
    }  // end of showPrompt method

    public static double amountTendered(double totalToBePaid){
        double change = totalToBePaid;
        do {
            change -= showPrompt(0, "Amount to be paid: "+change+"\n\nPlease enter cash tendered: ");
            if(change > 0){
                JOptionPane.showMessageDialog(null,"Sorry your cash wasn't enough please add "+change+" more");
            }
        }while(change > 0);
        // end of do while

        return change * (-1);

    }  // end of amountTendered method

}  // end of class FinalExercise6
