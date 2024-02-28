/**
 * Name: Aguilar, Aaron Kyle M.
 * Class Code and Schedule: 9315, 1:00 - 2:30 MW
 * Date: October 31, 2022
 *
 *Problem:
 *Write a program that may be used for checking if a
 *string is a palindrome or not.
 *A palindrome is a string that reads the same when it is read
 *from left to right as when it is read from right to left.
 *
 *For example,
 "ana" is a palindrome.
 "otto" is a palindrome.
 *
 Sample Run
 ----------------------------------------------------
 Enter a string: nasabayabasan
 nasabayabasan is a palindrome.
 ----------------------------------------------------
 Algorithm:
 1. Read a string and assign it to inputString
 2. Get the reversed form of inputString
 and assign it to reversedString
 3. if inputString is equal to reversed echo the message
 the input string is a palindrome. Otherwise, echo the
 message the input string is not a palindrome.
 **/

package firstYear.midterms;
import java.util.Scanner;

public class PalindromeChecker {
    static Scanner kbd= new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Enter a string: ");
        String input= kbd.nextLine();

        if (isPalindrome(input))
            System.out.println(input + " is a palindrome.");
        else
            System.out.println(input + " is not a palindrome.");

        System.exit(0);
    }  // end of main method

    public static String reverseString(String s){
        String r="";
        for ( int x=s.length() -1 ; x >=0; x--){
            r = r+s.charAt(x);
        }
        return r;
    }  // end of reverseString method

    public static boolean isPalindrome(String s){
        boolean r=false;
        String baligtad= reverseString(s);

        if (s.equals(baligtad))
            r = true;

        return r;
    }  // end of isPalindrome method


} // end of PalindromeChecker class

