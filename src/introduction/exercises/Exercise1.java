/**
 * 1. Create a File object that points to "resources/info.txt".
 * 2. Check if the file exists.
 * 3. If it exists:
 * - Print its absolute path.
 * - Print its size in bytes.
 * - Check if it’s readable and writable.
 * 4. If it doesn’t exist, print a message saying "File not found!".
 */

package src.introduction.exercises;

import java.io.File;

public class Exercise1 {

    public static void main(String[] args) {

        //Creating a file in this below-mentioned path
        File file = new File("C:\\Users\\eesha\\Back up-Workspace\\BackEnd-java-week-5\\resources\\info.txt");
        //Checking if file is available or not using exists method from IO class
        if (file.exists()) {
            System.out.println("File exists: " + file.getAbsolutePath()); //If file is available then write its absolute path using getAbsolutePath method
            System.out.println("File size in bytes: " + file.getTotalSpace());//getTotalSpace method will write the file size bytes
            if (file.canRead() && file.canWrite()) {  //Can.read method checks if file is readable or can write method checks if file is writable
                System.out.println("File is readable and writable");
            } else { //if file is not available then it says file not found
                System.out.println("File not found!");
            }

        }
    }
}





