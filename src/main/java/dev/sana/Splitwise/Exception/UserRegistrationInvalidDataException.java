package dev.sana.Splitwise.Exception;

public class UserRegistrationInvalidDataException extends RuntimeException{
    public UserRegistrationInvalidDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserRegistrationInvalidDataException(String message) {
        super(message);


    }
}
