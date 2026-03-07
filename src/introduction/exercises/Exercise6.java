/**
 *  1. Read input from System.in and store it in a String variable.
 *  2. Create a file whose name is the same as the user's input and write that input into the file.
 *  3. Use Scanner and FileWriter with try-with-resources.
 *  4. After writing, print "File written successfully!".
 *  5. Handle IOException properly.
 */

package src.introduction.exercises;

import java.io.*;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) throws IOException {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a String: ");
            String userInput = sc.nextLine();//To enter the string
            // Prompt for the file name separately
            System.out.println("Enter the file name: ");
            String fileName = sc.nextLine();

            try {
                FileWriter file = new FileWriter(fileName);
                file.write(userInput); //User string is written
                file.flush();                    // Make sure all content is written
                // After writing, print "File written successfully!".
                System.out.println("File written successfully! Check the file named: " + fileName);
            }
            catch (IOException e) {
                //  Handle IOException properly.
                System.err.println("An error occurred while writing the file: " + e.getMessage());

            }
            sc.close();
        }
    }







