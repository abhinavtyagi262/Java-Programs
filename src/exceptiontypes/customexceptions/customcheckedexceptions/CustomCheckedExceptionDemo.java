package exceptiontypes.customexceptions.customcheckedexceptions;

public class CustomCheckedExceptionDemo {

    public static void main(String[] args) {
        int age = 10;
        try {
            if (age < 18) {
                throw new InvalidAgeCheckedException("You must be at least 18 years old"); // Throw the custom checked exception
            }
            System.out.println("You are 18+ ");
        } catch (InvalidAgeCheckedException e) { // This catch block handles ArithmeticException
            System.out.println("Exception Object: " + e); // Exception Object: exceptiontypes.customexceptions.customcheckedexceptions.InvalidAgeCheckedException: You must be at least 18 years old
            System.out.println("Exception Message: " + e.getMessage()); // Exception Message: You must be at least 18 years old
            e.printStackTrace();
            // exceptiontypes.customexceptions.customcheckedexceptions.InvalidAgeCheckedException: You must be at least 18 years old
            // at exceptiontypes.customexceptions.customcheckedexceptions.CustomCheckedExceptionDemo.main(CustomCheckedExceptionDemo.java:9)
        }
    }
}


