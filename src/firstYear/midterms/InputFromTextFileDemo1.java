/**
 Name: Aguilar, Aaron Kyle M.
 Date: October 31, 2022
 Activity Name: InputFromTextFileDemo1

 Problem:
 Getting input data from a text File

 To be able to get input data for a program from a
 text file, you must create an object of the
 BufferedReader class and connect it to the text file.

 Analysis:
 Input:

 Process:
 1. Read the value from a certain text file
 2. Display the results
 3. End the process

 Output: Text from a certain text file

 Algorithm:
 1. Read the value from a certain text file
 2. Display the results
 3. End the program
*/

package firstYear.midterms;
import java.io.*;


public class InputFromTextFileDemo1 {
    public static void run() {
        BufferedReader inputReader = null;
        String lineOfTextRead = "";
        try {
            inputReader = new BufferedReader(new FileReader("datafile.txt"));
            lineOfTextRead = inputReader.readLine();
            System.out.println("The statements in datafile.txt is/are: ");
            while (lineOfTextRead != null) {
                System.out.println("    " + lineOfTextRead);
                lineOfTextRead = inputReader.readLine();
            }
            inputReader.close();
        } catch (Exception e1) {
            System.out.println("File datafile.txt does not exist." + e1.toString());
        }
    } // end of run method

    public static void main(String[] args) {
        run();
        System.exit(0);
    } // end of main method
} // end of class

