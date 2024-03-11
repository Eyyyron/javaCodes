/**
 Name: Aguilar, Aaron Kyle M.

 Class Code, Course Number, Schedule: 9315, 1:00 - 2:30 MW

 Date: December 11, 2022

 Problem:
 Given the following multidimensional array that contains address book entries:
 String[] entry = {{"Florence", "735-1234", "Manila"},
 {"Joyce", "983-3333", "Quezon City"},
 {"Becca", "456-3322", "Manila"}
 };

 Print the following entries on screen in the following format:
 Name : Florence
 Tel. # : 735-1234
 Address: Manila
 Name : Joyce
 Tel. # : 983-3333
 Address: Quezon City
 Name : Becca
 Tel. # : 456-3322
 Address: Manila
 */

package FirstYearFirstTermAndSecondTerm.finals;

public class AddressBookEntries {  //start of AddressBookEntries class
    public static void main(String[] args) {  //start of main method

        String entry[][] = {{"Florence", "735-1234", "Manila"},
                            {"Joyce", "983-3333", "Quezon City"},
                            {"Becca", "456-3322", "Manila"}};  //variable declaration
        String label[] = {"Name: ", "Tel. #: ","Address: "};  //variable declaration

        for(int i=0;i<label.length;i++){  //start of for first loop
            for(int i1=0;i1<entry.length;i1++){  //start of second for loop
                System.out.print(label[i1]);
                System.out.println(entry[i][i1]);
            }  //end of second for loop
            System.out.println();
        }  //end of first for loop
    }  //end of main method
}  //end of AddressBookEntriesClass


