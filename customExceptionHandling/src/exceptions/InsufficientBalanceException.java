package exceptions;

public class InsufficientBalanceException extends Exception{
	
	 // Constructor to initialize the exception message
	public InsufficientBalanceException(String message) {
		super(message);
	}

}
