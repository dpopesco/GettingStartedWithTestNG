package app;

public class DuplicateUserException extends Throwable {
    public DuplicateUserException(String msg) {
        super(msg);
    }
}
