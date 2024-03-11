package SecondYearSecondTerm.CompProg3.MvcSample.model;

public class AddingMachineModel {
    private double result;

    public void addNumbers(double firstNumber, double secondNumber) {
        result = firstNumber + secondNumber;
    }

    public double getResult() {
        return result;
    }
}
