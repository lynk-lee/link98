package com.spring.utils.exception;

/**
 * 参数异常
 * 
 * @author Lynk-Lee
 * 
 */
public class ParameterException extends Exception {
	/** serialVersionUID */
	private static final long serialVersionUID = 6417641452178955756L;

	public ParameterException() {
		super();
	}

	public ParameterException(String message) {
		super(message);
	}

	public ParameterException(Throwable cause) {
		super(cause);
	}

	public ParameterException(String message, Throwable cause) {
		super(message, cause);
	}
}
