package exceptiontypes.customexceptions.customuncheckedexceptions;

// Creating custom unchecked exception by extending RuntimeException class
public class InvalidAgeUncheckedException extends RuntimeException {

    // Constructor that accepts a message
    public InvalidAgeUncheckedException(String message) {
        super(message); // Pass the message to the parent class constructor
    }

    // Optional: Constructor that accepts a message and a cause
    public InvalidAgeUncheckedException(String message, Throwable cause) {
        super(message, cause);
    }
}
