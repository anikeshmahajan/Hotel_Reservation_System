package Hotel_Reservation_System;

public class CustomerException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	enum ExceptionType {
        ENTERED_NULL, ENTERED_EMPTY, ENTERED_INVALID
    }

    ExceptionType exceptionType;

    public CustomerException(ExceptionType exceptionType, String message) {
        super(message);
        this.exceptionType = exceptionType;
    }
}
