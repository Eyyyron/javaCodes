/**
 Group No.: 1
 Group Members: Afaga, Aguilar, Agustin, Alcaparras
 Class Code and Schedule: 9301 - Tuesday & Friday 9:00-10:30
 Date: February 17, 2022
 Problem: Complete the codes for Fraction.java and FractionArithmetic.java. The following diagram shows the UML class
 diagrams for the Fraction class and the FractionArithmetic class. The diagram also depicts a “has-a” relationship
 between the FractionArithmetic class and the Fraction class. The arrow in the diagram from the FractionArithmetic
 class diagram to the Fraction class diagram means that the FractionArithmetic class involves at least one variable
 that has Fraction as its data type.

 Analysis:
 Input: User's input number for the menu options.

 Processes:
 1. The program first initializes three Fraction objects, f1, f2, and out.
 2. The applyStyle method is invoked to change the default colors of JOptionPane.
 3. The run method is called, which enters into a runtime loop that continues to execute until the user selects the exit option.
 4. Inside the runtime loop, the mainMenu method is called to display the available menu options to the user.
 5. The user enters the input number to select a menu option.
 6. The selected menu option is passed to the actions method as an actual parameter.
 7. The actions method then executes the corresponding arithmetic operation, which may include input prompts, object value updates, or error messages.
 8. The runtime loop continues until the user selects the exit option.

 Output: The result of the selected arithmetic operation or any appropriate message.

 Algorithm:
 1. Import the following libraries:
 a. java.lang
 b. javax.swing
 c. javax.swing.plaf.ColorUIResource

 2. Create three static objects of the Fraction class: f1, f2, and out.

 3. Define a method named "run()":
 a. Initialize a variable "inputNumber" to 0.
 b. Invoke the method named "applyStyle()".
 c. Start a "do-while" loop:
 i. Prompt the user with the main menu and store the input to "inputNumber".
 ii. Pass "inputNumber" to the method named "actions()".
 d. Continue looping indefinitely.

 4. Define a method named "mainMenu()":
 a. Display a message asking the user what they want to do in the program.
 b. Invoke the "intInput()" method and pass the minimum and maximum values as arguments.
 c. Return the user's input.

 5. Define a method named "actions(int menu)":
 a. Create a switch statement using the "menu" parameter.
 b. Case 1:
 i. If the numerator of f1 is not 0, prompt the user if they want to override the value.
 ii. If the user does not want to override the value, break out of the loop.
 iii. If the user wants to override the value, prompt them for the numerator and denominator of f1.
 iv. Set the numerator and denominator of f1 using the input.
 c. Case 2:
 i. If the numerator of f2 is not 0, prompt the user if they want to override the value.
 ii. If the user does not want to override the value, break out of the loop.
 iii. If the user wants to override the value, prompt them for the numerator and denominator of f2.
 iv. Set the numerator and denominator of f2 using the input.
 d. Case 3:
 i. Add f1 and f2, then set the result to "out".
 ii. Display the value of "out".
 e. Case 4:
 i. Subtract f2 from f1, then set the result to "out".
 ii. Display the value of "out".
 f. Case 5:
 i. Multiply f1 and f2, then set the result to "out".
 ii. Display the value of "out".
 g. Case 6:
 i. Divide f1 by f2, then set the result to "out".
 ii. Display the value of "out".
 h. Case 7:
 i. Reduce f1 and f2 to their lowest terms, then set the results to f1 and f2.
 i. Case 8:
 i. Display a goodbye message.
 ii. Exit the program.

 6. Define the following methods:
 a. "applyStyle()" - Changes the default colors of JOption.
 b. "intInput(int min, int max, String message)" - Prompts the user to enter an integer between "min" and "max", inclusive.
 c. "intInput(String message)" - Prompts the user to enter an integer.
 d. "stringInput(String message)" - Prompts the user to enter a string.

 7. In the main method, invoke the "run()" method.

 8. End the program.
 */

package secondYear.prelims;
import java.lang.*;         // Imports the whole java.lang library
import javax.swing.*;       // Imports the whole swing library
import javax.swing.plaf.ColorUIResource;            // Imports ColorUIResource to change the default colors of JOption

public class FractionArithmetic {

    public static Fraction f1 = new Fraction();     // f1 Object intialization
    public static Fraction f2 = new Fraction();     // f2 Object initialization
    public static Fraction out = new Fraction();    // f2 Object Initialization
    public static void main(String[] args) {
        run();      // Invokes the run method
    }

    public static void run(){       // Method run to execute the commands
        int inputNumber;

        applyStyle();               // Invokes the applyStyle method which changes the default colors of JOption

        do {        // Runtime loop
            inputNumber = mainMenu();   // Stores the choice of the user in the menu to the variable inputNumber
            actions(inputNumber);       // Passes the variable to the method actions as an actual parameter
        }while(true);    // While case for runtime loop


    }

    public static int mainMenu(){

        // Prompts user what he would like to do in our program and returns its respective integer
        return intInput(1,8,"What do you want to do?" +             // Invokes the int input method with min and max
                "\n" +
                "\n<html>Enter <span style = \"color:#8FB9A8 ;\">1</span> for Entering the Value of Fraction 1</html>" +
                "\n<html>Enter <span style = \"color:#8FB9A8 ;\">2</span> for Entering the Value of Fraction 2</html>" +
                "\n<html>Enter <span style = \"color:#8FB9A8 ;\">3</span> for Adding the Fractions</html>" +
                "\n<html>Enter <span style = \"color:#8FB9A8 ;\">4</span> for Subtracting the Fractions</html>" +
                "\n<html>Enter <span style = \"color:#8FB9A8 ;\">5</span> for Multiplying the Fractions</html>" +
                "\n<html>Enter <span style = \"color:#8FB9A8 ;\">6</span> for Dividing the Fractions</html>" +
                "\n<html>Enter <span style = \"color:#8FB9A8 ;\">7</span> for Reducing the Fractions</html>" +
                "\n<html>Enter <span style = \"color:#8FB9A8 ;\">8</span> for Ending the Program</html>");
    }

