/**
 * 1. Create a File object pointing to the ("resources") directory.
 * 2. List all files and folders in it.
 * 3. Print each item’s name:
 *      - Add "[DIR]" before folder names.
 *      - Add "[FILE]" before file names.
 * 4. Print the total number of files and directories found.
 */

package src.introduction.exercises;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Exercise3 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\eesha\\Back up-Workspace\\BackEnd-java-week-5\\resources");
        System.out.println(file.isDirectory());
        File[] listOfFile = file.listFiles();// It returns array of files

        String fileList[]=file.list();//It returns array of String
        int count = 0;
//        for (int i = 0; i < file.list().length; i++) {
//
//
//            count++;
//
//            System.out.println(listOfFile[i]);
//
//        }
//
//
//        System.out.println("Number of files in a specified directory: " + count);


        //For each loop

        for (File item : listOfFile){
            count++;
            //System.out.println(item);
           if(item.isDirectory()){
               System.out.println("Dir: "+item.getName());
           }else
               System.out.println("File: "+item.getName());

            }
        System.out.println("Number of files in a specified directory: " + count);

    }
    }

