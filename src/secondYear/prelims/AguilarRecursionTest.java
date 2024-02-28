/**
 Name: Aguilar, Aaron Kyle M.
 Date of Programming: January 24, 2023
 Activity Name: (Prelim Exercise 2)
 Problem and other specifications: Create an executable class that uses the following methods. The following methods illustrate the concept of recursion.

 Sample Run for the Factorial Program:
 This program will create an executable class that uses the methods for the factorial and fibonacci sequence.
 This program will let the methods illustrate the concept of recursion.
 This program will compute the factorial of a number and the nth term of a fibonacci sequence.

 1 = Factorial Program
 2 = Fibonacci Sequence Program

 Enter the number of your desired option: 1

 Enter an integer: 3

 The factorial is 6

 Thank you for using the program.

 Sample Run for the Fibonacci Sequence Program:
 This program will create an executable class that uses the methods for the factorial and fibonacci sequence.
 This program will let the methods illustrate the concept of recursion.
 This program will compute the factorial of a number and the nth term of a fibonacci sequence.

 1 = Factorial Program
 2 = Fibonacci Sequence Program

 Enter the number of your desired option: 2

 Enter the nth digit of the fibonacci sequence: 3

 The term 3 of the fibonacci sequence is 2

 Thank you for using the program.
*/

package secondYear.prelims;
import java.lang.*;
import java.util.Scanner;

public class AguilarRecursionTest {
    public static void main(String[] args){
        showIntroduction();//invokes the showIntroduction method
        executeRecursion();//invokes the executeRecursion method
    }//end of main method

    public static void showIntroduction(){
        System.out.println("This program will create an executable class that uses the methods for the factorial and fibonacci sequence.");
        System.out.println("This program will let the methods illustrate the concept of recursion.");
        System.out.println("This program will compute the factorial of a number and the nth term of a fibonacci sequence.");
    }//end of showIntroduction method

    public static void executeRecursion(){
        System.out.println("\n1 = Factorial Program");
        System.out.println("2 = Fibonacci Sequence Program");

        int option = input("\nEnter the number of your desired option: ");//variable declaration

        if(option != 1 && option != 2){
            System.out.println("Only choose between 1 or 2.");
            executeRecursion();//invokes the executeRecursion method
        }else {
            switch (option) {
                case 1:
                    AguilarRecursionTest exec = new AguilarRecursionTest();
                    int a = exec.computeFactorial(input("\nEnter an integer: "));//invokes the computeFactorial method
                    System.out.println("\nThe factorial is " + a);
                    System.out.println("\nThank you for using the program.");
                    break;

                case 2:
                    exec = new AguilarRecursionTest();
                    int b = input("\nEnter the nth digit of the fibonacci sequence: ");
                    int fibonacci = exec.computeFibonacci(b);//invokes the computeFibonacci method
                    System.out.println("\nThe term " + b + " of the fibonacci sequence is " + fibonacci);
                    System.out.println("\nThank you for using the program.");
                    break;
            }//end of switch case
        }//end of if else
    }//end of executeRecursion method

    public int computeFactorial(int number){
        if(number <= 1)//base case
            return 1;
        else//recursive step
            return number * computeFactorial(number - 1);
    }//end of computeFactorial method

    public int computeFibonacci(int n ){
        if(n == 0 || n == 1)//base case
            return n;
        else//recursive step
            return computeFibonacci(n - 1) + computeFibonacci(n - 2);
    }//end of computeFibonacci method

    public static int input (String promptMessage){
        Scanner keyboard = new Scanner(System.in);
        int input = 0;//variable declaration

        do {
            try {
                System.out.print(promptMessage);
                input = Integer.parseInt(keyboard.nextLine());

                if (input < 1) System.out.println("Enter a number that is greater than 0.");

            } catch (RuntimeException ex) {
                System.out.println("Only enter a number.");
            }//end of try catch

        }while(input < 1);//end of do while

        return input;
    }//end of input method

}//end of AguilarRecursionTest class
