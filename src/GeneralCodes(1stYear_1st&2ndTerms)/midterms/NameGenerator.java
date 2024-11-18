/**
 Name: Aguilar, Aaron Kyle M.
 Date: November 1, 2022
 Activity Name: NameGenerator

 Problem: Study, debug if needed, test, trace and improve the following program. (Be able to explain
 some methods of the String class.)

 The following program used some methods of the String class.

 Analysis:
 Input: User's First Name, Someone's First Name

 Process:
 1. Assign the value to the user's first name
 2. Assign the value to someone's first name
 3. Compute the possible names with the combination of the user's and someone's names using methods
 4. Display the results
 5. End the process

 Output: Possible Names of the Combination of the User's and Someone's Names

 Algorithm:
 1. Let s1 represent the user's first name
 2. Let s2 represent someone's first name
 3. Let name1 represent the user's first name in the methods
 4. Let name2 represent someone's first name in the methods
 5. Let result represent concatenation of the user's and someone's first name in the methods
 6. Display a prompt to input the user's first name
 7. Display a prompt to input someone's first name
 8. Assign the value to the user's first name
 9. Assign the value to someone's first name
 10. Compute the possible names with the combination of the user's and someone's names using methods
 11. Display the results
 12. End the program
 */

package FirstYearFirstTermAndSecondTerm.midterms;
import java.util.Scanner;
import java.util.Random;
import java.lang.*;

public class NameGenerator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s1 = "", s2 = "";
        System.out.print("Enter your first name: ");
        s1 = scan.nextLine();
        System.out.print("Enter someone's first name: ");
        s2 = scan.nextLine();

        System.out.println("\nPossible names of your proteges:");
        System.out.println("1. " + formName3(s1, s2));
        System.out.println("2. " + formName3(s2, s1));
        System.out.println("3. " + formName1(s2, s1));
        System.out.println("4. " + formName1(s1, s2));
        System.out.println("5. " + formName5(s1, s2, 5));
        System.out.println("6. " + formName5(s2, s1, 5));
        System.exit(0);
    } // end of main method
    /**
     * Returns the string formed by concatenating the first 2 characters of a String called name1
     * to and the last two characters of another String called name2.
     */
    public static String formName1(String name1, String name2) {
        String result = "";
        result = name1.substring(0, 2).concat(name2.substring(name2.length() - 2));
        return result;
    }  // end of formName1 method

    /**
     * Returns the string formed by concatenating the two strings name1 and name2
     */
    public static String formName3(String name1, String name2) {
        String result = "";
        result = name1.concat(name2);
        return result;
    }  // end of formName3 method
    /**
     * Returns a string with length n formed by concatenating characters that are alternately
     * taken from random positions of the two strings name1 and name 2.
     */
    public static String formName5(String name1, String name2, int n) {
        String result = "";
        Random generate = new Random();
        int location = 0;
        for (int x = 0; x < n; x++) {
            if (x % 2 == 0) {
                location = generate.nextInt(name1.length());
                result = result + name1.charAt(location);
            } else {
                location = generate.nextInt(name2.length());
                result = result + name2.charAt(location);
            }
        } // end of for
        return result;
    }  // end of formName5 method
}  // end of class

