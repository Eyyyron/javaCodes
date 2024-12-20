package FirstYearShortTermAndSecondYearFirstTerm.midterms;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumberConversionBoard extends JFrame{
    private JPanel numberPanel;
    private JPanel buttonPanel;
    private JButton convertButton, clearButton, exitButton;
    private JTextField binaryTF, decimalTF, octalTF, hexadecimalTF;
    private int decimalInteger;
    private JLabel problemDisplayer;
    private JPanel reminderPanel;
    private ButtonHandler buttonsHandler;
    private JPanel headPanel;

    public static void main(String[] args) {
        NumberConversionBoard board = new NumberConversionBoard();
    }

    public NumberConversionBoard(){

        setTitle("Number Converter");
        setSize(800,400);

        headPanel = new JPanel();
        JLabel textArea = new JLabel();
        textArea.setText("This application helps you convert an integer to binary, octal and hexadecimal. Please enter the integer in the textfield provided. Then, press the convert key.");
        headPanel.add(textArea); //1. Type the method name to add the textArea

        numberPanel = new JPanel();
        setNumberPanel(numberPanel);
        buttonPanel = new JPanel();
        setButtonPanel(buttonPanel);

        reminderPanel = new JPanel();
        problemDisplayer = new JLabel("");
        problemDisplayer.setFont(new Font("Arial", Font.ITALIC,20));
        reminderPanel.add(problemDisplayer); //2. Type the method name to add problemDisplayer

        Container pane = getContentPane();
        pane.setLayout(new GridLayout(4,1));
        pane.add(headPanel); //3. Type the method name to add head panel
        pane.add(numberPanel); //4. What is missed here?
        pane.add(reminderPanel); //5. What is missed here?
        pane.add(buttonPanel); //6. What is missed here?

        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void setButtonPanel(JPanel panel){
        convertButton = new JButton("convert"); //Construct a JButton for "convert" action
        clearButton = new JButton("clear"); //7. Construct a JButton for "clear" action
        exitButton = new JButton("exit"); //8. Construct a JButton for "exit" action
        buttonsHandler = new ButtonHandler();
        convertButton.addActionListener(buttonsHandler); // Add buttonsHandler listener
        clearButton.addActionListener(buttonsHandler); //9. Add buttonsHandler listener
        exitButton.addActionListener(buttonsHandler); //10. Add buttonsHandler listener

        panel.add(convertButton); //11. add convertButton
        panel.add(clearButton); //12. add clearButton
        panel.add(exitButton); //13. add exitButton

        return;
    }

    public void setNumberPanel(JPanel panel){
        JLabel decimalLabel = new JLabel("Decimal Number: ");
        decimalLabel.setFont(new Font("Arial",Font.BOLD,20));
        JLabel binaryLabel = new JLabel("Binary Number: ");
        binaryLabel.setFont(new Font("Arial", Font.BOLD,20));
        JLabel octalLabel = new JLabel("Octal Number: ");
        octalLabel.setFont(new Font("Arial", Font.BOLD,20));
        JLabel hexadecimalLabel = new JLabel("Hexadecimal Number: ");
        hexadecimalLabel.setFont(new Font("Arial", Font.BOLD,20));
        decimalTF = new JTextField(20);
        decimalTF.setFont(new Font("Arial", Font.BOLD,20));
        binaryTF = new JTextField(20);
        binaryTF.setFont(new Font("Arial", Font.BOLD,20));
        octalTF = new JTextField(20);
        octalTF.setFont(new Font("Arial", Font.BOLD,20));
        hexadecimalTF = new JTextField(20);
        hexadecimalTF.setFont(new Font("Arial", Font.BOLD,20));
        panel.setLayout(new GridLayout(4,4));
        panel.add(decimalLabel);
        panel.add(decimalTF);
        panel.add(binaryLabel);
        panel.add(binaryTF);
        panel.add(octalLabel);
        panel.add(octalTF);
        panel.add(hexadecimalLabel);
        panel.add(hexadecimalTF);
        return;
    }

    private class ButtonHandler implements ActionListener{ //14.let ButtonHandler class implement ActionListener interface
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==exitButton)
                System.exit(0);

            if(e.getSource()==clearButton){
                decimalTF.setText("");
                binaryTF.setText("");
                octalTF.setText("");
                hexadecimalTF.setText("");
                problemDisplayer.setText("");
            }

            if(e.getSource()==convertButton)
                try{
                    if(decimalTF.getText().equals("")){
                        throw new Exception("No specified decimal number.");
                    }
                    else{
                        problemDisplayer.setText("");
                        decimalInteger = Integer.parseInt(decimalTF.getText());
                        binaryTF.setText(Integer.toBinaryString(decimalInteger)); //15. Apply the static toBinaryString method of the Integer class
                        octalTF.setText(Integer.toOctalString(decimalInteger)); //16. Apply the static toOctalString method of the Integer class
                        hexadecimalTF.setText(Double.toHexString((double)decimalInteger));
                    }
                } catch (NumberFormatException x){
                    problemDisplayer.setText("The entered integer does not follow the format of a number.");
                } catch (Exception e2){
                    problemDisplayer.setText(e2.getMessage());
                }

        }

    }

}
