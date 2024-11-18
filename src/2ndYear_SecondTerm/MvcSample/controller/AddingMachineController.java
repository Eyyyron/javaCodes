package SecondYearSecondTerm.CompProg3.MvcSample.controller;

import SecondYearSecondTerm.CompProg3.MvcSample.model.AddingMachineModel;
import SecondYearSecondTerm.CompProg3.MvcSample.view.AddingMachineView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddingMachineController {
    private AddingMachineView addingMachineView;
    private AddingMachineModel addingMachineModel;

    public AddingMachineController(AddingMachineView view, AddingMachineModel model) {
        addingMachineView = view;
        addingMachineModel = model;

        addingMachineView.setAddListener((ActionEvent e) ->{
            double operand1, operand2;
            try {
                operand1 = addingMachineView.getOperand1();
                operand2 = addingMachineView.getOperand2();
                addingMachineModel.addNumbers(operand1, operand2);
                addingMachineView.setResult(addingMachineModel.getResult());
            } catch (Exception exc) {
                addingMachineView.displayErrorMessage(exc.getMessage());
            }
        });
        //addingMachineView.setAddListener(new ButtonListener());
    }

    class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            double operand1, operand2;
            try {
                operand1 = addingMachineView.getOperand1();
                operand2 = addingMachineView.getOperand2();
                addingMachineModel.addNumbers(operand1, operand2);
                addingMachineView.setResult(addingMachineModel.getResult());
            } catch (Exception exc) {
                addingMachineView.displayErrorMessage(exc.getMessage());
            }
        }
    }
}
