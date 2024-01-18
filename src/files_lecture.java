import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class files_lecture {

    public static void main(String[] args) throws IOException {

        Path dataDirectory = Paths.get("./src/Bob.java");

        System.out.println(Files.exists(dataDirectory));

        Path newData = Paths.get("src/HelloWorld2");

        System.out.println(Files.exists(newData));

        //You can split up the path and store them into different variables
        String newDirectory = "Desk";

        String newDirectories = "data/experience/clothes/fenrir";

        //createDirectories method will only except a Path obj
        Files.createDirectories(Paths.get(newDirectory));

        //Append user input to the list in the file
        //check if the information already exists in that file
        //Use an exception to catch an existing name and warn the user

        String newDirectory2 = "src/data";

        Path pathToNewDirectory = Paths.get(newDirectory2);

        //if the directory does not exist create the directory at the specified location
        if (Files.notExists(pathToNewDirectory)) {

            Files.createDirectories(pathToNewDirectory);

        } else {

            System.out.println("directory already exist");

        }

        String myDataTextFile = "data.txt";

        //get file from the directory
        Path directoryAndFile = Paths.get(newDirectory2, myDataTextFile);

        //creates a file at the specified directory if it does not exist
        if (Files.notExists(directoryAndFile)) {

            Files.createFile(directoryAndFile);

        } else {

            System.out.println("File already exist");

        }

        //Allows you to write to a file
        List<String> myData = Arrays.asList("pants", "tops", "shoes");
        List<String> myData2 = Arrays.asList("jackets", "hats", "socks");
        Files.write(directoryAndFile, myData);


        //different ways to print out information from the file
        System.out.printf("%n");
        System.out.println("Here is the information in the file: ");
//        System.out.println(Files.readAllLines(directoryAndFile));
//        System.out.println(Files.readString(directoryAndFile));

        //stores the list into a variable and loops through that list
        List<String> lines = Files.readAllLines(directoryAndFile);

        for (String line : lines) {

            System.out.println(line);

        }


    }

}
