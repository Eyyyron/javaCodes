/*
 *Problem:
 *   Create a program that lets the computer accept an amount that is a multiple of 100.
 *   The computer should then, display the number of five hundred in the entered amount
 *   and the number of one hundred corresponding to the remaining amount after 5oo hundreds
 *   are given.
 *
 * Algorithm:
 *   1. Let validAmount be false
 *   2. Let the stringToDisplay be the empty string and inputString be the empty string
 *   3. Let amount be 0, nFiveHundreds be 0 and nOneHundreds be 0.
 *   4. While validAmount is false
 *        4.1. Accept the amount
 *                if the amount is a multiple of 100, let validAmount=true and go to step 5
 *                else
 *                     Let validAmount=false
 *                     Display an error message and repeat step 4
 *   5. Concatenate "Amount to be given = ", the value of amount, and the newline character
 *            to stringToDisplay
 *   6. Compute number of nFiveHundreds
 *   7. Concatenate "Number of Five Hundred = ", the value of nFiveHundreds and the newline character
 *             to stringToDisplay
 *   8. Let amount = amount modulo 500
 *   9. Compute number of nOneHundreds in current value of amount
 *   10. Concatenate "Number of One Hundred = ", the value of nOneHundreds and the newline character
 *             to StringToDisplay
 *   11. Display stringToDisplay
 *   12. Close the program
 *
 *
 * */

package FirstYearFirstTermAndSecondTerm.prelims;

import javax.swing.*;

public class DemoClassB {
    public static void main(String[] args) {
        boolean validAmount = false;
        String stringToDisplay = "";
        String inputString="";
        int amount=0, nFiveHundreds=0, nOneHundreds=0;

        while ( !validAmount ){
            try {
                inputString = JOptionPane.showInputDialog("Enter an amount: ");
                amount = Integer.parseInt(inputString);

                if (amount % 100 == 0) {
                    validAmount = true;
                } else {
                    validAmount = false;
                    JOptionPane.showMessageDialog(null, "The amount is not a multiple of 100. ");
                }
            }   catch (Exception exception){
                validAmount = false;
                JOptionPane.showMessageDialog(null, "The amount is invalid");
            }
        } // end of while

        stringToDisplay = stringToDisplay + "Amount to be given = " + amount + "\n";
        nFiveHundreds = amount / 500;
        stringToDisplay = stringToDisplay + "No. of Five Hundred = " + nFiveHundreds + "\n";
        amount = amount % 500;
        nOneHundreds = amount / 100;
        stringToDisplay = stringToDisplay + "No. of One Hundred = " + nOneHundreds + "\n";

        JOptionPane.showMessageDialog(null, stringToDisplay);

    }

}