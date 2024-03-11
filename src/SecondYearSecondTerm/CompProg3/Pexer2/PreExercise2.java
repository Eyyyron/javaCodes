package SecondYearSecondTerm.CompProg3.Pexer2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class PreExercise2 {
    public static void main(String[] args) {
        int port = 2000;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            // Inform that the server is running and listening on the specified port
            System.out.println("Server is running and listening on port " + port);
            while (true) {
                // Accept incoming client connections
                Socket clientSocket = serverSocket.accept();
                // Inform about the new client connection
                System.out.println("New client connected: " + clientSocket);
                // Create a new thread for each client connection and handle it
                Thread clientThread = new Thread(() -> {
                    handleClient(clientSocket); // Call method to handle client communication
                });
                clientThread.start(); // Start the thread to handle the client
            }
        } catch (Exception e) {
            // Print stack trace in case of any exceptions during server operation
            e.printStackTrace();
        }

    } // End of main method


    // Method to handle communication with a client
    private static void handleClient(Socket clientSocket) {
        try (
                // Create BufferedReader to read data from the client
                BufferedReader streamRdr = new BufferedReader(
                        new InputStreamReader(clientSocket.getInputStream()));
                // Create PrintWriter to send data to the client
                PrintWriter streamWtr = new PrintWriter(
                        clientSocket.getOutputStream(), true);
        ) {
            // Ask the client for their name
            streamWtr.println("What is your name? ");
            // Read the client's name from input
            String name = streamRdr.readLine();
            int age;
            // Loop until a valid age is provided
            while (true) {
                // Ask the client for their age
                streamWtr.println("\nWhat is your age? ");
                try {
                    // Attempt to parse the age input
                    age = Integer.parseInt(streamRdr.readLine());
                    // Validate the age
                    if (age <= 0) {
                        throw new NumberFormatException();
                    } else {
                        break;
                    }
                } catch (NumberFormatException nfe) {
                    // If the age is invalid, prompt the client to enter a valid age
                    streamWtr.println("Please enter a valid age.");
                    continue;
                }
            }
            // Check if the client is old enough to vote
            if (age >= 18) {
                streamWtr.println("\n" + name + ", you may exercise your right to vote!");
            } else {
                streamWtr.println("\n" + name + ", you are still too young to vote!");
            }
            // Send a farewell message to the client
            streamWtr.println("Thank you and good day.");
        } catch (Exception e) {
            // Print stack trace in case of any exceptions during client communication
            e.printStackTrace();
        }

    } // End of handleClient method

} // End of class PreExercise2