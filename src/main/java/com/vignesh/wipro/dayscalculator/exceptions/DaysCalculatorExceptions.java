package com.vignesh.wipro.dayscalculator.exceptions;

public class DaysCalculatorExceptions extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DaysCalculatorExceptions() {
	}

	public DaysCalculatorExceptions(String message) {
		super(message);
	}

	public DaysCalculatorExceptions(Throwable cause) {
		super(cause);
	}

	public DaysCalculatorExceptions(String message, Throwable cause) {
		super(message, cause);
	}

	public DaysCalculatorExceptions(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
