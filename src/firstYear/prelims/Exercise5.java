package firstYear.prelims;
import java.lang.*;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Make an object of Scanner that represents the keyboard
// get keyboard input for three integers

        System.out.print("First Number: ");
        int n1 = Integer.parseInt(keyboard.nextLine()); // variable declaration

        System.out.print("Second Number: ");
        int n2 = Integer.parseInt(keyboard.nextLine()); // variable declaration

        System.out.print("Third Number: ");
        int n3 = Integer.parseInt(keyboard.nextLine()); // variable declaration
// display the three numbers

        System.out.println ("You entered the numbers " + n1 + ", " + n2 + " and " + n3);
// add the three numbers and store it in another int variable named sum

        int sum = n1 + n2 + n3;
// display the sum

        System.out.println("\nThe sum of the three numbers is " + sum);
// divide the first number by the second and display the value

        int q1 = n1 / n2;
        System.out.println("\nThe expression used computed the integer quotient: " + q1);

        double q2 = (double) n1 / n2;
        System.out.println("\nThe expression used computed the actual quotient: " + q2);

/* #1. Compute the product of the three numbers, store it in another integer
variable and display this value. INSERT THE CODES BELOW... */

        int product = n1 * n2 * n3;
// display the product

        System.out.println("\nThe product of the three numbers is " + product);
// multiply the first, second, and third number and display the value

/* #2. Get the sum of the first two numbers and divide it by the third number,
compute only for the integer quotient and display the value.
INSERT THE CODES BELOW... */

        int sumOf2 = n1 + n2;
        int integerquotient = sumOf2 / n3;
// display the quotient

        System.out.println("\nThe integer quotient of the sum of the first two numbers numbers divided by the third number is " + integerquotient);
// add the first two numbers and divide it by the third number and display the integer quotient or value

/* #3. Get the sum of the first two numbers and divide it by the third number,
compute for the exact quotient and display the value.
INSERT THE CODES BELOW... */

        float sumOf21 = n1 + n2;
        float exactquotient = sumOf21 / n3;
// display the quotient

        System.out.println("\nThe exact quotient of the sum of the first two numbers numbers divided by the third number is " + exactquotient);
// add the first two numbers and divide it by the third number and display the exact quotient or value

/* #4. Compute the average of the three numbers and display the result with 2
decimal values shown. INSERT CODE BELOW... */

        float sumof3 = n1 + n2 +n3;
        float average = sumof3 / 3;
// display the average

        System.out.printf("\nThe average of the three numbers is %.2f%n", average);
// add the first, second, and third number and divide the sum of it by 3 and display the value

/* #5. Compute the square of each number and display the results.
INSERT CODE BELOW... */

        double squareof1 = ((Math.pow(n1, 2)));
        double squareof2 = ((Math.pow(n2, 2)));
        double squareof3 = ((Math.pow(n3, 2)));

        System.out.println("\nThe square of n1 of the three numbers is " + squareof1);
// multiply the first number by itself once and display the value

        System.out.println("\nThe square of n2 of the three numbers is " + squareof2);
// multiply the second number by itself once and display the value

        System.out.println("\nThe square of n3 of the three numbers is " + squareof3);
// multiply the third number by itself once and display the value

        System.exit(0);//End the program

    } // End of the main method
} // End of class Exercise5



