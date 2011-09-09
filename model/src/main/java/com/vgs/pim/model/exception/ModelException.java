package com.vgs.pim.model.exception;

@SuppressWarnings("serial")
public class ModelException extends Exception {

	public ModelException() {
		super();
	}

	public ModelException(String message, Throwable cause) {
		super(message, cause);
	}

	public ModelException(String message) {
		super(message);
	}

	public ModelException(Throwable cause) {
		super(cause);
	}

}
