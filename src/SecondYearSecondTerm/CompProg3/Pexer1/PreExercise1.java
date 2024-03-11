package SecondYearSecondTerm.CompProg3.Pexer1;
import java.util.*;
import java.net.*;

public class PreExercise1 {

    public static void main(String[] args) {

        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        char search; // to store user input for whether to search another host
        int hostNumber = 1; // to keep track of the host number
        String input; // to store user input for IP address or hostname

        // Start a loop to allow the user to search for hosts multiple times
        do{
            // Prompt the user to input an IP address or hostname for a host
            System.out.print("\nHost " + hostNumber + " - Type IP address/Hostname: ");

            // Read the user input
            input = scanner.nextLine();

            try{
                // Try to resolve the given input to IP addresses
                InetAddress [] addresses = InetAddress.getAllByName(input);

                // Print the number of resolved hosts/IPs
                System.out.println("\tNumber of Hosts/IPs: " + addresses.length);
                System.out.println("\tHost name\tIP Address");

                // Print the hostname and IP address of each resolved host
                for(InetAddress address:addresses){
                    System.out.println("\t" + address.getHostName() + "\t" + address.getHostAddress());
                }
            }catch (UnknownHostException e){
                // If the input cannot be resolved to an IP address, print an error message
                System.out.println("Unable to find host: " + input);
            }

            // Prompt the user if they want to search for another host
            System.out.print("Search another [y/n]? ");

            // Read the user's response
            search = scanner.nextLine().charAt(0);

            // Increment the host number for the next iteration
            hostNumber++;

            // Continue the loop if the user wants to search for another host
        }while(Character.toLowerCase(search) == 'y');

        // Print a message when the user is done searching for hosts
        System.out.println("\nThank you for using the program.");

        // Close the scanner object to release resources
        scanner.close();

        // Exit the program with status code 0
        System.exit(0);

    } // End of main method

} // End of class PreExercise1