/**
 Name: Aguilar, Aaron Kyle M.
 Class Code & Schedule: 9315, 1:00 - 2:30 MW
 Date: October 31, 2022

 *Program for determining if an integer is a prime number or not
 *An integer is a prime number if it is greater than 1
 *and it has no other factors aside from 1 and itself.
 **/

package FirstYearFirstTermAndSecondTerm.midterms;
import java.util.Scanner;


public class PrimeNumberChecker {
    /**
     *Return true if n is a prime number, return false if n is not a prime number
     **/

    static public boolean isPrime(int n){
        boolean result=true;
        for (int count=1; count<n; count++) {
            if (n%count == 0 && (count>1 && count<n  )) {
                result = false;
                break;
            }
        }
        return result;
    } // end of isPrime

    static public int readNumber(){
        Scanner keyboard = new Scanner(System.in);

        int n;
        do {
            System.out.print("Input an integer between 1 and 1000: ");
            n = keyboard.nextInt();
            if (n<1 || n>=1000) {
                System.out.println("You did not enter a number between 1 and 1000");
            }
        }while ( n<1 || n>=1000);

        return n;
    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int n;
        boolean prime;

        n = readNumber();

        for (int x=1; x<=n; x++ ){
            prime = isPrime(x);
            if (prime){
                System.out.println(x + " : The number is prime.");
            }

            else {
                System.out.print(x + " : ");
                int candidate =1;
                do {
                    if (x%candidate == 0) {
                        System.out.print(candidate);
                        if (candidate < x)
                            System.out.print(", ");
                        else
                            System.out.println();
                    } // end of block for the if
                    candidate++;
                } while (x >= candidate);
            } // end of else;
        } // end of for
    }// end of main method
} // end of class PrimeNumberChecker

