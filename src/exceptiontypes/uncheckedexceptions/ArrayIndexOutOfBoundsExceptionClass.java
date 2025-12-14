package exceptiontypes.uncheckedexceptions;

// Exception that occurs at runtime is called unchecked exception
public class ArrayIndexOutOfBoundsExceptionClass {

    public static void main(String[] args) {
        args = new String[]{"s1", "s2"};

        try {
            for (int i = 0; i <= args.length; i++) { // at i = 2
                System.out.println(args[i]); // throw new ArrayIndexOutOfBoundsException("Index 2 out of bounds for length 2");
            }
        } catch (ArrayIndexOutOfBoundsException e) { // The catch block handles the exception
            System.out.println("Exception Object: " + e); // Exception Object: java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
            System.out.println("Exception Message: " + e.getMessage()); // Exception Message: Index 2 out of bounds for length 2
            e.printStackTrace();
            // java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
            // at exceptiontypes.uncheckedexceptions.ArrayIndexOutOfBoundsExceptionClass.main(ArrayIndexOutOfBoundsExceptionClass.java:11)
        }
        System.out.println("Program continues after exception handling.");
    }
}
