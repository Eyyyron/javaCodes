/**
 * Name: Aguilar, Aaron Kyle
 * Course: BSCS 2-1
 * Class Code: 9329
 * Activity: Midterm Exercise 1
 *
 * Sample Run:
 * Enter a string to send to the server:
 * sa1nt & louis
 *
 * Response:
 * 9 aoui 4 sntls 5
 *
 * String Size: 13
 *
 * Process finished with exit code 0
 */
package SecondYearSecondTerm.CompProg3.Mexer1;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

// Class implementing the remote interface
public class MidExercise1 extends UnicastRemoteObject implements MidInterface1 {

    // Constructor for MidExercise1 class
    public MidExercise1() throws RemoteException {
        super();
    }

    // Method to process the input string and return a formatted string containing counts of letters, vowels, and consonants
    @Override
    public String profileString(String s) throws RemoteException {

        // Calculate the size of the input string
        int stringSize = s.length();

        // Remove non-letter characters from the input string
        String lettersOnly = s.replaceAll("[^a-zA-Z]", "");

        // Count the number of letters in the input string
        int lettersCount = lettersOnly.length();

        // Remove non-vowel characters from the letters-only string
        String vowels = lettersOnly.replaceAll("[^aeiouAEIOU]", "");

        // Count the number of vowels in the input string
        int vowelCount = vowels.length();

        // Remove vowel characters from the letters-only string to get consonants
        String consonants = lettersOnly.replaceAll("[aeiouAEIOU]", "");

        // Count the number of consonants in the input string
        int consonantCount = consonants.length();

        // Return a formatted string containing counts of letters, vowels, and consonants
        return  lettersCount + " " + vowels + " " + vowelCount + " " + consonants + " " + consonantCount + "\n\nString Size: " + stringSize;

    } // End of profileString method

    // Main method to start the RMI server
    public static void main(String[] args) {
        try {

            // Create an instance of the MidExercise1 class
            MidExercise1 obj = new MidExercise1();

            // Create and start the RMI registry on port 1099
            LocateRegistry.createRegistry(1099);

            // Bind the remote object's stub in the registry
            Naming.rebind("MidExercise1", obj);

            // Print a message indicating that the server is running
            System.out.println("\nServer is running.");

        } catch (Exception e) {

            // Print any exceptions that occur during server startup
            System.err.println("Server exception: " + e);
            e.printStackTrace();

        }

    } // End of main method

} // End of MidExercise1 class