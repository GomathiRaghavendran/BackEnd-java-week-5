package src.introduction.exercises;
// Java Program to list all files
// From a directory recursively
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ListFilesRecursively
{
    public static void main(String[] args) throws IOException
    {
        Path rootPath = Paths.get("D:", "root");

        List<Path> allFiles = new ArrayList<>();
        listAllFiles(rootPath, allFiles);

        System.out.println("Found files:");
        allFiles.forEach(System.out::println);
    }

    private static void listAllFiles(Path currentPath, List<Path> allFiles)
            throws IOException
    {
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(currentPath))
        {
            for (Path entry : stream) {
                if (Files.isDirectory(entry)) {
                    listAllFiles(entry, allFiles);
                } else {
                    allFiles.add(entry);
                }
            }
        }
    }
}