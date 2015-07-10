package br.com.msystem.exception;


public class SystemException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5521517965368928152L;

	public SystemException(String message) {
		super(message);
	}

	public SystemException(String message, Exception cause) {
		super(message, cause);
	}

	public SystemException(Exception cause) {
		super(cause);
	}

}
