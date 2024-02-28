/*
Name: Aaron Kyle Aguilar
Date: April 25, 2023
 */

package secondYear.finals;
import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class TestClass2 {
    public static void main(String[] args) {
        TestClass2 program;
        Random generator = new Random();
        try{
            program = new TestClass2();
            program.run((x) -> {
                String name = JOptionPane.showInputDialog("What is your name? ");
                String result = "Hello "+name+", expect to be married when you are "+ (x+generator.nextInt(30))+" years old";
                return result;
            });
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        System.exit(0);
    }
    public void run (MyFunctionalInterface predictor) throws Exception{
        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your current age? "));
        JOptionPane.showMessageDialog(null, predictor.provideResponse(age));
    }
}
