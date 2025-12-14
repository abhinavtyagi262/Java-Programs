package exceptiontypes.checkedexceptions;

// Exception that occurs at compile time is called checked exception
public class ClassNotFoundExceptionClass {

    // For checked exceptions, either we need to add throws in the method definition or we need to handle it using try-catch block
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> classObject = Class.forName("java.lang.UnknownClass"); // throw new ClassNotFoundException("java.lang.UnknownClass")
        // Class<?> classObject = Class.forName("java.lang.String"); // String will not throw ClassNotFoundException

        System.out.println(classObject); // This line will not be reached
    }

}
