package exceptiontypes.checkedexceptions;

import java.io.FileInputStream;
import java.io.IOException;

// Exception that occurs at compile time is called checked exception
public class IOExceptionClass {

    // For checked exceptions, either we need to add throws in the method definition or we need to handle it using try-catch block
    public static void main(String[] args) {

        try {
            // FileNotFoundException is a subclass of IOException
            FileInputStream fs = new FileInputStream("unknownfile.txt"); // throw new FileNotFoundException("unknownfile.txt (The system cannot find the file specified)");
            fs.close();

        } catch (IOException e) { // This catch block handles FileNotFoundException (subclass of IOException)
            System.out.println("Exception Object: " + e); // Exception Object: java.io.FileNotFoundException: unknownfile.txt (The system cannot find the file specified)
            System.out.println("Exception Message: " + e.getMessage()); // Exception Message: unknownfile.txt (The system cannot find the file specified)
            e.printStackTrace();
            // java.io.FileNotFoundException: unknownfile.txt (The system cannot find the file specified)
            // at java.base/java.io.FileInputStream.open0(Native Method)
            // at java.base/java.io.FileInputStream.open(FileInputStream.java:213)
            // at java.base/java.io.FileInputStream.<init>(FileInputStream.java:152)
            // at java.base/java.io.FileInputStream.<init>(FileInputStream.java:106)
            // at exceptiontypes.checkedexceptions.IOExceptionClass.main(IOExceptionClass.java:14)
        }
        System.out.println("Program continues after exception handling");
    }
}

