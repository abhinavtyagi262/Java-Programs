package exceptiontypes.customexceptions.customcheckedexceptions;

// Creating custom checked exception by extending Exception class
public class InvalidAgeCheckedException extends Exception {

    // Constructor that accepts a message
    public InvalidAgeCheckedException(String message) {
        super(message); // Pass the message to the parent class constructor
    }

    // Optional: Constructor that accepts a message and a cause
    public InvalidAgeCheckedException(String message, Throwable cause) {
        super(message, cause);
    }
}
