package src.modele.exceptions;

public class ObservationException extends Exception {
    public ObservationException(String ErrorMessage) {
        super(ErrorMessage);
    }

    public ObservationException() {
        super();
    }
}
