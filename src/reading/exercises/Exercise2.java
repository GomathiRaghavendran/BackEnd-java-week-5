/**
 * 1. Read a file named "paragraph.txt".
 * 2. Count how many words are in the file.
 * 3. Print the total word count.
 * (Hint: use line.split(" ") to split by spaces)
 */

package src.reading.exercises;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercise2
{
    public static void main(String[] args) throws FileNotFoundException {
        String path="C:\\Users\\eesha\\Back up-Workspace\\BackEnd-java-week-5\\resources\\paragraph.txt";
        try{
            BufferedReader br= new BufferedReader(new FileReader(path));
            String line;
            int count=0;
            while((line = br.readLine())!= null){  //Reads a line of text until it reaches end of lines
                String[]  words=line.split(" "); //split() returns an array of words, so storing  it in array variable.
                count=count+words.length;
            }
            System.out.println((count));
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
