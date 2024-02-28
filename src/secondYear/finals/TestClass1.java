/*
Name: Aaron Kyle Aguilar
Date: April 25, 2023
 */

package secondYear.finals;
import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class TestClass1 {
    public static void main(String[] args) {
        TestClass1 program;
        try{
            program = new TestClass1();
            program.run();
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        System.exit(0);
    }
    public void run() throws Exception{
        Scanner keyboard = new Scanner(System.in);
        Random generator = new Random();

        MyFunctionalInterface predictor = x -> {
            //System.out.printf("What is your name?");
            //String name = keyboard.nextLine();
            String name = JOptionPane.showInputDialog("What is your name?");
            String result = ""+name+", expect to be married when you are "+(x+generator.nextInt(30))+" years old";
            return result;
        };

        //System.out.print("How old are you now? ");
        //int age = Integer.parseInt(keyboard.nextLine());
        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your current age? "));
        //System.out.println(predictor.provideResponse(age));
        JOptionPane.showMessageDialog(null, predictor.provideResponse(age));
    }
}
