package exceptiontypes.uncheckedexceptions;

// Exception that occurs at runtime is called unchecked exception
public class ArithmeticExceptionClass {

    public static void main(String[] args) {
        int integer = 30;
        int divisor = 0;

        try {
            int result = integer / divisor; // throw new ArithmeticException("/ by zero");
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) { // This catch block handles ArithmeticException
            System.out.println("Exception Object: " + e); // Exception Object: java.lang.ArithmeticException: / by zero
            System.out.println("Exception Message: " + e.getMessage()); // Exception Message: / by zero
            e.printStackTrace();
            // java.lang.ArithmeticException: / by zero
            // at exceptiontypes.uncheckedexceptions.ArithmeticExceptionClass.main(ArithmeticExceptionClass.java:11)
        }
        System.out.println("Program continues after exception handling.");
    }
}
