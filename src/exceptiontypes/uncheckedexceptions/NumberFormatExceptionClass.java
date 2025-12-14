package exceptiontypes.uncheckedexceptions;

// Exception that occurs at runtime is called unchecked exception
public class NumberFormatExceptionClass {

    public static void main(String[] args) {
        args = new String[]{"s1"};

        try {
            int integer = Integer.parseInt(args[0]); // throw new NumberFormatException("For input string: \"s1\"");
            System.out.println(integer);
        } catch (NumberFormatException e) { // The catch block handles the exception
            System.out.println("Exception Object: " + e); // Exception Object: java.lang.NumberFormatException: For input string: "s1"
            System.out.println("Exception Message: " + e.getMessage()); // Exception Message: For input string: "s1"
            e.printStackTrace();
            // java.lang.NumberFormatException: For input string: "s1"
            // at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            // at java.base/java.lang.Integer.parseInt(Integer.java:662)
            // at java.base/java.lang.Integer.parseInt(Integer.java:778)
            // at exceptiontypes.uncheckedexceptions.NumberFormatExceptionClass.main(NumberFormatExceptionClass.java:10)
        }
        System.out.println("Program continues after exception handling.");
    }
}
