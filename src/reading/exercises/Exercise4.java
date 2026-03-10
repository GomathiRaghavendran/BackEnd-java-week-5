/**
 * 1. Read all lines from "data.txt" into a List<String>.
 * 2. Print the lines in reverse order.
 */

package src.reading.exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise4 {
    public static void main(String[] args) {

        List<String> lines=new ArrayList<>();
        String path = "C:\\Users\\eesha\\Back up-Workspace\\BackEnd-java-week-5\\resources\\data.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {  //Reads a line of text until it reaches end of lines
                lines.add(line); //To add each line into the list of strings
            }

            Collections.reverse(lines);
            for(String l: lines){
                System.out.println(l);

            }


           // System.out.println(lines);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}