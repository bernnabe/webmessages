package ar.com.afip.webmessages.exception;

public class BusinessException extends RuntimeException {
    public BusinessException() {
        super();
    }

    public BusinessException(final String message) {
        super(message);
    }
}
