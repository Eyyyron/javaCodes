package secondYear.finals; /**
 * Name: Aguilar, Aaron Kyle
 *
 * Problem:
 * Create a program that implements the following:
 * 1. Linear Search Algorithm
 * 2. Binary Search Algorithm
 *
 * Read a list of names (one per line) from a text file, store these names in an array of name
 * objects, search the list to determine if a name specified by the user at runtime is in the array.
 *
 * Sample:
 * This program searches a name from a list of names stored in a file.
 *
 * Enter the name of the file that contains the list of names: List1.txt
 *
 * List of Names
 * Abad, Santos
 * Dela Cruz, Juan
 * Osmena, Renator
 * Valdez, Theodore
 *
 * Enter the name to be searched from the list: Richard, Karen
 *
 * Enter the search algorithm to be applied:
 * [1] Linear Search Algorithm
 * [2] Binary Search Algorithm1
 *
 * Searching...
 *
 * DONE! Richard, Karen is not in the list.
 *
 * Repeat the process(Y/N)? Y
 *
 *
 * This program searches a name from a list of names stored in a file.
 *
 * Enter the name of the file that contains the list of names: List1.txt
 *
 * List of Names
 * Abad, Santos
 * Dela Cruz, Juan
 * Osmena, Renator
 * Valdez, Theodore
 *
 * Enter the name to be searched from the list: Abad, Santos
 *
 * Enter the search algorithm to be applied:
 * [1] Linear Search Algorithm
 * [2] Binary Search Algorithm2
 *
 * Searching...
 *
 * DONE!
 * Abad, Santos is in the list.
 *
 * Repeat the process(Y/N)? N
 *
 *
 * Process finished with exit code 0
 */

import secondYear.finals.Name;

import java.util.*;
import java.io.File;

public class NameFinder {
    public static void main(String[] args) {

        NameFinder nameFinder = new NameFinder();
        nameFinder.run();
    }

    public void run(){
        boolean repeat = true;
        Scanner scanner = new Scanner(System.in);

        while(repeat) {

            System.out.println("\nThis program searches a name from a list of names stored in a file.");

            System.out.println("");

            System.out.print("Enter the name of the file that contains the list of names: ");
            String fileName = scanner.nextLine();

            System.out.println("");

            Name[] names = txtReader("src/List2.txt");

            System.out.println("List of Names");
            for (Name name : names) {
                System.out.println(name.toString());
            }
            System.out.println();

            System.out.print("Enter the name to be searched from the list: ");
            String nameToSearch = scanner.nextLine();
            System.out.println();

            System.out.println("Enter the search algorithm to be applied:");
            System.out.println("[1] Linear Search Algorithm");
            System.out.print("[2] Binary Search Algorithm");
            int algorithmChoice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            boolean found = false;
            if (algorithmChoice == 1) {
                found = linearSearch(names, nameToSearch);
            } else if (algorithmChoice == 2) {
                Arrays.sort(names, (n1, n2) -> n1.toString().compareTo(n2.toString()));
                found = binarySearch(names, nameToSearch);
            }

            System.out.println();
            System.out.println("Searching...");
            System.out.println();

            if (found) {
                System.out.println("DONE! ");
                System.out.println(nameToSearch + " is in the list.");
            } else {
                System.out.print("DONE! ");
                System.out.println(nameToSearch + " is not in the list.");
            }

            System.out.println();
            System.out.print("Repeat the process(Y/N)? ");
            String repeatChoice = scanner.nextLine();
            repeat = repeatChoice.equalsIgnoreCase("Y");
            System.out.println();

        }

        scanner.close();

}

    public Name[] txtReader(String filePath){
        try{
            int count = 0;
            File txtFile = new File(filePath);
            Scanner scanner = new Scanner (txtFile);
            while(scanner.hasNextLine()){
                count++;
                scanner.nextLine();
            }
            scanner = new Scanner (txtFile);
            Name[] output = new Name[count];
            for(int x = 0; x<count; x++){
                String [] rawName = scanner.nextLine().split(", ");
                String lName = rawName[0];
                String fName = rawName[1];
                output[x] = new Name(fName,lName);
            }
            return output;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    public void printArray(Name[] array){
        for(int x = 0; x < array.length; x++){
            array[x].toString();
        }
    }

    public boolean linearSearch(Name[] names, String searchKey){
        for(Name name: names){
            if(name.toString().equalsIgnoreCase(searchKey)){
                return true;
            }
        }
        return false;
    }

    public boolean binarySearch(Name[] names, String searchKey){
        int left = 0;
        int right = names.length-1;

        while(left<=right){
            int mid = (left+right) / 2;
            int cmp = searchKey.compareTo(names[mid].toString());

            if (cmp == 0){
                return true;
            } else if (cmp<0) {
                right = mid-1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

}
