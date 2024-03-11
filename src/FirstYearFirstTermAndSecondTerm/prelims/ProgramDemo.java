/**
 Name: Aguilar, Aaron Kyle M.
 Date of completion: September 21, 2022
 Class Code and Course Number: 9315, CS112
 */

package FirstYearFirstTermAndSecondTerm.prelims;
import java.lang.*;
import java.util.Scanner;

public class ProgramDemo {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        //Object of scanner

        int n1 = 0;                 //Variable declaration
        int n2 = 0;                 //Variable declaration
        int n3 = 0;                 //Variable declaration
        int sum = 0;                //Variable declaration
        int q1 = 0;                 //Variable declaration
        double q2 = 0;              //Variable declaration
        int product = 0;            //Variable declaration
        int sumOf2 = 0;             //Variable declaration
        int integerquotient = 0;    //Variable declaration
        float sumOf21 = 0;          //Variable declaration
        float exactquotient = 0;    //Variable declaration
        float sumof3 = 0;           //Variable declaration
        float average = 0;          //Variable declaration
        double squareof1 = 0;       //Variable declaration
        double squareof2 = 0;       //Variable declaration
        double squareof3 = 0;       //Variable declaration

        System.out.print("First Number: ");
        n1 = Integer.parseInt(keyboard.nextLine());
        //Read the first number

        System.out.print("Second Number: ");
        n2 = Integer.parseInt(keyboard.nextLine());
        //Read the second number

        System.out.print("Third Number: ");
        n3 = Integer.parseInt(keyboard.nextLine());
        //Read the third number

        System.out.println("");

        System.out.println ("You entered the numbers " + n1 + ", " + n2 + " and " + n3);
        //Display the three numbers

        sum = n1 + n2 + n3;
        //Add the three numbers and store it in another int variable named sum

        System.out.println("\nThe sum of the three numbers is " + sum);
        //Display the sum

        q1 = n1 / n2;
        System.out.println("\nThe expression used computed the integer quotient: " + q1);

        q2 = (double) n1 / n2;
        System.out.println("\nThe expression used computed the actual quotient: " + q2);
        //Divide the first number by the second and display the value

        /* #1. Compute the product of the three numbers, store it in another integer
        variable and display this value.
        INSERT THE CODES BELOW... */

        product = n1 * n2 * n3;
        //Multiply the first, second, and third number and display the value

        System.out.println("\nThe product of the three numbers is " + product);
        //Display the product

        /* #2. Get the sum of the first two numbers and divide it by the third number,
        compute only for the integer quotient and display the value.
        INSERT THE CODES BELOW... */

        sumOf2 = n1 + n2;
        integerquotient = sumOf2 / n3;
        //Add the first two numbers and divide it by the third number and display the integer quotient or value


        System.out.println("\nThe integer quotient of the sum of the first two numbers numbers divided by the third number is " + integerquotient);
        //Display the quotient

        /* #3. Get the sum of the first two numbers and divide it by the third number,
        compute for the exact quotient and display the value.
        INSERT THE CODES BELOW... */

        sumOf21 = n1 + n2;
        exactquotient = sumOf21 / n3;
        //Add the first two numbers and divide it by the third number and display the exact quotient or value

        System.out.println("\nThe exact quotient of the sum of the first two numbers numbers divided by the third number is " + exactquotient);
        //Display the quotient

        /* #4. Compute the average of the three numbers and display the value.
        INSERT CODE BELOW... */

        sumof3 = n1 + n2 +n3;
        average = sumof3 / 3;
        //Add the first, second, and third number and divide the sum of it by 3 and display the value

        System.out.printf("%s%.2f%n", "The average of the three numbers is", average);
        //Display the average

        /* #5. Compute the square of each number and display the results.
        INSERT CODE BELOW... */

        squareof1 = ((Math.pow(n1, 2)));
        squareof2 = ((Math.pow(n2, 2)));
        squareof3 = ((Math.pow(n3, 2)));

        System.out.println("\nThe square of n1 of the three numbers is " + squareof1);
        //Multiply the first number by itself once and display the value

        System.out.println("\nThe square of n2 of the three numbers is " + squareof2);
        //Multiply the second number by itself once and display the value

        System.out.println("\nThe square of n3 of the three numbers is " + squareof3);
        //Multiply the third number by itself once and display the value

        System.exit(0); //End the program

    } // End of the main method
} // End of the class ProgramDemo


