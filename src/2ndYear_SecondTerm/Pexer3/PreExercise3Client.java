package SecondYearSecondTerm.CompProg3.Pexer3;

import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.*;
import java.io.*;
import java.net.*;

public class PreExercise3Client {

    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {

        try (
                // Establish a connection with the server running on localhost at port 2000
                Socket socket = new Socket("localhost", 2000);

                // Create PrintWriter for sending data to the server
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

                // Create BufferedReader for receiving data from the server
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                ) {

            // Parse the XML file containing expressions to evaluate
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File("src/res/exer3.xml"));

            // Retrieve the list of expression nodes from the XML document
            NodeList expressionNodes = document.getElementsByTagName("expression");

            // Iterate over each expression node in the XML document
            for (int i = 0; i < expressionNodes.getLength(); i++) {
                Node expressionNode = expressionNodes.item(i);
                if (expressionNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element expressionElement = (Element) expressionNode;

                    // Extract operands and operator from the expression node
                    String operand1 = expressionElement.getElementsByTagName("operand1").item(0).getTextContent();
                    String operator = expressionElement.getElementsByTagName("operator").item(0).getTextContent();
                    String operand2 = expressionElement.getElementsByTagName("operand2").item(0).getTextContent();

                    // Construct the expression string
                    String expression = operand1 + " " + operator + " " + operand2;

                    // Send the expression to the server
                    out.println(expression);

                    // Receive and process the response from the server
                    String response = in.readLine();
                    if (response == null) { // No more data from the server
                        out.println("bye");
                        break; // Exit loop
                    }
                    System.out.println(response); // Print the response from the server
                }
            }

            // Notify that no more expressions will be sent
            System.out.println("\nThe client can no longer read any data from the input file. Sending 'bye' to the server.");

            // Notify that the client will terminate
            System.out.println("\nThe client will no longer be expecting a response from the server and will stop executing.");

        } catch (Exception e) {
            throw new RuntimeException(e); // Propagate any exceptions as runtime exceptions
        }

    } // End of main method

} // End of PreExercise3Client class