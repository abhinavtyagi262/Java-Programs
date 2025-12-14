package exceptiontypes.checkedexceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Exception that occurs at compile time is called checked exception
public class FileNotFoundExceptionClass {

    // For checked exceptions, either we need to add throws in the method definition or we need to handle it using try-catch block
    public static void main(String[] args) {

        String filename = "unknownfile.txt"; // Specify the name of the file

        try {
            File fileObj = new File(filename); // Attempt to create a File object and then a Scanner to read it
            Scanner reader = new Scanner(fileObj); // throw new FileNotFoundException("unknownfile.txt (The system cannot find the file specified)");

            // This part of the code will only run if the file is found
            System.out.println("File found and opened successfully. Reading contents:");
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close(); // Close the resource after use

        } catch (FileNotFoundException e) { // This catch block handles FileNotFoundException
            System.out.println("Exception Object: " + e); // Exception Object: java.io.FileNotFoundException: unknownfile.txt (The system cannot find the file specified)
            System.out.println("Exception Message: " + e.getMessage()); // Exception Message: unknownfile.txt (The system cannot find the file specified)
            e.printStackTrace();
            // java.io.FileNotFoundException: unknownfile.txt (The system cannot find the file specified)
            // at java.base/java.io.FileInputStream.open0(Native Method)
            // at java.base/java.io.FileInputStream.open(FileInputStream.java:213)
            // at java.base/java.io.FileInputStream.<init>(FileInputStream.java:152)
            // at java.base/java.util.Scanner.<init>(Scanner.java:645)
            // at exceptiontypes.checkedexceptions.FileNotFoundExceptionClass.main(FileNotFoundExceptionClass.java:17)
        }
        System.out.println("Program continues after exception handling");
    }
}

