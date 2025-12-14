package exceptiontypes.customexceptions.customuncheckedexceptions;

public class CustomUncheckedExceptionDemo {

    public static void main(String[] args) {
        int age = 10;
        try {
            if (age < 18) {
                throw new InvalidAgeUncheckedException("You must be at least 18 years old"); // Throw the custom unchecked exception
            }
            System.out.println("You are 18+ ");
        } catch (InvalidAgeUncheckedException e) { // This catch block handles ArithmeticException
            System.out.println("Exception Object: " + e); // Exception Object: exceptiontypes.customexceptions.customuncheckedexceptions.InvalidAgeUncheckedException: You must be at least 18 years old
            System.out.println("Exception Message: " + e.getMessage()); // Exception Message: You must be at least 18 years old
            e.printStackTrace();
            // exceptiontypes.customexceptions.customuncheckedexceptions.InvalidAgeUncheckedException: You must be at least 18 years old
            // at exceptiontypes.customexceptions.customuncheckedexceptions.CustomUncheckedExceptionDemo.main(CustomUncheckedExceptionDemo.java:9)
        }
    }
}


