/**
 * Name: Aguilar, Aaron Kyle
 *
 * Objective:
 * Create a program that implements the following:
 * 1. Balloon Sort Algorithm
 * 2. Bubble Sort Algorithm
 * 3. Selection Sort Algorithm
 *
 * Problem:
 * Read a list of names (one per line) from a text file, store these names in an array of name
 * objects, sort the name objects, then display the sorted name objects on the screen. In addition,
 * a file containing the sorted names must be created.
 *
 * Sample Run:
 * This program sorts a list of names stored in a file.
 *
 * Enter the name of the file that contains the list of names: List1.txt
 *
 * Enter the desired order:
 * [1] Ascending or [2] Descending? 1
 *
 * Enter the sorting algorithm to be applied:
 * [1] Balloon Sort Algorithm
 * [2] Bubble Sort Algorithm
 * [3] Selection Sort Algorithm? 1
 *
 * Sorting...
 *
 * DONE.
 *
 * List of Sorted Names
 * Abad, Santos
 * Dela Cruz, Juan
 * Osmena, Renator
 * Valdez, Theodore
 *
 * The sorted names are saved in SortedList1.txt
 *
 * Repeat the process(Y/N)? Y
 *
 * This program sorts a list of names stored in a file.
 *
 * Enter the name of the file that contains the list of names: List1.txt
 *
 * Enter the desired order:
 * [1] Ascending or [2] Descending? 2
 *
 * Enter the sorting algorithm to be applied:
 * [1] Balloon Sort Algorithm
 * [2] Bubble Sort Algorithm
 * [3] Selection Sort Algorithm? 3
 *
 * Sorting...
 *
 * DONE.
 *
 * List of Sorted Names
 * Valdez, Theodore
 * Osmena, Renator
 * Dela Cruz, Juan
 * Abad, Santos
 *
 * The sorted names are saved in SortedList1.txt
 *
 * Repeat the process(Y/N)? N
 *
 * Process finished with exit code 0
 */
package secondYear.finals;
import java.io.*;
import java.util.*;

public class NameSorter {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String fileName;
            int sortOrder;
            int sortingAlgorithm;

            do {
                System.out.println("\nThis program sorts a list of names stored in a file.");

                System.out.println("");

                System.out.print("Enter the name of the file that contains the list of names: ");
                fileName = scanner.nextLine();

                System.out.println("");

                System.out.print("Enter the desired order:\n[1] Ascending or [2] Descending? ");
                sortOrder = scanner.nextInt();
                scanner.nextLine();

                System.out.println("");

                System.out.print("Enter the sorting algorithm to be applied:\n[1] Balloon Sort Algorithm\n[2] Bubble Sort Algorithm\n[3] Selection Sort Algorithm? ");
                sortingAlgorithm = scanner.nextInt();
                scanner.nextLine();

                System.out.println("\nSorting...");

                System.out.println("\nDONE.");

                String[] names = readNamesFromFile(fileName);
                sortNames(names, sortOrder, sortingAlgorithm);
                printSortedNames(names);
                saveSortedNamesToFile(names);

                System.out.print("\nRepeat the process(Y/N)? ");
            } while (scanner.nextLine().equalsIgnoreCase("Y"));

            scanner.close();
        }

        /**
         * Reads the names from the specified file and returns them as an array of strings.
         */
        private static String[] readNamesFromFile(String fileName) {
            try (BufferedReader reader = new BufferedReader(new FileReader("src\\finals\\exercise\\List1.txt"))) {
                return reader.lines().toArray(String[]::new);
            } catch (IOException e) {
                System.err.println("Error reading names from file: " + e.getMessage());
                System.exit(1);
                return null;
            }
        }

        /**
         * Sorts the array of names in either ascending or descending order using the specified sorting algorithm.
         */
        private static void sortNames(String[] names, int sortOrder, int sortingAlgorithm) {
            switch (sortingAlgorithm) {
                case 1: // Balloon Sort Algorithm
                    balloonSort(names, sortOrder == 1);
                    break;
                case 2: // Bubble Sort Algorithm
                    bubbleSort(names, sortOrder == 1);
                    break;
                case 3: // Selection Sort Algorithm
                    selectionSort(names, sortOrder == 1);
                    break;
                default:
                    System.err.println("Invalid sorting algorithm: " + sortingAlgorithm);
                    System.exit(1);
            }
        }

    /**
     * Implements the balloon sort algorithm to sort the array of names in either ascending or descending order.
     */
    private static void balloonSort(String[] names, boolean ascending) {
        int n = names.length;
        boolean swapped = true;
        int start = 0;
        int end = n - 1;
        while (swapped) {
            swapped = false;
            for (int i = start; i < end; ++i) {
                if ((ascending && names[i].compareTo(names[i+1]) > 0) || (!ascending && names[i].compareTo(names[i+1]) < 0)) {
                    String temp = names[i];
                    names[i] = names[i+1];
                    names[i+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            swapped = false;
            end--;
            for (int i = end-1; i >= start; --i) {
                if ((ascending && names[i].compareTo(names[i+1]) > 0) || (!ascending && names[i].compareTo(names[i+1]) < 0)) {
                    String temp = names[i];
                    names[i] = names[i+1];
                    names[i+1] = temp;
                    swapped = true;
                }
            }
            start++;
        }
    }

    /**
     * Implements the bubble sort algorithm to sort the array of names in either ascending or descending order.
     */
    private static void bubbleSort(String[] names, boolean ascending) {
        int n = names.length;
        for (int i = 0; i < n-1; ++i) {
            for (int j = 0; j < n-i-1; ++j) {
                if ((ascending && names[j].compareTo(names[j+1]) > 0) || (!ascending && names[j].compareTo(names[j+1]) < 0)) {
                    String temp = names[j];
                    names[j] = names[j+1];
                    names[j+1] = temp;
                }
            }
        }
    }

    /**
     * Implements the selection sort algorithm to sort the array of names in either ascending or descending order.
     */
    private static void selectionSort(String[] names, boolean ascending) {
        int n = names.length;
        for (int i = 0; i < n-1; ++i) {
            int minIndex = i;
            for (int j = i+1; j < n; ++j) {
                if ((ascending && names[j].compareTo(names[minIndex]) < 0) || (!ascending && names[j].compareTo(names[minIndex]) > 0)) {
                    minIndex = j;
                }
            }
            String temp = names[minIndex];
            names[minIndex] = names[i];
            names[i] = temp;
        }
    }

    /**
     * Prints the sorted list of names to the console.
     */
    private static void printSortedNames(String[] names) {
        System.out.println("\nList of Sorted Names");
        for (String name : names) {
            System.out.println(name);
        }
    }

    /**
     * Saves the sorted list of names to a new file called "SortedList1.txt".
     */
    private static void saveSortedNamesToFile(String[] names) {

        System.out.println("\nThe sorted names are saved in SortedList1.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src\\finals\\exercise\\SortedList1.txt"))) {
            for (String name : names) {
                writer.write(name);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing sorted names to file: " + e.getMessage());
            System.exit(1);
        }
    }
}
