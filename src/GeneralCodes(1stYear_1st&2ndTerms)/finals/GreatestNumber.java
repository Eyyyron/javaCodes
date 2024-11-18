/**
 Name: Aguilar, Aaron Kyle M.

 Class Code, Course Number, Schedule: 9315, 1:00 - 2:30 MW

 Date: December 11, 2022

 Problem: Using Scanner, BufferedReader or JOptionPane, ask for 10 numbers from the user. Use an
 array to store the values of these 10 numbers. Output on the screen the number with the greatest
 value.
 */

package FirstYearFirstTermAndSecondTerm.finals;
import java.util.*;

public class GreatestNumber {  //start of GreatestNumber class
    public static void main(String[] args) {  //start of main method
        Scanner keyboard = new Scanner(System.in);  //object for scanner

        int temp = 0;  //variable declaration
        int greatestValue = 0;  //variable declaration
        int num[] = new int[10];  //variable declaration

        for(int i=0;i<10;i++){  //start of for loop
            System.out.println("Enter a number: ");
            num[i]=Integer.parseInt(keyboard.nextLine());
        }  //end of for loop

        for(int x=0;x<10;x++){  //start of for loop
            temp = num[x];
            if(temp>greatestValue){greatestValue=temp;}
        }  //end of for loop

        System.out.println();

        System.out.println("The number with the greatest value is " + greatestValue);

    }  //end of main method
}  //end of GreatestNumber class


