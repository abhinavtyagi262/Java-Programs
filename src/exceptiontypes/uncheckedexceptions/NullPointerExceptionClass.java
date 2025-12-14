package exceptiontypes.uncheckedexceptions;

// Exception that occurs at runtime is called unchecked exception
public class NullPointerExceptionClass {

    public static void main(String[] args) {
        String s1 = null;
        String s2 = "Hello";

        try {
            boolean valuesEqual = s1.equals(s2); // throw new NullPointerException("Cannot invoke \"String.equals(Object)\" because \"s1\" is null");
            System.out.println(valuesEqual);
        } catch (NullPointerException e) { // This catch block handles NullPointerException
            System.out.println("Exception Object: " + e); // Exception Object: java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "s1" is null
            System.out.println("Exception Message: " + e.getMessage()); // Exception Message: Cannot invoke "String.equals(Object)" because "s1" is null
            e.printStackTrace();
            // java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "s1" is null
            // at exceptiontypes.uncheckedexceptions.NullPointerExceptionClass.main(NullPointerExceptionClass.java:11)
        }
        System.out.println("Program continues after exception handling");
    }
}
