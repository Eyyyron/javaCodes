/**
 Name: Aguilar, Aaron Kyle M.

 Class Code, Course Number, Schedule: 9315, 1:00 - 2:30 MW

 Date: December 11, 2022

 Problem: Create an array of Strings which are initialized to the 7 days of the week using a while loop.
 */

package FirstYearFirstTermAndSecondTerm.finals;

public class DaysOfTheWeekWhileLoop {  //start of DaysOfTheWeekWhileLoop class
    public static void main(String[] args) {  //start of main method

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};  //variable declaration
        int index = 0;  //variable declaration

        while (index < days.length) {  //start of while loop
            System.out.println(days[index]);
            index++;
        }  //end of while loop
    }  //end of main method
}  //end of DaysOfTheWeekWhileLoop class