    public static void actions(int menu){
        switch (menu) {

            case 1:
                int n = 0;
                int d = 0;
                char od = 'a';
                if(f1.toDecimal() != 0){        // Checks if object has a value already
                    do {                // Validation loop
                        // Prompts user if they would want to override the current value of the object
                        od = stringInput("There already is a value for Fraction 1 \nWould you like to override it ?" +
                                "\nY for Yes || N for No").toLowerCase().charAt(0);
                        if (od == 'n') {
                            break;
                        }
                        else if (od != 'y' && od != 'n') {      // User toleration for yes and no
                            JOptionPane.showMessageDialog(null, "Please choose between Y or N");
                        }
                    }while(od != 'y' && od != 'n');
                }
                if (od == 'n') break;
                n = intInput("Please enter the numerator of Fraction 1");       // Prompts input for numerator of Fraction 1
                do {
                    d = intInput("Please enter the denominator of Fraction 1");     // Prompts input for the denominator
                    if(n > d)
                        JOptionPane.showMessageDialog(null, "Improper Fractions are not allowed denominator cannot be less than the numerator");
                }while(n > d);
                f1.setNumerator(n);
                f1.setDenominator(d);

                break;

            case 2:     // Case for populating the value of the object f2 which is known as Fraction 2 to the user
                int n2 = 0;
                int d2 = 0;
                char od2 = 'a';
                if(f2.toDecimal() != 0){            // Checks if object is empty or not
                    do {
                        // Prompt user if they want to override the current value (if there is a value)
                        od2 = stringInput("There already is a value for Fraction 2 \nWould you like to override it ?" +
                                "\nY for Yes || N for No").toLowerCase().charAt(0);
                        if (od2 == 'n') break;
                        else if (od2 != 'y' && od2 != 'n') {  // User toleration for yes and no
                            JOptionPane.showMessageDialog(null, "Please choose between Y or N");
                        }
                    }while(od2 != 'y' && od2 != 'n');
                }
                if(od2 == 'n') break;
                n2 = intInput("Please enter the numerator of Fraction 2");      // Prompts input for numerator of Fraction 1
                do {
                    d2 = intInput("Please enter the denominator of Fraction 2");     // Prompts input for the denominator
                    if(n2 > d2)
                        JOptionPane.showMessageDialog(null, "Improper Fractions are not allowed denominator cannot be less than the numerator");
                }while(n2 > d2);
                f2.setNumerator(n2);
                f2.setDenominator(d2);

                break;

            case 3:     // Case for addition using the method in the reference class
                out = f1.add(f2);
                JOptionPane.showMessageDialog(null, "The sum of "+f1.toString()+" and "+
                        f2.toString()+" is:\n "+out);
                break;

            case 4:     // Case for subtraction using the subtraction method in the reference class
                out = f1.subtract(f2);
                JOptionPane.showMessageDialog(null, "The difference of "+f1.toString()+" and "+
                        f2.toString()+" is:\n "+out);

                break;

            case 5:     // Case for multiplication using the respective method in the reference class
                out = f1.multiply(f2);
                JOptionPane.showMessageDialog(null, "The product of "+f1.toString()+" and "+
                        f2.toString()+" is:\n "+out);
                break;

            case 6:     // Case for dividing the fraction using the divide method in the Fraction reference
                out = f1.divide(f2);
                JOptionPane.showMessageDialog(null, "The quotient of "+f1.toString()+" and "+
                        f2.toString()+" is:\n "+out);
                break;

            case 7:     // Case for reducing the fraction
                out = out.simplify();
                JOptionPane.showMessageDialog(null, "The reduced fractions is: \n"+out);
                break;

            case 8:     // Closes the program after thanking the user
                JOptionPane.showMessageDialog(null, "Thank you for using the program!");
                System.exit(0);
                break;
        }
    }

    // Easy to call String input for joption
    public static String stringInput(String promptMessage){
        return JOptionPane.showInputDialog(promptMessage);
    }

    // Integer method that prompts user for an integer input with user toleration
    public static int intInput(String promptMessage){
        boolean valid = false;
        do{
            try{
                return Integer.parseInt(JOptionPane.showInputDialog(promptMessage));
            }catch(NumberFormatException exc){
                JOptionPane.showMessageDialog(null, "Please enter a whole number");
            }
        }while(!valid);
        return -1;
    }

    // Integer input method overload for use cases needing min and max
    public static int intInput(int min, int max, String promptMessage){
        boolean valid = false;
        int output  = 0;
        do{
            try{
                output = Integer.parseInt(JOptionPane.showInputDialog(promptMessage));
                if (output < min || output > max){
                    JOptionPane.showMessageDialog(null, "Please enter a value between "+min+" and "+max);
                }
                valid = true;
                return output;
            }catch(NumberFormatException exc){
                JOptionPane.showMessageDialog(null, "Please enter a whole number");
            }
        }while(!valid);
        return -1;
    }


    // Method for changing the color of JOption using the ColorUIResource
    public static void applyStyle(){

        UIManager.put("OptionPane.background", new ColorUIResource(241, 130, 141));
        UIManager.put("Panel.background", new ColorUIResource(118, 93, 105));
        UIManager.put("OptionPane.messageForeground", new ColorUIResource(252, 208, 186));

    }
}
