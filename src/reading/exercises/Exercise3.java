/**
 * 1. Read "log.txt" line by line.
 * 2. Print all lines containing the keyword "ERROR".
 * 3. Count and print how many error lines were found.
 */

package src.reading.exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise3
{
    public static void main(String[] args)
    {
        String path="C:\\Users\\eesha\\Back up-Workspace\\BackEnd-java-week-5\\resources\\log.txt";
        try{
            BufferedReader br= new BufferedReader(new FileReader(path));
            String line;
            int count=0;
            while((line = br.readLine())!= null){  //Reads a line of text until it reaches end of lines
                String[]  words=line.split(" "); //split() returns an array of words, so storing  it in array variable.
//                count=count+words.length;
//                if(line.contains("error")){
//                   count++;
//                }
                for(String w:words){
                    if(w.contains("error")){
                        count++;
                    }
                }
            }
            System.out.println("Total number of words: "+count);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}


