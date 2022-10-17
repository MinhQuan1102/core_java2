package SE1.Week3;

public class MissingValueException extends IndexOutOfBoundsException{
    public MissingValueException() {
        super();
    }

    public MissingValueException(String message) {
        super(message);
    }
}
