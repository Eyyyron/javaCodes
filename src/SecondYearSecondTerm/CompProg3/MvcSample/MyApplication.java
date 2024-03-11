package SecondYearSecondTerm.CompProg3.MvcSample;


import SecondYearSecondTerm.CompProg3.MvcSample.controller.AddingMachineController;
import SecondYearSecondTerm.CompProg3.MvcSample.model.AddingMachineModel;
import SecondYearSecondTerm.CompProg3.MvcSample.view.AddingMachineView;

public class MyApplication {
    public static void main(String[] args) {
        AddingMachineModel model = new AddingMachineModel();
        AddingMachineView view = new AddingMachineView();
        AddingMachineController controller = new AddingMachineController(view, model);
    }
}
