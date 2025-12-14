package exceptiontypes.checkedexceptions;

import java.lang.reflect.Method;

// Exception that occurs at compile time is called checked exception
public class NoSuchMethodExceptionClass {

    // For checked exceptions, either we need to add throws in the method definition or we need to handle it using try-catch block
    public static void main(String[] args) {
        try {
            Class<?> classObject = Class.forName("java.lang.String"); // Get the Class object for java.lang.String

            Method method = classObject.getMethod("UnknownMethod"); // throw new NoSuchMethodException("java.lang.String.UnknownMethod()")
            // Method method = classObject.getMethod("toLowerCase"); // toLowerCase will not throw NoSuchMethodException

            System.out.println("Method found: " + method.getName()); // This line will not be reached if the exception occurs

        } catch (NoSuchMethodException e) { // This catch block handles NoSuchMethodException from classObject.getMethod()
            System.out.println("Exception Object: " + e); // Exception Object: java.lang.NoSuchMethodException: java.lang.String.UnknownMethod()
            System.out.println("Exception Message: " + e.getMessage()); // Exception Message: java.lang.String.UnknownMethod()
            e.printStackTrace();
            // java.lang.NoSuchMethodException: java.lang.String.UnknownMethod()
            // at java.base/java.lang.Class.getMethod(Class.java:2397)
            // at exceptiontypes.checkedexceptions.NoSuchMethodExceptionClass.main(NoSuchMethodExceptionClass.java:13)
        } catch (ClassNotFoundException e) { // This catch block handles ClassNotFoundException from Class.forName()
            System.out.println("Exception Object: " + e);
            System.out.println("Exception Message: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Program continues after exception handling");
    }
}
