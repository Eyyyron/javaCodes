/**
 Name: Aguilar, Aaron Kyle M.
 Date: November 1, 2022
 Activity Name: SimpleGame

 Problem:
 Study, debug if needed, test, trace and improve the following program. (Be able to explain
 how the Random class is used.

 This program allows the user to guess a randomly generated integer between 1 and
 100
 (inclusive). The user is given 3 chances to guess the number. For every guess
 that is not
 correct, the program tells the user to try something higher or lower, whichever is
 appropriate.

 Analysis:
 Input: Guess of the Number

 Process:
 1. Assign the value to the guess of the number
 2. Repeat the guessing of the number 3 times
 3. Determine whether the user guessed the correct number or not
 4. Display the results
 5. End the process

 Output: Message determining whether the user guessed the correct number or not

 Algorithm:
 1. Let secretNo be an object for generateRandomNumber
 2. Let guess represent the guess of the user
 3. Let guessCount represent the number of guess count
 4. Display a prompt to input the guess of the user using JOption
 5. Assign the value to the guess of the number
 6. Repeat the guessing of the number 3 times using while loop
 7. Determine whether the user guessed the correct number or not using if-else statement
 8. Display the results
 9. End the program
 */

package FirstYearFirstTermAndSecondTerm.midterms;
import javax.swing.*;
import java.util.Random;

public class SimpleGame {
    public static void main(String[] args) {

        showIntroduction();
        int secretNo = generateRandomNumber(100);
        int guess = 0;
        int guessCount=0;
        boolean gotIt = false;
        while (!gotIt && guessCount< 3) {
            guess = readGuess(100);
            guessCount +=1;
            if (areEqual(guess, secretNo)){
                gotIt = true;
                JOptionPane.showMessageDialog(null, "Congratulations! You won.");
            }
            else {
                gotIt = false;
                String stringToDisplay = "";
                if (guessCount >= 3){
                    stringToDisplay += "You have guessed for 3 times already!  No more chance to guess!";
                    stringToDisplay += "The secret num ber is "+ secretNo + ".\n";
                    stringToDisplay += "\nThank you for playing anyway";
                } else {
                    if (guess < secretNo )
                        stringToDisplay = "You have to enter a number that is greater than your previous guess.";
                    else
                        stringToDisplay = "You have to enter a number that is lower than your previous guess.";
                }
                JOptionPane.showMessageDialog(null, stringToDisplay);
            }
        } // end of while

        System.exit(0);
    } // end of main method

    /**
     * Returns true if number1 is equal to number2
     * */
    public static boolean areEqual(int number1, int number2){
        return (number1 == number2);
    }

    /**
     * Returns an integer in the range 1 to upperLimit that is randomly generated
     */
    public static int generateRandomNumber(int upperLimit){
        Random randomNumberGenerator = new Random();
        int result = 0;
        result = 1 + randomNumberGenerator.nextInt(100);
        return result;
    }

    /**
     * Shows an introductory message on the output screen
     * */
    public static void showIntroduction(){
        String stringToDisplay = "This is a simple game program. \n";
        stringToDisplay += "I have a secret whole number. \n";
        stringToDisplay += "You have to guess my number. \n";
        stringToDisplay += "You have at most 3 chances to guess my secret number";
        JOptionPane.showMessageDialog(null, stringToDisplay);
    }

    /**
     * Returns an integer in the range 1 to upperLimit
     * that is entered by the program user
     * */
    public static int readGuess(int upperLimit){
        int result= 0;
        String promptMessage = "Enter your guess of my secret number that falls in the range 1 to " + upperLimit+".";
        try {
            while (result < 1 || result > upperLimit) {
                result = Integer.parseInt(JOptionPane.showInputDialog(promptMessage));
                if (result < 1 || result > upperLimit){
                    JOptionPane.showMessageDialog(null, "You must enter a whole number that is in the range 1 to "+ upperLimit +".");
                }
            }
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "You have to enter a number.");
            result = 0;
        }
        return result;
    } // end of readGuess Method

} // end of class


