/**
 * 1. Create a FileWriter to write into "resources/notes.txt".
 * 2. Write the following text lines into the file:
 *      - "Java I/O is powerful."
 *      - "Streams make reading and writing easier."
 * 3. Use try-with-resources for automatic stream closing.
 * 4. After writing, print "File written successfully!".
 */

package src.introduction.exercises;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise4
{
    public static void main(String[] args) throws IOException {
        String filePath="C:\\Users\\eesha\\Back up-Workspace\\BackEnd-java-week-5\\resources\\notes.txt"; //Storing the file path in the variable
        FileWriter writer=null;

        try{
            File file1=new File(filePath);
            writer=new FileWriter(file1);
            writer.write("Java I/O is powerful");
            writer.write("\n"); //It will return a new line character
            writer.write(   "Streams make reading and writing easier");
            System.out.println("File Written successfully");

          /**  writer.write("Java");
            writer.write("\n");
            writer.write(65); // ASCII value
            writer.write("\n");
            char ch[]={'a','e','i','o','u'};
            writer.write(ch);
            writer.write("\n");*/

        } catch (IOException e) {
            System.out.println("Some problem");
            throw new RuntimeException(e);
        }
        finally {
            writer.close();
        }
    }

}
