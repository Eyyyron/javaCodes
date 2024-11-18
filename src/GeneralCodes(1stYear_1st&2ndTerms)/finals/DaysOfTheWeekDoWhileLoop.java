/**
 Name: Aguilar, Aaron Kyle M.

 Class Code, Course Number, Schedule: 9315, 1:00 - 2:30 MW

 Date: December 11, 2022

 Problem: Create an array of Strings which are initialized to the 7 days of the week using a do-while loop.
 */

package FirstYearFirstTermAndSecondTerm.finals;

public class DaysOfTheWeekDoWhileLoop {  //start of DaysOfTheWeekDoWhileLoop class
    public static void main(String[] args) {  //start of main method

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};  //variable declaration
        int index = 0;  //variable declaration

        do{  //start of do while loop
            System.out.println(days[index]);
            index++;
        }while(index<7);  //end of do while loop
    }  //end of main method
}  //end of DaysOfTheWeekDoWhileLoop class
