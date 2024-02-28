/**
 * Name: Aguilar, Aaron Kyle M.
 * Class Code & Schedule: 9315, 1:00 - 2:30 MW
 * Date: October 19, 2022
 *
 * Create a program that forms a string by
 *
 * a. concatenating characters that are randomly
 *     taken from 2 given strings.
 * b. concatenating substrings taken from 2 strings
 *
 * but the user must enter names with at least 4 characters in
 * order for the program to continue.
 *
 * Possible Application:
 * Form a name to be given to a child by getting and joining
 * together characters that are randomly taken from the
 * name of the mother and the father:
 *
 * Sample run:
 *
 * Enter the name of the mother:  Danielle
 * Enter the name of the father:  Eriko
 *
 * a. First suggested name of child:  LINKODEE
 * b. b.1. Second suggested name of child: Daniko
 *    b.2. Second suggested name of child: Erielle
 * */

package firstYear.midterms;
import java.util.Random;
import java.util.Scanner;

public class NameMakerModified {
    public static void main(String[] args) {
        String name1="", name2="", newName="";
        int lengthOfName=0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("This program forms a name out of 2 names.");
        System.out.println("You will be asked to enter 2 names.");
        System.out.println("Further, you will be asked to enter a specific length of the name to be formed");

        name1 = readAName("\nEnter one name");
        name2 = readAName("Enter another name");
        System.out.println();

        do{
            System.out.print("How many characters do you want to be in the name to be formed (must be 4 and above):  ");
            lengthOfName = Integer.parseInt(keyboard.nextLine());
        }while(lengthOfName<4);

        newName = formNewString(lengthOfName,name1,name2);
        System.out.println("\nFirst Generated Name: "+ newName);

        /*The following needs improvement. Currently, it is assuming that name1
            has 4 or more characters and that name2 has 3 or more characters
            Possible remedies:
              If the name entered has ver fe characters (i.e. fewer than 4), you
                 may change the name by repeating the same name.
                 -If name1="ana", let name1= name1.concat(name1) = "ana"+"ana" = anaana
            */
        newName = name1.substring(0,4).concat(name2.substring(name2.length()-3));
        System.out.println("Second Generated Name: "+ newName);

        newName = name2.substring(0,3).concat(name1.substring(name1.length()-4));
        System.out.println("Second Generated Name: "+ newName);

        System.exit(0);
    }  // end of main method

    /**
     * Returns a name that is entered at runtime by
     * the program user
     * */
    public static String readAName(String promptMessage){
        Scanner keyboard = new Scanner(System.in);
        String nameRead="";
        System.out.print(promptMessage+":");
        nameRead = keyboard.nextLine();
        return nameRead;
    }  // end of readAName method

    /**
     * Returns a string with a given length
     * that is formed by randomly picking
     * characters from string1 and string2
     */
    public static String formNewString(int lengthOfNameToForm, String string1, String string2){
        String joinedNames = string1.concat(string2);
        int lengthOfJoinedNames = joinedNames.length();
        Random randomNumberGenerator = new Random();
        String newString="";
        for (int index=0; index<lengthOfNameToForm; index++){
            int indexOfCharacterToGet = randomNumberGenerator.nextInt(lengthOfJoinedNames);
            char letterTaken = Character.toUpperCase(joinedNames.charAt(indexOfCharacterToGet));
            newString += letterTaken;
        }
        return newString;
    }  // end of formNewString method
}  // end of class

