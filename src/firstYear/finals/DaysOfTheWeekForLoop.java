/**
 Name: Aguilar, Aaron Kyle M.

 Class Code, Course Number, Schedule: 9315, 1:00 - 2:30 MW

 Date: December 11, 2022

 Problem: Create an array of Strings which are initialized to the 7 days of the week using a for loop.
 */

package firstYear.finals;

public class DaysOfTheWeekForLoop { //start of DaysOfTheWeekForLoop class
    public static void main(String[] args) {  //start of main method

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};  //variable declaration
        int index = 0;  //variable declaration

        for(int i=0; i<days.length-1; i++){  //start of for loop
            System.out.println(days[index]);
            index++;
        }  //end of for loop
    }  //end of main method
}  //end of DaysOfTheWeekForLoop class
