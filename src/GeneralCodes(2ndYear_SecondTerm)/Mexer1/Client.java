package SecondYearSecondTerm.CompProg3.Mexer1;
import java.rmi.Naming;
import java.util.Scanner;

// Client class to interact with the remote server
public class Client {

    public static void main(String[] args) {
        try {

            // Look up for the remote object stub registered on the RMI registry
            MidInterface1 stub = (MidInterface1) Naming.lookup("rmi://localhost/MidExercise1");

            // Create a scanner object to read input from the user
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nEnter a string to send to the server: ");
            String input = scanner.nextLine();

            // Call the remote method on the server and get the response
            String response = stub.profileString(input);
            System.out.println("\nResponse: \n" + response);

        } catch (Exception e) {

            // Print any exceptions that occur during client-server communication
            System.err.println("Client exception: " + e);
            e.printStackTrace();

        }

    } // End of main method

} // End of Client class