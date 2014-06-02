package br.com.edsonfilho.oncast.exception;

/**
 * OrderingException class used when ordering method be called without a valid comparator.
 * @author Edson Filho
 * @version 1.0
 */
public class OrderingException extends Exception {
	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public OrderingException(String message){
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return getMessage();
	}
}
