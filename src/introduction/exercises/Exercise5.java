/**
 * 1. Use FileInputStream and FileOutputStream to copy a file.
 * 2. Read from "source.txt" and write its content into "backup.txt".
 * 3. Use try-with-resources to automatically close both streams.
 * 4. After copying, print "File copied successfully!".
 * 5. Handle IOException properly.
 */

package src.introduction.exercises;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercise5 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileInputStream input = new FileInputStream("C:\\Users\\eesha\\Back up-Workspace\\BackEnd-java-week-5\\resources\\notes.txt");  //To read the file
            FileOutputStream output = new FileOutputStream("C:\\Users\\eesha\\Back up-Workspace\\BackEnd-java-week-5\\resources\\copied.txt");//To write the file

            int data; //  variable to store each byte that is read

            while ((data = input.read()) != -1) {  // Read one byte at a time until end of file (-1 means "no more data")
                output.write(data); //to write the already read file
            }

            input.close();
            output.close();

            System.out.println("File copied successfully!");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {

        }
    }
}
