package SecondYearSecondTerm.CompProg3.Pexer3;

import java.io.*;
import java.net.*;

public class PreExercise3Server {

    public static void main(String[] args) throws IOException {

        // Create a server socket to listen for client connections on port 2000
        ServerSocket serverSocket = new ServerSocket(2000);
        System.out.println("The server is now running.");

        // Continuously accept incoming client connections
        while (true) {
            Socket socket = serverSocket.accept();
            new Thread(new ClientHandler(socket)).start();
        }

    } // End of main method

    // Class to handle client connections
    static class ClientHandler implements Runnable {
        private Socket socket;

        // Constructor to initialize the socket
        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        // Method to handle client requests
        public void run() {
            try {
                // Create input and output streams for communication with the client
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                String inputLine;

                // Read input from the client until "bye" is received
                while ((inputLine = in.readLine()) != null) {
                    if ("bye".equals(inputLine)) {
                        break; // Exit loop if client sends "bye"
                    }
                    // Process the expression received from the client and send back the result
                    String result = process(inputLine);
                    out.println(result);
                }

                // Close the socket and print a message when the client sends "bye"
                socket.close();
                System.out.println("\nThe client sent 'bye'. The server will no longer process and will terminate.");

                // Terminate the server
                System.exit(0);

            } catch (IOException e) {
                e.printStackTrace();
            }

        } // End of run method

        // Method to process the expression received from the client
        private String process(String expression) {
            String[] parts = expression.split(" ");
            String operand1 = parts[0];
            String operator = parts[1];
            String operand2 = parts[2];

            // Perform the operation based on the operator
            switch (operator) {
                case "^":
                    try {
                        return operand1 + " ^ " + operand2 + " = " + Math.pow(Double.parseDouble(operand1), Double.parseDouble(operand2));
                    } catch (NumberFormatException e) {
                        return operand1 + " ^ " + operand2 + " = Invalid expression";
                    }

                case "*":
                    try {
                        return operand1 + " * " + operand2 + " = " + (Double.parseDouble(operand1) * Double.parseDouble(operand2));
                    } catch (NumberFormatException e) {
                        return operand1 + " * " + operand2 + " = Invalid expression";
                    }

                case "/":
                    try {
                        return operand1 + " / " + operand2 + " = " + (Double.parseDouble(operand1) / Double.parseDouble(operand2));
                    } catch (NumberFormatException e) {
                        return operand1 + " / " + operand2 + " = Invalid expression";
                    }

                case "%":
                    try {
                        return operand1 + " % " + operand2 + " = " + (Double.parseDouble(operand1) % Double.parseDouble(operand2));
                    } catch (NumberFormatException e) {
                        return operand1 + " % " + operand2 + " = Invalid expression";
                    }

                case "+":
                    try {
                        return operand1 + " + " + operand2 + " = " + (Integer.parseInt(operand1) + Integer.parseInt(operand2));
                    } catch (NumberFormatException e) {
                        return operand1 + " + " + operand2 + " = Invalid expression";
                    }

                case "-":
                    try {
                        return operand1 + " - " + operand2 + " = " + (Integer.parseInt(operand1) - Integer.parseInt(operand2));
                    } catch (NumberFormatException e) {
                        return operand1 + " - " + operand2 + " = Invalid expression";
                    }

                default:
                    return operand1 + " " + operator + " " + operand2 + " = Invalid expression";
            }

        } // End of process method

    } // End of ClientHandler class

} // End of PreExercise3Server class