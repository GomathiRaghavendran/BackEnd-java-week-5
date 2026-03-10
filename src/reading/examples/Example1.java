/**
 * Reads all characters from a file called "example.txt" one by one.
 * Demonstrates simple use of FileReader.
 */

package src.reading.examples;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Example1
{
    public static void main(String[] args)
    {
        String filePath = "resources" + File.separator + "example.txt";
        try (FileReader reader = new FileReader(filePath))
        {
            int character;
            while ((character = reader.read()) != -1)
            {
                System.out.print((char) character);
            }
        }
        catch (IOException e)
        {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}