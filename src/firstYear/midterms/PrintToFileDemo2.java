/**
 Name: Aguilar, Aaron Kyle M.
 Class Code & Schedule: 9315, 1:00 - 2:30 MW
 Date: October 31, 2022

 Writing/Sending the output program to a text file.

 To be able to save the output of a program in a text file,
 you must create an object of the PrintWriter class
 that is pointing to the text file where the outputs will
 be written.
*/

package firstYear.midterms;
import java.io.*;

public class PrintToFileDemo2 {
    public static void run(){
        BufferedReader keyboard=null;// use keyboard for input
        PrintWriter outputWriter=null;   // reference to PrintWriter
        String lineOfText="";

        try {
            keyboard =new BufferedReader(new InputStreamReader(System.in));
            outputWriter = new PrintWriter(new FileWriter("src/firstYear/midterms/outputfile.txt"));
            /* or  outputWriter = new PrintWriter(new FileOutputStream("outputfile.txt")); */
    /*
    NOTE:  If the file outputfile.txt is already existing,
    the old contents will be lost.
    If outputfile.txt does not exist, a new,
       empty file is created upon the instantiation of PrintWriter.
    */
            System.out.println("Enter three lines of text ");
            for (int count = 1; count <= 3; count++) {
                System.out.print("Line " + count+ ": ");
                lineOfText = keyboard.readLine();
                outputWriter.println(count + " " + lineOfText);
            }
            outputWriter.close();  // closes the text file
            System.out.println("The lines of text you entered were written in outputfile.txt.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    } // end of run method

    public static void main(String[] args) {
        run();
        System.exit(0);
    } // end of main method
} // end of class
