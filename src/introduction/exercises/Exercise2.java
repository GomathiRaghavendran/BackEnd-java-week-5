/**
 * 1. Use the File class to create a new file called "resources/students.txt".
 * 2. If the file already exists, print a message "File already exists."
 * 3. If it is newly created, print "File created successfully!"
 * 4. After creation, print the file’s absolute path.
 */

package src.introduction.exercises;

import java.io.File;
import java.io.IOException;

public class Exercise2
{
    public static void main(String[] args) throws IOException {
    File file =new File("c:\\Users\\eesha\\Back up-Workspace\\BackEnd-java-week-5\\resources\\student4.txt");

        if(file.exists()){
            System.out.println("File Already Exists: "+file.exists());
        }else{
            System.out.println("File created successfully: "+file.createNewFile());
            System.out.println("file path: "+file.getAbsolutePath());
            System.out.println("File canonical path: "+file.getCanonicalPath());
        }


    }
    }

