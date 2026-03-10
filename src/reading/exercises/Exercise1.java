/**
 * 1. Create a file named "story.txt" with some text.
 * 2. Write a program to read the file character by character.
 * 3. Count the number of characters read and print it at the end.
 */

package src.reading.exercises;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise1
{
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\eesha\\Back up-Workspace\\BackEnd-java-week-5\\resources\\story.txt";
        FileWriter writer =new FileWriter(path);
        writer.write("Hello Java");
        writer.flush();

        try {
            FileReader reader = new FileReader(path);


            int data;
            while ((data = reader.read()) != -1) {

                System.out.println((char) data);
            }
        }
         catch (IOException e)
            {
                System.out.println("Error reading file: " + e.getMessage());
            }

        }

    }

