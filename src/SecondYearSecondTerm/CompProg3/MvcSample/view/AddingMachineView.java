package SecondYearSecondTerm.CompProg3.MvcSample.view;

import javax.swing.*;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;
import java.awt.event.*;
import java.text.NumberFormat;

public class AddingMachineView extends JFrame {
    private JFormattedTextField txtOperand1;
    private JFormattedTextField txtOperand2;
    private JButton btnAdd;
    private JTextField txtResult;
    private JPanel pnlMain;


    public AddingMachineView() {
        // set format of the operands (text fields) to be numeric
        NumberFormat operandFormat = NumberFormat.getNumberInstance();
        NumberFormatter formatter = new NumberFormatter(operandFormat);
        DefaultFormatterFactory factory = new DefaultFormatterFactory(formatter);
        txtOperand1.setFormatterFactory(factory);
        txtOperand2.setFormatterFactory(factory);

        // set behavior of text fields when clicked
        FocusListener myFocusListener = new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                ((JFormattedTextField)e.getComponent()).setValue(null);
            }

            @Override
            public void focusLost(FocusEvent e) {
                // do nothing
            }
        };
        txtOperand1.addFocusListener(myFocusListener);
        txtOperand2.addFocusListener(myFocusListener);

        add(pnlMain);
        setTitle("Adding Machine");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350, 250);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public double getOperand1() {
        return Double.parseDouble(txtOperand1.getText());
    }

    public double getOperand2() {
        return Double.parseDouble(txtOperand2.getText());
    }

    public void setResult(double value) {
        txtResult.setText(value + "");
    }

    public void setAddListener(ActionListener addListener) {
        btnAdd.addActionListener(addListener);
    }

    public void displayErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
}
