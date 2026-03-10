/**
 * 1. Read "quotes.txt" line by line.
 * 2. Find and print the longest line in the file.
 * 3. Print its length as well.
 */

package src.reading.exercises;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercise5 {
    public static void main(String[] args) {
        String path = "C:\\Users\\eesha\\Back up-Workspace\\BackEnd-java-week-5\\resources\\quotes.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
             String longestLine = "";
            int maxLength = 0;
            while ((line = br.readLine()) != null) {  //Reads a line of text until it reaches end of lines

            if(line.length()>maxLength){
                maxLength = line.length();
                longestLine = line;

            }
            }
            System.out.println(longestLine);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

