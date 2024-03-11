/**
 * Sample Run:
 *
 * This program helps you divide whole numbers.
 * Enter the dividend: 10
 * Enter the divisor: 0
 * zero denominator should be avoided
 * Division was not executed because the divisor is 0.
 * Have a good day!
 */

package FirstYearShortTermAndSecondYearFirstTerm.midterms;
import java.util.Scanner;

public class ExceptionExerciseProgram {
    public static void main(String[] args) {
        ExceptionExerciseProgram test;
        try{
            test = new ExceptionExerciseProgram();
            test.run();
        }
        catch(ArithmeticException e1){
            System.out.println(e1.getMessage());
            System.out.println("Division was not executed because the divisor is 0.");
        }
        catch(Exception e2){
            e2.printStackTrace();
        }
        finally{
            System.out.println("Have a good day!");
            System.exit(0);
        }
    }// end of main method

    // A method that propagates an exception
    public void run()throws ArithmeticException, Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program helps you divide whole numbers.");
        int x = readInteger("Enter the dividend");
        int y = readInteger("Enter the divisor");
        if(y==0)
            throw new ArithmeticException("zero denominator should be avoided");
        System.out.println(x + "/" + y + "=" + x/y);
    }// end of run method

    // A method that handles an exception
    private int readInteger(String prompt){
        Scanner scanner = new Scanner(System.in);
        int result=0;
        boolean validValueRead = false;
        while(!validValueRead){
            try{
                System.out.print(prompt+ ": ");
                result = Integer.parseInt(scanner.nextLine());
                validValueRead = true;

            }catch (NumberFormatException ex){
                System.out.println("You have entered an invalid integer");
                System.out.println(ex.getMessage());
            }
        }// end of while
        return result;
    }// end of readInteger method
}// end of class

