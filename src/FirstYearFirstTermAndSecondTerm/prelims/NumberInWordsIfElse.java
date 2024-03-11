/**
 * Name: Aguilar, Aaron Kyle M.
 * Programming Date: September 20, 2022

 Problem: Get a number as input from the user, and output the equivalent of the number in words. The
 number inputted should range from 1-10. If the user inputs a number that is not in the range,
 output, "Invalid number".

 Analysis:
 Input: Numbers

 Process:
 1. Assign the value of the number.
 2. Create an else-if statement to determine the equivalence of the number into words.
 3. Display the results.
 4. End the process.

 Output: Words that are equivalent to the numbers

 Algorithm:
 1. Let number represent the number the user will input.
 2. Let one represent the word One.
 3. Let two represent the word Two.
 4. Let three represent the word Three.
 5. Let four represent the word Four.
 6. Let five represent the word Five.
 7. Let six represent the word Six.
 8. Let seven represent the word Seven.
 9. Let eight represent the word Eight.
 10. Let nine represent the word Nine.
 11. Let ten represent the word Ten.
 12. Display a message that will show the user to input a value that would only range from 1-10.
 13. Create an else-if statement to check if the input is equals to the range of 1-10,
 if not, display a message that would say "Invalid number".
 14. End the program.
 */

package FirstYearFirstTermAndSecondTerm.prelims;
import java.util.Scanner;

public class NumberInWordsIfElse {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        //Object of scanner

        int number = 0;             //Variable declaration
        String one = "One";         //Variable declaration
        String two = "Two";         //Variable declaration
        String three = "Three";     //Variable declaration
        String four = "Four";       //Variable declaration
        String five = "Five";       //Variable declaration
        String six = "Six";         //Variable declaration
        String seven = "Seven";     //Variable declaration
        String eight = "Eight";     //Variable declaration
        String nine = "Nine";       //Variable declaration
        String ten = "Ten";         //Variable declaration

        System.out.println("Enter number that would range from 1-10: ");
        number = Integer.parseInt(keyboard.nextLine());
        //Display a prompt to input the number that would range from 1-10

        //Else-if statement
        if (number==1) {
            System.out.print(one);
        } else if (number==2) {
            System.out.print(two);
        }else if (number==3) {
            System.out.print(three);
        }else if (number==4){
            System.out.print(four);
        } else if (number==5) {
            System.out.print(five);
        } else if (number==6) {
            System.out.print(six);
        } else if (number==7) {
            System.out.printf(seven);
        } else if (number==8) {
            System.out.printf(eight);
        } else if (number==9) {
            System.out.printf(nine);
        } else if (number==10) {
            System.out.printf(ten);
        }else {
            System.out.print("Invalid number");
        }//End of else-if statement

        System.exit(0);//End the program

    }//End of the main method
}//End of the class NumberInWordsIfElse



