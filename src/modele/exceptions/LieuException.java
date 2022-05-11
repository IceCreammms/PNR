package src.modele.exceptions;

public class LieuException extends Exception {
    public LieuException(String ErrorMessage) {
        super(ErrorMessage);
    }

    public LieuException() {
        super();
    }
}
